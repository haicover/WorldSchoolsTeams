package com.example.worldschoolsteams.src.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import com.example.worldschoolsteams.R

class BottomBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BottomBarComponent()
        }
    }
}

@Composable
fun BottomBarComponent() {

    var selectedItem by remember { mutableStateOf("Home") }
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        BottomBarItem(
            icon = Icons.Default.Home,
            contentDescription = "Home",
            text = "Trang chủ",
            selected = selectedItem == "Home",
            onClick = { selectedItem = "Home" }
        )

        BottomBarItem(
            icon = Icons.Default.Headset,
            contentDescription = "Podcasts",
            text = "Podcasts",
            selected = selectedItem == "Podcasts",
            onClick = { selectedItem = "Podcasts" }
        )

        BottomBarItem(
            icon = Icons.Default.Videocam,
            contentDescription = "Video",
            text = "Video",
            selected = selectedItem == "Video",
            onClick = { selectedItem = "Video" }
        )

        BottomBarItem(
            icon = Icons.Default.VideogameAsset,
            contentDescription = "Trò chơi",
            text = "Trò chơi",
            selected = selectedItem == "Trò chơi",
            onClick = { selectedItem = "Trò chơi" }
        )

        BottomBarItem(
            icon = Icons.Default.Menu,
            contentDescription = "Menu",
            text = "Menu",
            selected = selectedItem == "Menu",
            onClick = { selectedItem = "Menu" }
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
        modifier = Modifier.clickable(onClick = onClick)
    ) {
        // Icon with the selected tint applied
        Box(
            Modifier
                .border(0.dp, if (selected) Color(0x80FEBCBC) else Color.White, RoundedCornerShape(20.dp))
                .background(if (selected) Color(0xFFFFEDED) else Color.White, RoundedCornerShape(20.dp))
        ) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
                tint = if (selected) Color(0xFF8B2323) else Color.Black,
                modifier = Modifier
                    .height(30.dp)
                    .width(60.dp)
                    .size(20.dp)
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
    BottomBarComponent()
}