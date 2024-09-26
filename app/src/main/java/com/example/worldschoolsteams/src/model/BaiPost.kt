package com.example.worldschoolsteams.src.model

data class Post(
    val id: Int,
    val title: String,
    val description: String,
    val imageUrl: String,
    val timeAgo: String,
    val category: String,
    val date: String,
)


//"Mới nhất", "Bình luận nhiều", "Xem nhiều nhất", "Đọc nhiều nhất", "Giáo dục"
// Menu Items Mới nhất
fun getMoiNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
            "1 giờ trước",
            "Mới nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/tau-cao-toc-phap-5582-17277465-2277-4948-1729764362.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=-tmcQ--qsXCfRG8DOELqgQ",
            "2 giờ trước",
            "Mới nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-suckhoe.vnecdn.net/2024/10/24/pexels-yankrukov-4457991-17297-5763-9060-1729763343.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=92O129-EdRo-aoWe4TBziA",
            "3 giờ trước",
            "Mới nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getBinhLuanNhieuNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/233a7116-1729741196-3397-1729741219.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=C_w02FD11tJ0jOxSZEdfLA",
            "1 giờ trước",
            "Bình luận nhiều",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-thethao.vnecdn.net/2024/10/24/djokovicnolograrasegundavez-17-8950-2075-1729759314.jpg?w=380&h=228&q=100&dpr=1&fit=crop&s=cQkvaKaWLBDp64MIn7Y1Cg",
            "2 giờ trước",
            "Bình luận nhiều",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-thethao.vnecdn.net/2024/10/24/nam-dinh-tampines-rovers-afc-c-5203-8263-1729781921.jpg?w=380&h=228&q=100&dpr=1&fit=crop&s=1clOP61eGsiZmR4u1zA4Hw",
            "3 giờ trước",
            "Bình luận nhiều",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getXemNhieuNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/HnQuc-1729741555-8963-1729742005.png?w=220&h=132&q=100&dpr=1&fit=crop&s=wwyPBYe_EEvnG0nKKW5MuQ",
            "1 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/07c682359a54220a7b45-172974287-6726-9331-1729743796.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=JXb38F2IhMaV8BGxfVxF7Q",
            "2 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy3",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-kinhdoanh.vnecdn.net/2024/10/24/xang64-1729754827-1729754852-1-1823-5160-1729754892.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=npN19Ld2Ng2HAIr32IAgyA",
            "3 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getDocNhieuNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/23/dji-0991-jpg-1729397368-6103-1729652606.jpg?w=680&h=408&q=100&dpr=1&fit=crop&s=-NsyGNP5hT7B_FkA0_fcUw",
            "1 giờ trước",
            "Đọc nhiều nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/20/DJI015445721702011800-17293996-9436-9365-1729399790.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=kCpCeqMzQz40ek85uhaVDA",
            "2 giờ trước",
            "Đọc nhiều nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-kinhdoanh.vnecdn.net/2024/10/17/afp-20240512-cfoto-urbanhig240-4510-6883-1729152623.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=WpU8L5wpnJdBDX7HNkffxQ",
            "3 giờ trước",
            "Đọc nhiều nhất",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getGiaoDuc(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/sv-ve-tet-10-jpg-1729772248-9650-1729773056.jpg?w=680&h=408&q=100&dpr=1&fit=crop&s=4xdJ9qR55G0OXW90p8hgXA",
            "1 giờ trước",
            "Giáo dục",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/23/viet-duc-1729691020-6104-1729691450.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=-PZOXxa0UBPj9dZYFhYOTg",
            "2 giờ trước",
            "Giáo dục",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/22/Anhmanhinh20240806luc151509-17-5382-5475-1729588332.png?w=240&h=144&q=100&dpr=1&fit=crop&s=tlph1G0Lb9ebavVP8r-VeQ",
            "3 giờ trước",
            "Giáo dục",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

//"Tin tức", "Tuyển sinh", "Chân dung", "Du học", "Diễn đàn", "Học tiếng anh",   "Giáo dục 4.0"
// Category Items Data
fun getTinTuc(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/ham-rog-1729742640-1816-1729743023.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=oB2hlVaRc9drgYifQrkILg",
            "1 giờ trước",
            "Tin tức",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/233a7116-1729741196-3397-1729741219.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=C_w02FD11tJ0jOxSZEdfLA",
            "2 giờ trước",
            "Tin tức",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/23/image003-1729652147-4230-1729652386.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=k05D2R_E5pOLH8D_2KjCzw",
            "3 giờ trước",
            "Tin tức",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getTuyenSinh(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/21/sanhocbongduhocanh1-1729503831-6309-1729503925.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=pJNX_A7dg89K6eCpVM5Tkw",
            "1 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/09/hvanninhjpeg170912687820121709-8048-6746-1728466752.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=1YYS1HLWM2D0VJ2YYObICQ",
            "2 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/11/cg2a935387801711373209-1728611-2969-4821-1728611644.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=-lIagTNnu3M-iH9leoOOcg",
            "3 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getChanDung(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/toannguyenpsu1-1729703444-5218-1729724941.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=SSDsoRbE1Zqfz3YPJ94XyA",
            "1 giờ trước",
            "Chân dung",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/18/Nguyenlab1024x518-1729218856-2070-1729244841.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=mi8Mo8Z3Hd0NWlk9w972vA",
            "2 giờ trước",
            "Chân dung",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/09/img-5928-1728466046-5755-1728467399.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=LyDjYJG85c5qDesBMtCeoQ",
            "3 giờ trước",
            "Chân dung",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getDuHoc(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/23/dh-1729670648-3893-1729670730.png?w=300&h=180&q=100&dpr=1&fit=crop&s=MPkGEClWiR3cURvFNVQDrg",
            "1 giờ trước",
            "Du học",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/22/90090544-3088827947807910-2998-8309-7467-1729554714.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=CBFtzPi-UOwBiIvZC5Bb-g",
            "2 giờ trước",
            "Du học",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/18/screenshot-2024-07-04-091507-8-3709-8927-1729247019.png?w=300&h=180&q=100&dpr=1&fit=crop&s=s0uWCdQTV_Wqf4uKiVpKrQ",
            "3 giờ trước",
            "Du học",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getDienDan(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/13/13f0377c5ce5fcbba5f4-172881661-4281-6264-1728817752.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=WtcydmLrpwdCSxeUpI2BZg",
            "1 giờ trước",
            "Diễn đàn",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/19/233a8636-1729309824-1729309835-2978-1729310442.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=focehjVO9Rxpoi2xu_2WQg",
            "2 giờ trước",
            "Diễn đàn",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/18/z5577640575924-3e721201c625ded-4259-9637-1729256928.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=uP3Uy7f-WZuYQ4XbMBb6Aw",
            "3 giờ trước",
            "Diễn đàn",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getHocTiengAnh(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/22/hoa-1729534133-2240-1729534830.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=grDNclPkz4qzygar-IyWuA",
            "1 giờ trước",
            "Học tiếng anh",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/20/m1-1729390317-1729390342-2993-1729390503.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=Yq7eTIpaenYBTzUx-DRCoA",
            "2 giờ trước",
            "Học tiếng anh",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/15/openid1728978231-1728978518-17-8294-2566-1728978567.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=MrZTkZwv1vSs03llmgCIJA",
            "3 giờ trước",
            "Học tiếng anh",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getGiaoDucNew(): List<Post> {
    return listOf(
        Post(
            1,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/23/image350498371extractword0out-6460-6692-1729648907.png?w=680&h=0&q=100&dpr=1&fit=crop&s=ywhnUn1mMvcO5kaQr1-x9g",
            "1 giờ trước",
            "Giáo dục 4.0",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/19/image862201898extractword0out-9422-7627-1729311650.png?w=300&h=180&q=100&dpr=1&fit=crop&s=fjLSQm1x9wkgYysC6agwBQ",
            "2 giờ trước",
            "Giáo dục 4.0",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bốn trường ở Bắc Ninh cho học sinh nghỉ thứ bảy",
            "Bốn trường THCS ở thành phố Bắc Ninh dạy học 5 ngày trong tuần để học sinh được nghỉ thứ bảy, giảm áp lực học tập, có thời gian vui chơi.\n" +
                    "\n" +
                    "Bà Bùi Thị Huệ, Phó trưởng phòng Giáo dục và Đào tạo TP Bắc Ninh, tối 5/11 cho biết bốn trường thí điểm gồm Suối Hoa, Ninh Xá, Vệ An và Nguyễn Đăng Đạo. Trước đó, Phòng đã khảo sát ý kiến của giáo viên, học sinh, phụ huynh và nhận được sự đồng thuận.\n" +
                    "\n" +
                    "Ba trường thực hiện từ 4/11, riêng THCS Nguyễn Đăng Đạo từ 20/1, sau kỳ thi học sinh giỏi cấp tỉnh.\n" +
                    "\n" +
                    "Các trường chủ động bố trí thêm hoạt động câu lạc bộ thể thao, năng khiếu, nghệ thuật, đọc sách truyện, rèn kỹ năng sống, tăng tiết Toán, Văn... vào thời gian còn lại của các buổi chiều. Riêng THCS Nguyễn Đăng Đạo là trường trọng điểm, có thể đề xuất thêm thời gian ôn luyện cho các đội tuyển học sinh giỏi.\n" +
                    "\n" +
                    "Theo bà Huệ, được nghỉ trọn vẹn hai ngày cuối tuần sẽ giúp học sinh giảm áp lực học tập, có thêm thời gian vui chơi cùng gia đình, bạn bè hoặc rèn luyện thể thao, năng khiếu theo sở thích. Giáo viên cũng có thêm thời gian tái tạo sức khỏe, chuẩn bị cho tuần làm việc kế tiếp.\n" +
                    "Theo chương trình giáo dục phổ thông mới (chương trình 2018), số tiết học trung bình một tuần với học sinh tiểu học là 25-30, THCS và THPT 29-29,5, chưa gồm các môn tự chọn.\n" +
                    "\n" +
                    "Trong hướng dẫn của Bộ Giáo dục và Đào tạo, nếu dạy cả ngày, các trường không được dạy quá 4 tiết buổi sáng với bậc THCS; buổi chiều tối đa ba tiết và một tuần không quá 6 ngày học. Số tiết tối đa một tuần của học sinh THCS là 42.\n" +
                    "\n" +
                    "Tuy nhiên, nhiều ý kiến cho rằng nếu như vậy, học sinh phải học thêm thứ bảy, ảnh hưởng tới thời gian nghỉ ngơi. Trước Bắc Ninh, một số địa phương cho phép trường học dạy 5 ngày mỗi tuần với quy mô khác nhau như Lai Châu, Lào Cai và thành phố Hà Tĩnh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/18/hhh-1729223849-1729223859-1355-1729224202.png?w=300&h=180&q=100&dpr=1&fit=crop&s=j3eOq6ouHqJDIzbTBnTmUw",
            "3 giờ trước",
            "Giáo dục 4.0",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        )
    )
}