package com.example.worldschoolsteams.src.components

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.IconButton
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.worldschoolsteams.src.model.Comment

@Composable
fun CommentItem(
    comment: Comment, onLikeClicked: (Comment) -> Unit,
    onReplyClicked: (Comment) -> Unit,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    var likeCount by remember { mutableStateOf(comment.likeCount) }  // Assume `likeCount` is a property in the `Comment` class
    var isLiked by remember { mutableStateOf(false) }
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = comment.userName, fontWeight = FontWeight.Bold)
        Text(text = comment.content, modifier = Modifier.padding(vertical = 4.dp))
        Text(text = comment.timestamp, style = MaterialTheme.typography.body2, color = Color.Gray)
        // Thêm một Row để chứa các icon
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Icon Like
            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = {
                    // Update like count when clicked
                    likeCount += if (isLiked) -1 else 1
                    isLiked = !isLiked
                    onLikeClicked(comment)
                }) {
                    Icon(
                        imageVector = Icons.Default.ThumbUp,
                        contentDescription = "Like",
                        tint = if (isLiked) Color.Blue else Color.Gray
                    )
                }
                // Display like count
                Text(text = likeCount.toString(), color = Color.Gray)
            }

            // Icon để phản hồi hoặc ý kiến về bình luận
            IconButton(onClick = {
                onReplyClicked(comment)
                Toast.makeText(context, "Replying to comment: ${comment.id}", Toast.LENGTH_SHORT).show()
            }) {
                Icon(
                    imageVector = Icons.Default.Comment,
                    contentDescription = "Comment",
                    tint = Color.Gray
                )
            }
        }

        Divider(color = Color.LightGray, thickness = 1.dp)
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewList() {
    CommentItem(
        Comment(
            id = 1,
            userName = "bai sdfldskfjlkf",
            content = "sfdkfjksdljlk",
            timestamp = "22:06 31/10",
            likeCount = 1,
            replies = mutableListOf()
        ),
        onLikeClicked = {},
        onReplyClicked = {}
    )
}