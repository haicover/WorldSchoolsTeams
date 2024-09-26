package com.example.worldschoolsteams.ui.screen.baiviet

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.src.components.BottomBaiViet
import com.example.worldschoolsteams.src.model.Post
import kotlinx.coroutines.delay


@Composable
fun BaiVietChiTiet(
    navController: NavHostController,
    id: String,
    title: String,
    date: String,
    description: String,
    imageUrl: String,
    timeAgo: String,
    category: String
) {
    // Tìm vị trí dấu cách gần nhất để tách
    val splitIndex = description.length / 2
    val spaceIndex = description.lastIndexOf(' ', splitIndex)

    // Kiểm tra nếu tìm được dấu cách hợp lý, nếu không thì giữ nguyên splitIndex
    val finalSplitIndex = if (spaceIndex != -1) spaceIndex else splitIndex

    // Tách đoạn mô tả
    val firstPart = description.substring(0, finalSplitIndex)
    val secondPart = description.substring(finalSplitIndex).trim()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 15.dp, end = 15.dp, top = 10.dp)
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(start = 15.dp, end = 15.dp, top = 15.dp)
        ) {
            item {
                Column {
                    // Text Category
                    Text(
                        "$category",
                        fontSize = 24.sp,
                        color = Color(0xFF8B2323),
                        fontStyle = FontStyle.Normal
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    // Text Ngay/Thang/Nam Time(Mui gio)
                    Text(
                        "$date",
                        fontSize = 16.sp,
                        color = Color(0xFF716D6D),
                        fontStyle = FontStyle.Normal
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                // Title
                Text(
                    "$title",
                    fontSize = 24.sp, color = Color.Black, fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                // Main content
//                Text(
//                    "$description",
//                    fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Normal
//                )
                Text(
                    text = firstPart,
                    style = MaterialTheme.typography.body1
                )

                Spacer(modifier = Modifier.height(10.dp))
                // Image
                Image(
                    painter = rememberImagePainter(imageUrl),
                    contentDescription = "News Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(10.dp))
                // Main content
                Text(
                    text = secondPart,
                    style = MaterialTheme.typography.body1
                )
            }
        }
        BottomBaiViet(
            navController = navController,
            title = title,
            imageUrl = imageUrl
        )
    }
}


@Preview
@Composable
fun PreviewBaiViet() {
    BaiVietChiTiet(
        id = "1",
        title = "Bài viết mẫu",
        description = "Đây là nội dung chi tiết của bài viết mẫu. " +
                "Nội dung này chỉ để hiển thị ví dụ.Đây là nội dung chi tiết của bài viết mẫu. " +
                "Nội dung này chỉ để hiển thị ví dụ.Đây là nội dung chi tiết của bài viết mẫu." +
                " Nội dung này chỉ để hiển thị ví dụ.",
        imageUrl = "https://vcdn1-kinhdoanh.vnecdn.net/2024/10/22/Trump-mcdonald-3969-1729575002.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=VJy9RWvFxqs3k2rju06y5w",
        timeAgo = "1 giờ trước",
        category = "Thể thao",
        date = "Thứ 4, 6/11/2024 03:07 (GMT+7)",
        navController = rememberNavController()
    )
}
