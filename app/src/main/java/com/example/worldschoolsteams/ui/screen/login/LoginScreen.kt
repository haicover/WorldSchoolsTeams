package com.example.worldschoolsteams.ui.screen.login

import android.annotation.SuppressLint
import android.util.Log
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.data.AuthViewModel
import com.example.worldschoolsteams.ui.screen.signup.EmailInput
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInOptions
import com.google.android.gms.common.api.ApiException
import com.google.firebase.auth.GoogleAuthProvider

@SuppressLint("UnrememberedMutableState")
@Composable
fun LoginScreen(
    navController: NavController,
    viewModel: LoginGoogleViewModel = viewModel(),
    authViewModel: AuthViewModel = viewModel(),
) {
    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }// Biến kiểm tra xem email dung dang chua

    //google
    val token = "1009719807804-gca37eg3ovgr0fcnatmju66i2k2lv498.apps.googleusercontent.com"
    val context = LocalContext.current
    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.StartActivityForResult()
    ) {
        val task = GoogleSignIn.getSignedInAccountFromIntent(it.data)
        try {
            val account = task.getResult(ApiException::class.java)
            val credential = GoogleAuthProvider.getCredential(account.idToken, null)
            viewModel.signInWithGoogleCredential(credential) {
                navController.navigate("BottomNavigation")
            }
        } catch (ex: Exception) {
            Log.d("OK", "That bai google")
        }
    }
    LaunchedEffect(key1 = authViewModel.loginUIState.loginSuccessful) {
        if (authViewModel.loginUIState.loginSuccessful) {
            navController.navigate("BottomNavigation")
        }
    }
    val loginUIState = authViewModel?.loginUIState
    val isError = loginUIState?.loginError != null
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    val isButtonEnabled = derivedStateOf {
        isEmailValid(email) && password.length in 6..15
    }
    var isEmailRegistered by remember { mutableStateOf(true) } // Biến kiểm tra xem email đã đăng ký chưa
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(top = 20.dp, start = 20.dp, end = 20.dp, bottom = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.left),
                contentDescription = "Back",
                modifier = Modifier
                    .size(24.dp)
                    .clickable {
                        navController.popBackStack()
                    }
            )

            Text(
                text = "Đăng nhập",
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 16.dp),
                fontSize = 24.sp,
                color = Color.Black,
                textAlign = TextAlign.Center
            )

        }
        //Vien viewBottom
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp) // Chiều cao đường viền dưới
                .background(Color(0xffACACAC)) // Màu của đường viền
        )

        Column(modifier = Modifier.padding(top = 50.dp)) {
            SocialLoginButton(iconRes = R.drawable.facebook, label = "Đăng nhập bằng Facebook") {
                // Facebook login logic
            }
            Spacer(modifier = Modifier.height(10.dp))
            SocialLoginButton(iconRes = R.drawable.google, label = "Đăng nhập bằng Google") {
                val opciones = GoogleSignInOptions
                    .Builder(
                        GoogleSignInOptions.DEFAULT_SIGN_IN
                    )
                    .requestIdToken(token)
                    .requestEmail()
                    .build()
                val googleSingInClinete = GoogleSignIn.getClient(context, opciones)
                launcher.launch(googleSingInClinete.signInIntent)
            }
            Spacer(modifier = Modifier.height(10.dp))
            SocialLoginButton(iconRes = R.drawable.twitter, label = "Đăng nhập bằng Twitter") {
                // Twitter login logic
            }
        }
        Spacer(modifier = Modifier.height(40.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .width(106.dp)
                    .height(1.dp) // Chiều cao đường viền dưới
                    .background(Color(0xffACACAC)) // Màu của đường viền
            )
            Text(
                text = "Đăng nhập bằng email",
                fontSize = 14.sp,
                color = Color(0xffACACAC),
                textAlign = TextAlign.Center,
                modifier = Modifier.weight(1f)
            )
            Box(
                modifier = Modifier
                    .width(106.dp)
                    .height(1.dp) // Chiều cao đường viền dưới
                    .background(Color(0xffACACAC)) // Màu của đường viền
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 50.dp, start = 30.dp, end = 30.dp)
                .clip(RoundedCornerShape(5.dp)),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Input Email
            EmailInput(
                email = email,
                onEmailChange = { email = it }
            )
            // Input Password
            PassInput(
                password = password,
                onPassChange = { password = it }
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        if (!isEmailRegistered && isEmailValid(email)) {
            Text(
                text = buildAnnotatedString {
                    append("Email chưa được đăng kí, hãy ")
                    pushStyle(
                        SpanStyle(
                            color = Color.Black,
                            textDecoration = TextDecoration.Underline
                        )
                    )
                    append("Tạo tài khoản")
                    pop()
                },
                modifier = Modifier.clickable {
                    // Xử lý khi nhấn vào "tạo tài khoản"
                    navController.navigate("signup")
                }
            )
        }

        // Thông báo lỗi nếu email không hợp lệ
        if (!isEmailValid(email) && email.isNotEmpty()) {
            Text(
                "Email không hợp lệ",
                color = Color.Red,
                fontSize = 12.sp
            )
        }

        if (password.length !in 6..15 && password.isNotEmpty()) {
            Text(
                "Mật khẩu phải có từ 6 đến 15 kí tự",
                color = Color.Red,
                fontSize = 12.sp
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
//                authViewModel.login(email, password)
                if (isButtonEnabled.value) {
                    authViewModel.login(email, password) // Call login with email and password
                }
            },
            enabled = isButtonEnabled.value,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 45.dp, end = 45.dp)
                .height(50.dp)
                .background(
                    if (isButtonEnabled.value) Color(0xff8B2323) else Color(0xffA49D9D),
                    shape = RoundedCornerShape(5.dp)
                ),
            colors = ButtonDefaults.buttonColors(
                backgroundColor = if (isButtonEnabled.value) Color(0xff8B2323) else Color(0xffA49D9D),
                contentColor = Color.White
            ),
            elevation = ButtonDefaults.elevation(0.dp)
        ) {
            Text(
                "Xác nhận",
                color = if (isButtonEnabled.value) Color(0xffffffff) else Color(0x80FFFFFF)
            )
        }
        Text(
            "Forgot Password",
            fontSize = 14.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 10.dp)
        )
        Spacer(modifier = Modifier.weight(1f))
        //Vien viewBottom
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 10.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0xffACACAC))
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(50.dp)
                    .padding(top = 10.dp, start = 20.dp, end = 20.dp, bottom = 10.dp),
                verticalAlignment = Alignment.Bottom,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Bạn chưa có tài khoản?",
                    fontSize = 16.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = " Tạo tài khoản.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.clickable {
                        // Điều hướng đến trang đăng ký
                        navController.navigate("signup")
                    }
                )
            }
        }
    }
}

@Composable
fun SocialLoginButton(
    iconRes: Int,
    label: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .width(350.dp)
            .height(50.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(Color(0xffDCDCDC))
            .padding(start = 20.dp)
            .clickable(onClick = onClick),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = iconRes),
            contentDescription = "$label Icon",
            modifier = Modifier.size(25.dp),
            contentScale = ContentScale.Fit
        )
        Text(
            text = label,
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier.weight(1f)
        )
    }
}

@Composable
fun PassInput(
    password: String,
    onPassChange: (String) -> Unit,
) {
    var isPasswordVisible by remember { mutableStateOf(false) }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
            .border(
                BorderStroke(
                    1.dp,
                    Color(0x805E5555).copy(alpha = 0.7f)
                ),
                shape = RoundedCornerShape(10.dp)
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = password,
            onValueChange = onPassChange,
            modifier = Modifier
                .weight(1f)
                .padding(end = 8.dp),
            placeholder = { Text("Password") },
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            singleLine = true,
            visualTransformation = if (isPasswordVisible) VisualTransformation.None else PasswordVisualTransformation()
        )
        IconButton(
            onClick = { isPasswordVisible = !isPasswordVisible }
        ) {
            Icon(
                imageVector = if (isPasswordVisible) Icons.Default.Visibility else Icons.Default.VisibilityOff,
                contentDescription = if (isPasswordVisible) "Hide password" else "Show password"
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun LoginScreenPreview() {
    LoginScreen(
        navController = rememberNavController(),
    )
}