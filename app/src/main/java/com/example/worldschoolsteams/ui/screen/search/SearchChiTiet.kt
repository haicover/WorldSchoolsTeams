package com.example.worldschoolsteams.ui.screen.search

import android.annotation.SuppressLint
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.R
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
import java.time.LocalDate


@SuppressLint("NewApi")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchChiTiet(navController: NavController) {
    val itemTitle = navController.currentBackStackEntry?.arguments?.getString("itemTitle") ?: ""
    var searchQuery by remember { mutableStateOf("") }
    val searchHistory = remember { mutableStateListOf<String>() }
    var startDate by remember { mutableStateOf<LocalDate?>(null) }
    var endDate by remember { mutableStateOf<LocalDate?>(null) }
    var selectedCategory by remember { mutableStateOf("Mới nhất") }
    val categories = listOf(
        "Mới nhất",
        "Bình luận nhiều",
        "Xem nhiều nhất",
        "Đọc nhiều nhất",
        "Giáo dục",
        "Tin tức",
        "Chân dung",
        "Học Tiếng Anh",
        "Diễn đàn",
        "Du học",
        "Giáo dục 4.0",
        "Tuyển sinh"
    )
    // Lấy dữ liệu từ các danh sách
    val allSearch =
        getMoiNhat() + getDocNhieuNhat() + getXemNhieuNhat() + getBinhLuanNhieuNhat() + getTinTuc() + getChanDung() + getHocTiengAnh() + getDienDan() + getDuHoc() + getGiaoDuc() + getTuyenSinh() + getGiaoDucNew()

// Lọc dữ liệu theo từ khóa, chuyên mục và ngày tháng
    val filteredItems = allSearch.filter {
        it.title.contains(searchQuery, ignoreCase = true) &&
                (selectedCategory == "Mới nhất" || it.category == selectedCategory) &&
                (startDate == null || LocalDate.parse(it.date) >= startDate) &&
                (endDate == null || LocalDate.parse(it.date) <= endDate)
    }
    val context = LocalContext.current
    val searchResults = allSearch.filter { it.title.contains(itemTitle, ignoreCase = true) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        // Title or logo, etc.
        Image(
            painter = painterResource(id = R.drawable.logo), // Replace with your image
            contentDescription = "Logo",
            modifier = Modifier
                .padding(top = 30.dp)
                .width(179.dp)
                .height(34.dp),
            contentScale = ContentScale.Crop
        )

        OutlinedTextField(
            value = searchQuery,
            onValueChange = { query ->
                searchQuery = query
            },
            placeholder = { Text("Tìm bài viết") },
            shape = RoundedCornerShape(5.dp),
            colors = TextFieldDefaults.textFieldColors(
                focusedIndicatorColor = Color(0xffECEBEB),
                unfocusedIndicatorColor = Color(0xffECEBEB)
            ),
            leadingIcon = {
                androidx.compose.material3.Icon(
                    Icons.Default.Search,
                    contentDescription = null,
                    tint = Color.Black
                )
            },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Search,
                keyboardType = KeyboardType.Text
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp)
                .shadow(4.dp, RoundedCornerShape(12.dp)),

            )

        // Kết quả tìm kiếm
        if (filteredItems.isEmpty()) {
            Text(
                text = "Không tìm thấy kết quả nào",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.Gray
            )
        } else {
            LazyColumn(
                modifier = Modifier.padding(top = 8.dp)
            ) {
                items(filteredItems) { item ->
                    SearchItemCard(item, navController)
                    Divider(color = Color.LightGray)
                }
            }
        }
    }
}


@Composable
fun SearchItemCard(item: Post, navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .clickable {
                navController.navigate(
                    "BaiVietChiTiet/${item.id}/${Uri.encode(item.title)}/${
                        Uri.encode(
                            item.date
                        )
                    }/${Uri.encode(item.description)}/${Uri.encode(item.imageUrl)}/${Uri.encode(item.timeAgo)}/${
                        Uri.encode(
                            item.category
                        )
                    }"
                )
            }
    ) {
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                // Title Text
                Text(
                    text = item.title,
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.weight(1f) // Expand to take available space
                )

                // Image
                Image(
                    painter = rememberImagePainter(item.imageUrl),
                    contentDescription = null,
                    modifier = Modifier
                        .border(
                            BorderStroke(
                                0.dp,
                                Color(0xffffffff)
                            ), // Viền màu trắng với độ mờ 70%
                            shape = RoundedCornerShape(7.dp) // Đảm bảo viền có cùng bo góc
                        )
                        .width(120.dp)
                        .height(50.dp)// Fixed size for image
                        .padding(start = 16.dp) // Add padding between text and image
                )
            }

            Spacer(modifier = Modifier.height(8.dp))

            // Category and comments section
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween // Space between category and comment section
            ) {
                // Category Text
                Text(
                    text = item.category,
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.weight(1f) // Expand to take available space
                )

                // Comments icon and count
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.message),
                        modifier = Modifier
                            .size(15.dp)
                            .padding(end = 5.dp),
                        contentDescription = "Chat Icon"
                    )
                    Text(
                        text = "10",
                        style = MaterialTheme.typography.h6,
                    )
                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun SearchChiTietPreview() {
    SearchChiTiet(navController = rememberNavController())
}