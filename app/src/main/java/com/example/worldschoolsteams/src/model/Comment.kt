package com.example.worldschoolsteams.src.model

data class Comment (
    val id: Int,
    val userName: String,
    val content: String,
    val timestamp: String,
    var likeCount: Int,
    val replies: MutableList<Comment> = mutableListOf()// Initialize replies
)