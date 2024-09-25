package com.example.worldschoolsteams.src.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class NavigationBar : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationBarComponent()
        }
    }
}

@Composable
fun NavigationBarComponent() {
    // First row with Home icon and text buttons
    Row(
        modifier = Modifier
            .height(50.dp)
            .padding(start = 10.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        // Home Icon
        IconButton(
            onClick = { /* Home button action */ },
            Modifier
                .border(0.dp, Color(0x80D9D9D9), RoundedCornerShape(50.dp))
                .background(Color(0xFFD9D9D9), RoundedCornerShape(50.dp))
                .size(40.dp)
        ) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = "Home Icon",
                tint = Color.Black,
                modifier = Modifier
                    .size(25.dp)
            )
        }
        // Menu Items
        val menuItems =
            listOf("Mới nhất", "Bình luận nhiều", "Xem nhiều nhất", "Đọc nhiều nhất", "Giáo dục")
        menuItems.forEach { item ->
            TextButton(onClick = { /* Handle button click */ }) {
                Text(text = item, fontSize = 15.sp, color = Color.Black)
            }
        }
    }

    // Second row with categories
    Row(
        modifier = Modifier
            .height(50.dp)
            .padding(start = 10.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        // Category Items
        val categoryItems =
            listOf(
                "Tin tức",
                "Tuyển sinh",
                "Chân dung",
                "Du học",
                "Diễn đàn",
                "Học tiếng anh",
                "Giáo dục 4.0"
            )
        categoryItems.forEach { category ->
            TextButton(onClick = { /* Handle category click */ }) {
                Text(text = category, fontSize = 15.sp, color = Color.Gray)
            }
        }
    }
}

@Preview
@Composable
fun PreviewNavigationBar() {
    NavigationBarComponent()
}