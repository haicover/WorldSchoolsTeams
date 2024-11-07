package com.example.worldschoolsteams.ui.screen.baiviet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.worldschoolsteams.src.model.Post
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SavedNewsViewModel @Inject constructor(private val repository: SavedNewsRepository) : ViewModel() {
    // LiveData chứa danh sách các bài viết đã lưu
    private val _savedPosts = MutableLiveData<List<Post>>()
    val savedPosts: LiveData<List<Post>> get() = _savedPosts

    // Hàm lưu bài viết
    fun savePost(post: Post) {
        repository.savePost(post)
    }

    // Hàm xóa bài viết
    fun deletePost(post: Post) {
        repository.deletePost(post)
    }
}