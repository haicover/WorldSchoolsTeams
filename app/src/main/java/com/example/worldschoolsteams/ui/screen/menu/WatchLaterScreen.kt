package com.example.worldschoolsteams.ui.screen.menu

import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.ui.screen.baiviet.PostItem
import com.example.worldschoolsteams.ui.screen.baiviet.PostsViewModel

@Composable
fun WatchLaterScreen(navController: NavController,viewModel: PostsViewModel) {
    val watchLaterPosts by viewModel.watchLaterPosts.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                navController.popBackStack()
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "Back"
                )
            }
            Text(
                text = "Xem sau",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff8B2323),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        // Danh sách bài viết sẽ xem sau
        LazyColumn {
            items(watchLaterPosts) { post ->
                PostItem(post = post, viewModel = viewModel) {
                    navController.navigate("detail/${post.id}/${post.title}/${post.description}/${post.imageUrl}/${post.timeAgo}/${post.category}")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun WatchLaterScreenPreviewList() {
    WatchLaterScreen(navController = rememberNavController(), viewModel = PostsViewModel())
}