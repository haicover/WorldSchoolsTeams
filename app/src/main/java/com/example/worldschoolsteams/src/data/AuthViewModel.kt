package com.example.worldschoolsteams.src.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.google.firebase.auth.AuthCredential
import com.google.firebase.auth.FirebaseAuth

class AuthViewModel() : ViewModel() {

    var loginUIState by mutableStateOf(LoginUIState())
        private set

    var signUpUIState by mutableStateOf(SignUpUIState())
        private set
    private var authMethod: AuthMethod? = null // Track the authentication method

    // Define an enum class for authentication methods
    enum class AuthMethod {
        EMAIL_PASSWORD,
        GOOGLE
    }
    // Login function
    fun login(email: String, password: String) {
        // Your logic to authenticate the user with email and password
        // For example, using Firebase Auth
        val auth = FirebaseAuth.getInstance()
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    authMethod = AuthMethod.EMAIL_PASSWORD
                    loginUIState = loginUIState.copy(loginSuccessful = true)
                } else {
                    loginUIState = loginUIState.copy(loginError = task.exception?.message)
                }
            }
    }
    fun loginWithGoogle(credential: AuthCredential) {
        val auth = FirebaseAuth.getInstance()
        auth.signInWithCredential(credential)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    authMethod = AuthMethod.GOOGLE // Set authentication method
                    loginUIState = loginUIState.copy(loginSuccessful = true)
                } else {
                    loginUIState = loginUIState.copy(loginError = task.exception?.message)
                }
            }
    }
    // SignUp function
    fun signUp(email: String, password: String) {
        // Your logic to register the user with email and password
        val auth = FirebaseAuth.getInstance()
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    signUpUIState = signUpUIState.copy(signUpSuccessful = true)
                } else {
                    signUpUIState = signUpUIState.copy(signUpError = task.exception?.message)
                }
            }
    }


    private val auth: FirebaseAuth = FirebaseAuth.getInstance()
    fun logout() {
        val auth = FirebaseAuth.getInstance()
        if (authMethod == AuthMethod.GOOGLE) {
            // Sign out from Google
            auth.signOut() // Sign out from Firebase (includes Google)
        } else {
            // Sign out from email/password (also handled by Firebase)
            auth.signOut()
        }
        // Reset authentication method
        authMethod = null
    }
}

data class LoginUIState(
    val userName: String = "",
    val password: String = "",
    val userNameSignUp: String = "",
    val passwordSignUp: String = "",
    val confirmPasswordSignUp: String = "",
    val isLoading: Boolean = false,
    val loginSuccessful: Boolean = false,
    val signUpError: String? = null,
    val loginError: String? = null
)

data class SignUpUIState(
    val signUpSuccessful: Boolean = false,
    val signUpError: String? = null
)