package com.example.worldschoolsteams.src.components

import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.FileProvider
import androidx.core.graphics.drawable.toBitmap
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.ImageLoader
import coil.request.ImageRequest
import coil.request.SuccessResult
import com.example.worldschoolsteams.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.io.File


@Composable
fun BottomBaiViet(navController: NavHostController, title: String, imageUrl: String) {
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
            ShareImageButton(title = title, imageUrl = imageUrl)
        }
    }
}

@Composable
fun ShareImageButton(imageUrl: String, title: String) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()

    IconButton(
        onClick = {
            coroutineScope.launch(Dispatchers.IO) {
                shareContent(context, imageUrl, title)
            }
        }
    ) {
        Icon(
            painter = painterResource(id = R.drawable.chiase),
            contentDescription = "Share Icon",
            tint = Color.Gray,
            modifier = Modifier.size(25.dp)
        )
    }
}

private suspend fun shareContent(context: Context, imageUrl: String, title: String) {
    val imageLoader = ImageLoader(context)
    val request = ImageRequest.Builder(context)
        .data(imageUrl)
        .allowHardware(false)
        .build()

    val result = (imageLoader.execute(request) as? SuccessResult)?.drawable
    result?.let { drawable ->
        val file = File(context.cacheDir, "shared_image.png")
        file.outputStream().use { outputStream ->
            drawable.toBitmap().compress(Bitmap.CompressFormat.PNG, 100, outputStream)
        }

        val imageUri: Uri = FileProvider.getUriForFile(
            context,
            "${context.packageName}.fileprovider",
            file
        )

        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "image/*"
            putExtra(Intent.EXTRA_TEXT, title)
            putExtra(Intent.EXTRA_STREAM, imageUri)
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
        context.startActivity(Intent.createChooser(shareIntent, "Share Post With"))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewBottomBaiViet() {
    BottomBaiViet(
        navController = rememberNavController(),
        "Mô tả bài viết mới nhất 1",
        "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
    )
}