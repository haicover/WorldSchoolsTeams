package com.example.worldschoolsteams.ui.screen.baiviet

import android.net.Uri
import android.util.Log
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.src.model.Post
import com.example.worldschoolsteams.src.model.getBinhLuanNhieuNhat
import com.example.worldschoolsteams.src.model.getChanDung
import com.example.worldschoolsteams.src.model.getDienDan
import com.example.worldschoolsteams.src.model.getDocNhieuNhat
import com.example.worldschoolsteams.src.model.getDuHoc
import com.example.worldschoolsteams.src.model.getGiaoDuc
import com.example.worldschoolsteams.src.model.getGiaoDucNew
import com.example.worldschoolsteams.src.model.getHocTiengAnh
import com.example.worldschoolsteams.src.model.getMoiNhat
import com.example.worldschoolsteams.src.model.getTinTuc
import com.example.worldschoolsteams.src.model.getTuyenSinh
import com.example.worldschoolsteams.src.model.getXemNhieuNhat

fun getPostsByCategory(category: String): List<Post> {
    // Trả về danh sách bài viết tương ứng với danh mục
    return when (category) {
        "Tin tức" -> getTinTuc()
        "Tuyển sinh" -> getTuyenSinh()
        "Chân dung" -> getChanDung()
        "Du học" -> getDuHoc()
        "Diễn đàn" -> getDienDan()
        "Học tiếng anh" -> getHocTiengAnh()
        "Giáo dục 4.0" -> getGiaoDucNew()

        // Menu items handling
        "Mới nhất" -> getMoiNhat()
        "Bình luận nhiều" -> getBinhLuanNhieuNhat()
        "Xem nhiều nhất" -> getXemNhieuNhat()
        "Đọc nhiều nhất" -> getDocNhieuNhat()
        "Giáo dục" -> getGiaoDuc()
        else -> emptyList()
    }
}

@Composable
fun PostsScreen(category: String, viewModel: PostsViewModel, navController: NavController) {
    val posts = getPostsByCategory(category)
    LazyColumn(modifier = Modifier.padding(16.dp)) {
        items(posts) { post ->
            PostItem(
                post, viewModel = viewModel, onClick = {
                    Log.d("Navigation", "Navigating to detail screen")
                    // Navigate to Detail Screen with proper parameters
                    navController.navigate(
                        "BaiVietChiTiet/${Uri.encode(post.id.toString())}/${Uri.encode(post.title)}/${
                            Uri.encode(
                                post.description
                            )
                        }/${Uri.encode(post.imageUrl)}/${Uri.encode(post.timeAgo)}/${Uri.encode(post.category)}/${
                            Uri.encode(
                                post.date
                            )
                        }"
                    )
                }
            )
        }
    }
}

@Composable
fun PostItem(post: Post, viewModel: PostsViewModel, onClick: () -> Unit) {
    // Layout for each post item
//    var isBookmarked by rememberSaveable { mutableStateOf(false) }
    val isBookmarked = viewModel.savedPosts.collectAsState().value.contains(post)
    var isPressed by remember { mutableStateOf(false) }
    var isMenuExpanded by remember { mutableStateOf(false) }


    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .padding(vertical = 8.dp)
            .background(
                if (isPressed) Color.Gray else Color.Transparent
            )
            .clickable(onClick = onClick)
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(vertical = 8.dp)
        ) {
            // Image
            Image(
                painter = rememberImagePainter(post.imageUrl),
                contentDescription = "News Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .clip(RoundedCornerShape(10.dp)),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            // Title and time row
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = post.title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f) // Ensures text takes up available space
                )


            }

            Spacer(modifier = Modifier.height(4.dp))

            // Description
            Text(
                text = if (isPressed) post.description else post.description.take(100) + "...",
                fontSize = 14.sp,
                color = Color.Gray,
                modifier = Modifier.weight(1f),
                maxLines = if (isPressed) Int.MAX_VALUE else 2,
            )

            Spacer(modifier = Modifier.height(4.dp))

            // Time and category
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row() {
                    Text(
                        text = post.timeAgo,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = post.category,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }
                IconButton(onClick = {
//                    isBookmarked = !isBookmarked
//                    isMenuExpanded = true // Mở menu khi nhấn vào icon
                    Log.d("PostItem", "Bookmark icon clicked for post: ${post.title}")
                    isMenuExpanded = true
                }) {
                    Icon(
                        imageVector = if (isBookmarked) Icons.Default.BookmarkBorder else Icons.Default.BookmarkBorder,
                        contentDescription = "Bookmark Icon",
                        tint = if (isBookmarked) Color.Blue else Color.Gray
                    )
                }
            }
            Column(
                modifier = Modifier.fillMaxWidth(), // Ensures the column takes up the full width
                horizontalAlignment = Alignment.End
            ) {
                AnimatedVisibility(visible = isMenuExpanded) {
                    DropdownMenu(
                        expanded = isMenuExpanded,
                        onDismissRequest = { isMenuExpanded = false },
                        modifier = Modifier
                            .width(200.dp)
                            .background(Color(0xFFE0E0E0)) // Light gray background
                            .border(
                                BorderStroke(1.dp, Color.Black),
                                shape = RoundedCornerShape(5.dp)
                            )
                            .align(Alignment.End)

                    ) {
                        androidx.compose.material.DropdownMenuItem(onClick = {
                            Log.d("PostItem", "Save Post selected for post: ${post.title}")
                            viewModel.savePost(post)
                            isMenuExpanded = false
                        }) {
                            Row(
                                Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Lưu tin", fontSize = 16.sp)
                                Icon(
                                    imageVector = Icons.Default.BookmarkBorder,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        }
                        Divider(thickness = 1.dp, color = Color.Black) // Separator line

                        androidx.compose.material.DropdownMenuItem(onClick = {
                            viewModel.addToWatchLater(post)
                            Log.d("PostItem", "View Later selected for post: ${post.title}")
                            isMenuExpanded = false
                        }) {
                            Row(
                                Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Text("Xem sau", fontSize = 16.sp)
                                Icon(
                                    imageVector = Icons.Default.Schedule,
                                    contentDescription = null,
                                    tint = Color.Black
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewList() {
    PostsScreen(
        category = "Tin tức",
        navController = rememberNavController(),
        viewModel = PostsViewModel()
    )

}
