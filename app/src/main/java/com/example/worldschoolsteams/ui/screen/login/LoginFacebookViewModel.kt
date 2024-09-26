package com.example.worldschoolsteams.ui.screen.login

import android.app.Activity
import android.content.Intent
import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FacebookAuthProvider
import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.launch

//class LoginFacebookViewModel : ViewModel() {
//    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
//
//    fun handleFacebookAccessToken(token: AccessToken, onSuccess: () -> Unit, onError: (Exception) -> Unit) {
//        val credential = FacebookAuthProvider.getCredential(token.token)
//        auth.signInWithCredential(credential)
//            .addOnCompleteListener { task ->
//                if (task.isSuccessful) {
//                    onSuccess()
//                } else {
//                    task.exception?.let { onError(it) }
//                }
//            }
//    }
//}

