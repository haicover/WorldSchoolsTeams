package com.example.worldschoolsteams.ui.screen.podcasts

import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Forward30
import androidx.compose.material.icons.filled.Pause
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Replay
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.model.PodcastItem
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@Composable
fun PodcastDetailScreen(
    id: Int,
    audioResId: Int,
    imageUrl: String,
    title: String,
    description: String,
    date:String,
    mediaPlayer: MediaPlayer?,
    navController: NavController
) {
    val context = LocalContext.current
    val mediaPlayer: MediaPlayer = MediaPlayer.create(context, audioResId)
    var currentPosition by remember { mutableStateOf(0) }
    var isPlaying by remember { mutableStateOf(mediaPlayer.isPlaying) }
    val duration = mediaPlayer.duration
    // Effect to update current position while playing
    LaunchedEffect(mediaPlayer.isPlaying) {
        while (mediaPlayer.isPlaying) {
            currentPosition = mediaPlayer.currentPosition
            delay(1000) // Update every second
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),

        ) {
        // Back button
        IconButton(onClick = {
            navController.popBackStack()
        }) {
            Icon(imageVector = Icons.Default.ArrowBack, contentDescription = "Back")
        }

        // Podcast details
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = title, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = date)
            Spacer(modifier = Modifier.height(8.dp))
            Image(
                painter = rememberImagePainter(data = imageUrl),
                contentDescription = title,
                modifier = Modifier.size(100.dp),
                contentScale = ContentScale.Crop
            )

            Spacer(modifier = Modifier.height(8.dp))

            // SeekBar
            SeekBar(
                currentPosition = currentPosition,
                duration = duration,
                onSeekChange = { newPosition ->
                    mediaPlayer.seekTo(newPosition)
                    currentPosition = newPosition // Update position immediately
                }
            )

            // Control buttons to skip forward/backward
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                // Rewind Button
                IconButton(onClick = {
                    val newPosition = (currentPosition - 2000).coerceAtLeast(0)
                    mediaPlayer.seekTo(newPosition)
                    currentPosition = newPosition
                    if (!mediaPlayer.isPlaying) mediaPlayer.start()
                }) {
                    Icon(imageVector = Icons.Default.Replay, contentDescription = "Rewind 2s")
                }

                // Play/Pause Button
                Button(onClick = {
                    if (mediaPlayer.isPlaying) {
                        mediaPlayer.pause()
                        isPlaying = false
                    } else {
                        mediaPlayer.start()
                        isPlaying = true
                    }
                }) {
                    Text(text = if (isPlaying) "Pause" else "Play")
                }

                // Forward Button
                IconButton(onClick = {
                    val newPosition = (currentPosition + 3000).coerceAtMost(duration)
                    mediaPlayer.seekTo(newPosition)
                    currentPosition = newPosition
                    if (!mediaPlayer.isPlaying) mediaPlayer.start()
                }) {
                    Icon(imageVector = Icons.Default.Forward30, contentDescription = "Forward 3s")
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = description)
        }
    }
}

// Helper function to format the date
fun formatDate(date: Long): String {
    val formatter = SimpleDateFormat("dd/MM/yyyy HH:mm", Locale.getDefault())
    return formatter.format(Date(date))
}


@Preview(showBackground = true)
@Composable
fun PreviewPodcastDetailScreen() {

    val mediaPlayer: MediaPlayer? = null // Replace with actual mock media player if needed

    // Use a no-op for onBackPress since this is a preview
    PodcastDetailScreen(
        id = 1,
        audioResId = R.raw.url2,
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
        title = "Sample Podcast",
        description = "This is a sample description for the podcast.",
        date = "Thứ năm, 31/10/2024, 11:00 (GMT+7)",
        mediaPlayer = mediaPlayer,
        navController = rememberNavController()
    )
}