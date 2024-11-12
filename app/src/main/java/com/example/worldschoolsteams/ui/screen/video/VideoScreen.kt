package com.example.worldschoolsteams.ui.screen.video

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
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
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.model.VideoItem
import com.example.worldschoolsteams.src.model.getVideoGiaiTri
import com.example.worldschoolsteams.src.model.getVideoGiaoDuc
import com.example.worldschoolsteams.src.model.getVideoSucKhoe
import com.example.worldschoolsteams.src.model.getVideoTheThao
import com.example.worldschoolsteams.src.model.getVideoThoiSu
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


fun getVideoByCategory(category: String): List<VideoItem> {
    return when (category) {
        "Thời sự" -> getVideoThoiSu()
        "Thể thao" -> getVideoTheThao()
        "Giải trí" -> getVideoGiaiTri()
        "Sức khỏe" -> getVideoSucKhoe()
        "Giáo dục" -> getVideoGiaoDuc()

        else -> emptyList()
    }
}

@Composable
fun VideoScreen(category: String, navController: NavController) {
    var isDialogVisible by remember { mutableStateOf(false) }
    var selectedVideoUri by remember { mutableStateOf("") }
    var selectedCategory by remember { mutableStateOf("Thời sự") }
    // Sample data for video list
    val videos = remember(selectedCategory) { getVideoByCategory(selectedCategory) }

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // Fixed header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo1), // Replace with your image
                contentDescription = "Logo",
                modifier = Modifier.size(30.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Video",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff8B2323)
            )
        }
        // Category Navigation Bar (fixed)
        NavigationBarVideo(
            navController = navController,
            selectedCategory = selectedCategory,
            onCategorySelected = { category ->
                selectedCategory = category
            }
        )

        Spacer(modifier = Modifier.height(16.dp))

        // Scrollable video list
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp)
        ) {
            items(videos) { video ->
                VideoListItem(video, onVideoClick = { uri ->
                    selectedVideoUri = uri
                    isDialogVisible = true
                })
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }

    // Dialog to show video player
    if (isDialogVisible) {
        VideoDialog(
            videoUri = selectedVideoUri,
            onDismiss = { isDialogVisible = false }
        )
    }
}

@Composable
fun VideoListItem(video: VideoItem, onVideoClick: (String) -> Unit) {
    var isBookmarked by rememberSaveable { mutableStateOf(false) }
    var isPressed by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(if (isPressed) Color(0xFFF0F0F0) else Color.Transparent)
            .clickable {
                onVideoClick(video.urlVideo)
                isPressed = !isPressed
            }
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center // Center the play icon over the image
        ) {
            Image(
                painter = rememberImagePainter(data = video.urlImage), // Replace with thumbnail image
                contentDescription = "Thumbnail",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .clickable { onVideoClick(video.urlVideo) },
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.play_circle),
                    contentDescription = "Play Icon",
                    modifier = Modifier.size(50.dp),
                    tint = Color(0xB3000000)
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Tiêu đề video và các biểu tượng
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = video.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Text(
                    text = video.description,
                    fontSize = 14.sp,
                    color = Color.Gray
                )
            }

        }

        Spacer(modifier = Modifier.height(8.dp))

        // Hàng chứa thông tin bổ sung
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Thời sự",
                fontSize = 12.sp,
                color = Color.Gray,
            )
            IconButton(onClick = { isBookmarked = !isBookmarked }) {
                Icon(
                    imageVector = if (isBookmarked) Icons.Default.Bookmark else Icons.Default.BookmarkBorder,
                    contentDescription = "Bookmark Icon",
                    tint = if (isBookmarked) Color(0xFF2196F3) else Color.Gray
                )
            }
        }
    }
}

@Composable
fun VideoDialog(videoUri: String, onDismiss: () -> Unit) {
    val lifecycleOwner = LocalLifecycleOwner.current
    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false),

        ) {
        Surface(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(20.dp), // Padding to space it from screen edges
            shape = RoundedCornerShape(10.dp),
            color = Color.White, // Background color of the dialog
            elevation = 8.dp // Elevation for shadow effect
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(start = 20.dp, end = 20.dp),
                contentAlignment = Alignment.Center
            ) {
                Column(
                    modifier = Modifier.padding(10.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight()
                            .clip(RoundedCornerShape(10.dp)) // Đảm bảo border radius
                            .border(
                                BorderStroke(
                                    1.dp,
                                    Color(0x805E5555).copy(alpha = 0.7f)
                                ),
                                shape = RoundedCornerShape(10.dp) // Đảm bảo border có border radius
                            )
                    ) {
                        AndroidView(
                            factory = { context ->
                                YouTubePlayerView(context).apply {
                                    // Add lifecycle observer to automatically manage player lifecycle
                                    lifecycleOwner.lifecycle.addObserver(this)

                                    // Add YouTube player listener to load and play video
                                    addYouTubePlayerListener(object :
                                        AbstractYouTubePlayerListener() {
                                        override fun onReady(youTubePlayer: YouTubePlayer) {
                                            youTubePlayer.loadVideo(videoUri, 0f)
                                        }
                                    })
                                }
                            },
                            modifier = Modifier.fillMaxWidth()
                        )
                    }

                    Spacer(modifier = Modifier.height(10.dp))
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        IconButton(onClick = onDismiss) {
                            Icon(
                                painter = painterResource(id = R.drawable.cancel),
                                contentDescription = "cancel Icon",
                                modifier = Modifier.size(50.dp),
                                tint = Color(0xB3000000)
                            )
                        }

                    }
                }
            }
        }
    }
}

@Composable
fun NavigationBarVideo(
    navController: NavController,
    selectedCategory: String,
    onCategorySelected: (String) -> Unit
) {
    var showCategories by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .height(50.dp)
            .padding(start = 9.dp)
            .horizontalScroll(rememberScrollState()),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        // Menu Items
        val menuItems =
            listOf("Thời sự", "Thể thao", "Giải trí", "Sức khỏe", "Giáo dục")
        menuItems.forEach { item ->
            TextButton(
                onClick = {
                    onCategorySelected(item)
                    showCategories = item == "Giáo dục"
                },
            ) {
                Text(
                    text = item,
                    fontSize = 15.sp,
                    color = if (item == selectedCategory) Color.Black else Color.Gray,
                    fontWeight = if (item == selectedCategory) FontWeight.Bold else FontWeight.Normal,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewVideoList() {
    VideoScreen(category = "Thời sự", navController = rememberNavController())
}