package com.example.worldschoolsteams.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.AlertDialog
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.src.components.CommentItem
import com.example.worldschoolsteams.src.model.Comment
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@SuppressLint("NewApi")
@Composable
fun CommentExample(navController: NavController) {
    // Initialize comments as a mutable state
    val comments = remember { mutableStateOf(listOf<Comment>()) }
    val currentUserName = "Người dùng"

    CommentScreen(
        comments = comments.value,
        onAddComment = { newCommentText ->
            val currentTime = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("HH:mm MM/dd")
            val formattedTime = currentTime.format(formatter)

            val newComment = Comment(
                id = comments.value.size + 1,
                userName = currentUserName,
                content = newCommentText,
                timestamp = formattedTime,
                likeCount = 0
            )

            comments.value += newComment // Cập nhật danh sách bình luận
        },
        currentUserName = currentUserName,
        navController = navController
    )
}

@SuppressLint("NewApi")
@Composable
fun CommentScreen(
    comments: List<Comment>,
    onAddComment: (String) -> Unit,
    currentUserName: String,
    navController: NavController
) {
    var commentText by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }
    var selectedComment by remember { mutableStateOf<Comment?>(null) }

    Column(modifier = Modifier.fillMaxSize()) {
        Text(
            text = "Ý kiến (${comments.size})",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(20.dp)
        )

        LazyColumn(modifier = Modifier.weight(1f)) {
            items(comments) { comment ->
                CommentItem(
                    comment = comment,
                    onLikeClicked = { likedComment ->
                        // Handle like click
                    },
                    onReplyClicked = { repliedComment ->
                        // Open reply dialog
                        selectedComment = repliedComment
                        showDialog = true
                    }
                )
                // Display replies below the original comment
                comment.replies.forEach { reply ->
                    CommentItem(
                        comment = reply,
                        onLikeClicked = { likedComment ->
                            // Handle like for the reply
                        },
                        onReplyClicked = { repliedComment ->
                            selectedComment = repliedComment
                            showDialog = true
                        },
                        modifier = Modifier.padding(start = 20.dp) // Indent reply
                    )
                }
            }
        }

        Row(
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {
                navController.popBackStack()
            }) {
                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "back Icon",
                    tint = Color.Black
                )
            }
            OutlinedTextField(
                value = commentText,
                onValueChange = { commentText = it },
                modifier = Modifier
                    .weight(1f)
                    .height(55.dp),
                placeholder = { Text("Nhập bình luận của bạn...") }
            )
            Spacer(modifier = Modifier.width(8.dp))
            Button(onClick = {
                if (commentText.isNotBlank()) {
                    onAddComment(commentText)
                    commentText = "" // Clear text after submitting
                }
            }) {
                Text("Gửi")
            }
        }

        // Show dialog for replying to a comment if needed
        if (showDialog && selectedComment != null) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = { Text("Trả lời ý kiến") },
                text = {
                    Column {
                        Text("Phản hồi đến: ${selectedComment?.userName}")
                        OutlinedTextField(
                            value = commentText,
                            onValueChange = { commentText = it },
                            modifier = Modifier.fillMaxWidth(),
                            placeholder = { Text("Nhập ý kiến của bạn...") }
                        )
                    }
                },
                confirmButton = {
                    TextButton(onClick = {
                        selectedComment?.replies?.add(
                            Comment(
                                id = selectedComment!!.replies.size + 1,
                                userName = currentUserName,
                                content = commentText,
                                timestamp = LocalDateTime.now()
                                    .format(DateTimeFormatter.ofPattern("HH:mm MM/dd")), // Update timestamp as needed
                                likeCount = 0
                            )
                        )
                        commentText = ""
                        showDialog = false
                    }) {
                        Text("Gửi")
                    }
                },
                dismissButton = {
                    TextButton(onClick = { showDialog = false }) {
                        Text("Hủy")
                    }
                }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewList() {
    CommentExample(navController = rememberNavController())
}
