package com.example.worldschoolsteams.src.model

data class VideoItem(
    val title: String,
    val description: String,
    val urlVideo: String,
    val urlImage: String,
    val date: String
)


//"Thời sự", "Thể thao", "Giải trí  ", "Sức khỏe", "Giáo dục"
fun getVideoThoiSu(): List<VideoItem> {
    return listOf(

        VideoItem(
            "Robot đào hầm đường sắt Nhổn - ga Hà Nội hoạt động thế nào",
            "Hai robot khoan hầm đường sắt Nhổn - ga Hà Nội có tốc độ đào 10-12 m mỗi ngày, đào so le cách nhau 200 m để tránh tác động lẫn nhau, hoàn thành 4 km trong 16 tháng.",
            "czAG16BFxHg",
            "https://vcdn1-vnexpress.vnecdn.net/2024/08/06/DUNG00103802Still024-172291864-3726-4219-1722918667.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=lf0d3q2ubeb_BaMFW67VTA",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Phà ở TP HCM ngưng hoạt động, người dân đi đường vòng 10 km",
            "Bốn tháng qua, phà Bình Quới nối quận Bình Thạnh với TP Thủ Đức ngưng hoạt động do vướng mắc thủ tục pháp lý, thuê đất, người dân phải đi vòng hơn 10 km.",
            "czAG16BFxHg",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/02/462571137151950637873325341648-9716-2084-1730512339.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=AyBbFrQDKgIISsM499mc1g",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Dự án đường sắt tốc độ cao Bắc Nam giúp di chuyển hiệu quả thế nào",
            "Dự án đường sắt tốc độ cao Bắc Nam dự kiến dài 1.541 km, qua 20 tỉnh thành với tốc độ thiết kế 350 km/h, đi từ Hà Nội đến TP HCM hết 5,5 giờ, tiết kiệm thời gian 6 lần so với tàu hỏa thường.",
            "czAG16BFxHg",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/30/6119c94e9dcc43adbe34b828e042f0-9024-1874-1730277715.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=wZfX5anDL8GRXLiSiidn_Q",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        )
    )
}

fun getVideoTheThao(): List<VideoItem> {
    return listOf(

        VideoItem(
            "Tâm điểm Man Utd - Chelsea ở vòng 10 Ngoại hạng Anh",
            "AnhHLV tạm quyền Ruud van Nistelrooy được kỳ vọng giúp Man Utd gượng dậy, khi đấu Chelsea tại Ngoại hạng Anh cuối tuần này.",
            "qV3GcZtd7",
            "https://vcdn1-thethao.vnecdn.net/2024/11/01/180fa4ec60014e77a8cae7940bbf-1-4716-1408-1730445255.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=qREWo6R9o9S2z0NpXQz-hQ",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Vì sao Ten Hag đáng bị sa thải?",
            "Những màn trình diễn yếu kém của cầu thủ cùng loạt kỷ lục buồn khiến HLV Erik ten Hag không thể trụ lại Man Utd hết mùa giải thứ ba.",
            "qV3GcZtd7",
            "https://vcdn1-thethao.vnecdn.net/2024/10/30/skysportseriktenhagunited67-17-8109-1629-1730224217.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=OGvaxsBZPH8bDSE08jgLlA",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Yamal giành giải Cầu thủ trẻ hay nhất 2024",
            "Tiền đạo của Barca và tuyển Tây Ban Nha Lamine Yamal giành giải Kopa cho cầu thủ trẻ xuất sắc ở lễ trao giải Quả Bóng Vàng 2024, tối 28/10",
            "qV3GcZtd7",
            "https://vcdn1-thethao.vnecdn.net/2024/10/29/a-1730157984-7968-1730157993.png?w=300&h=180&q=100&dpr=1&fit=crop&s=QcWgK01RN4HMHwMrm841iQ",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        )
    )
}

fun getVideoGiaiTri(): List<VideoItem> {
    return listOf(
        VideoItem(
            "Bùi Lan Hương: 'Dấu ấn nghệ sĩ không chỉ ở show thực tế'",
            "Bùi Lan Hương nói thi hát ở \"Chị đẹp 2024\" để làm mới bản thân, nhưng hiểu nghệ sĩ cần trau dồi nhiều hơn là chỉ tham gia show thực tế.",
            "Agjrdx2w5Wc",
            "https://vcdn1-giaitri.vnecdn.net/2024/10/21/462364904775971540413143558783-5884-4907-1729492931.jpg?w=500&h=300&q=100&dpr=2&fit=crop&s=J8PtiYI1_nOH_IFVgPOV8w",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)",
        ),
        VideoItem(
            "Nữ họa sĩ vẽ tranh 3D bằng công nghệ thực tế ảo",
            "TP HCMVới kính thực tế ảo và hai tay cầm điều khiển, chị Minh Hằng sáng tạo ra hàng chục tác phẩm nghệ thuật trong không gian ba chiều giả lập.",
            "Agjrdx2w5Wc",
            "https://vcdn1-giaitri.vnecdn.net/2024/10/21/462364904775971540413143558783-5884-4907-1729492931.jpg?w=500&h=300&q=100&dpr=2&fit=crop&s=J8PtiYI1_nOH_IFVgPOV8w",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Nút Camera Control trên iPhone 16 hoạt động thế nào",
            "Camera Control vừa là nút bấm vật lý cho chức năng chụp, quay video vừa hỗ trợ cảm ứng lực để thay đổi cài đặt máy ảnh nhưng không dễ làm quen.",
            "Agjrdx2w5Wc",
            "https://vcdn1-sohoa.vnecdn.net/2024/09/11/testezgifcomvideotogifconverte-6602-1192-1726011434.gif?w=140&h=84&q=100&dpr=1&fit=crop&s=8gyFHXV4ycWRUMfNuKD8rg&t=image",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        )
    )
}

fun getVideoSucKhoe(): List<VideoItem> {
    return listOf(

        VideoItem(
            "Sản phẩm từ Fucoidan được quan tâm tại triển lãm y tế",
            "TP HCMGian hàng giới thiệu sản phẩm làm từ Fucoidan của công ty TNHH Umi No Shizuku tại Triển lãm Y tế Quốc tế Việt Nam lần thứ 19 - Pharmedi Vietnam 2024 hút khách tham quan.",
            "JS8WNA6WA",
            "https://vcdn1-vnexpress.vnecdn.net/2024/09/14/videocapture1726290088448-1726-9274-8616-1726290454.jpg?w=500&h=300&q=100&dpr=2&fit=crop&s=OWEc4oCQ65Y0BLZX6_g0jQ",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Bài tập chân quý ông có thể tập tại nhà",
            "Huấn luyện viên Shin Phamm hướng dẫn một số động tác giúp đôi chân khỏe khoắn, tăng cơ bắp chân hiệu quả. ",
            "JS8WNA6WA",
            "https://vcdn1-suckhoe.vnecdn.net/2019/05/27/chan-1…300&q=100&dpr=2&fit=crop&s=LIOVKINbeU55bAMWgsFOVA",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Bệnh nhân rơi nước mắt khi gặp lại bác sĩ Nguyễn Quang Tuấn",
            "Hà NộiLà bệnh nhân đầu tiên bác sĩ Nguyễn Quang Tuấn khám sau khi ông mãn hạn tù 3 năm, bà Hồng Vân xúc động vì gặp lại người đã phẫu thuật tim cho mình 20 năm trước.",
            "JS8WNA6WA",
            "https://vcdn1-vnexpress.vnecdn.net/2024/07/11/1778…300&q=100&dpr=2&fit=crop&s=BK710o5q7mH5CB4-CE9X5A",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        )
    )
}

fun getVideoGiaoDuc(): List<VideoItem> {
    return listOf(

        VideoItem(
            "Victoria School - Riverside đưa mảng xanh vào trong phòng học",
            "40 phòng học và 12 khu chức năng của Victoria School - Riverside bố trí nhiều mảng xanh, thiết kế các khung cửa đón ánh sáng tự nhiên, trang bị nhiều học cụ thông minh.",
            "bg2gVN0D0d0",
            "https://vcdn1-vnexpress.vnecdn.net/2024/08/15/TD50965-1723692108-4166-1723692121.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=c6u-JE__mSOIdSzZeE9w7A",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Học sinh nói gì khi chia tay tuổi học trò?",
            "Hạnh phúc, lưu luyến, tràn đầy hy vọng về tương lai… là những cảm xúc của các học sinh lớp 12 vào giây phút chia tay tuổi học trò.",
            "bg2gVN0D0d0",
            "https://vcdn1-vnexpress.vnecdn.net/2023/09/29/untitled-1695955055-1695955063-5737-1695955196.png?w=300&h=180&q=100&dpr=1&fit=crop&s=HqTrQeL46T7I4C7VmSKdGQ",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        ),
        VideoItem(
            "Cách đọc từ 'ask', 'tax', 'after'",
            "Âm /æ/ có ở nhiều từ thông dụng như \"ask\" (hỏi, đề nghị), \"tax\" (thuế), \"after\" (sau)... Cô Moon Nguyen, chuyên gia đào tạo phát âm tiếng Anh sẽ hướng dẫn bạn đọc chính xác những từ này.",
            "bg2gVN0D0d0",
            "https://vcdn1-vnexpress.vnecdn.net/2023/06/28/toppp-1687915512-5728-1687915527.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=DiQxqdpfUVBQwwA2bWjmQg",
            "Thứ năm, 31/10/2024, 11:00 (GMT+7)"
        )
    )
}