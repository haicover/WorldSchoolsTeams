package com.example.worldschoolsteams.ui.screen.baiviet

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.worldschoolsteams.src.model.Post
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class PostsViewModel : ViewModel() {
    private val _savedPosts = MutableStateFlow<List<Post>>(emptyList())
    val savedPosts: StateFlow<List<Post>> get() = _savedPosts

//    fun toggleSavePost(post: Post) {
//        _savedPosts.value = if (_savedPosts.value.contains(post)) {
//            Log.d("PostsViewModel", "Removing post from saved list: ${post.title}")
//            _savedPosts.value - post
//        } else {
//            Log.d("PostsViewModel", "Adding post to saved list: ${post.title}")
//            _savedPosts.value + post
//        }
//    }

    private val _watchLaterPosts = MutableStateFlow<List<Post>>(emptyList())
    val watchLaterPosts: StateFlow<List<Post>> = _watchLaterPosts

    fun savePost(post: Post) {
        _savedPosts.value += post
    }

    fun addToWatchLater(post: Post) {
        _watchLaterPosts.value += post
    }
}