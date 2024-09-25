package com.example.worldschoolsteams.src.navigations

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.src.screens.GamesScreen
import com.example.worldschoolsteams.src.screens.HomeScreen
import com.example.worldschoolsteams.src.screens.MenuScreen
import com.example.worldschoolsteams.src.screens.PodcastsScreen
import com.example.worldschoolsteams.src.screens.VideoScreen

class BottomNavigationBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}

class BottomNavigationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomNavigationExample()
        }
    }
}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun BottomNavigationExample() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { BottomNavigationBar(navController = navController) }
    ) {
        NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
            composable(Screen.HomeScreen.route) { HomeScreen() }
            composable(Screen.PodcastsScreen.route) { PodcastsScreen() }
            composable(Screen.VideoScreen.route) { VideoScreen() }
            composable(Screen.GamesScreen.route) { GamesScreen() }
            composable(Screen.MenuScreen.route) { MenuScreen() }
        }
    }
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        Screen.HomeScreen,
        Screen.PodcastsScreen,
        Screen.VideoScreen,
        Screen.GamesScreen,
        Screen.MenuScreen
    )
    BottomNavigation(
        backgroundColor = Color.White,
        contentColor = Color.Black
    ) {
        val currentRoute = getCurrentRoute(navController)
        items.forEach { screen ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        imageVector = when (screen) {
                            is Screen.HomeScreen -> Icons.Default.Home
                            is Screen.PodcastsScreen -> Icons.Default.Headset
                            is Screen.VideoScreen -> Icons.Default.Videocam
                            is Screen.GamesScreen -> Icons.Default.VideogameAsset
                            is Screen.MenuScreen -> Icons.Default.Menu
                        },
                        contentDescription = screen.route
                    )
                },
                label = { Text(screen.route) },
                selected = currentRoute == screen.route,
                onClick = {
                    navController.navigate(screen.route) {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                selectedContentColor = Color(0xFF8B2323),
                unselectedContentColor = Color.Gray
            )
        }
    }
}

@Composable
fun getCurrentRoute(navController: NavController): String? {
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    return navBackStackEntry?.destination?.route
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomNavigation() {
    BottomNavigationExample()
}