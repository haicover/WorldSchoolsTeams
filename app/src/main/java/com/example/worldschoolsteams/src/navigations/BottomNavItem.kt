package com.example.worldschoolsteams.src.navigations


sealed class BottomNavItem(val route: String) {
    data object Home : BottomNavItem("Home")
    data object Podcasts : BottomNavItem("Podcasts")
    data object Video : BottomNavItem("Video")
    data object Games : BottomNavItem("Games")
    data object Menu : BottomNavItem("Menu")
}