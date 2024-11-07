package com.example.worldschoolsteams.src.components

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.rememberBottomAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.model.Post


@Composable
fun BottomBaiViet(
    navController: NavHostController, title: String,
    imageUrl: String
) {
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Icon Search
        IconButton(onClick = {
            navController.popBackStack()
        }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Back Icon",
                tint = Color.Gray,
                modifier = Modifier.size(25.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(0.dp),
            modifier = Modifier.padding(end = 15.dp)
        ) {
            IconButton(onClick = {}) {
                Text(
                    "Aa",
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    fontSize = 25.sp
                )
            }
            IconButton(onClick = { navController.navigate("Comment") }) {
                Icon(
                    painter = painterResource(id = R.drawable.message),
                    contentDescription = "comment Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(onClick = { /* Do something when notification icon is clicked */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = "luu Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(onClick = {
                shareContent(
                    context,
                    title, imageUrl
                )
            }) {
                Icon(
                    painter = painterResource(id = R.drawable.chiase),
                    contentDescription = "chiase Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
    }
}

fun shareContent(context: Context, title: String, imageUrl: String) {
    val shareMessage = "Check out this post: $title\n$imageUrl"

    val sendIntent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, shareMessage)
        type = "text/plain"
    }
    // Create a chooser to let the user select the app to share with
    val chooser = Intent.createChooser(sendIntent, null)
    // Start the sharing activity
    context.startActivity(chooser) // Use context here

}

@Preview(showBackground = true)
@Composable
fun PreviewBottomBaiViet() {
    BottomBaiViet(
        navController = rememberNavController(),
        title = "Bài viết mới nhất 1",
        imageUrl = "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ"
    )
}
