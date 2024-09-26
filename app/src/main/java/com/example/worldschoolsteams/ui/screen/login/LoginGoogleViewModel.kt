package com.example.worldschoolsteams.ui.screen.login

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.Firebase
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import kotlinx.coroutines.launch

class LoginGoogleViewModel : ViewModel() {
    private val auth: FirebaseAuth = Firebase.auth
    private val _loading = MutableLiveData(false)

    fun signInWithGoogleCredential(credential: AuthCredential, bottomNavigation: () -> Unit) =
        viewModelScope.launch {
            try {
                auth.signInWithCredential(credential)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            Log.d("Ok", "Thanh cong Google")
                            bottomNavigation()
                        }
                    }.addOnFailureListener {
                        Log.d("Ok", "That bai Google")
                    }
            } catch (ex: Exception) {
                Log.d("Ok", "Google" + "${ex.localizedMessage}")
            }
        }
}