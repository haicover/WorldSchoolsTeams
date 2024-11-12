package com.example.worldschoolsteams.ui.screen.baiviet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.worldschoolsteams.src.model.Post
import javax.inject.Inject

class SavedNewsRepository @Inject constructor() {
    private val _savedPosts = MutableLiveData<List<Post>>(emptyList())

    // Đổi tên getter thành getSavedPosts()
    fun getSavedPosts(): LiveData<List<Post>> {
        return _savedPosts
    }

    fun savePost(post: Post) {
        val currentPosts = _savedPosts.value.orEmpty().toMutableList()
        if (!currentPosts.contains(post)) {
            currentPosts.add(post)
            _savedPosts.value = currentPosts // Cập nhật LiveData
        }
    }

    fun deletePost(post: Post) {
        val currentPosts = _savedPosts.value.orEmpty().toMutableList()
        currentPosts.remove(post)
        _savedPosts.value = currentPosts // Cập nhật LiveData
    }
}