package com.example.worldschoolsteams.ui.screen.baiviet

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.worldschoolsteams.src.model.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor() : ViewModel() {
    private val _savedPosts = MutableStateFlow<List<Post>>(emptyList())
    val savedPosts: StateFlow<List<Post>> = _savedPosts.asStateFlow()

    fun savePost(post: Post) {
        val currentList = _savedPosts.value.toMutableList()
        if (!currentList.contains(post)) {
            currentList.add(post)
            _savedPosts.value = currentList
        }
    }

    fun removeSavedPost(post: Post) {
        val currentList = _savedPosts.value.toMutableList()
        currentList.remove(post)
        _savedPosts.value = currentList
    }

    private val _watchLaterPosts = MutableStateFlow<List<Post>>(emptyList())
    val watchLaterPosts: StateFlow<List<Post>> = _watchLaterPosts

//    fun savePost(post: Post) {
//        _savedPosts.value += post
//    }

    fun addToWatchLater(post: Post) {
        _watchLaterPosts.value += post
    }


}