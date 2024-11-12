package com.example.worldschoolsteams.ui.screen.search

import android.net.Uri
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {
    var searchQuery by remember { mutableStateOf("") }
    val searchHistory = remember { mutableStateListOf<String>() }
    val allSearch =
        getMoiNhat() + getDocNhieuNhat() + getXemNhieuNhat() + getBinhLuanNhieuNhat() + getTinTuc() + getChanDung() + getHocTiengAnh() + getDienDan() + getDuHoc() + getGiaoDuc() + getTuyenSinh() + getGiaoDucNew()
    val filteredItems = allSearch.filter { it.title.contains(searchQuery, ignoreCase = true) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo), // Replace with your image
            contentDescription = "Logo",
            modifier = Modifier
                .padding(top = 30.dp)
                .width(179.dp)
                .height(34.dp),
            contentScale = ContentScale.Crop
        )
        Box(
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 30.dp, bottom = 30.dp)
        ) {
            OutlinedTextField(
                value = searchQuery,
//                onValueChange = { searchQuery = it },
                onValueChange = { query ->
                    searchQuery = query
                    if (query.isNotEmpty() && query !in searchHistory) {
                        searchHistory.add(query) // Add to history if not already there
                    }
                },
                placeholder = { Text("Tìm bài viết") },
                shape = RoundedCornerShape(5.dp),
                colors = TextFieldDefaults.textFieldColors(
                    focusedIndicatorColor = Color(0xffECEBEB),
                    unfocusedIndicatorColor = Color(0xffECEBEB)
                ),
                leadingIcon = {
                    Icon(
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
                    .background(Color(0xffECEBEB))

            )
        }

        // Display history or results
        if (searchQuery.isEmpty()) {
            // Display history
            LazyColumn {
                items(searchHistory) { item ->

                    HistoryItem(item) {
                        // Navigate to search detail
                        navController.navigate("SearchChiTiet/$item")
                    }

                }
            }

        } else {
            // Display search results (replace with actual search logic)

            if (filteredItems.isEmpty()) {
                // Show a message if no results found
                Text(
                    text = "No results found for \"$searchQuery\"",
                    modifier = Modifier.padding(16.dp),
                    style = MaterialTheme.typography.bodyMedium
                )
            } else {

                LazyColumn {
                    items(filteredItems) { item ->
                        SearchResultItem(item, navController)
                    }
                }

            }
        }

    }
}

@Composable
fun HistoryItem(query: String, onClick: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .clickable(onClick = onClick)
    ) {
        androidx.compose.material.Icon(Icons.Default.History, contentDescription = "History Icon")
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = query)
        Spacer(modifier = Modifier.weight(1f))
        androidx.compose.material.Icon(
            Icons.Default.KeyboardArrowRight,
            contentDescription = "Arrow Right"
        )
    }
}

@Composable
fun SearchResultItem(
    post: Post,
    navController: NavController
) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .clickable {
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
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Title Text
            Text(
                text = post.title,
                style = MaterialTheme.typography.titleMedium,
                modifier = Modifier.weight(1f) // Expand to take available space
            )

            // Image
            Image(
                painter = rememberImagePainter(post.imageUrl),
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
                text = post.category,
                style = MaterialTheme.typography.bodyMedium,
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
                    style = MaterialTheme.typography.bodySmall,
                )
            }
        }
    }
}


@Composable
@Preview(showBackground = true)
fun SearchScreenPreview() {
    SearchScreen(navController = rememberNavController())
}