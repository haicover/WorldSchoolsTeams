package com.example.worldschoolsteams.src.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.components.HeaderComponent
import com.example.worldschoolsteams.src.components.NavigationBarComponent
import com.example.worldschoolsteams.src.components.Posts
import com.example.worldschoolsteams.src.components.PostsItem
import com.example.worldschoolsteams.src.components.PostsList

class HomeScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeList()
        }
    }
}

@Composable
fun HomeList() {
    Column (
        Modifier.fillMaxSize()
    ){
        HeaderComponent()
        NavigationBarComponent()
        PostsList(samplePosts)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeList() {
    HomeList()
}


val samplePosts = listOf(
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