package com.example.worldschoolsteams.src.screens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.components.BottomBaiViet
import com.example.worldschoolsteams.src.components.ComponentBottomBaiViet

class BaiVietScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BaiVietList()
        }
    }
}

@Composable
fun BaiVietList() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(start = 15.dp, end = 15.dp, top = 10.dp)
    ) {
        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .padding(start = 15.dp, end = 15.dp, top = 10.dp)
        ) {
            item {
                Column {
                    // Text Category
                    Text(
                        "Giáo dục",
                        fontSize = 24.sp,
                        color = Color(0xFF8B2323),
                        fontStyle = FontStyle.Normal
                    )
                    Spacer(modifier = Modifier.height(10.dp))
                    // Text Ngay/Thang/Nam Time(Mui gio)
                    Text(
                        "Thứ 4, 25/09/2024, 17:23 (GMT+7)",
                        fontSize = 16.sp,
                        color = Color(0xFF716D6D),
                        fontStyle = FontStyle.Normal
                    )
                }
                Spacer(modifier = Modifier.height(10.dp))
                // Title
                Text(
                    "Nhiều địa phương cho học sinh nghỉ thứ bảy",
                    fontSize = 24.sp, color = Color.Black, fontWeight = FontWeight.Bold
                )
                Spacer(modifier = Modifier.height(10.dp))
                // Main content
                Text(
                    "Tỉnh Lai Châu, Lào Cai và thành phố Hà Tĩnh thông báo chỉ dạy học từ thứ hai đến sáu, học sinh được nghỉ hai ngày cuối tuần.\n" +
                            "\n" +
                            "Quyết định trên được UBND tỉnh Lai Châu công bố hôm nay, cho biết căn cứ vào quy định của Bộ Giáo dục và Đào tạo về chế độ tuần làm việc 40 giờ và đề xuất của ngành giáo dục địa phương.\n" +
                            "\n" +
                            "Theo đó, hơn 150.000 học sinh Lai Châu đến trường từ thứ hai đến sáu, nghỉ thứ bảy và chủ nhật. Sở Giáo dục và Đào tạo được yêu cầu hướng dẫn các trường chi tiết, đảm bảo tiến độ thực hiện chương trình và chất lượng giáo dục.\n" +
                            "\n" +
                            "Trước Lai Châu, nhiều địa phương khác cũng đưa ra quyết định tương tự với quy mô áp dụng khác nhau.\n" +
                            "\n" +
                            "Các trường THCS ở thành phố Hà Tĩnh đã áp dụng thí điểm lịch học 5 ngày mỗi tuần, nghỉ thứ bảy và chủ nhật từ năm học này. Sở Giáo dục và Đào tạo Hà Tĩnh đánh giá quy định này cho thấy sự đổi mới của ngành, thể hiện sự quan tâm tới đời sống, quyền lợi của người dạy và học.\n" +
                            "\n" +
                            "Lào Cai cũng hoàn tất triển khai chính sách này trên quy mô toàn tỉnh với hơn 200.000 học sinh từ tháng 3 năm nay, nhằm đáp ứng nhu cầu của gia đình và xã hội, tạo cơ hội cho học sinh tham gia các hoạt động giáo dục kỹ năng sống.\n" +
                            "\n" +
                            "Nghệ An cũng từng lấy ý kiến nhà giáo, nhà quản lý về chính sách tương tự vào cuối năm 2023.",
                    fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Normal
                )
                Spacer(modifier = Modifier.height(10.dp))
                // Image
                Image(
                    painter = painterResource(id = R.drawable.image12),
                    contentDescription = "News Image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(220.dp),
                    contentScale = ContentScale.Crop
                )
                Spacer(modifier = Modifier.height(10.dp))
                // More text content
                Text(
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                            "\n" +
                            "Bộ từng có hướng dẫn về việc dạy học hai buổi mỗi ngày với cấp trung học. Theo đó, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS, 5 tiết với THPT; buổi chiều tối đa 3 tiết và một tuần không quá 6 ngày học, áp dụng cả hai cấp. Số tiết tối đa một tuần của học sinh THCS là 42, THPT 48.\n" +
                            "\n" +
                            "TP HCM từng yêu cầu các trường THPT không dạy quá 8 tiết mỗi ngày, song nhiều hiệu trưởng cho rằng nếu áp dụng, học sinh phải học thêm thứ 7, ảnh hưởng tới thời gian nghỉ ngơi.",
                    fontSize = 20.sp, color = Color.Black, fontWeight = FontWeight.Normal
                )
            }
        }
        ComponentBottomBaiViet()
    }
}


@Preview
@Composable
fun PreviewBaiViet() {
    BaiVietList()
}