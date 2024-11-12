package com.example.worldschoolsteams.ui.screen.signup

import android.annotation.SuppressLint
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
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

@SuppressLint("UnrememberedMutableState")
@Composable
fun SignUpScreen(navController: NavController, authViewModel: AuthViewModel = viewModel()) {
    fun isEmailValid(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    } // Biến kiểm tra xem email dung dang chua

    LaunchedEffect(key1 = authViewModel.signUpUIState.signUpSuccessful) {
        if (authViewModel.signUpUIState.signUpSuccessful) {
            navController.navigate("login")
        }
    }
    val loginUIState = authViewModel?.loginUIState
    val isError = loginUIState?.signUpError != null
    val context = LocalContext.current
    var password by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var rePassword by remember { mutableStateOf("") } // Biến cho mật khẩu xác nhận
    var emailError by remember { mutableStateOf(false) } // Biến theo dõi lỗi email
    var passwordError by remember { mutableStateOf(false) } // Biến theo dõi lỗi mật khẩu
    var rePasswordError by remember { mutableStateOf(false) } // Biến theo dõi lỗi xác nhận mật khẩu
    val isButtonEnabled = derivedStateOf {
        val isEmailValid = isEmailValid(email)
        val isPasswordLengthValid = password.length in 6..15
        val doPasswordsMatch = password == rePassword

        emailError = !isEmailValid
        passwordError = !isPasswordLengthValid
        rePasswordError = password.isNotEmpty() && !doPasswordsMatch

        isEmailValid && isPasswordLengthValid && doPasswordsMatch // Cập nhật điều kiện cho nút
    }
    var isEmailRegistered by remember { mutableStateOf(true) } // Biến kiểm tra xem email đã đăng ký chưa

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
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
                text = "Tạo tài khoản",
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
                onPassChange = { password = it },
                label = "Password"
            )
            // Input RePassword
            PassInput(
                password = rePassword,
                onPassChange = { rePassword = it },
                label = "Re-Password"
            )
            // Thông báo lỗi email không hợp lệ
            if (emailError) {
                Text("Email không hợp lệ", color = Color.Red, fontSize = 12.sp)
            }
            // Thông báo lỗi mật khẩu không hợp lệ
            if (passwordError) {
                Text("Mật khẩu phải có từ 6 đến 15 kí tự", color = Color.Red, fontSize = 12.sp)
            }
            // Thông báo lỗi mật khẩu không khớp
            if (rePasswordError) {
                Text("Mật khẩu không khớp", color = Color.Red, fontSize = 12.sp)
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        // Thông báo cho người dùng đăng ký tài khoản
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
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = {
                if (isButtonEnabled.value) {
                    authViewModel.signUp(email, password) // Call signUp with email and password
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
                    text = "Bạn đã có tài khoản?",
                    fontSize = 16.sp,
                    color = Color.Black,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = " Đăng nhập.",
                    fontSize = 16.sp,
                    color = Color.Black,
                    textDecoration = TextDecoration.Underline,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.clickable {
                        // Điều hướng đến trang đăng ký
                        navController.navigate("login")
                    }
                )
            }
        }
    }
}

@Composable
fun EmailInput(
    email: String,
    onEmailChange: (String) -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 12.dp)
    ) {
        TextField(
            value = email,
            onValueChange = onEmailChange,
            modifier = Modifier
                .fillMaxWidth()
                .border(
                    BorderStroke(
                        1.dp,
                        Color(0x805E5555).copy(alpha = 0.7f)
                    ), // Viền màu trắng với độ mờ 70%
                    shape = RoundedCornerShape(10.dp) // Đảm bảo viền có cùng bo góc
                ),
            placeholder = { Text("Email") },
            textStyle = TextStyle(fontSize = 16.sp),
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent
            ),
            singleLine = true
        )
    }
}

@Composable
fun PassInput(
    label: String,
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
                ), // Viền màu trắng với độ mờ 70%
                shape = RoundedCornerShape(10.dp) // Đảm bảo viền có cùng bo góc
            ),
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = password,
            onValueChange = onPassChange,
            placeholder = { Text(label) },
            modifier = Modifier
                .weight(1f)  // Để TextField chiếm hết chiều rộng còn lại
                .padding(end = 8.dp),
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


@Composable
@Preview(showBackground = true)
fun SignUpScreenPreview() {
    SignUpScreen(navController = rememberNavController())
}