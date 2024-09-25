package com.example.worldschoolsteams.src.navigations

sealed class Screen(val route: String) {
    data object HomeScreen : Screen("Home")
    data object PodcastsScreen : Screen("Podcasts")
    data object VideoScreen : Screen("Video")
    data object GamesScreen : Screen("Game")
    data object MenuScreen : Screen("Menu")
//    data object HomeScreen : Screen("Home")

}