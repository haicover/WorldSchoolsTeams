package com.example.worldschoolsteams.src.components

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun NavigationBarComponent(
    navController: NavHostController,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    // Trạng thái để xác định xem có hiển thị categoryItems hay không
    var showCategories by remember { mutableStateOf(false) }
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
            onClick = { navController.navigate("Home") },
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
            TextButton(onClick = {
                onCategorySelected(item)
                showCategories = item == "Giáo dục"
            }) {
                Text(
                    text = item,
                    fontSize = 15.sp,
                    color = if (item == selectedCategory) Color.Black else Color.Gray,
                    fontWeight = if (item == selectedCategory) FontWeight.Bold else FontWeight.Normal
                )
            }
        }
    }

    // Hiển thị categoryItems khi showCategories == true
    if (showCategories) {
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
                TextButton(onClick = {
                    onCategorySelected(category)
                }) {
                    Text(
                        text = category,
                        fontSize = 15.sp,
                        color = if (category == selectedCategory) Color.Black else Color.Gray,
                        fontWeight = if (category == selectedCategory) FontWeight.Bold else FontWeight.Normal
                    )
                }
            }
        }
    }
}


@Preview
@Composable
fun PreviewNavigationBar() {
    NavigationBarComponent(
        navController = rememberNavController(),
        selectedCategory = "Mới nhất",
        onCategorySelected = {}
    )
}