package com.example.worldschoolsteams.src.navigations

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Headset
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String) {
    data object Home : BottomNavItem("Home")
    data object Podcasts : BottomNavItem("Podcasts")
    data object Video : BottomNavItem("Video")
    data object Games : BottomNavItem("Games")
    data object Menu : BottomNavItem("Menu")
}