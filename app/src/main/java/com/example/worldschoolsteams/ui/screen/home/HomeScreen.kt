package com.example.worldschoolsteams.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.components.BottomBar
import com.example.worldschoolsteams.src.components.NavigationBarComponent
import com.example.worldschoolsteams.ui.screen.baiviet.PostsScreen


@Composable
fun HomeScreen(navController: NavHostController) {
    var selectedCategory by remember { mutableStateOf("Mới nhất") }
    Column(
        Modifier.fillMaxSize()
    ) {

        HeaderComponent(navController = navController)
        NavigationBarComponent(
            navController = navController,
            selectedCategory = selectedCategory,
            onCategorySelected = { category ->
                selectedCategory = category // Cập nhật danh mục khi người dùng chọn
            }
        )
        PostsScreen(category = selectedCategory, viewModel = viewModel(), navController = navController)
        BottomBar(navController = navController)
    }
}

@Composable
fun HeaderComponent(navController: NavHostController) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .height(80.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Icon Search
        IconButton(onClick = {
            navController.navigate("Search") // Ensure it navigates to the correct route
        }) {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = "Search Icon",
                tint = Color.Black
            )
        }
        // Image
        Image(
            painter = painterResource(id = R.drawable.logo), // Replace with your image
            contentDescription = "Logo",
            modifier = Modifier
                .width(50.dp)
                .height(34.dp)
                .weight(1f),
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeList() {
    HomeScreen(navController = rememberNavController())
}

