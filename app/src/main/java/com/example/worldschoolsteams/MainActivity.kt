package com.example.worldschoolsteams

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.worldschoolsteams.src.navigations.BottomNavigationExample
import com.example.worldschoolsteams.ui.screen.WelcomeScreen
import com.example.worldschoolsteams.ui.screen.baiviet.BaiVietChiTiet
import com.example.worldschoolsteams.ui.screen.login.LoginScreen
import com.example.worldschoolsteams.ui.screen.search.SearchChiTiet
import com.example.worldschoolsteams.ui.screen.search.SearchScreen
import com.example.worldschoolsteams.ui.screen.signup.SignUpScreen
import com.example.worldschoolsteams.ui.theme.WorldSchoolsTeamsTheme
import com.example.worldschoolsteams.src.data.AuthViewModel
import com.example.worldschoolsteams.ui.screen.CommentExample
import com.example.worldschoolsteams.ui.screen.baiviet.PostsScreen
import com.example.worldschoolsteams.ui.screen.baiviet.PostsViewModel
import com.example.worldschoolsteams.ui.screen.baiviet.SavedNewsViewModel
import com.example.worldschoolsteams.ui.screen.game.GameSnake
import com.example.worldschoolsteams.ui.screen.menu.AccountEditScreen
import com.example.worldschoolsteams.ui.screen.menu.SavedPostsScreen
import com.example.worldschoolsteams.ui.screen.menu.WatchLaterScreen

class MainActivity : ComponentActivity() {

    private val authViewModel: AuthViewModel by viewModels()
    private val postsViewModel: PostsViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            var isDarkTheme by remember { mutableStateOf(false) }
            val systemTheme = isSystemInDarkTheme()
            var selectedButton by remember { mutableStateOf("Hệ thống") }

            // Chọn theme dựa trên giá trị `selectedButton`
            val darkTheme = when (selectedButton) {
                "Bật" -> true
                "Tắt" -> false
                else -> systemTheme
            }
            WorldSchoolsTeamsTheme(darkTheme = darkTheme) {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val startApp = remember { mutableStateOf(true) }
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "welcome") {
                        composable("welcome") {
                            WelcomeScreen(navController = navController)
                        }
                        composable("login") {
                            LoginScreen(navController = navController)
                        }
                        composable("signup") {
                            SignUpScreen(navController = navController)
                        }
                        composable("BottomNavigation") {
                            BottomNavigationExample()
                        }

                        composable("Search") {
                            SearchScreen(navController = navController)
                        }
                        composable("SearchChiTiet/{itemTitle}") { backStackEntry ->
                            val itemTitle = backStackEntry.arguments?.getString("itemTitle") ?: ""
                            SearchChiTiet(navController = navController)
                        }
                        composable("PostsScreen?category={category}") { backStackEntry ->
                            val category =
                                backStackEntry.arguments?.getString("category") ?: "Mới nhất"
                            PostsScreen(category, viewModel = postsViewModel, navController)
                        }
                        composable(
                            route = "BaiVietChiTiet/{id}/{title}/{description}/{imageUrl}/{timeAgo}/{category}/{date}",
                            arguments = listOf(
                                navArgument("id") { type = NavType.StringType },
                                navArgument("title") { type = NavType.StringType },
                                navArgument("description") { type = NavType.StringType },
                                navArgument("imageUrl") { type = NavType.StringType },
                                navArgument("timeAgo") { type = NavType.StringType },
                                navArgument("category") { type = NavType.StringType },
                                navArgument("date") { type = NavType.StringType }
                            )
                        ) { backStackEntry ->
                            val id = backStackEntry.arguments?.getString("id") ?: ""
                            val title = backStackEntry.arguments?.getString("title") ?: ""
                            val description =
                                backStackEntry.arguments?.getString("description") ?: ""
                            val imageUrl = backStackEntry.arguments?.getString("imageUrl") ?: ""
                            val timeAgo = backStackEntry.arguments?.getString("timeAgo") ?: ""
                            val category = backStackEntry.arguments?.getString("category") ?: ""
                            val date = backStackEntry.arguments?.getString("date") ?: ""
                            BaiVietChiTiet(
                                id = id,
                                title = title,
                                description = description,
                                imageUrl = imageUrl,
                                timeAgo = timeAgo,
                                category = category,
                                date = date,
                                navController = navController
                            )
                        }
                        composable("gameSnake") {
                            GameSnake()
                        }
                        composable("saved") {

                            val postsViewModel: SavedNewsViewModel = hiltViewModel()
                            SavedPostsScreen(
                                navController = navController,
                                viewModel = postsViewModel
                            )
                        }
                        composable("watchLaterPosts") {
                            WatchLaterScreen(
                                navController = navController,
                                postsViewModel
                            )
                        }
                        composable("Comment") { CommentExample(navController = navController) }
                        composable("SuaTaiKhoan") { AccountEditScreen(navController = navController) }
                    }
                }
            }
        }
    }
}

