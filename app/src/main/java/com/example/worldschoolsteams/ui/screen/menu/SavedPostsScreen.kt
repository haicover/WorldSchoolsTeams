package com.example.worldschoolsteams.ui.screen.menu

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.src.model.Post
import com.example.worldschoolsteams.ui.screen.baiviet.PostsViewModel
import com.example.worldschoolsteams.ui.screen.baiviet.SavedNewsRepository
import com.example.worldschoolsteams.ui.screen.baiviet.SavedNewsViewModel

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun SavedPostsScreen(
    navController: NavController,
    viewModel: SavedNewsViewModel = hiltViewModel()
) {
    val savedPosts by viewModel.savedPosts.observeAsState(emptyList())
    Log.d("SavedPostsScreen", "Số bài viết đã lưu: ${savedPosts.size}")
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Tin đã lưu") },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                backgroundColor = Color.White,
                elevation = 4.dp
            )
        }
    ) {
        LazyColumn(
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(savedPosts) { post ->
                SavedNewsItem(
                    post = post,
                    onOpen = { navController.navigate("BaiVietChiTiet/${post.id}/${post.title}") },
                    onDelete = { viewModel.deletePost(post) }
                )
            }
        }
    }
}

@Composable
fun SavedNewsItem(
    post: Post,
    onOpen: () -> Unit,
    onDelete: () -> Unit
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable { onOpen() }, // Chuyển đến màn hình chi tiết khi nhấp vào
        elevation = 4.dp,
        backgroundColor = Color.White
    ) {
        Row(
            modifier = Modifier.padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            // Hình ảnh của bài viết
            Image(
                painter = rememberImagePainter(data = post.imageUrl),
                contentDescription = "Post Image",
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
            )

            Spacer(modifier = Modifier.width(12.dp))

            // Thông tin bài viết
            Column(modifier = Modifier.weight(1f)) {
                Text(
                    text = post.title,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = post.description,
                    fontSize = 14.sp,
                    color = Color.Gray,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }

            // Nút xóa
            IconButton(onClick = onDelete) {
                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = "Delete Saved Post",
                    tint = Color.Red
                )
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun PreviewList() {
//
//    // Tạo ViewModel giả với dữ liệu thử nghiệm
//    val fakeViewModel = remember {
//        PostsViewModel().apply {
//            savePost(
//                Post(
//                    id = 1,
//                    title = "Bài viết 1",
//                    description = "Nội dung bài viết 1",
//                    date = "Thứ 4",
//                    category = "Tin tức",
//                    imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/T2-1731226922-8181-1731227235.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=m1i5PfjoUTxhRDvZyLtWkQ",
//                    timeAgo = "2 giờ trước"
//                )
//            )
//            savePost(
//                Post(
//                    id = 2,
//                    title = "Bài viết 2",
//                    description = "Nội dung bài viết 2",
//                    date = "Thứ 4",
//                    category = "Tin tức",
//                    imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/T2-1731226922-8181-1731227235.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=m1i5PfjoUTxhRDvZyLtWkQ",
//                    timeAgo = "1 giờ trước"
//                )
//            )
//        }
//    }
//    // Gọi SavedPostsScreen với ViewModel và NavController giả
//    SavedPostsScreen(navController = rememberNavController(), viewModel = fakeViewModel)
//}