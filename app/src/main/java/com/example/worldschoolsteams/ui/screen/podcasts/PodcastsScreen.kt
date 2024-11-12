package com.example.worldschoolsteams.ui.screen.podcasts

import android.media.MediaPlayer
import android.net.Uri
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.BookmarkBorder
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.model.PodcastItem

val podcastItem = listOf(
    PodcastItem(
        id = 1,
        audioResId = R.raw.url1, // First audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/10/31/Frame1826-1730350713-2658-1730351964.jpg?w=320&h=320&q=100&dpr=1&fit=crop&s=gqLPsVB7jRekfR6QkIc3TQ",
        title = "Bí ẩn vị trí lăng mộ của Cleopatra",
        description = "Các nhà khảo cổ tìm được nhiều cổ vật từ thời Cleopatra trong cung điện đã chìm dưới đáy biển, nhưng lăng mộ của bà vẫn còn là một dấu hỏi.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 2,
        audioResId = R.raw.url2, // Second audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/04/Frame1774-1730659967-3000-1730660649.jpg?w=320&h=320&q=100&dpr=1&fit=crop&s=9Z6-pVaoT94KaGojYDFSZg",
        title = "Vì sao bầu cử Mỹ khó bị gian lận?",
        description = "Quy trình bầu cử nhiều lớp của Mỹ cung cấp các biện pháp bảo vệ giúp gian lận cử tri thường dễ phát hiện và hiếm khi xảy ra, chẳng hạn như việc bầu hai lần hay trùng tên với người đã khuất.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 3,
        audioResId = R.raw.url3, // Third audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/03/2420b47e98e3450ba9a34a209a8d24-3272-3635-1730570869.jpg?w=320&h=320&q=100&dpr=1&fit=crop&s=jOJRk3-2yuIQ3sNDx44JxA",
        title = "Người Việt ở Tây Ban Nha: 'Choáng vì mùi chết chóc'",
        description = "Đăng ký đi cứu trợ ở Valencia sau trận lũ lịch sử, chị Thanh Thảo, 40 tuổi, choáng váng với cảnh tượng thành phố như vừa trải qua trận chiến, sặc mùi chết chóc.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 4,
        audioResId = R.raw.url4, // Fourth audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/06/de2jpg168215312717307998361577-2540-4982-1730847604.jpg?w=320&h=320&q=100&dpr=1&fit=crop&s=Ujjhe4oh_UGRuL9zIo0yEw",
        title = "Điểm tin 6h: 8 năm trắc trở của dự án chống ngập 10.000 tỷ | Israel sa thải Bộ trưởng Quốc phòng",
        description = "CEO Công ty Tường Việt muốn nhận lại 53 bất động sản trong vụ án Vạn Thịnh Phát; Kéo dài thời gian thí điểm cho người Việt vào chơi casino...\n",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 5,
        audioResId = R.raw.url1, // Fifth audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/06/Frame1776-1730828488-8226-1730829091.jpg?w=320&h=320&q=100&dpr=1&fit=crop&s=uulpBTSBJcaWk88MeUquNA",
        title = "AI khiến con người thất nghiệp như thế nào?",
        description = "Trong 15 năm nữa, khoảng 40% công việc trên thế giới sẽ bị thay thế, AI được cho là làm tốt hơn trong các ngành như chăm sóc khách hàng hay nhân viên văn phòng cơ bản.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 6,
        audioResId = R.raw.url2, // Sixth audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/04/Frame1775-1730687198-6490-1730688616.jpg?w=320&h=320&q=100&dpr=1&fit=crop&s=P0s_ylJYNiKBDgEZLNoEYg",
        title = "Nghi án thái sư Lê Văn Thịnh dùng tà thuật giết vua",
        description = "Đằng sau vụ án \"hoá hổ\" giết vua của Lê Văn Thịnh có thể là một âm mưu thanh trừng chính trị giữa hai ý thức hệ Nho giáo và Phật giáo.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 7,
        audioResId = R.raw.url2, // Seventh audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/04/chobachieu-1730739505-9731-1730739561.jpg?w=100&h=100&q=100&dpr=1&fit=crop&s=HwT6d0LWZSKDcf50jLW6og",
        title = "Hàng giá rẻ bóp nghẹt tiểu thương, doanh nghiệp bán lẻ",
        description = "18h chiều, ngồi thẩn thơ bên sạp quần áo, bà Thảo, 57 tuổi, tiểu thương tại chợ Bà Chiểu, vẫn chưa mở hàng, lượng khách giảm 90%, thê thảm nhất trong 30 năm buôn bán.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    ),
    PodcastItem(
        id = 8,
        audioResId = R.raw.url3, // Eighth audio file in res/raw
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/11/05/alcaponesmokesacigaronthetrain-7033-3648-1730777513.jpg?w=100&h=100&q=100&dpr=1&fit=crop&s=ktHkybCZUfI1wiOitWfDmA",
        title = "Cuộc thanh trừng mafia bắn 160 viên đạn trong 2 phút",
        description = "Năm 1921, băng đảng của ông trùm rượu lậu Al Capone được cho là đã kết liễu 7 kẻ thù trong 2 phút tại một căn nhà ở Chicago, rồi trốn thoát mà không để lại bằng chứng kết tội nào.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
    )
)

@Composable
fun PodcastsScreen(navController: NavController) {
    val podcastList = podcastItem
    var currentPlayingId by remember { mutableStateOf<Int?>(null) }
    var mediaPlayer by remember { mutableStateOf<MediaPlayer?>(null) }

    DisposableEffect(Unit) {
        onDispose {
            mediaPlayer?.release()
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = "Logo",
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Podcasts",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff8B2323)
            )
        }
        LazyColumn {
            items(podcastList) { podcast ->
                val isPlaying = podcast.id == currentPlayingId
                PodcastItem(podcast, isPlaying) {
                    navController.navigate(
                        "podcast_detail/${podcast.id}/${podcast.audioResId}/${
                            Uri.encode(
                                podcast.imageUrl
                            )
                        }/${Uri.encode(podcast.title)}/${Uri.encode(podcast.description)}/${
                            Uri.encode(
                                podcast.date
                            )
                        }"
                    )
                }
            }
        }

    }
}

@Composable
fun PodcastItem(
    podcast: PodcastItem, isPlaying: Boolean,
    onPlayPauseClick: () -> Unit
) {
    var isPressed by remember { mutableStateOf(false) }
    var isBookmarked by rememberSaveable { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(if (isPressed) Color(0xFFF0F0F0) else Color.Transparent)
            .clickable { onPlayPauseClick() }
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp)),
            contentAlignment = Alignment.Center
        ) {
            // Hình ảnh đại diện podcast
            Image(
                painter = rememberImagePainter(data = podcast.imageUrl),
                contentDescription = "Podcast Image",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .clickable { onPlayPauseClick() },
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

        // Thông tin tiêu đề podcast
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column {
                Text(
                    text = podcast.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    color = Color.Black
                )
                Text(
                    text = podcast.description,
                    fontSize = 14.sp,
                    color = Color.Gray,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
        Spacer(modifier = Modifier.height(8.dp))

        // Biểu tượng và thông tin bổ sung
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Tin tức",
                fontSize = 12.sp,
                color = Color.Gray
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
fun SeekBar(
    currentPosition: Int,
    duration: Int,
    onSeekChange: (Int) -> Unit
) {
//    val progress = (currentPosition / duration.toFloat() * 100).toInt()
    val progress = if (duration > 0) (currentPosition / duration.toFloat() * 100).toInt() else 0
    Column(modifier = Modifier.fillMaxWidth()) {
        Slider(
            value = progress.toFloat(),
            onValueChange = { newValue ->
                // Update the position based on the slider's value
                val newPosition = (newValue / 100 * duration).toInt()
                onSeekChange(newPosition)
            },
            valueRange = 0f..100f,
            modifier = Modifier.fillMaxWidth()
        )
        Text(
            text = String.format(
                "%02d:%02d / %02d:%02d",
                (currentPosition / 1000) / 60,
                (currentPosition / 1000) % 60,
                (duration / 1000) / 60,
                (duration / 1000) % 60
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPodcastsList() {
    val navController = rememberNavController()
    PodcastsScreen(navController = navController)
}