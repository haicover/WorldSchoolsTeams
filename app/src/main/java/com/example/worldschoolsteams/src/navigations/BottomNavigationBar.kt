package com.example.worldschoolsteams.src.navigations

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.worldschoolsteams.src.components.BottomBar
import com.example.worldschoolsteams.src.data.AuthViewModel
import com.example.worldschoolsteams.ui.screen.CommentExample
import com.example.worldschoolsteams.ui.screen.baiviet.BaiVietChiTiet
import com.example.worldschoolsteams.ui.screen.baiviet.PostsScreen
import com.example.worldschoolsteams.ui.screen.baiviet.PostsViewModel
import com.example.worldschoolsteams.ui.screen.baiviet.SavedNewsViewModel
import com.example.worldschoolsteams.ui.screen.game.GameSnake
import com.example.worldschoolsteams.ui.screen.game.GamesScreen
import com.example.worldschoolsteams.ui.screen.home.HomeScreen
import com.example.worldschoolsteams.ui.screen.menu.AccountEditScreen
import com.example.worldschoolsteams.ui.screen.menu.MenuScreen
import com.example.worldschoolsteams.ui.screen.menu.SavedPostsScreen
import com.example.worldschoolsteams.ui.screen.menu.WatchLaterScreen
import com.example.worldschoolsteams.ui.screen.podcasts.MediaPlayerHolder
import com.example.worldschoolsteams.ui.screen.podcasts.PodcastDetailScreen
import com.example.worldschoolsteams.ui.screen.podcasts.PodcastsScreen
import com.example.worldschoolsteams.ui.screen.search.SearchChiTiet
import com.example.worldschoolsteams.ui.screen.search.SearchScreen
import com.example.worldschoolsteams.ui.screen.video.VideoScreen


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigationExample() {
    val context = LocalContext.current
    val navController = rememberNavController()
    val authViewModel: AuthViewModel = viewModel()
    val viewModel: PostsViewModel = viewModel()
    Scaffold(
        bottomBar = {
            BottomBar(navController = navController)
        }
    ) { paddingValues ->
        NavHost(
            navController = navController,
            startDestination = "Home",
            modifier = Modifier.padding(paddingValues),
        ) {
            composable("Home") { HomeScreen(navController = navController) }
            composable("Podcasts") {
                PodcastsScreen(
                    navController = navController,
                )
            }
            composable("Video") { backStackEntry ->
                val category = backStackEntry.arguments?.getString("category") ?: "Mới nhất"
                VideoScreen(category, navController = navController)
            }
            composable("Games") { GamesScreen(navController = navController) }
            composable("Menu") {
                MenuScreen(
                    navController = navController,
                    viewModel = viewModel
                )
            }


            composable("Search") { SearchScreen(navController = navController) }
            composable("SearchChiTiet/{itemTitle}") { backStackEntry ->
                val itemTitle = backStackEntry.arguments?.getString("itemTitle") ?: ""
                SearchChiTiet(navController = navController)
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
                // Retrieve arguments from the backStackEntry
                val id = backStackEntry.arguments?.getString("id") ?: ""
                val title = backStackEntry.arguments?.getString("title") ?: ""
                val description = backStackEntry.arguments?.getString("description") ?: ""
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
            composable(
                "podcast_detail/{id}/{audioResId}/{imageUrl}/{title}/{description}/{date}",
                arguments = listOf(
                    navArgument("id") { type = NavType.IntType },
                    navArgument("audioResId") { type = NavType.IntType },
                    navArgument("imageUrl") { type = NavType.StringType },
                    navArgument("title") { type = NavType.StringType },
                    navArgument("description") { type = NavType.StringType },
                    navArgument("date") { type = NavType.StringType }
                )
            ) { backStackEntry ->
                val id = backStackEntry.arguments?.getInt("id") ?: 0
                val audioResId = backStackEntry.arguments?.getInt("audioResId") ?: 0
                val imageUrl = backStackEntry.arguments?.getString("imageUrl") ?: ""
                val title = backStackEntry.arguments?.getString("title") ?: ""
                val description = backStackEntry.arguments?.getString("description") ?: ""
                val date = backStackEntry.arguments?.getString("date") ?: ""
                PodcastDetailScreen(
                    id = id,
                    audioResId = audioResId,
                    imageUrl = imageUrl,
                    title = title,
                    description = description,
                    date = date,
                    navController = navController,
                    mediaPlayer = MediaPlayerHolder.mediaPlayer,
                )
            }
            composable("PostsScreen?category={category}") { backStackEntry ->
                val category = backStackEntry.arguments?.getString("category") ?: "Mới nhất"
                PostsScreen(category, viewModel = viewModel, navController)
            }
            composable("gameSnake") {
                GameSnake()
            }
            composable("saved") {
                val postsViewModel: SavedNewsViewModel = hiltViewModel()
                SavedPostsScreen(navController = navController, viewModel = postsViewModel)
            }
            composable("watchLaterPosts") {
                WatchLaterScreen(
                    navController = navController,
                    viewModel
                )
            }
            composable("Comment") { CommentExample(navController = navController) }
            composable("SuaTaiKhoan") { AccountEditScreen(navController = navController) }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomNavigation() {
    BottomNavigationExample()
}