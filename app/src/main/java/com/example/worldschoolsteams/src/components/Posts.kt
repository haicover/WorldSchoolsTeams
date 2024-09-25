package com.example.worldschoolsteams.src.components

import android.os.Bundle
import android.view.MotionEvent
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInteropFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.worldschoolsteams.R

class Posts : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Load the sample news data into the list
            val sampleNews = listOf(
                PostsItem(
                    title = "244 thí sinh Thái Bình 'trượt' có chỗ học mới",
                    description = "Trong 260 thí sinh thi đỗ thành trượt sau sự cố nhóm phách, 141 em nhập học lớp 10 trường tư, 73 em học bổ túc.",
                    imageUrl = R.drawable.image22, // Replace with your drawable resource
                    timeAgo = "40 phút trước",
                    category = "Giáo dục"
                ),
                PostsItem(
                    title = "Nam sinh lớp 8 trong top 5% điểm SAT, giành học bổng chính phủ Singapore",
                    description = "Nguyễn Khoa, 14 tuổi, đạt điểm SAT trong top 5% thế giới, học lớp online vì toàn toàn cho bản bè.",
                    imageUrl = R.drawable.image24, // Replace with your drawable resource
                    timeAgo = "1 giờ trước",
                    category = "Du học"
                ),
                PostsItem(
                    title = "Học trò tập ứng phó động đất trong ngày khai giảng",
                    description = "Sau tiếng hô của cô giáo, học sinh trường tiểu học Măng Đen chạy xuống gầm bàn học để mô phỏng tình huống động đất.",
                    imageUrl = R.drawable.image25, // Replace with your drawable resource
                    timeAgo = "2 giờ trước",
                    category = "Giáo dục"
                )
            )
            PostsList(sampleNews)
        }
    }
}

// Sample data class for a news item
data class PostsItem(
    val title: String,
    val description: String,
    val imageUrl: Int, // Replace with your image resource
    val timeAgo: String,
    val category: String
)

@Composable
fun PostsList(postsItems: List<PostsItem>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(8.dp)
    ) {
        items(postsItems) { postsItems ->
            PostsCard(postsItems)
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
fun PostsCard(newsItem: PostsItem) {
    var isBookmarked by rememberSaveable { mutableStateOf(false) }

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
            .pointerInteropFilter { motionEvent ->
                when (motionEvent.action) {
                    MotionEvent.ACTION_DOWN -> {
                        isPressed = true
                    }

                    MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                        isPressed = false
                        isMenuExpanded = true
                    }
                }
                true
            }
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(400.dp)
                .padding(vertical = 8.dp)
        ) {
            // Image
            Image(
                painter = painterResource(id = newsItem.imageUrl),
                contentDescription = "News Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
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
                    text = newsItem.title,
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.weight(1f) // Ensures text takes up available space
                )


            }

            Spacer(modifier = Modifier.height(4.dp))

            // Description
            Text(
                text = newsItem.description,
                fontSize = 14.sp,
                color = Color.Gray
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
                        text = newsItem.timeAgo,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Text(
                        text = newsItem.category,
                        fontSize = 12.sp,
                        color = Color.Gray,
                        modifier = Modifier.padding(start = 10.dp)
                    )
                }

                IconButton(onClick = { isBookmarked = !isBookmarked }) {
                    Icon(
                        imageVector = if (isBookmarked) Icons.Default.BookmarkBorder else Icons.Default.BookmarkBorder,
                        contentDescription = "Bookmark Icon",
                        tint = if (isBookmarked) Color.Blue else Color.Gray
                    )
                }
            }
            AnimatedVisibility(visible = isMenuExpanded) {
                DropdownMenu(
                    expanded = isMenuExpanded,
                    onDismissRequest = { isMenuExpanded = false },
                    modifier = Modifier
                        .width(180.dp)
                        .background(Color(0xFFE0E0E0)) // Light gray background
                        .border(BorderStroke(1.dp, Color.Black), shape = RoundedCornerShape(10.dp)) // Border for dropdown

                ) {
                    DropdownMenuItem(onClick = { /* Action for saving */ }) {
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

                    DropdownMenuItem(onClick = { /* Action for viewing later */ }) {
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


@Preview
@Composable
fun PreviewNewsList() {
    val sampleNews = listOf(
        PostsItem(
            title = "244 thí sinh Thái Bình 'trượt' có chỗ học mới",
            description = "Trong 260 thí sinh thi đỗ thành trượt sau sự cố nhóm phách, 141 em nhập học lớp 10 trường tư, 73 em học bổ túc.",
            imageUrl = R.drawable.image22, // Replace with your drawable resource
            timeAgo = "40 phút trước",
            category = "Giáo dục"
        ),
        PostsItem(
            title = "Nam sinh lớp 8 trong top 5% điểm SAT, giành học bổng chính phủ Singapore",
            description = "Nguyễn Khoa, 14 tuổi, đạt điểm SAT trong top 5% thế giới, học lớp online vì toàn toàn cho bản bè.",
            imageUrl = R.drawable.image24, // Replace with your drawable resource
            timeAgo = "1 giờ trước",
            category = "Du học"
        ),
        PostsItem(
            title = "Học trò tập ứng phó động đất trong ngày khai giảng",
            description = "Sau tiếng hô của cô giáo, học sinh trường tiểu học Măng Đen chạy xuống gầm bàn học để mô phỏng tình huống động đất.",
            imageUrl = R.drawable.image25, // Replace with your drawable resource
            timeAgo = "2 giờ trước",
            category = "Giáo dục"
        )
    )
    PostsList(sampleNews)
}