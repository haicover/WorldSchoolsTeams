package com.example.worldschoolsteams.src.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Headset
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Videocam
import androidx.compose.material.icons.filled.VideogameAsset
import androidx.compose.material.icons.outlined.Headset
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Videocam
import androidx.compose.material.icons.outlined.VideogameAsset
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.src.navigations.BottomNavItem


@Composable
fun BottomBar(navController: NavHostController) {

    var selectedItem by remember { mutableStateOf("Home") }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

//
        // Home Icon
        BottomBarItem(
            icon = if (selectedItem == "Home") Icons.Default.Home else Icons.Outlined.Home,
            contentDescription = "Home",
            text = "Home",
            selected = selectedItem == "Home",
            onClick = {
                if (selectedItem != "Home") {
                    selectedItem = "Home"
                    navController.navigate("Home") {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )

        // Podcasts Icon
        BottomBarItem(
            icon = if (selectedItem == "Podcasts") Icons.Default.Headset else Icons.Outlined.Headset,
            contentDescription = "Podcasts",
            text = "Podcasts",
            selected = selectedItem == "Podcasts",
            onClick = {
                if (selectedItem != "Podcasts") {
                    selectedItem = "Podcasts"
                    navController.navigate("Podcasts") {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )

        // Video Icon
        BottomBarItem(
            icon = if (selectedItem == "Video") Icons.Default.Videocam else Icons.Outlined.Videocam,
            contentDescription = "Video",
            text = "Video",
            selected = selectedItem == "Video",
            onClick = {
                if (selectedItem != "Video") {
                    selectedItem = "Video"
                    navController.navigate("Video") {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )

        // Games Icon
        BottomBarItem(
            icon = if (selectedItem == "Games") Icons.Default.VideogameAsset else Icons.Outlined.VideogameAsset,
            contentDescription = "Games",
            text = "Games",
            selected = selectedItem == "Games",
            onClick = {
                if (selectedItem != "Games") {
                    selectedItem = "Games"
                    navController.navigate("Games") {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )

        // Menu Icon
        BottomBarItem(
            icon = if (selectedItem == "Menu") Icons.Default.Menu else Icons.Outlined.Menu,
            contentDescription = "Menu",
            text = "Menu",
            selected = selectedItem == "Menu",
            onClick = {
                if (selectedItem != "Menu") {
                    selectedItem = "Menu"
                    navController.navigate("Menu") {
                        popUpTo(navController.graph.startDestinationId) {
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            }
        )
    }
}

@Composable
fun BottomBarItem(
    icon: ImageVector,
    contentDescription: String,
    text: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(8.dp)
            .clickable(onClick = onClick)
            .height(70.dp)
    ) {
        // Icon with the selected tint applied
        Box(
            Modifier
                .border(
                    0.dp,
//                    if (selected) Color(0x80FEBCBC) else Color.White,
                    color = if (selected) Color(0xFFFEBCBC) else Color.White,
                    RoundedCornerShape(20.dp)
                )
                .background(
//                    if (selected) Color(0xFFFFEDED) else Color.White,
                    color = if (selected) Color(0xFFFFEDED) else Color.White,
                    RoundedCornerShape(20.dp)
                )
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = if (selected) Color(0xFF8B2323) else Color(0xB3000000),
                modifier = Modifier
                    .height(30.dp)
                    .width(60.dp)
                    .size(30.dp)
            )
        }
        // Text explicitly set to black
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = text,
            style = TextStyle(
                fontSize = 12.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal, // Bold if selected
                color = Color.Black // Text always black
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomBar() {
    BottomBar(navController = rememberNavController())
}

