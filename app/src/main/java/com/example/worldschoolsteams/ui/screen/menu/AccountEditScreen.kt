package com.example.worldschoolsteams.ui.screen.menu

import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.LocalTextStyle
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberAsyncImagePainter

@Composable
fun AccountEditScreen(navController: NavController) {
    var showEditDialog by remember { mutableStateOf<Pair<String, Boolean>?>(null) }
    var showProfileDialog by remember { mutableStateOf(false) }
    var selectedImageUri by remember { mutableStateOf<Uri?>(null) }
    var email by remember { mutableStateOf("haicon12345@gmail.com") }
    var password by remember { mutableStateOf("********") }
    var phoneNumber by remember { mutableStateOf("Chưa có") }
    var fullName by remember { mutableStateOf("Chưa có") }
    var gender by remember { mutableStateOf("Khác") }
    var location by remember { mutableStateOf("Chưa có") }


    // Profile Picture Edit Dialog
    if (showProfileDialog) {
        ProfilePictureDialog(
            onDismiss = { showProfileDialog = false },
            onImageSelected = { uri -> selectedImageUri = uri }
        )
    }
    // Sử dụng LazyColumn cho phép cuộn màn hình
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            // Header Row with Back button and title
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = { navController.popBackStack() }) {
                    androidx.compose.material3.Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back"
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = "Sửa tài khoản",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xff8B2323),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.weight(1f)
                )
            }
        }

        item {
            Spacer(modifier = Modifier.height(20.dp))

            // Profile Picture Section
            Column(
                modifier = Modifier
                    .size(100.dp)
                    .background(Color(0x80ACACAC), CircleShape)
                    .border(1.dp, Color(0x4A000000), CircleShape)
                    .clickable { showProfileDialog = true },
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                if (selectedImageUri != null) {
                    // Hiển thị ảnh đã chọn
                    Image(
                        painter = rememberAsyncImagePainter(selectedImageUri),
                        contentDescription = "Profile Picture",
                        modifier = Modifier
                            .size(100.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )
                } else {
                    // Hiển thị icon camera mặc định nếu chưa chọn ảnh
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_menu_camera),
                        contentDescription = "Change Profile Picture",
                        tint = Color.Black,
                        modifier = Modifier.size(30.dp)
                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(24.dp))
        }

        // Account Details Section
        item {
            AccountDetailItem(
                label = "Email",
                value = email,
                onEditClick = { showEditDialog = "Email" to false })
        }
        item {
            AccountDetailItem(
                label = "Mật khẩu",
                value = password,
                isPassword = true,
                onEditClick = { showEditDialog = "Mật khẩu" to true })
        }
        item {
            AccountDetailItem(
                label = "Số điện thoại",
                value = phoneNumber,
                onEditClick = { showEditDialog = "Số điện thoại" to false })
        }
        item {
            AccountDetailItem(
                label = "Họ và tên",
                value = fullName,
                onEditClick = { showEditDialog = "Họ và tên" to false })
        }
        item {
            AccountDetailItem(
                label = "Giới tính",
                value = gender,
                onEditClick = { showEditDialog = "Giới tính" to false })
        }
        item {
            AccountDetailItem(
                label = "Địa điểm",
                value = location,
                onEditClick = { showEditDialog = "Địa điểm" to false })
        }
    }

    // Edit Dialog
    if (showEditDialog != null) {
        EditDialog(
            label = showEditDialog!!.first,
            isPassword = showEditDialog!!.second,
            initialValue = when (showEditDialog!!.first) {
                "Email" -> email
                "Mật khẩu" -> password
                "Số điện thoại" -> phoneNumber
                "Họ và tên" -> fullName
                "Giới tính" -> gender
                "Địa điểm" -> location
                else -> ""
            },
            onDismiss = { showEditDialog = null },
            onSave = { newValue ->
                // Save the edited value to the appropriate field
                when (showEditDialog!!.first) {
                    "Email" -> email = newValue
                    "Mật khẩu" -> password = newValue
                    "Số điện thoại" -> phoneNumber = newValue
                    "Họ và tên" -> fullName = newValue
                    "Giới tính" -> gender = newValue
                    "Địa điểm" -> location = newValue
                }
                showEditDialog = null
            }
        )
    }
}

@Composable
fun AccountDetailItem(
    label: String,
    value: String,
    isPassword: Boolean = false,
    onEditClick: () -> Unit
) {
    Column(modifier = Modifier.padding(vertical = 8.dp)) {
        Text(text = label, color = Color.Gray, fontSize = 14.sp)
        OutlinedTextField(
            value = value,
            onValueChange = {},
            visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
            enabled = false,
            modifier = Modifier.fillMaxWidth(),
            textStyle = LocalTextStyle.current.copy(fontSize = 16.sp, color = Color.Black),
            trailingIcon = {
                Icon(
                    painter = painterResource(id = android.R.drawable.ic_menu_edit),
                    contentDescription = "Edit $label",
                    tint = Color.Gray,
                    modifier = Modifier.clickable { onEditClick() }
                )
            }
        )
    }
}

@Composable
fun EditDialog(
    label: String,
    isPassword: Boolean,
    initialValue: String,
    onDismiss: () -> Unit,
    onSave: (String) -> Unit
) {
    var text by remember { mutableStateOf(initialValue) }
    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text(text = "Đổi $label") },
        text = {
            Column {
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Nhập $label mới") },
                    visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        },
        confirmButton = {
            TextButton(onClick = { onSave(text) }) {
                Text("Lưu thay đổi")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Hủy")
            }
        }
    )
}

@Composable
fun ProfilePictureDialog(onDismiss: () -> Unit, onImageSelected: (Uri?) -> Unit) {
    val context = LocalContext.current
    val imageUri = remember { mutableStateOf<Uri?>(null) }
    val imageBitmap = remember { mutableStateOf<ImageBitmap?>(null) }

    // Camera launcher
    val cameraLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.TakePicturePreview()
    ) { bitmap ->
        bitmap?.let {
            imageBitmap.value = it.asImageBitmap() // Chuyển Bitmap thành ImageBitmap và cập nhật
            imageUri.value = null // Reset URI vì chúng ta đang sử dụng Bitmap
        }
    }

    // Gallery launcher
    val galleryLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.GetContent()
    ) { uri ->
        uri?.let {
            imageUri.value = uri // Lưu URI ảnh từ thư viện
            imageBitmap.value = null // Reset Bitmap vì chúng ta đang sử dụng URI
        }
    }

    // Camera permission launcher
    val cameraPermissionLauncher = rememberLauncherForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted ->
        if (isGranted) {
            cameraLauncher.launch() // Mở camera nếu quyền được cấp
        } else {
            Toast.makeText(context, "Quyền truy cập Camera đã bị từ chối.", Toast.LENGTH_SHORT)
                .show()
        }
    }

    AlertDialog(
        onDismissRequest = onDismiss,
        title = { Text("Thay ảnh đại diện") },
        text = {
            Column(
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Button để chụp ảnh
                Button(
                    onClick = {
                        cameraPermissionLauncher.launch(android.Manifest.permission.CAMERA)
                    }
                ) {
                    Text("Chụp Ảnh")
                }

                // Button để chọn ảnh từ thư viện
                Button(onClick = { galleryLauncher.launch("image/*") }) {
                    Text("Chọn Ảnh Từ Thư Viện")
                }

                Spacer(modifier = Modifier.height(16.dp))

                // Hiển thị ảnh đã chọn hoặc chụp
                imageBitmap.value?.let { bitmap ->
                    Image(
                        bitmap = bitmap,
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )
                } ?: imageUri.value?.let { uri ->
                    Image(
                        painter = rememberAsyncImagePainter(uri),
                        contentDescription = null,
                        modifier = Modifier
                            .size(150.dp)
                            .clip(CircleShape)
                            .background(Color.LightGray)
                    )
                }
            }
        },
        confirmButton = {
            TextButton(onClick = {
                onDismiss()
                onImageSelected(imageUri.value) // Gửi URI ảnh ra ngoài để cập nhật giao diện
            }) {
                Text("Xác nhận")
            }
        },
        dismissButton = {
            TextButton(onClick = onDismiss) {
                Text("Hủy")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewAccountEditScreen() {
    AccountEditScreen(navController = rememberNavController())
}