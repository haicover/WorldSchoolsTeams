package com.example.worldschoolsteams.ui.screen.menu

import android.widget.Toast
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
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForwardIos
import androidx.compose.material.icons.filled.Bookmark
import androidx.compose.material.icons.filled.Brightness6
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Schedule
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.ui.screen.baiviet.PostsViewModel
import com.google.firebase.auth.FirebaseAuth


@Composable
fun MenuScreen(navController: NavHostController, viewModel: PostsViewModel) {
    var selectedButton by remember { mutableStateOf("Bật") } // Default selected button
    val mAuth = remember { FirebaseAuth.getInstance() }
    val savedPosts by viewModel.savedPosts.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo1), // Replace with your image
                contentDescription = "Logo",
                modifier = Modifier
                    .size(30.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Menu",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff8B2323)
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Tài khoản ",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xffACACAC)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0x66999999))
            )
            //layoutSuaTaiKhoan
            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .clickable { navController.navigate("SuaTaiKhoan")},
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "Person Icon",
                    tint = Color(0xff999999)
                )
                Text(
                    text = "Sửa tài khoản",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = Color(0xCC000000),
                    modifier = Modifier
                        .weight(1f)
                        .padding(start = 20.dp)
                )
                Icon(
                    imageVector = Icons.Default.ArrowForwardIos,
                    contentDescription = "Right Icon",
                    tint = Color(0xff999999)
                )
            }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(1.dp)
                    .background(Color(0x66999999))
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Hoạt động",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xffACACAC)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0x66999999))
        )
        //layoutYKienCuaBan
        Row(
            modifier = Modifier
                .padding(10.dp)
                .clickable { },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = painterResource(id = R.drawable.message),
                contentDescription = "comment Icon",
                tint = Color.Gray,
                modifier = Modifier.size(20.dp)
            )
            Text(
                text = "Ý kiến của bạn",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xCC000000),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            )
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = "Right Icon",
                tint = Color(0xff999999)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0x66999999))
        )
        //layoutTinDaLuu
        Row(
            modifier = Modifier
                .padding(10.dp)
                .clickable {navController.navigate("saved") },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Bookmark,
                contentDescription = "Person Icon",
                tint = Color(0xff999999)
            )
            Text(
                text = "Xem Tin đã lưu",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xCC000000),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            )
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = "Right Icon",
                tint = Color(0xff999999)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0x66999999))
        )
        //layouXemSau
        Row(
            modifier = Modifier
                .padding(10.dp)
                .clickable {navController.navigate("watchLaterPosts") },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Schedule,
                contentDescription = "Person Icon",
                tint = Color(0xff999999)
            )
            Text(
                text = "Xem sau",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xCC000000),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            )
            Icon(
                imageVector = Icons.Default.ArrowForwardIos,
                contentDescription = "Right Icon",
                tint = Color(0xff999999)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0x66999999))
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Thiết bị ứng dụng",
            fontSize = 18.sp,
            fontWeight = FontWeight.Normal,
            color = Color(0xffACACAC)
        )
        //layoutCheDoNenToi
        Row(
            modifier = Modifier
                .padding(10.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Brightness6,
                contentDescription = "Person Icon",
                tint = Color(0xff999999)
            )
            Text(
                text = "Chế độ nền tối",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xCC000000),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            )
        }
        ThemeToggleRow(selectedButton) { newSelection ->
            selectedButton = newSelection
        }
        Spacer(modifier = Modifier.height(40.dp))
        val context = LocalContext.current
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0x66999999))
        )
        Row(
            modifier = Modifier
                .padding(10.dp)
                .clickable {
                    mAuth.signOut()
                    val message = if (mAuth.currentUser == null) {
                        "Đăng xuất thành công"
                    } else {
                        "Đăng xuất thất bại. Không có người dùng đang đăng nhập"
                    }
                    Toast
                        .makeText(context, message, Toast.LENGTH_SHORT)
                        .show()
                    navController.navigate("welcome")
                },
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                imageVector = Icons.Default.Logout,
                contentDescription = "Logout Icon",
                tint = Color(0xff999999)
            )
            Text(
                text = "Đăng xuất",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color(0xFFFF0000),
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 20.dp)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(1.dp)
                .background(Color(0x66999999))
        )
    }
}

@Composable
fun ThemeToggleRow(selectedButton: String, onSelectionChange: (String) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(35.dp)
            .background(Color(0xFFE8F2F3), shape = RoundedCornerShape(5.dp))
            .border(
                BorderStroke(1.dp, Color(0xFFE8F2F3).copy(alpha = 0.7f)),
                shape = RoundedCornerShape(5.dp)
            )
            .clip(RoundedCornerShape(5.dp)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.width(3.dp))

        listOf("Bật", "Tắt", "Hệ thống").forEach { option ->
            Box(
                modifier = Modifier
                    .weight(1f)
                    .clickable { onSelectionChange(option) }
                    .background(
                        color = if (selectedButton == option) Color.White else Color(0x80FFF8F8),
                        shape = RoundedCornerShape(5.dp)
                    )
                    .padding(vertical = 6.dp),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = option,
                    fontWeight = FontWeight.Bold,
                    color = if (selectedButton == option) Color.Black else Color.Gray
                )
            }
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMenuList() {
    MenuScreen(navController = rememberNavController(), viewModel = viewModel())
}