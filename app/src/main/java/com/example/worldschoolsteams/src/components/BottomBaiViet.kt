package com.example.worldschoolsteams.src.components

import android.os.Bundle
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.worldschoolsteams.R

class BottomBaiViet : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComponentBottomBaiViet()
        }
    }
}

@Composable
fun ComponentBottomBaiViet() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(80.dp)
            .padding(0.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Icon Search
        IconButton(onClick = { /* Do something when search icon is clicked */ }) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "Search Icon",
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
            IconButton(onClick = { /* Do something when notification icon is clicked */ }) {
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
            IconButton(onClick = { /* Do something when notification icon is clicked */ }) {
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


@Preview(showBackground = true)
@Composable
fun PreviewBottomBaiViet() {
    ComponentBottomBaiViet()
}