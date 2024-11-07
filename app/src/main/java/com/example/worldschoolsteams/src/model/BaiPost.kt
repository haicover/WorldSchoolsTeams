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
            "Ông Biden, bà Harris lần đầu xuất hiện chung sau thất bại bầu cử",
            "Ông Biden, bà Harris dự sự kiện tưởng niệm cựu binh Mỹ, đây là lần đầu tiên hai người xuất hiện chung từ khi Phó tổng thống thất cử tuần trước.\n" +
                    "\n" +
                    "Tổng thống Joe Biden, Phó tổng thống Kamala Harris sáng 11/11 cùng dự sự kiện ở Nghĩa trang Quốc gia Arlington, bang Virginia. Hai người đứng cạnh nhau đặt tay lên ngực khi quốc thiều Mỹ vang lên, sau khi ông Biden thực hiện nghi thức đặt vòng hoa.\n" +
                    "\n" +
                    "\"Đây là lần cuối cùng tôi đứng đây, tại Arlington, với tư cách tổng tư lệnh\", ông Biden phát biểu. \"Đây là vinh dự lớn nhất cuộc đời tôi, khi được dẫn dắt, phục vụ, chăm sóc và bảo vệ các bạn, như cách các bạn đã bảo vệ chúng tôi, từ thế hệ này qua thế hệ khác\".Đây là lần đầu tiên ông Biden và bà Harris xuất hiện cùng nhau sau khi Phó tổng thống thất bại trước đối thủ đảng Cộng hòa Donald Trump trong cuộc đua vào Nhà Trắng diễn ra ngày 5/11.\n" +
                    "\n" +
                    "Ông Biden dự kiến tiếp đón ông Trump tại Nhà Trắng vào ngày 13/11. Cuộc gặp này là thông lệ giữa tổng thống sắp mãn nhiệm và tổng thống đắc cử Mỹ, đánh dấu bắt đầu quá trình chuyển giao quyền lực trong hòa bình.Ông Biden dừng chiến dịch tái tranh cử hồi tháng 7 sau khi tranh luận kém ấn tượng trước đối thủ Trump. Ông ủng hộ bà Harris làm ứng viên thay thế.\n" +
                    "\n" +
                    "Sau thất bại trong ngày bầu cử 5/11, một số trợ lý của bà Harris đổ lỗi cho Tổng thống Biden, cho rằng ông nên từ bỏ cuộc đua sớm hơn. Trong khi đó, một cựu trợ lý của Tổng thống Biden nói với trang tin chính trị Axios rằng bà Harris mới là người cần đưa ra lời xin lỗi.\n" +
                    "\n" +
                    "Phát biểu tại Nhà Trắng hôm 7/11, ông Biden kêu gọi \"đừng quên những gì chúng ta đã đạt được\". \"Đó là nhiệm kỳ tổng thống mang tính lịch sử, không phải vì tôi là Tổng thống, mà bởi những gì chúng ta đã làm được\", ông nói, đồng thời ca ngợi bà Harris đã tiến hành chiến dịch tranh cử \"mang tính lịch sử trong hoàn cảnh đặc biệt\".",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/12/afp-20241111-36m87pn-v1-highre-7103-9958-1731368926.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=C3TMm_pJ_D9sWe9lIwLxIw",
            "9' trước",
            "Mới nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Chile mong muốn tăng cường quan hệ với Việt Nam",
            "Tổng thống Chile Gabriel Boric Font nói luôn coi trọng và mong muốn tăng cường quan hệ với Việt Nam, khi hội đàm với Chủ tịch nước Lương Cường.\n" +
                    "\n" +
                    "Chủ tịch nước Lương Cường hội đàm với Tổng thống Chile Gabriel Boric Font sáng 11/11, cùng đánh giá tình hình phát triển của quan hệ song phương và trao đổi về các vấn đề khu vực, quốc tế cùng quan tâm, theo thông cáo Bộ Ngoại giao.\n" +
                    "\n" +
                    "Tổng thống Font cho biết chuyến thăm của Chủ tịch nước Lương Cường có ý nghĩa đặc biệt quan trọng, là chuyến thăm Chile đầu tiên ở cấp nguyên thủ Việt Nam trong vòng 15 năm qua. Lãnh đạo Chile tin tưởng chuyến thăm sẽ tạo động lực mạnh mẽ, làm sâu sắc hơn nữa quan hệ hai nước.\n" +
                    "\n" +
                    "Tổng thống khẳng định Chile luôn coi trọng và mong muốn tăng cường quan hệ với Việt Nam trong tổng thể chính sách đối với khu vực châu Á - Thái Bình Dương, đặc biệt trong bối cảnh Việt Nam và Chile kỷ niệm 10 năm thực thi Hiệp định thương mại tự do song phương và hai nước cùng là thành viên của Hiệp định Đối tác Toàn diện và Tiến bộ xuyên Thái Bình Dương (CPTPP).Chủ tịch nước Lương Cường nhấn mạnh Việt Nam coi trọng quan hệ hữu nghị truyền thống và Đối tác toàn diện Việt Nam - Chile, quốc gia đầu tiên tại Nam Mỹ thiết lập quan hệ ngoại giao với Việt Nam (25/3/1971).\n" +
                    "\n" +
                    "Chủ tịch nước cho biết chuyến thăm lần này nhằm khẳng định thông điệp Việt Nam coi trọng và mong muốn thúc đẩy mạnh mẽ hơn quan hệ Đối tác toàn diện với Chile.\n" +
                    "\n" +
                    "Hai bên nhất trí thúc đẩy hợp tác trong các lĩnh vực có thế mạnh và cùng quan tâm như thương mại tự do, nông nghiệp, phát triển bền vững, năng lượng tái tạo, khoa học, giáo dục, du lịch, quốc phòng, an ninh.\n" +
                    "\n" +
                    "Hai lãnh đạo cũng nhất trí tích cực đàm phán, ký kết các văn kiện hợp tác song phương; tạo điều kiện thuận lợi cho cộng đồng doanh nghiệp hai nước tăng cường trao đổi, hợp tác kinh doanh để nâng cao kim ngạch song phương tương xứng với tiềm năng hai nước.\n" +
                    "\n" +
                    "Về vấn đề Biển Đông, hai bên nhất trí cho rằng các tranh chấp về chủ quyền và lãnh thổ cần được giải quyết bằng các biện pháp hòa bình, trên cơ sở tôn trọng luật pháp quốc tế, nhất là Hiến chương Liên Hợp Quốc và Công ước Liên Hợp Quốc về Luật Biển năm 1982 (UNCLOS 1982).\n" +
                    "\n" +
                    "Sau hội đàm, hai lãnh đạo chứng kiến lễ ký Tuyên bố chung Việt Nam - Chile, bản ghi nhớ về hợp tác quốc phòng và các văn kiện hợp tác trong những lĩnh vực nông nghiệp, văn hóa, xúc tiến thương mại...\n" +
                    "\n" +
                    "Cùng ngày, Chủ tịch nước Lương Cường đã hội kiến Chủ tịch Hạ viện, đồng thời là Chủ tịch Nhóm Nghị sĩ hữu nghị Chile - Việt Nam Karol Cariola và Chủ tịch Thượng viện Chile José Garcia Ruminot. Chủ tịch nước đề\n" +
                    "nghị quốc hội hai bên tăng cường hợp tác, phát huy vai trò trong việc ủng hộ\n" +
                    "thông qua các sáng kiến, thỏa thuận và hiệp định hợp tác được ký kết giữa\n" +
                    "chính phủ, các bộ, ngành và địa phương hai nước.\n" +
                    "\n" +
                    "Việt Nam và Chile thiết lập quan hệ đối tác toàn diện tháng 5/2007. Kim ngạch năm 2023 đạt 1,57 tỷ USD và 9 tháng đầu 2024 đạt gần 1,3 tỷ USD, tăng 5% so với cùng kỳ năm ngoái. Chile hiện là thị trường xuất khẩu lớn thứ tư của Việt Nam sang Mỹ Latin sau Mexico, Brazil và Argentina, trong khi Việt Nam là đối tác thương mại lớn nhất của Chile trong ASEAN.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/12/chu-tich-nuoc-luong-cuong-hoi-6842-3218-1731367749.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=JHVdHozIX1u0wmOVV-7xoQ",
            "16' trước",
            "Mới nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Giảm 21 kg sau 4 tháng sinh con nhờ thực đơn 'cơm nhà'",
            "Ăn cơm nhà với đầy đủ nhóm chất dinh dưỡng, kết hợp tập gym, kháng lực, chạy bộ giúp Trịnh Thị Ngọc Huyền, 31 tuổi, giảm 21 kg.\n" +
                    "\n" +
                    "Huyền hiện sở hữu 3 phòng gym và một mô hình tập luyện online dành riêng cho các mẹ sau sinh. Cô cho biết đã tự tin, thoải mái hơn sau khi giảm cân thành công.\n" +
                    "\n" +
                    "Suốt thai kỳ, người phụ nữ chăm chỉ vận động với mong muốn có thể sinh con đầu lòng tự nhiên. \"Tôi mong được sinh thường để mẹ và con khỏe, cơ thể phục hồi nhanh hơn\", Huyền nói.\n" +
                    "\n" +
                    "Tuy nhiên, tháng 5 năm nay, thời điểm em bé sắp chào đời, Huyền phải chuyển sang mổ sinh gấp vì bị vỡ ối. Thời điểm lên bàn sinh, cân nặng cô chạm mốc 86 kg, vòng bụng lên đến 123 cm. Sau sinh, Huyền giảm tự nhiên về 78 kg, song thân hình vẫn sồ sề, thiếu sức sống so với chiều cao 1,65 m.Vốn là người yêu thích cái đẹp, Huyền quyết định thay đổi để lấy lại sức khỏe và sự tự tin. Con tròn một tháng tuổi, cô bắt đầu hành trình giảm cân, tìm lại vóc dáng sau khi tham khảo ý kiến bác sĩ. \"Tôi luôn muốn bản thân đẹp và rạng rỡ nhất, dù đã sinh con hay chưa\", Huyền nói, thêm rằng công việc của cô cũng liên quan tập luyện, \"nếu bản thân không làm được thì không thể truyền cảm hứng mang lại niềm tin cho các khách hàng ở phòng gym\".\n" +
                    "\n" +
                    "Để thuận tiện trong việc chăm sóc và quây quần cùng gia đình, thay vì ăn kiêng kham khổ, Huyền chọn cơm nhà với thực đơn đủ chất, đa dạng. \"Càng đơn giản, dễ dàng, gần gũi lại càng bền và cái gì bền thì mới có hiệu quả được\", Huyền nói.\n" +
                    "\n" +
                    "Cô luôn ưu tiên thực phẩm tươi, không sử dụng đồ đông lạnh. Ăn trái cây, rau củ, thực phẩm theo mùa. Huyền tiêu thụ thực phẩm đa dạng nhưng đặc biệt không ăn mỡ, da, nội tạng động vật (trừ cá), hạn chế đồ ngọt và trái cây có nhiều đường.\n" +
                    "\n" +
                    "Ngoài ra, Huyền thỉnh thoảng thưởng cho bản thân một bữa ăn ngoài với các món yêu thích. Đây là \"ngày xả hơi\" định kỳ, còn gọi là quãng nghỉ trong quá trình ăn kiêng được nhiều người áp dụng, vừa hạn chế thèm ăn vừa giải tỏa căng thẳng.Bên cạnh việc ăn uống, Huyền còn tập gym, kháng lực và chạy bộ 4-5 buổi/ tuần, mỗi buổi 45-60 phút.\n" +
                    "\n" +
                    "Gym là bộ môn được chứng minh giúp phát triển, cải thiện sự linh hoạt cơ bắp hiệu quả. Nhiều nghiên cứu cho thấy tập gym còn có ích cho xương như tăng sức mạnh, giảm nguy cơ gãy xương cũng như chấn thương liên quan đến thể thao. Tuy nhiên, mọi người cần tập đúng cách, có bài tập riêng và được huấn luyện viên hướng dẫn cụ thể.\n" +
                    "\n" +
                    "Theo Sebastien Lagree, cựu huấn luyện viên của các sao hạng A như Meghan Markle và Jennifer Aniston, bạn cần bắt đầu tập kháng lực nếu muốn sống lâu và khỏe mạnh. Anh tin rằng rèn luyện lực kháng, đặc biệt là bằng các bài tập nhẹ, là chìa khóa cho quá trình lão hóa khỏe mạnh. Tập kháng lực là hình thức tăng sức mạnh cho cơ bắp thông qua việc để cho cơ bắp tự chống lại với một lực hoặc trọng lượng nhất định. Quá trình tập kháng lực nhất quán và thường xuyên giúp cơ bắp trở nên khỏe hơn.\n" +
                    "\n" +
                    "Còn chạy là một cách hiệu quả để đốt cháy calo trong thời gian ngắn, số lượng calo bạn đốt cháy trong khi chạy sẽ thay đổi tùy theo kích thước cơ thể, tốc độ và thời lượng chạy. Số liệu thống kê từ Cơ quan đăng ký kiểm soát cân nặng Mỹ, những người giảm cân thành công và duy trì cân nặng đó đốt cháy khoảng 2.800 calo mỗi tuần thông qua tập thể dục có kế hoạch. Điều này tương đương với việc một người trưởng thành cần chạy 45 km mỗi tuần, theo Verywellfit.\n" +
                    "\n" +
                    "\"Cứ con ngủ giờ nào tôi sẽ tập giờ đó, có khi đang tập mà con khóc thì phải bỏ giữa chừng để về chăm\", Huyền kể, nhận định thêm rằng \"có còn hơn không\" nên vẫn luôn duy trì lịch tập chăm chỉ.Sau 4 tháng kiên trì ăn uống, vận động tích cực, Huyền giảm còn 65 kg, vòng eo về mốc 70 cm, thân hình thon gọn, săn chắc hơn.\n" +
                    "\n" +
                    "Từ kinh nghiệm của bản thân, bà mẹ một con khuyên mọi người cần kiên trì với mục tiêu vì mọi thứ đều cần thời gian để thay đổi.\n" +
                    "\n" +
                    "\"Vóc dáng gọn gàng sau sinh đã giúp tôi có nhiều cơ hội hơn trong công việc và cuộc sống nên mọi người đừng vội, cứ kiên trì, quả ngọt sẽ tới\", Huyền nói.",
            "https://vcdn1-suckhoe.vnecdn.net/2024/11/11/Huye-n-3-JPG-5114-1731308406.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=T1mv-yn2noteUnWL7qcvKQ",
            "22' trước",
            "Mới nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "Ngày càng nhiều người nước ngoài mua nhà ở Việt Nam",
            "Tìm được căn hộ chung cư trên đường Mai Chí Thọ, TP Thủ Đức, anh Oliver Bennett lập tức \"xuống tiền\" dù giá bán 6 tỷ đồng, tăng một tỷ so với dự kiến của anh.\n" +
                    "\n" +
                    "\"Chỉ cần chậm một chút là mất cơ hội\", anh Oliver nói.\n" +
                    "\n" +
                    "Chàng trai người Anh, 39 tuổi, đã có 15 năm sống và làm việc ở TP HCM. Trước đây anh không nghĩ người nước ngoài như mình có thể mua nhà nên chỉ đi thuê. Cuối năm ngoái, sau khi kết hôn với cô gái Việt Nam, nhu cầu về một chỗ ở \"an cư lạc nghiệp\" khiến anh đi tìm hiểu lĩnh vực này.\n" +
                    "\n" +
                    "\"Hóa ra chúng tôi không chỉ được mua mà các thủ tục cũng nhanh, thuận lợi và dễ dàng\", Oliver cho biết.\n" +
                    "\n" +
                    "Nhưng anh cũng nhanh chóng cảm nhận được sức nóng của thị trường. Cặp vợ chồng trẻ bắt đầu đi tìm nhà từ tháng 12/2003 với tài chính 5 tỷ đồng. Họ mong muốn ở quanh khu vực các phường Thảo Điền, An Phú (TP Thủ Đức). \"Chỗ vừa giá thì nhà không ưng ý, chỗ đúng ý thì giá quá cao\", chị Bảo Vy, 33 tuổi, vợ Oliver nói.\n" +
                    "\n" +
                    "Đầu năm 2024, họ tìm được căn hộ phù hợp thì công ty gặp vấn đề về tài chính, thiếu 900 triệu. Cùng lúc, vợ anh cũng chưa bán được căn chung cư ở quận Gò Vấp. Họ đành lỡ hẹn cho đến giữa năm nay. Khi Oliver quay lại, căn hộ đã tăng giá thành 6 tỷ đồng, cao hơn 20% so với ba tháng trước.\n" +
                    "\n" +
                    "Cuối cùng, Oliver tìm đến chung cư ở đường Mai Chí Thọ, TP Thủ Đức có giá bán tương đương nhưng nhiều ưu điểm như thuận tiện đến quận trung tâm, cách chỗ làm 10 phút đi xe máy, gần siêu thị và bệnh viện.\n" +
                    "\n" +
                    "Oliver được người môi giới chuẩn bị giúp các thủ tục pháp lý. Anh nhận ra kể cả khi không kết hôn với người Việt, người nước ngoài vẫn có thể đứng tên sở hữu, khác với hình dung của anh vào 15 năm trước.Oliver nằm trong làn sóng người nước ngoài tìm mua nhà Việt Nam, đặc biệt khi chính sách sở hữu nhà được nới lỏng từ năm 2015.\n" +
                    "\n" +
                    "Theo thống kê của Hội Môi giới bất động sản Việt Nam (VARS), giai đoạn 2018-2022, số người nước ngoài mua nhà ở Việt Nam chỉ chiếm 0,53% tổng lượng nhà ở cả nước. Nhưng thị trường này bắt đầu bùng nổ từ đầu năm 2023. Hơn 90% chọn mua căn hộ chung cư.\n" +
                    "\n" +
                    "Bà La Kim Mỹ Duyên, giám đốc kinh doanh tập đoàn bất động sản IQI, cho biết theo luật chỉ 30% tổng số căn hộ của dự án chung cư xây mới được phép bán cho người nước ngoài. Chính vì thế, các dự án mở bán mới ở quận 1, quận 4, quận 7 và TP Thủ Đức thường xuyên trong tình trạng \"hết suất\" dù nhu cầu mua vẫn còn rất cao.\n" +
                    "\n" +
                    "Khoảng 70% đơn đăng ký mua là người châu Á như Singapore, Hong Kong, Trung Quốc, Đài Loan và Hàn Quốc, độ tuổi phổ biến 35-45. Theo thống kê của tập đoàn bất động sản CBRE, khách hàng nước ngoài chuộng nhất là căn hộ cao cấp tại các thành phố lớn như Hà Nội và TP HCM. Đến nay, nhóm khách hàng này đã sở hữu hơn 3.000 bất động sản.\n" +
                    "\n" +
                    "Theo chỉ số Savills Residential Prime Index, căn hộ hạng sang ở TP HCM có giá thấp hơn khoảng 14% so với Bangkok và 50% so với Singapore, mặc dù vẫn cao hơn 72% so với Kuala Lumpur.\n" +
                    "\n" +
                    "Bà La Kim Mỹ Duyên đưa ra hai nguyên nhân chính khiến người nước ngoài tăng mua nhà ở Việt Nam.\n" +
                    "\n" +
                    "Thứ nhất, họ đang nhắm vào đầu tư kiếm lời nhờ thị trường bất động sản liên tục sốt giá thời gian qua và tỷ suất cho thuê ở thị trường TP HCM và Hà Nội rất có lợi. Tính toán chu kỳ những năm 2015-2019 cho thấy tỷ suất cho thuê lên đến 6-7%.\n" +
                    "\n" +
                    "Thứ hai, kinh tế và xã hội phát triển ổn định khiến tệp người nước ngoài định cư (nghỉ hưu, kết hôn) ở Việt Nam cũng đang tăng mạnh.\n" +
                    "\n" +
                    "\"Thị trường dành cho người nước ngoài dự kiến tăng trưởng mạnh trong tương lai, khi nguồn cung bất động sản sơ cấp mới chuẩn bị được tung ra\", bà Duyên nhận định.Bowie Leung, người Hong Kong, làm kinh doanh ở Việt Nam từ năm 1989. Hiện ông sở hữu 10 căn hộ chung cư ở quận 7 và TP Thủ Đức. Căn đầu tiên ông để ở, số còn lại đầu tư để cho thuê.\n" +
                    "\n" +
                    "\"Giá nhà ở Việt Nam không rẻ so với khu vực Đông Nam Á nhưng đó là khoản đầu tư dài hạn và hợp lý\", ông Bowie nói.\n" +
                    "\n" +
                    "Người đàn ông này đã theo dõi thị trường bất động sản Việt Nam từ những năm 2000. Ông nói các dự án vị trí tốt ở quận 7, quận 9 và TP Thủ Đức là \"mỏ vàng\". Doanh nhân Hong Kong từng một lần hủy cọc ở một bất động sản ở Bình Dương bởi không cảm nhận được ổn định của thị trường cho thuê như TP HCM.\n" +
                    "\n" +
                    "Theo ông, Việt Nam đang có rất nhiều lợi thế bởi nền kinh tế phát triển nhanh ở ASEAN, thu hút vốn đầu tư và nhân lực người nước ngoài. Nhưng cùng với đó là các yếu tố như dân số và đô thị hóa tăng nhanh, môi trường, chính sách ổn định, tầng lớp trung lưu ngày càng lớn mạnh và số lượng người có thu nhập cao ngày càng nhiều khiến bất động sản sẽ đắt đỏ hơn.\n" +
                    "\n" +
                    "Ba năm qua, Bowie cảm nhận sự thuận lợi trong việc mua nhà. Ông chọn loại hợp đồng SPA (Sale and Purchase Agreement) mua bán chính thức thay vì LTL (Long Term Lease) hợp đồng cho thuê dài hạn.\n" +
                    "\n" +
                    "Ông Troy Griffiths, phó giám đốc điều hành công ty bất động sản Savills Việt Nam, nói trước khi sửa đổi Luật Đất đai, việc bán nhà cho người nước ngoài thường bị lách qua các hợp đồng cho thuê dài hạn. Điều này hiện nay đã bị cấm và đẩy nhu cầu của người nước ngoài vào thị trường sơ cấp.\n" +
                    "\n" +
                    "Sự gia tăng đầu tư của người nước ngoài cũng cho thấy hạn chế về nguồn cung. Ông Troy Griffiths ước tính TP HCM và Hà Nội đang thiếu hụt nguồn cung chung cư và cần thêm 30.000- 50.000 căn mới mỗi năm.\n" +
                    "\n" +
                    "Chung cư là loại bất động sản sinh lời tổng thể cao do tăng trưởng giá trị vốn và cho thuê. Điều này dẫn đến người mua nước ngoài phải cạnh tranh trong cùng một thị trường, nơi mà sự lựa chọn nguồn cung có sẵn rất hạn chế.\n" +
                    "\n" +
                    "Về tính tác động, ông Troy Griffiths nói thị trường bất động sản đang bị mất cân đối cung cầu, thừa ở phân khúc cao cấp và thiếu hụt ở phân khúc trung và thấp, phù hợp với khả năng chi trả của tầng lớp trung lưu.\n" +
                    "\n" +
                    "Bowie Leung vừa mua được căn hộ mới, diện tích 70 m2, ba phòng ngủ ở TP Thủ Đức, tầm nhìn hướng về phía quận 1, với công viên nhiều mảng xanh. Ông cảm thấy hài lòng, dự định đây sẽ là khoản tích lũy hưu trí của mình.\n" +
                    "\n" +
                    "\"Tôi quyết định mua nhà vì đã xem Việt Nam là quê hương thứ hai\", ông nói.",
            "https://vcdn1-giadinh.vnecdn.net/2024/11/06/f3a12794260d9e53c71c-9882-1730885814.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=WDjSO2g_C876Kn77Ms69Fw",
            "40' trước",
            "Mới nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            5,
            "7 sai lầm thường gặp khi tập chạy half marathon",
            "Không tập theo pace mục tiêu, bỏ bê dinh dưỡng, tập sức mạnh là những sai lầm thường gặp các các runner trong thời gian tập luyện cho cự ly 21,0975km.\n" +
                    "\n" +
                    "Tập bù những ngày nghỉ\n" +
                    "\n" +
                    "Khi rèn thể lực cho half marathon, mỗi cữ chạy rất quan trọng với khả năng hoàn thành mục tiêu, đặc biệt là những cữ chạy dài. Nhưng nếu phải hủy một hoặc hai buổi tập vì bị ốm hay bận việc, đừng cố gắng chạy bù vào những ngày khác.\n" +
                    "\n" +
                    "Lựa chọn tốt nhất thường là tiếp tục tập theo kế hoạch đã lên lịch từ trước, và xem những cữ chạy bị lỡ đó là thời gian nghỉ ngơi mà cơ thể bạn cần.\n" +
                    "\n" +
                    "\"Nỗi sợ không tập đủ sẽ dẫn đến việc phải chạy thêm quãng đường dài, từ đó dẫn đến chấn thương hoặc mệt mỏi\", Amanda Brooks - HLV chạy bộ người Mỹ và là người sáng lập Run to the Finish - cho biết. \"Nếu lỡ vài cữ chạy, hãy tiếp tục kế hoạch tập luyện. Việc nghỉ ngơi thêm đó có thể khiến mọi thứ trở nên tốt hơn\".\n" +
                    "\n" +
                    "Không tập theo pace mục tiêu\n" +
                    "\n" +
                    "\"Kỷ luật về pace rất quan trọng. Bạn dễ bị cuốn vào sự phấn khích và bắt đầu cuộc đua quá nhanh, dẫn đến việc hụt hơi và giảm tốc độ đáng kể ở nửa cuối\", HLV chạy bộ người Mỹ Emily Booth nói. \"Bạn muốn chạy nhanh hoặc chậm hơn không đáng kể ở giai đoạn nước rút so với lúc bắt đầu\". Cách tốt nhất để làm điều đó là tập theo pace mong muốn trước khi thi đấu.\n" +
                    "\n" +
                    "Dave Berdan, runner từng hai lần vô địch Baltimore Marathon, chia sẻ quan điểm này và lưu ý rằng việc tập theo pace mong muốn đặc biệt quan trọng trong sáu đến tám tuần trước cuộc đua.Không chuẩn bị tinh thần\n" +
                    "\n" +
                    "Bạn thực hiện các bài tập thể chất để cơ thể sẵn sàng chạy 21,0975 km, nhưng thành công cũng phụ thuộc vào sức mạnh tinh thần, liệu bạn có giữ bình tĩnh, điều chỉnh pace và tiếp tục khi mọi thứ trở nên khó khăn.\n" +
                    "\n" +
                    "\"Chuẩn bị tinh thần trước khi chạy half marathon là cực kỳ quan trọng. Tôi thường yêu cầu các học trò hình dung về việc chạy vài tuần trước khi diễn ra cuộc đua\", Berdan cho biết.\n" +
                    "\n" +
                    "Ví dụ, bạn có thể xem bản đồ cuộc đua, những thông tin về độ dốc, các đoạn đường hẹp, đông đúc hay thời tiết. Sau đó, hãy suy nghĩ kỹ về ngày thi đấu, từ lúc thức dậy, chuẩn bị ở nhà, đến lúc tiến đến vạch xuất phát, bắt đầu cuộc đua và đạt được pace mong muốn. Đừng quên hình dung ra những hoàn cảnh không lý tưởng, như khi bạn lỡ trạm tiếp nước hoặc phải giảm tốc độ ở các đoạn dốc.\n" +
                    "\n" +
                    "Bỏ qua dinh dưỡng khi chạy\n" +
                    "\n" +
                    "Theo Jeff Gaudette, chủ sở hữu và HLV trưởng tại RunnersConnect, pace chạy half marathon có thể sẽ nhanh hơn khi chạy marathon, điều này có thể khiến cơ thể bạn khó xử lý carbohydrate hơn.\n" +
                    "\n" +
                    "\"Trung bình, hầu hết những runner luyện tập bài bản đều có đủ glycogen dự trữ để hoàn thành 75 đến 90 phút chạy\", Gaudette nói. \"Nhưng vì nhiều runner sẽ mất hơn 90 phút để chạy half marathon, nên bạn cân nhắc việc ăn một số loại carbohydrate dễ tiêu hóa, chẳng hạn như gel 100 calo, 15 phút trước cuộc đua và sau đó cứ sau 30 đến 45 phút trong suốt cuộc đua\".\n" +
                    "\n" +
                    "Để giúp quá trình này diễn ra suôn sẻ khi thi đấu, Gaudette khuyên bạn nên lập kế hoạch dinh dưỡng và thực hành vài lần trong quá trình tập luyện.\n" +
                    "\n" +
                    "Chỉ uống nước\n" +
                    "\n" +
                    "Tương tự như dinh dưỡng, việc không nghĩ nhiều đến cách bù nước trong các cữ chạy dài là lỗi luyện tập phổ biến. Uống nước có thể đủ với những khoảng cách này, nhưng uống đồ uống thể thao có thể tăng cường năng lượng.\n" +
                    "\n" +
                    "\"Dù chúng ta cần giữ đủ nước, với các runner đổ mồ hôi và mất natri, việc sử dụng chất điện giải có lợi ích rất lớn\", Brooks giải thích. \"Chúng có thể giúp ngăn ngừa cảm giác co thắt trong dạ dày và giảm mệt mỏi, lú lẫn và thậm chí là chuột rút\".\n" +
                    "\n" +
                    "Ít tập sức mạnh\n" +
                    "\n" +
                    "\"Các runner tập luyện cho bất kỳ cự ly nào đều nên kết hợp một số bài tập sức mạnh\", Berdan nhấn mạnh. \"Nó giúp ngăn ngừa chấn thương và có một số tác dụng tuyệt vời của hormone giúp thích nghi với quá trình luyện tập\".Tập luyện sức mạnh cũng không nhất thiết phải tốn nhiều thời gian. \"Lý do hầu hết runner không thêm các bài tập sức mạnh vào kế hoạch tập vì 'tốn nhiều thời gian', nhưng việc tập sức mạnh hiệu quả có thể chỉ mất 10 đến 15 phút, ba đến bốn ngày một tuần\", Gaudette cho biết. \"Bạn không nhất thiết phải tập sức mạnh sau cữ chạy. Bạn có thể dành 10 phút sau bữa tối hoặc bất cứ lúc nào vào buổi tối nếu bạn không có nhiều thời gian\".\n" +
                    "\n" +
                    "Gaudette khuyên bạn nên tập trung vào các động tác giúp tăng cường sức mạnh cho phần thân, hông, mông và cẳng chân.\n" +
                    "\n" +
                    "Lo lắng những điều nhỏ nhặt\n" +
                    "\n" +
                    "\"Nhiều người mới chạy bộ thường tập trung vào những điều nhỏ nhặt, như tập phục hồi với foam roller hoặc thử giày phục hồi, thay vì duy trì những điều cơ bản như ngủ đủ giấc, tiếp nhiên liệu trước khi chạy và bù nước cả ngày\", Brooks cho biết. \"Thật dễ dàng để tin rằng các công cụ bên ngoài sẽ có tác động lớn, nhưng nó quá nhỏ so với các thói quen lành mạnh nói chung\".Thay vào đó, hãy thử suy nghĩ về bức tranh toàn cảnh, đến ngày thi đấu. Hãy nhắc nhở bản thân về quãng đường tích lũy (mileage) đã chạy và những lựa chọn lành mạnh mà bạn đã thực hiện trong khi tập luyện để hướng tới việc chạy half marathon.",
            "https://vcdn1-thethao.vnecdn.net/2024/11/08/half-5401-1731036762.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=FL1ezZ_SVD28ww61XXwcQw",
            "35' trước",
            "Mới nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),

        )
}

fun getBinhLuanNhieuNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Tổng Bí thư Tô Lâm điện đàm với ông Trump",
            "Tổng Bí thư Tô Lâm điện đàm với Tổng thống đắc cử Mỹ Donald Trump, trao đổi về phương hướng tăng cường quan hệ kinh tế, thương mại, đầu tư giữa hai nước.\n" +
                    "\n" +
                    "Trong cuộc điện đàm tối 11/11 từ Trụ sở Trung ương Đảng, Tổng Bí thư Tô Lâm chúc mừng ông Donald Trump được bầu là Tổng thống thứ 47 của Mỹ và đánh giá cao đóng góp của ông trong quá trình phát triển của quan hệ Việt - Mỹ, theo thông cáo của Ban Đối ngoại Trung ương.\n" +
                    "\n" +
                    "Hai bên thảo luận về những kết quả tích cực của quan hệ Đối tác Chiến lược Toàn diện Việt - Mỹ thời gian qua. Việt Nam sẵn sàng thúc đẩy quan hệ hai nước phát triển ổn định, lâu dài vì lợi ích của nhân dân hai nước, vì hòa bình, hợp tác và phát triển bền vững của khu vực và trên thế giới." +
                    "Tổng Bí thư Tô Lâm cũng trao đổi với ông Trump về một số phương hướng lớn nhằm tăng cường quan hệ kinh tế, thương mại và đầu tư giữa hai nước trong các lĩnh vực hai bên có thế mạnh và nhu cầu.\n" +
                    "\n" +
                    "Tổng thống đắc cử Mỹ vui mừng một lần nữa có dịp trao đổi với Tổng Bí thư và chuyển lời chào đến nhân dân Việt Nam, tin rằng quan hệ hữu nghị giữa hai nước sẽ tiếp tục phát triển. Ông khẳng định sự coi trọng quan hệ với Việt Nam và hợp tác kinh tế song phương, đề cập một số lĩnh vực hợp tác kinh tế, thương mại mà Mỹ quan tâm và mong muốn thúc đẩy.\n" +
                    "\n" +
                    "Ông Trump chia sẻ những ấn tượng tốt đẹp về nhân dân Việt Nam, nhắc lại kỷ niệm với đất nước, con người Việt Nam qua hai chuyến thăm trước đây. Ông cũng đánh giá cao đóng góp của cộng đồng người Việt tại Mỹ.\n" +
                    "\n" +
                    "Tổng Bí thư Tô Lâm mời Tổng thống đắc cử Trump thăm lại Việt Nam. Ông Trump vui vẻ nhận lời và mời Tổng Bí thư Tô Lâm sang thăm lại Mỹ vào thời gian thích hợp.\n" +
                    "\n" +
                    "Ông Trump, 78 tuổi, đắc cử tổng thống Mỹ sau cuộc bầu cử ngày 5/11. Tổng Bí thư Tô Lâm, Chủ tịch nước Lương Cường và Thủ tướng Phạm Minh Chính sau đó gửi điện chúc mừng ông, khẳng định Việt Nam coi Mỹ là đối tác có tầm quan trọng chiến lược." +
                    "Lãnh đạo cấp cao Việt Nam tin tưởng rằng với nền tảng vững chắc được các thế hệ lãnh đạo hai nước gây dựng trong gần ba thập kỷ qua, với sự ủng hộ mạnh mẽ của ông Trump trong nhiệm kỳ thứ nhất cũng như nhiệm kỳ mới, quan hệ Đối tác Chiến lược Toàn diện Việt - Mỹ sẽ tiếp tục phát triển sâu rộng, hiệu quả, bền vững, vì lợi ích và mong muốn của nhân dân hai nước, vì hòa bình, ổn định, hợp tác và phát triển ở khu vực và trên thế giới.\n" +
                    "\n" +
                    "Trong nhiệm kỳ đầu tiên của mình, ông Trump từng hai lần tới Việt Nam. Tháng 11/2017, ông thăm Việt Nam và dự Hội nghị Cấp cao APEC tại Đà Nẵng. Ông khi đó nói rằng \"Việt Nam đã trở thành một điều kỳ diệu của thế giới\" và nhấn mạnh Việt - Mỹ gắn kết vì \"mục đích chung, lợi ích chung\". Cuối tháng 2/2019, ông Trump trở lại Việt Nam để dự hội nghị thượng đỉnh với lãnh đạo Triều Tiên Kim Jong-un.\n" +
                    "\n" +
                    "Việt Nam - Mỹ nâng cấp quan hệ lên Đối tác Chiến lược Toàn diện vào năm 2023. Mỹ hiện là thị trường xuất khẩu lớn nhất của Việt Nam, trong khi Việt Nam là đối tác thương mại lớn thứ tám của Mỹ. Trong 10 tháng đầu năm, kim ngạch thương mại Việt - Mỹ đạt gần 111 tỷ USD, theo dữ liệu thống kê của Tổng cục Hải quan.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/12/z5556720751821-10b6c41bbf9c592-1252-8728-1731361666.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=ceUQWRor6iJ2HdwjNkj7ww",
            "4 giờ trước",
            "Bình luận nhiều",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Cuộc đua trong dinh thự ông Trump ở Mar-a-Lago",
            "Một cuộc cạnh tranh để gặp được Tổng thống đắc cử Mỹ Donald Trump đang diễn ra ở dinh thự Mar-a-Lago, tâm điểm trong quá trình chuyển giao quyền lực của ông.\n" +
                    "\n" +
                    "Khu nghỉ dưỡng kiêm câu lạc bộ tư nhân Mar-a-Lago ở Palm Beach, Florida, đã trở thành trung tâm trong quá trình chuyển giao quyền lực của Tổng thống đắc cử Donald Trump sau khi ông chiến thắng cuộc đua Nhà Trắng hồi tuần trước.\n" +
                    "\n" +
                    "Các lãnh đạo nước ngoài, nhà thầu và những người tìm kiếm cơ hội việc làm trong chính quyền mới đang đổ về đây, lấp đầy các khách sạn xung quanh nơi từng được mệnh danh là \"Nhà Trắng mùa đông\" của Trump. Họ cũng tìm thuê các bất động sản gần đó trong ba tháng tới để có cơ hội gặp mặt Tổng thống đắc cử cũng như các cố vấn hàng đầu bên cạnh ông nhiều nhất có thể." +
                    "Nhiều thành viên thuộc các câu lạc bộ khác của Trump trên khắp đất nước nhưng không phải Mar-a-Lago đã liên hệ với ban quản lý khu nghỉ dưỡng để xin được vào trong. Số khác tìm cách tiếp cận các thành viên Mar-a-Lago, ngỏ ý sẵn sàng chi tiền để được đưa đến gặp Tổng thống đắc cử tại câu lạc bộ, CNN dẫn lời ba nguồn thạo tin cho hay.\n" +
                    "\n" +
                    "Không có hạn chế nào trong việc thành viên câu lạc bộ Mar-a-Lago dẫn theo khách và những người bên ngoài đang cố gắng tận dụng điều này khi nó vẫn còn hiệu lực.\n" +
                    "\n" +
                    "\"Tôi thậm chí còn không biết mình đã đi cùng thành viên nào của câu lạc bộ\", một người đã đến Mar-a-Lago cùng các cựu quan chức chính quyền cho biết về chuyến đi hồi tuần trước.\n" +
                    "\n" +
                    "Một số người chỉ muốn tận mắt chứng kiến cảnh tượng thú vị tại Mar-a-Lago, số khác lại có mục đích riêng: Giành được vị trí trong chính quyền tương lai.\n" +
                    "\n" +
                    "\"Có người đến gặp tôi tối qua tại Mar-a-Lago và nói rằng họ sẽ trở thành thư ký báo chí\", một nguồn tin thân cận với Tổng thống đắc cử cho biết. \"Tôi chưa từng thấy người này trong đời\".\n" +
                    "\n" +
                    "Một khách giấu tên tại Mar-a-Lago cho hay họ đã báo cáo một người khác với bộ phận an ninh khách sạn, nói rằng vị khách này có biểu hiện \"mất kiểm soát\" trên mạng xã hội và làm rò rỉ những cuộc trò chuyện riêng tư.\n" +
                    "\n" +
                    "Các cố vấn khẳng định quá trình chuyển giao quyền lực của Trump lần này sẽ quy củ hơn nhiều so với hồi năm 2016 nhằm tránh xa mọi hỗn loạn. Việc Tổng thống đắc cử bổ nhiệm giám đốc chiến dịch Susie Wiles làm chánh văn phòng Nhà Trắng đã báo hiệu với những người trong quỹ đạo của ông rằng có một người đang kiểm soát mọi thứ.\n" +
                    "\n" +
                    "Những cố vấn của Trump đã tổ chức các cuộc họp với nhóm chuyển giao và Tổng thống đắc cử vào ban ngày tại khu nghỉ dưỡng, trình bày cho ông các kế hoạch về chính sách và nhân sự. Nhưng sự sôi động chỉ bắt đầu lúc trời tối, khi các thành viên và khách mời xếp hàng dọc hành lang để chào đón Trump trong lúc họ dùng bữa tối.\n" +
                    "\n" +
                    "Dù Trump có một đội mật vụ, vệ sĩ và đoàn tùy tùng riêng, ông thường dừng lại và giao lưu với khách và các thành viên câu lạc bộ, bắt tay và cảm ơn họ vì đã có mặt tại Mar-a-Lago." +
                    "Bàn ăn của Tổng thống đắc cử được sắp xếp ở vị trí riêng, tách biệt với xung quanh, nhưng điều đó thường không thể ngăn cản mọi người đến tìm ông trong bữa tối hoặc cố gắng giáp mặt ông khi di chuyển.\n" +
                    "\n" +
                    "\"Mọi người trình bày ý tưởng khi ông ấy đi ngang qua\", một nguồn tin có mặt tại Mar-a-Lago trong những ngày này nói với CNN.\n" +
                    "\n" +
                    "Một số thành viên và khách, trong đó có cả những người đang để mắt tới các vị trí nội các, đã được ông Trump tiếp chuyện riêng, mặc dù các cố vấn khẳng định mọi thứ vẫn diễn ra theo quy trình.\n" +
                    "\n" +
                    "Tỷ phú công nghệ Elon Musk cũng gần như đã chuyển hẳn về sống tại câu lạc bộ, nơi các thành viên nhìn thấy ông hoặc đội an ninh tư nhân khổng lồ của ông gần như mỗi ngày.\n" +
                    "\n" +
                    "Cựu ứng viên tổng thống độc lập Robert F. Kennedy Jr., người dự kiến ở lại Palm Beach trong hầu hết thời gian chuyển giao quyền lực, đã chụp ảnh với người hâm mộ tại Mar-a-Lago vào tuần trước. Ông đang cạnh tranh cho một vai trò có ảnh hưởng đến chính sách y tế Mỹ trong chính quyền mới.\n" +
                    "\n" +
                    "Tổng thống đắc cử đã nhiều lần nói rằng sai lầm lớn nhất trong nhiệm kỳ đầu tiên của ông là tuyển dụng \"những người tồi tệ hoặc không trung thành\", vì thế, ông muốn làm mọi việc khác đi trong lần này.\n" +
                    "\n" +
                    "Quá trình chuyển giao đến nay diễn ra chậm hơn nhiều so với năm 2016. Và giới truyền thông đang chen chúc tại ban công khách sạn, công viên và bãi biển xung quanh Mar-a-Lago, nơi an ninh đã được thắt chặt ở mức cao nhất, để tìm kiếm manh mối về những gương mặt sẽ tham gia chính quyền mới.\n" +
                    "\n" +
                    "Palm Beach không thực sự trải thảm đỏ đón Trump khi ông lần đầu tiên ghi dấu ấn của mình tại đây bằng việc mua lại Mar-a-Lago vào những năm 1980.\n" +
                    "\n" +
                    "Nhưng khi đi dạo quanh thành phố những ngày này, có thể thấy rõ đây chính là vùng đất của ông. Bikini và mũ mang thương hiệu MAGA xuất hiện đầy rẫy trên đường phố.\n" +
                    "\n" +
                    "Tuần này, Tổng thống Argentina Javier Milei dự kiến đến Mar-a-Lago để gặp Trump và Elon Musk." +
                    "Cũng trong tuần này, Hội nghị Hành động Chính trị Bảo thủ (CPAC), sẽ tổ chức hội nghị thường niên dành cho các nhà đầu tư tại Mar-a-Lago với giá vé lên tới 25.000 USD.\n" +
                    "\n" +
                    "Slater Bayliss, nhà vận động hành lang ở Florida, tin rằng Trump sẽ muốn dành nhiều thời gian ở Florida nhất có thể trong nhiệm kỳ thứ hai của mình và điều này sẽ có tác dụng nhất định trong việc biến \"5.806 m2 của Mar-a-Lago trở thành bất động sản thiêng liêng nhất trong vũ trụ chính trị Mỹ\".",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/trump-2-gty-er-240808-17231414-6469-7552-1731317813.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=bliCevx-iMrOIZ3BIKh8NQ",
            "8 giờ trước",
            "Bình luận nhiều",
            "Thứ 7, 09/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Ông Biden, bà Harris lần đầu xuất hiện chung sau thất bại bầu cử",
            "Ông Biden, bà Harris dự sự kiện tưởng niệm cựu binh Mỹ, đây là lần đầu tiên hai người xuất hiện chung từ khi Phó tổng thống thất cử tuần trước.\n" +
                    "\n" +
                    "Tổng thống Joe Biden, Phó tổng thống Kamala Harris sáng 11/11 cùng dự sự kiện ở Nghĩa trang Quốc gia Arlington, bang Virginia. Hai người đứng cạnh nhau đặt tay lên ngực khi quốc thiều Mỹ vang lên, sau khi ông Biden thực hiện nghi thức đặt vòng hoa.\n" +
                    "\n" +
                    "\"Đây là lần cuối cùng tôi đứng đây, tại Arlington, với tư cách tổng tư lệnh\", ông Biden phát biểu. \"Đây là vinh dự lớn nhất cuộc đời tôi, khi được dẫn dắt, phục vụ, chăm sóc và bảo vệ các bạn, như cách các bạn đã bảo vệ chúng tôi, từ thế hệ này qua thế hệ khác\"." +
                    "Đây là lần đầu tiên ông Biden và bà Harris xuất hiện cùng nhau sau khi Phó tổng thống thất bại trước đối thủ đảng Cộng hòa Donald Trump trong cuộc đua vào Nhà Trắng diễn ra ngày 5/11.\n" +
                    "\n" +
                    "Ông Biden dự kiến tiếp đón ông Trump tại Nhà Trắng vào ngày 13/11. Cuộc gặp này là thông lệ giữa tổng thống sắp mãn nhiệm và tổng thống đắc cử Mỹ, đánh dấu bắt đầu quá trình chuyển giao quyền lực trong hòa bình." +
                    "Ông Biden dừng chiến dịch tái tranh cử hồi tháng 7 sau khi tranh luận kém ấn tượng trước đối thủ Trump. Ông ủng hộ bà Harris làm ứng viên thay thế.\n" +
                    "\n" +
                    "Sau thất bại trong ngày bầu cử 5/11, một số trợ lý của bà Harris đổ lỗi cho Tổng thống Biden, cho rằng ông nên từ bỏ cuộc đua sớm hơn. Trong khi đó, một cựu trợ lý của Tổng thống Biden nói với trang tin chính trị Axios rằng bà Harris mới là người cần đưa ra lời xin lỗi.\n" +
                    "\n" +
                    "Phát biểu tại Nhà Trắng hôm 7/11, ông Biden kêu gọi \"đừng quên những gì chúng ta đã đạt được\". \"Đó là nhiệm kỳ tổng thống mang tính lịch sử, không phải vì tôi là Tổng thống, mà bởi những gì chúng ta đã làm được\", ông nói, đồng thời ca ngợi bà Harris đã tiến hành chiến dịch tranh cử \"mang tính lịch sử trong hoàn cảnh đặc biệt\".",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/12/AFP-20241111-36M87PN-v1-HighRe-2646-7785-1731368925.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=Upw1fdmwHM1nP9LvNZxZvw",
            "9 giờ trước",
            "Bình luận nhiều",
            "Thứ 3, 12/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "100.000 sinh viên rủ nhau đạp xe 50 km đi ăn đêm",
            "Trung QuốcPhong trào đạp xe 50 km để đi ăn đêm thu hút 100.000 sinh viên tham gia, gây tắc nghẽn các đoạn đường từ Trịnh Châu tới Khai Phong.\n" +
                    "\n" +
                    "Hồi tháng 6, nhóm 4 nữ sinh viên đại học ở thành phố Trịnh Châu đã rủ nhau thuê xe đạp vượt quãng đường 50 km tới Khai Phong, tỉnh Hà Nam, để tìm hàng há cảo ngon ăn khuya. Hành trình của họ nhanh chóng nổi tiếng trên mạng xã hội, thu hút thêm nhiều sinh viên làm theo, với hashtag \"tuổi trẻ là vô giá\" hay \"hãy đạp xe đêm tới Khai Phong để không bỏ lỡ\".\n" +
                    "\n" +
                    "\"Mọi người cùng hát, cổ vũ cho nhau mỗi khi đạp lên dốc. Tôi có thể thấy niềm vui của những người trẻ. Đó không chỉ đơn thuần là chuyến đạp xe\", Liu Lulu, sinh viên tại Đại học Đại Nam, nói." +
                    "Phong trào này ban đầu được giới chức cổ vũ để thúc đẩy du lịch. People’s Daily đăng bài viết ca ngợi \"làn sóng du khách trẻ\" tới Khai Phong, dự đoán lượng du khách này có thể đạt đỉnh 2.000 người.\n" +
                    "\n" +
                    "\"Khi tới Khai Phong, nhiều sinh viên đã tranh thủ cơ hội khám phá các địa điểm tham quan văn hóa, lịch sử của thành phố, mang tới năng lượng mới mẻ cho thành phố cổ kính này\", People’s Daily viết hôm 7/11.\n" +
                    "\n" +
                    "Nhưng phong trào này gần đây trở nên quá tải. Chỉ trong tối 7/11, số sinh viên đạp xe tới Khai Phong tăng lên 17.000 người và một ngày sau, con số này tăng khoảng gấp 10, lên đến hàng trăm nghìn sinh viên.\n" +
                    "\n" +
                    "Số sinh viên kéo tới Khai Phong khổng lồ như vậy đã gây ra nhiều phiền toái, nhất là cho người dân địa phương. Nhiều người dân cho biết thành phố của họ bị ùn tắc, quá tải, nhiều xe đạp và rác thải cũng bị bỏ lại.\n" +
                    "\n" +
                    "Cuối tuần trước, khoảng 100.000 người cùng đạp xe đêm tới Khai Phong, gây tắc nghẽn giao thông nghiêm trọng. Video trên mạng xã hội cho thấy hàng chục nghìn người đạp xe chật kín đại lộ 6 làn đường, trong khi cảnh sát dùng loa phóng thanh đề nghị sinh viên rời đi.Để ngăn chặn tình trạng này tái diễn, chính quyền Khai Phong đã ban lệnh cấm tạm thời làn đường dành cho xe đạp tới hết tuần. Các ứng dụng cho thuê xe đạp công cộng cũng cảnh báo họ sẽ kích hoạt khóa xe từ xa nếu xe di chuyển khỏi Trịnh Châu.\n" +
                    "\n" +
                    "Một số trường đại học ở Trịnh Châu cũng ban hành các biện pháp như cấm để xe đạp trong khuôn viên trường và sinh viên phải xin giấy phép nếu rời khỏi ký túc xá vào ban đêm.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/cats-4287-1731337641.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=buz13Fo478HIAQyn1bl4dQ",
            "9 giờ trước",
            "Bình luận nhiều",
            "Thứ 4, 13/11/2024 03:07 (GMT+7)"
        ),
        Post(
            5,
            "Cháu gái đăng ảnh bà Harris chơi cờ, uống rượu vang sau thất bại bầu cử",
            "Meena Harris, cháu gái bà Harris, đăng ảnh Phó tổng thống uống rượu vang, chơi cờ bàn với hai cháu nhỏ, sau thất bại trong bầu cử tổng thống năm nay.\n" +
                    "\n" +
                    "Meena, cháu gái ứng viên Dân chủ Kamala Harris, ngày 10/11 đăng hai bức ảnh lên Instagram, cho thấy bà Harris nở nụ cười rạng rỡ khi vừa uống rượu vang trắng, vừa chơi cờ bàn (boardgame) với hai cháu là các con gái của Meena trên sàn nhà.\n" +
                    "\n" +
                    "\"Quay lại nơi mọi thứ bắt đầu vài tháng trước. Chúng tôi yêu bà rất nhiều\", Meena viết trong bài đăng, với địa điểm được đề là thủ đô Washington của Mỹ. Đây là những hình ảnh hiếm hoi về hoạt động đời thường của bà Harris sau khi thất bại trong cuộc bầu cử tổng thống.\n" +
                    "\n" +
                    "Hồi tháng 7, bà Harris cũng đang chơi boardgame, ăn bánh kếp kèm thịt xông khói với các cháu thì nhận cuộc gọi từ Tổng thống Joe Biden, thông báo ông ngừng tranh cử và trao lại \"ngọn đuốc\" cho bà để đối đầu ứng viên Cộng hòa Donald Trump trong cuộc đua vào Nhà Trắng.\n" +
                    "\n" +
                    "Bà Harris kể từ đó tiến hành chiến dịch tranh cử trong 107 ngày, ngắn nhất lịch sử Mỹ. Meena, 40 tuổi, là giám đốc truyền thông năng nổ quảng bá cho chiến dịch tranh cử của dì.\n" +
                    "\n" +
                    "Trong hai bức ảnh được Meena đăng, bà Harris mặc hoodie Howard Bison, tên linh vật Đại học Howard, nơi bà từng theo học, trong khi cháu gái nhỏ tuổi mặc áo ghi dòng chữ Harris - Walz." +
                    "Nhiều người ủng hộ đảng Dân chủ đã tri ân Phó tổng thống trong phần bình luận. \"Thật biết ơn bà Harris, cảm ơn vì đã chia sẻ những khoảng khắc tươi vui này\", một người dùng Instagram bình luận.\n" +
                    "\n" +
                    "\"Thất bại thật đắng cay, nhưng tôi phấn khởi vì bà ấy có thể vui cười như vậy\", người khác viết.\n" +
                    "\n" +
                    "Ông Trump đã giành được 312 phiếu đại cử tri và thắng ở cả 7 bang chiến trường để đắc cử tổng thống Mỹ. Bà Harris đã nhận thua trước ông Trump và cam kết sẽ chuyển giao quyền lực trong hòa bình.\n" +
                    "\n" +
                    "Kết quả chính thức của cuộc bầu cử được xác nhận sau khi quốc hội Mỹ họp toàn thể vào ngày 6/1/2025 để kiểm đếm phiếu đại cử tri từ các bang và chứng nhận ứng viên chiến thắng.\n" +
                    "\n" +
                    "Phó tổng thống Harris, người đồng thời giữ chức Chủ tịch Thượng viện, sẽ chủ trì phiên họp này. Kết thúc sự kiện, bà Harris sẽ phải gõ búa chứng nhận chiến thắng cho ông Trump, cũng như thất bại của chính mình. Đây là lần hiếm hoi trong lịch sử Mỹ một ứng viên tổng thống phải chứng nhận thất bại của mình và chiến thắng của đối phương.\n" +
                    "\n",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/AN-DO-5-4790-1731297799.png?w=680&h=0&q=100&dpr=1&fit=crop&s=dSJtXZmdAaL7i170yuu2aw",
            "10 giờ trước",
            "Bình luận nhiều",
            "Thứ 4, 13/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getXemNhieuNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Alcaraz thua sốc trận ra quân ATP Finals",
            "ItalyHạt giống số ba Carlos Alcaraz thua 1-6, 5-7 trước Casper Ruud, ở trận mở màn bảng John Newcombe tại ATP Finals hôm 11/11.\n" +
                    "\n" +
                    "Ruud chỉ kém Alcaraz ba bậc trên bảng điểm ATP, nhưng gần như \"đánh đâu thua đó\" trong hai tháng qua. Trước khi đấu Alcaraz, tay vợt Na Uy chỉ thắng hai trong 11 trận kể từ đầu tháng 9, đa phần trước các đối thủ kém xa về thứ bậc. Do đó, chiến thắng của Ruud trước Alcaraz được xem như cú sốc lớn, đặc biệt khi nó diễn ra chỉ sau hai set." +
                    "Hai break-point kiếm được ở game đầu tưởng như mở ra trận đấu thuận lợi cho Alcaraz. Nhưng sau khi bỏ lỡ cả hai cơ hội, tay vợt Tây Ban Nha đánh mất hưng phấn, rồi sớm thua game giao bóng. Alcaraz có thêm ba cơ hội để trở lại, nhưng tiếp tục lỡ những break-point ở game 6. Cứ sau mỗi game như vậy, tay vợt 21 tuổi lại chơi tệ ở game giao kế tiếp. Anh khép lại set một với tỷ số thua đậm 1-6.\n" +
                    "\n" +
                    "Set hai chứng kiến nỗ lực vùng lên của tay vợt số ba thế giới. Alcaraz lần đầu thắng game đỡ bóng và dẫn 4-2, rồi 5-3, nhưng một loạt lỗi tự đánh hỏng khiến anh mất lợi thế và thua ngược 5-7.\n" +
                    "\n" +
                    "Alcaraz ghi 25 winner nhưng mắc tới 34 lỗi tự đánh hỏng, nhiều hơn gấp đôi Ruud (16 lỗi). Theo Ruud, anh nhận thấy Alcaraz dường như có triệu chứng cảm lạnh, khiến thể trạng không đạt 100%. \"Tôi cố kéo cậu ấy vào những loạt bóng bền\", Ruud nói sau trận. \"Không dễ khi bạn đấu với một đối thủ không có 100% sức. Bạn sẽ có phần dao động và luôn nghĩ rằng bản thân có cơ hội lớn để chiến thắng\".Ruud lần đầu thắng Alcaraz sau năm cuộc chạm trán ở các giải chính thức. Trước đó, tay vợt Na Uy từng hạ đàn em ở các giải biểu diễn ở Hurlingham và Mubadala. \"Dựa trên thứ bậc của cả hai và màn trình diễn của tôi, đây là trận hay bậc nhất mùa này\", Ruud nói.\n" +
                    "\n" +
                    "Chiến thắng giúp Ruud lấy lại tự tin sau bốn thất bại liên tiếp. Năm 2022, anh từng chơi tệ ở các giải sân cứng trong nhà cuối năm, rồi bất ngờ đi tới chung kết ATP Finals. Năm nay, cánh cửa vào bán kết rộng mở với Ruud, khi anh thắng đối thủ được xem là mạnh nhất bảng. Alcaraz cũng vẫn còn hy vọng đi tiếp, nếu đạt kết quả tốt trước Alexander Zverev và Andrey Rublev ở bảng này.",
            "https://vcdn1-thethao.vnecdn.net/2024/11/11/c3fslkkfhzlk5mqaj47tj5yawe-173-9905-4609-1731343572.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=dqtJW9PAPm_2N1dsrROWSw",
            "1 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "CLB TP HCM sáu trận không ghi bàn ở V-League",
            "Phung phí nhiều cơ hội, CLB TP HCM thảm bại 0-3 trước Nam Định ở vòng 7 chiều 11/11, đồng thời cán mốc sáu trận liền không ghi bàn ở V-League 2024-2025." +
                    "Từ vòng ba, CLB TP HCM lần lượt thua Hà Nội FC 0-2, Bình Dương 0-3, hòa Quảng Nam và SLNA cùng 0-0. Xen giữa là trận hòa Phù Đổng Ninh Bình 0-0, trước khi thua luân lưu 3-4 ở vòng loại Cup Quốc gia 2024-2025.\n" +
                    "\n" +
                    "Trên sân Thống Nhất tối 11/11, CLB TP HCM có cơ hội gây bất ngờ khi Nam Định đang vướng lịch thi đấu dày nên xuống sức. Đội khách cũng vắng ba cầu thủ tấn công chủ chốt là Hendrio – vấn đề thể lực, Nguyễn Xuân Son và Nguyễn Văn Toàn vì chấn thương. Đội bóng của HLV Phùng Thanh Phương thi đấu không kém cạnh, thậm chí tạo ra nhiều cơ hội ăn bàn nhưng lại bỏ lỡ." +
                    "Phút 13, Thanh Khôi chọc khe ở trung lộ, để Bùi Ngọc Long bứt tốc từ biên phải, nhưng cú sút đi chệch cột gần trong thế đối mặt thủ môn Trần Nguyên Mạnh. Hai phút sau, Nguyễn Phong Hồng Duy mất bóng bên sân nhà, giúp TP HCM phản công nhanh. Bóng được chuyền đến sát vòng cấm để Ngọc Hậu làm tường cho Erik Sorga vô-lê chân trái chệch cột trái.\n" +
                    "\n" +
                    "Trận đấu sau đó diễn ra chặt chẽ và không có cơ hội nguy hiểm. Phải đến phút 45, Nam Định, trong lần hiếm hoi lên bóng sáng nước, mở tỷ số. Từ biên phải, Joseph Mpande làm điểm trung chuyển để Lý Công Hoàng Anh băng vào vòng cấm, rồi căng ngang thuận lợi cho Trần Văn Đạt đệm chân trái ở cột hai ghi bàn.\n" +
                    "\n" +
                    "Đến phút bù thứ hai, chủ nhà đá phạt góc bên phải ra cột xa cho Adriano Schmidt đánh đầu trả ngược, nhưng Erik Sorga vô-lê vọt xà. Ngay sau đó, đội phải trả giá bằng bàn thua thứ hai và vẫn theo kịch bản tương tự bàn thứ nhất. Khác biệt chỉ là Văn Đạt đệm chân trái vào góc thấp phải, đánh bại Patrik Lê Giang.\n" +
                    "\n" +
                    "Khi hiệp hai trôi qua được bốn phút, CLB TP HCM đã thủng bàn thứ ba. Lý Công Hoàng Anh hoàn tất hat-trick kiến tạo, với pha dốc bóng ở trung lộ rồi chuyền cho Mpande trong vòng cấm. Ngoại binh của Nam Định khống chế, rồi xoay người sút rất mạnh vào góc cao trái, khiến Patrik chôn chân đứng nhìn.Hình ảnh đội thủng lưới ít nhất V-League 2023-2024 đã hoàn toàn biến mất ở CLB TP HCM. Trong khi đó, hàng công lại vô duyên và thiếu may mắn.\n" +
                    "\n" +
                    "Phút 61, Caio Cesar mất bóng ở giữa sân giúp CLB TP HCM chuyển trạng thái nhanh. Thanh Khôi sút xa buộc Nguyên Mạnh phải đấm bóng, và trong thế thuận lợi Sorga lại đá bồi vọt xà. Sau đó, Thanh Khôi có liên tiếp hai pha dứt điểm trong thế trống trải ở phút 63 và 64 nhưng đều chệch cột. Đến phút 76, tiền vệ Endrick Parafita xử lý bình tĩnh trước vòng cấm rồi cứa lòng chân trái đưa bóng dội xà." +
                    "Thua trận thứ ba tại V-League 2024-2025, CLB TP HCM tụt xuống thứ 11 với sáu điểm, bằng Quảng Nam nhưng kém hiệu số bàn thắng bại (-7 so với -5), đồng thời hơn vị trí cuối bảng hai điểm. Trong khi đó, Nam Định có chiến thắng thứ tư, để vươn lên thứ hai với 13 điểm, kém Thanh Hóa một điểm.\n" +
                    "\n" +
                    "Ở vòng 8 giải LPBank V-League 2024-2025, CLB TP HCM tiếp tục thi đấu ở sân nhà, đón Công an Hà Nội. Nam Định về sân Thiên Trường gặp đội cuối bảng Đà Nẵng.\n" +
                    "\n" +
                    "Đội hình xuất phát\n" +
                    "\n" +
                    "CLB TP HCM: Patrik Lê Giang, Thanh Thảo, Vũ Tín, Adriano Schmidt, Matheus Rocha, Trần Mạnh Cường, Endrick Parafita, Bùi Ngọc Long, Thanh khôi, Ngọc Hậu, Erik Sorga\n" +
                    "\n" +
                    "Nam Định: Trần Nguyên Mạnh, Nguyễn Phong Hồng Duy, Trần Văn Kiên, Trần Văn Công, Lucas Alves, Ngô Đức Huy, Tô Văn Vũ, Lý Công Hoàng Anh, Caio Cesar, Trần Văn Đại, Joseph Mpande.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/24/07c682359a54220a7b45-172974287-6726-9331-1729743796.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=JXb38F2IhMaV8BGxfVxF7Q",
            "2 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
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
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "Tóp mỡ ngào mắm đường tỏi",
            "Cách làm\n" +
                    "Sơ chế mỡ: Nên chọn phần mỡ thăn vừa rán lấy nước mỡ vừa tận dụng tóp giòn búi béo làm nhiều món ngon. Cách nhận biết mỡ thăn ngon có 2 phần và đường chỉ lằn nhỏ ở giữa. Mỡ mua về cho vào nước luộc sơ vài phút cùng nhánh gừng hoặc hành khô đập dập, chút rượu trắng, muối hạt khử mùi rồi vớt ra rửa sạch, thái miếng dài hoặc vuông tùy chọn, thường theo kiểu Nam Bộ hoặc người Hoa thái vuông. " +
                    "Thắng mỡ: Cho mỡ vào chảo, thêm một bát nước nhỏ rồi bật bếp và thắng ở lửa trung bình. Việc thắng mỡ bằng nước vừa giúp không bị bắn dầu, vừa làm cho mỡ được trong. Đảo đều cho rút hết nước và mỡ dần tiết ra nước. Khi mỡ rán được 70 - 80% và tóp mỡ hơi ngả vàng thì chắt nước mỡ ra, để riêng vào lọ sành sứ hoặc thủy tinh. " +
                    "Thắng tóp vàng giòn: Tiếp tục thắng phần mỡ còn lại ở lửa vừa, đảo đều. Khi tóp mỡ ngả vàng, đạt 90% thì cho thêm vài nhánh tỏi hoặc hành khô vào cho thơm. Khi hành ngả vàng, tóp mỡ cũng vàng giòn đều các mặt, lạo xạo là đã đạt, vớt ra khay thưa cho ráo dầu. " +
                    "Chuẩn bị các nguyên liệu khác: Tỏi bóc bỏ vỏ, băm nhỏ. Các gia vị quen thuộc gồm 1,5 - 2 thìa canh nước mắm, 2 thìa canh đường, 1 thìa canh tương ớt, 1/2 thìa cà phê ớt bột. " +
                    "Nấu hỗn hợp sốt mắm đường: Phi thơm tỏi, cho hết mắm, muối, đường, tương ớt, ớt bột như trên, thêm chút nước lọc đảo đều để ở lửa vừa. Nêm nếm gia vị lại sao cho vừa miệng. Tiếp tục đun ở lửa nhỏ vừa, đảo đều cho tới khi hỗn hợp nổi bọt khí to, hơi sanh sánh là đạt. " +
                    "Ngào tóp mỡ mắm đường: Trút tóp mỡ vào đảo hoặc xóc đều tay để hỗn hợp mắm đường tỏi ớt bao đều và thấm vị các mặt là hoàn thiện. " +
                    "Yêu cầu thành phẩm: Tóp mỡ bên ngoài áo lớp sốt mắm đường nâu đỏ, bên trong giòn thơm, vị mặn ngọt đậm đà, dậy mùi thơm của tỏi, vị tê cay của ớt. Món này ăn cùng cơm trắng hay nhâm nhi với dưa cải muối kích thích vị giác ngày se lạnh. ",
            "https://vcdn1-giadinh.vnecdn.net/2024/11/11/Bc66-1731315132-3743-1731315137.jpg?w=0&h=0&q=100&dpr=2&fit=crop&s=ZDzHbYM-sKN_8Ceg-Rmonw",
            "3 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            5,
            "7 giai đoạn của hôn nhân",
            "Nhiều cặp vợ chồng kỳ vọng về nhau không hợp lý và thiếu hiểu biết về quy luật phát triển của hôn nhân nên sinh ra đau khổ và thất vọng.\n" +
                    "\n" +
                    "Sau nhiều năm tư vấn trong lĩnh vực hôn nhân, tiến sĩ tâm lý học Quan Mỹ Lâm, ĐH Lâm nghiệp Trung Quốc, nhận thấy hầu hết các trục trặc của hôn nhân đều có thể phòng tránh và khắc phục được thông qua giáo dục tiền hôn nhân.\n" +
                    "\n" +
                    "Chỉ cần biết 7 giai đoạn phát triển của hôn nhân, hình thành những kỳ vọng hợp lý, bạn sẽ có khả năng gặt hái hạnh phúc." +
                    "Giai đoạn đầu là trăng mật. Ngay cả những đôi đã sống thử trước hôn nhân cũng sẽ cảm nhận được hạnh phúc và ngọt ngào khi mới bước vào cuộc sống vợ chồng. Những bức ảnh cưới lãng mạn, lễ cưới long trọng, sự kỳ vọng vào cuộc sống tương lai, sự gần gũi và thỏa mãn về tình dục. Tất cả những điều này sẽ khiến các đôi mới cưới cảm thấy mãn nguyện.\n" +
                    "\n" +
                    "Cảm giác hạnh phúc khi tình yêu thăng hoa thành hôn nhân có thể che lấp nhiều vấn đề nhỏ. Chúng ta có thể bao dung những khuyết điểm nhỏ của bạn đời, sẵn sàng đặt họ làm trung tâm, từ đó từ bỏ một số nhu cầu và mong muốn của bản thân. Vì vậy, trong giai đoạn này, mức độ hài lòng trong hôn nhân khá cao.\n" +
                    "\n" +
                    "Nhưng mối quan hệ nồng nàn đến đâu rồi cũng giảm dần sự say mê. Do đó, sau một vài năm kết hôn, hôn nhân bước vào giai đoạn thứ hai: Mài giũa.\n" +
                    "\n" +
                    "Trong giai đoạn này nhiều vấn đề bị che lấp dần nổi lên. Chúng ta bắt đầu chú ý đến những khuyết điểm của đối phương, không muốn nhường nhịn và nhận ra kết hôn khiến bản thân mất đi độc lập, đi kèm rất nhiều trách nhiệm và nghĩa vụ.\n" +
                    "\n" +
                    "Có chút thất vọng vì hôn nhân, hối hận vì lựa chọn, nhưng vì tình yêu, chúng ta sẽ cố gắng mài giũa với đối phương, thay đổi bản thân để thích nghi.\n" +
                    "\n" +
                    "Tuy nhiên, việc mài giũa không hề dễ dàng. Đôi khi, chúng ta cảm thấy người bạn đời sau khi kết hôn đã thay đổi, người trước đây vô cùng dịu dàng bây giờ lại có thể gắt gỏng, quát tháo. Lúc này, sự thất vọng và xung đột bắt đầu xuất hiện. Vì vậy, hôn nhân bước vào giai đoạn thứ ba: Nổi loạn.\n" +
                    "\n" +
                    "Hôn nhân bắt đầu trải qua khủng hoảng. Chúng ta thực sự sẽ thất vọng về người bạn đời, vì sự trưởng thành và thay đổi của họ hoàn toàn không như kỳ vọng của ta.\n" +
                    "\n" +
                    "Người vợ có thể phát hiện chồng mải mê với công việc và các cuộc gặp gỡ, chỉ biết kiếm tiền mà dành rất ít thời gian cho vợ con, việc nhà. Người chồng có thể nhận ra cô vợ dịu dàng ngày nào giờ đây đầu bù tóc rối bên con cái, không quan tâm, không ủng hộ sự nghiệp của chồng.\n" +
                    "\n" +
                    "Tình dục không khác gì trả nợ, hoàn toàn không còn sự nồng nhiệt như trước. Lúc này, những xung đột dữ dội sẽ xuất hiện, nên những người thất vọng về hôn nhân rất có thể sẽ tìm kiếm sự an ủi từ ngoại tình." +
                    "Sau khi trải qua một số đau khổ và đấu tranh, chúng ta bắt đầu nhìn nhận hôn nhân một cách thực tế hơn và bước vào giai đoạn thứ tư: Hợp tác.\n" +
                    "\n" +
                    "Trải qua 5-6 năm chung sống, cuối cùng chúng ta cũng hiểu ra hôn nhân không phải là màn độc diễn hay cuộc chiến giành quyền lực, mà cần hợp tác cùng có lợi. Chúng ta bắt đầu quan tâm đến nhu cầu của đối phương, học cách bao dung lẫn nhau, bắt đầu vì lợi ích lớn hơn, ví như sự phát triển lành mạnh của con cái, mà tự kiềm chế. zhôn nhân có chút hương vị của sự trưởng thành, cũng bắt đầu dần đi đến chín chắn.\n" +
                    "\n" +
                    "Khi con cái dần lớn lên, chúng ta có thời gian để quan tâm đến nhau. Vợ chồng chung tay vun đắp nên kinh tế gia đình cũng dần ổn định. Lúc này, hôn nhân bước vào giai đoạn thứ năm: Ổn định.\n" +
                    "\n" +
                    "Tình yêu năm nào giờ đây đã dần trở thành tình thân, tính cách của cả hai cũng trở nên ôn hòa, không còn kỳ vọng vào những điều viển vông. Trong giai đoạn này, chúng ta bắt đầu trải nghiệm lại hạnh phúc hôn nhân. Vì hiểu rõ về nhau nên giảm bớt xung đột. Vì cảm nhận được sự hy sinh của nhau nên lòng biết ơn tăng lên. Hôn nhân bước vào một giai đoạn ngọt ngào mới về cả thể xác lẫn tinh thần.\n" +
                    "\n" +
                    "Cuộc sống hôn nhân hạnh phúc ở tuổi trung niên vẫn sẽ gặp phải những thử thách, từ đó bước vào giai đoạn thứ sáu: Khủng hoảng.\n" +
                    "\n" +
                    "Ở tuổi này chúng ta có thể phải chịu nhiều áp lực: bệnh tật hoặc sự ra đi của cha mẹ, giai đoạn bế tắc trong sự nghiệp, bản thân bị bệnh. Những điều này đều có thể khiến hôn nhân rơi xuống vực thẳm. Dưới áp lực, chúng ta sẽ trở nên kém đồng cảm với bạn đời. Những cảm xúc lo lắng và sự yếu đuối của bản thân cũng sẽ lây sang người bạn đời, mang đến những thách thức mới.\n" +
                    "\n" +
                    "Tất nhiên, những thách thức này lại một lần nữa mang đến cho hôn nhân cơ hội để trưởng thành. Cùng nhau vượt qua giai đoạn khó khăn này, các cặp vợ chồng sẽ phát hiện ra cuộc sống của cả hai đã hòa làm một. Và rồi, cuộc hôn nhân đầy thăng trầm cũng bước vào giai đoạn thứ bảy: Viên mãn.\n" +
                    "\n" +
                    "Cùng nhau bước qua bao thăng trầm, vợ chồng là người thân thiết nhất trong cuộc đời của nhau, cũng là người đồng hành, hỗ trợ nhau nhiều nhất trong lúc khó khăn. Chúng ta chứng kiến toàn bộ cuộc đời của nhau, cũng đồng hành cùng nhau đến giai đoạn cuối của cuộc đời. Dù sau cùng ai cũng phải chia ly, nhưng không còn nuối tiếc gì nữa.\n" +
                    "\n" +
                    "Qua các 7 giai đoạn trên, chúng ta hiểu rằng hôn nhân không chỉ có đam mê, còn là hành trình của những thách thức và cả sự trưởng thành qua những khổ đau. Đồng thời, vì biết được những vấn đề của từng giai đoạn, có thể chuẩn bị trước cho việc xây dựng hôn nhân.\n" +
                    "\n" +
                    "\"Kỳ vọng hợp lý là chìa khóa của một cuộc hôn nhân hạnh phúc\", tiến sĩ Quan Mỹ Lâm nói.",
            "https://vcdn1-giadinh.vnecdn.net/2024/11/09/1-18-4931-1731163564.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=OHe1MfRiRh07ds8bhKJKTQ",
            "4 giờ trước",
            "Xem nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
    )
}

fun getDocNhieuNhat(): List<Post> {
    return listOf(
        Post(
            1,
            "Được, mất với Elon Musk khi ông Trump đắc cử",
            "Việc Trump đắc cử giúp Musk có thêm hàng tỷ USD từ cổ phiếu, nhưng đế chế của ông có thể bị ảnh hưởng nếu Mỹ tăng sức ép thương mại với Trung Quốc.\n" +
                    "\n" +
                    "Không lãnh đạo doanh nghiệp nào ủng hộ nỗ lực tranh cử của Donald Trump hơn Elon Musk. Theo hồ sơ của Ủy ban Bầu cử Liên bang Mỹ, Musk đã quyên góp gần 119 triệu USD cho siêu ủy ban hành động chính trị (siêu PAC) do ông thành lập để hỗ trợ Trump và thường xuyên xuất hiện cùng ứng viên đảng Cộng hòa tại các cuộc vận động tranh cử.\n" +
                    "\n" +
                    "Musk đã ngồi cạnh Trump trò chuyện khi chờ đợi kết quả đêm bầu cử. Và khi Trump thắng, Musk đăng hàng loạt dòng tweet trên mạng xã hội X để ăn mừng. \"Người dân Mỹ đã trao cho Donald Trump một nhiệm vụ rõ ràng sau những thay đổi vào tối nay\", ông viết." +
                    "Điều này rất khác với Musk năm 2022, khi ông cho rằng Trump đã quá già để làm tổng thống và khuyên cựu tổng thống nên \"về vườn an dưỡng\". Trump đáp lại rằng Musk từng \"cầu xin\" ông phê chuẩn các khoản trợ cấp khi ông còn ở Nhà Trắng. Mọi thứ chỉ thay đổi trong chặng cuối cuộc bầu cử tổng thống năm nay.\n" +
                    "\n" +
                    "\"Musk đã đặt cược lớn. Ông ấy dấn thân rất sâu vào cuộc bầu cử\", Daniel Ives, nhà phân tích công nghệ tại công ty quản lý tài sản, môi giới Wedbush Securities, trụ sở tại Los Angeles, nhận xét. Đổi lại, tỷ phú công nghệ sẽ được hưởng nhiều lợi ích cả về chính trị và kinh tế khi Trump chiến thắng.\n" +
                    "\n" +
                    "Steve Nelson, nhà khoa học chính trị tại Đại học Tây Bắc Mỹ, cho rằng với những người siêu giàu, khi tài sản không còn là mối bận tâm lớn, họ sẽ có xu hướng quan tâm đến chính trị. Musk tham gia vào chính trị bằng cách đổ tiền cho ứng viên mình ủng hộ, thay vì trực tiếp chạy đua tranh cử.\n" +
                    "\n" +
                    "Là người sinh ra ở Nam Phi, Musk không thể tranh cử tổng thống Mỹ, nhưng theo lý thuyết vẫn được quyền chạy đua vào các vị trí khác trong chính quyền. Nhưng tỷ phú giàu nhất thế giới dường như không quan tâm đến các vị trí đó, mà chỉ muốn tạo ảnh hưởng chính sách thông qua mối quan hệ với Trump, người sẽ giữ chức vụ cao nhất tại Nhà Trắng.\n" +
                    "\n" +
                    "\"Với người như Musk, ông ấy có lẽ có mối quan tâm cá nhân mạnh mẽ với việc theo đuổi những chính sách nhất định bằng tác động gián tiếp\", Nelson nói.\n" +
                    "\n" +
                    "Trump từng gợi ý Musk có thể được bổ nhiệm làm bộ trưởng Bộ Hiệu suất Chính phủ (DOGE), nhưng để giữ vị trí này, Musk sẽ phải từ bỏ vị trí tại các tập đoàn ông đang điều hành như Tesla hay SpaceX. Do đó, Musk nhiều khả năng sẽ tham gia một ủy ban giám sát hiệu suất chính phủ, hơn là trở thành bộ trưởng.\n" +
                    "\n" +
                    "\"Musk tìm kiếm một vị thế chính trị để có thể thúc đẩy tốt hơn các mục tiêu của mình, thay vì phải phụ thuộc vào người khác\", Nelson nói. \"Tín điều của Musk nằm ở hiệu suất làm việc và một chương trình nghị sự rõ ràng với các công nghệ tiên phong\".\n" +
                    "\n" +
                    "Sự ủng hộ về chính trị và kinh tế của Musk với Trump mang lại hiệu quả gần như tức thì. Sáng 6/11, chiến thắng của Trump đã giúp cổ phiếu hãng xe điện Tesla, công ty đại chúng lớn do Musk làm chủ, tăng 13% khi thị trường mở cửa, giúp tỷ phú này có thêm hơn 15 tỷ USD. Điều này đồng nghĩa khoản tiền 119 triệu USD mà Musk quyên góp cho siêu PAC đã mang về mức lợi nhuận 12.761%.\n" +
                    "\n" +
                    "Đây là mức tăng cao nhất trong hai năm qua đối với cổ phiếu Tesla, vốn đã gặp khó khăn gần đây và chỉ tăng 1% trong năm tính đến thời điểm thị trường đóng cửa ngày 5/11." +
                    "Tuy nhiên, Tesla vẫn đối mặt một số rủi ro, ngay cả khi Trump chiến thắng. Trump từng công khai phản đối xe điện, nói rằng chúng quá đắt, phạm vi di chuyển hạn chế và sẽ hủy hoại việc làm cũng như ngành công nghiệp ôtô Mỹ. Ông tuyên bố sẽ chấm dứt cái mà ông gọi là \"sứ mệnh xe điện của Biden\", mặc dù không có kế hoạch nào như vậy tồn tại và cũng không rõ ông đang muốn đề cập đến vấn đề gì.\n" +
                    "\n" +
                    "Nhưng dưới thời Tổng thống Joe Biden, chính phủ Mỹ đã hỗ trợ đáng kể cho nỗ lực phát triển xe điện, trong đó có những khoản vay hàng tỷ USD để khuyến khích các nhà sản xuất ôtô đầu tư vào nhà máy sản xuất xe điện và pin ở Mỹ, hỗ trợ việc xây dựng trạm sạc và cung cấp khoản tín dụng thuế 7.500 USD cho khách hàng mua xe điện.\n" +
                    "\n" +
                    "Nhiều chuyên gia trong ngành tin rằng Trump sẽ chấm dứt những chương trình hỗ trợ xe điện đó. Trump có thể ra lệnh cho Bộ Tài chính thay đổi các quy tắc xác định thời điểm người mua xe điện đủ điều kiện nhận khoản vay, hạn chế đáng kể khả năng nhận tín dụng thuế. Hoặc nếu đảng Cộng hòa kiểm soát lưỡng viện quốc hội, ông có thể thông qua luật để xóa bỏ hoàn toàn khoản tín dụng này.\n" +
                    "\n" +
                    "Nhưng Musk cho biết ông không lo lắng về nguy cơ khoản tín dụng thuế cho người mua xe điện bị xóa sổ, vì Tesla coi đây là một lợi ích cho nỗ lực của các nhà sản xuất ôtô truyền thống nhằm tiến vào thị trường xe điện và mang lại nhiều cạnh tranh hơn.\n" +
                    "\n" +
                    "\"Hãy loại bỏ các khoản trợ cấp. Nó sẽ chỉ giúp ích cho Tesla\", Musk đăng trên X hồi tháng 7.\n" +
                    "\n" +
                    "Do thị trường ngày càng cạnh tranh, doanh số toàn cầu của Tesla đã giảm 2% trong 9 tháng đầu năm nay so với cùng kỳ năm ngoái. Doanh thu và lợi nhuận được cải thiện vào quý ba, nhưng đây là lần đầu tiên công ty chứng kiến mức giảm như vậy kể từ khi thành lập." +
                    "Theo nhà phân tích Ives, vấn đề lớn hơn mà Tesla phải đối mặt là nguy cơ xảy ra chiến tranh thương mại lần hai giữa Mỹ với Trung Quốc trong nhiệm kỳ của Trump.\n" +
                    "\n" +
                    "\"Trump sẽ cứng rắn hơn nhiều với Trung Quốc và khi đó, những thứ tiêu cực có thể lấn át các mặt tích cực với Tesla\", Ives nói. \"Nhà máy ở Thượng Hải có tầm quan trọng đặc biệt đối với doanh thu và lợi nhuận toàn cầu của Tesla. Hơn 40% đơn hàng của hãng đến từ thị trường Trung Quốc. Tesla sẽ bị cuốn vào trận chiến\".\n" +
                    "\n" +
                    "Và Tesla cũng có thể gặp vấn đề khác nếu Trump giao cho Musk giám sát ủy ban cắt giảm lãng phí trong chính phủ, điều có thể khiến ông bị phân tâm khỏi việc điều hành Tesla. \"Sẽ có nhiều thời gian Musk phải rời xa Tesla hơn, vào thời điểm người ta muốn ông ấy chú ý đến tập đoàn nhiều hơn\", Ives nói.\n" +
                    "\n" +
                    "Một doanh nghiệp lớn khác của Musk, SpaceX, có lẽ sẽ ít bị ảnh hưởng hơn. Đối thủ cạnh tranh chính của nó, Boeing, đang gặp vấn đề nghiêm trọng với con tàu mà NASA đã ký hợp đồng để chở các phi hành gia đến và đi từ Trạm Vũ trụ Quốc tế (ISS).\n" +
                    "\n" +
                    "Quyền sở hữu mạng xã hội X của Musk đã bị chỉ trích rộng rãi, đặc biệt là bởi các đảng viên Dân chủ khi họ cáo buộc nền tảng này truyền bá thông tin sai lệch. Nhưng nó vẫn không bị đóng cửa hoặc bị cản trở bởi hành động của chính phủ ngay cả dưới thời Biden.\n" +
                    "\n" +
                    "Chính quyền mới của Trump có thể cũng sẽ không đưa ra bất kỳ hành động nào chống lại X. Dù Musk đã phải chịu những khoản lỗ tài chính kể từ khi mua công ty, giờ đây, nó chỉ là một phần tương đối nhỏ trong tổng giá trị tài sản ròng của ông.\n" +
                    "\n" +
                    "Musk mua lại Twitter năm 2022 với giá 44 tỷ USD và đổi tên thành X. Ông sau đó sa thải loạt nhân sự của công ty, mở khóa các tài khoản gây tranh cãi, trong đó có Trump, và quay lưng với các nhà quảng cáo. Điều đó đã khiến lượng lớn người dùng rời bỏ X và mạng xã hội này hiện chỉ có giá trị bằng 1/5 số tiền mà Musk đã bỏ ra để mua.\n" +
                    "\n" +
                    "Nhưng Musk dường như không bận tâm.\n" +
                    "\n" +
                    "\"Có những người giàu muốn kiếm thêm tiền và nhìn ngắm thế giới qua lăng kính lợi ích kinh doanh, tích lũy thêm tài sản\", David Faris, giáo sư khoa học chính trị tại Đại học Roosevelt, nói. \"Nhưng cũng có những người, như Musk, giàu đến mức chi 44 tỷ USD mua Twitter mà không thèm bận tâm. Ông ấy làm giàu theo cách không thể giải thích về mặt kinh tế\".",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/09/AFP-20241005-36JD9TM-v4-HighRe-3695-8545-1731147540.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=TVlsgKnOJmIqyTsJmo91Cw",
            "1 giờ trước",
            "Đọc nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Kiều bào tại Qatar kiến nghị tăng hợp tác lao động giữa hai nước",
            "Kiều bào tại Qatar gặp Thủ tướng Phạm Minh Chính, mong hai nước tăng hợp tác lao động, thêm lao động có kỹ năng, tay nghề sang nước bạn.\n" +
                    "\n" +
                    "Thủ tướng Phạm Minh Chính gặp cộng đồng người Việt Nam tại Doha, Qatar, tối 30/10. Đại sứ Việt Nam tại Qatar Nguyễn Huy Hiệp cho biết cộng đồng người Việt Nam ở đây hiện có khoảng 450 người, chủ yếu làm trong lĩnh vực xây dựng, dầu khí, học tập, nghiên cứu, kinh doanh, có người làm trong cơ quan công tố. Có hơn 300 người Việt đang là kỹ sư trong các doanh nghiệp dầu khí Qatar.\n" +
                    "\n" +
                    "Anh Nguyễn Trung Hiếu, trưởng ban liên lạc cộng đồng người Việt tại Qatar, kiến nghị tăng hợp tác lao động giữa hai nước, tiếp nhận thêm lao động có kỹ năng, có tay nghề làm việc tại các dự án Qatar. Cộng đồng người Việt cũng đề xuất tạo điều kiện cấp visa cho lao động, thúc đẩy đàm phán, ký kết văn bản miễn visa cho người mang hộ chiếu phổ thông để tạo điều kiện cho công dân hai nước qua lại du lịch, thúc đẩy thương mại, hỗ trợ người Việt sang kinh doanh, làm ăn tại Qatar." +
                    "Trong cộng đồng người Việt tại Qatar hiện có khoảng 20 em dưới 18 tuổi, kiều bào mong chính phủ, Bộ Ngoại giao, đại sứ quán hỗ trợ mở lớp học tiếng Việt cho các em.\n" +
                    "\n" +
                    "Các công nhân làm việc tại những dự án xây dựng, dầu khí ở sở tại mong nhà nước có chính sách hỗ trợ hòa nhập sau khi hết hạn hợp đồng về nước, nhằm tìm kiếm việc làm phù hợp.\n" +
                    "\n" +
                    "Thủ tướng Phạm Minh Chính mong kiều bào tiếp tục đoàn kết, tuân thủ pháp luật sở tại, chăm chỉ lao động, học tập, công tác, luôn giữ gìn, phát huy các giá trị văn hóa dân tộc, đặc biệt là vận động, giúp đỡ, tìm kiếm việc làm, học bổng, cơ hội đầu tư để đưa anh em, bạn bè sang học tập, nghiên cứu, sinh sống lâu dài tại sở tại.\n" +
                    "\n" +
                    "Thủ tướng chỉ đạo các cơ quan liên quan đàm phán với phía Qatar để có chính sách visa cởi mở, phù hợp hơn; các cơ quan nghiên cứu việc tiếp nhận người Việt Nam lao động về nước có tay nghề, kỹ năng, kinh nghiệm với các quy định, quy chuẩn rõ ràng." +
                    "Thủ tướng Phạm Minh Chính đang thăm chính thức Qatar ngày 30/10-1/11. Việt Nam - Qatar thiết lập quan hệ ngoại giao ngày 8/2/1993. Qatar là đối tác kinh tế, đầu tư tiềm năng của Việt Nam. Kim ngạch thương mại song phương năm 2023 đạt 497,2 triệu USD. Hàng năm, Qatar cấp học bổng cho ba sinh viên Việt Nam học tiếng Arab.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/31/img1930-1730317474946817742232-8108-1730359850.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=FTg1eeA3opYqjmkE0tiJ0Q",
            "2 giờ trước",
            "Đọc nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Người Việt trồng lúa nước trên đất châu Phi",
            "Từ ý tưởng của Linh Philip, Team châu Phi thử nghiệm canh tác giống lúa Khang Dân ở Angola, gặt hái thành công bước đầu trên mảnh đất châu Phi.\n" +
                    "\n" +
                    "Team châu Phi, nhóm có 4 thành viên là người Việt đang sinh sống, làm việc ở Angola, gần đây gây chú ý với các hoạt động làm thiện nguyện, hỗ trợ người dân bản địa do Phạm Quang Linh, người sáng lập \"Quang Linh Vlogs - Cuộc sống châu Phi\", dẫn dắt. Hồi đầu năm, Team châu Phi đã khiến nhiều người thán phục khi canh tác thành công giống lúa nước ở châu Phi.\n" +
                    "\n" +
                    "Người đầu tiên trong nhóm nêu ý tưởng trồng lúa nước ở châu Phi là anh Đỗ Văn Linh (Linh Philip), 37 tuổi, sang Angola xuất khẩu lao động từ năm 2012. Trong khi Quang Linh là người phân phối đầu việc cho anh em trong nhóm, Văn Linh lại chịu trách nhiệm chính tại trang trại Việt Phi Farm ở huyện Bailundo, cũng là trang trại đầu tiên canh tác thử nghiệm thành công hạt giống lúa nước ở Angola." +
                    "Văn Linh cho biết năm 2023, khi hay tin có người Việt đến tặng quà, giúp dân bản địa trồng cây lương thực, Phó chủ tịch và Trưởng phòng Nông nghiệp huyện Bailundo đã đến gặp và dẫn anh tới khu đất gần suối, có thể canh tác được vào mùa khô.\n" +
                    "\n" +
                    "Hai quan chức Angola muốn Văn Linh canh tác trên thửa đất này, thu hút người dân ở hai bản Bota và Chipipa lân cận đến làm việc, dạy họ \"mọi thứ về nông nghiệp\". \"Khi xem xét thực địa, tôi đồng ý nhận lời dạy dân địa phương canh tác theo hình thức của người Việt\", anh nói với VnExpress.\n" +
                    "\n" +
                    "Theo Văn Linh, văn hóa làm nông hiện nay của người dân Angola có từ thời thuộc địa Bồ Đào Nha, chỉ làm việc vào mùa mưa từ tháng 9 đến tháng 2 năm sau, còn mùa khô sẽ không canh tác gì.\n" +
                    "\n" +
                    "\"Họ chỉ gieo hạt vào mùa mưa, còn cây lên tốt hay không hoàn toàn phụ thuộc vào thiên nhiên, cũng không dùng phân chuồng, càng không dùng phân lân, đạm như Việt Nam\", anh giải thích.\n" +
                    "\n" +
                    "Sau khi Văn Linh nhận lời, hai quan chức huyện Bailundo giới thiệu anh với các trưởng thôn lân cận. Dân trong bản khi đó đã biết về hoạt động thiện nguyện của Team châu Phi nên chào đón rất nồng nhiệt. Các trưởng thôn cử con trai kêu gọi người dân đến làm cỏ, phát quang đất để hỗ trợ nhóm." +
                    "Sau khi cải tạo đất, đào mương, Văn Linh hướng dẫn bà con trồng vụ ngô đầu tiên. Do còn khó khăn, vụ đầu chỉ thu hoạch được 10 tấn ngô, chia đều cho người dân hai bản.\n" +
                    "\n" +
                    "Nhận thấy bà con cần có \"cần câu cơm\" về lâu dài, Văn Linh khởi xướng ý tưởng trồng lúa nước. Năm 2022, một số thành viên Team châu Phi về Việt Nam mang hạt giống lúa nương sang thử nghiệm, song không thành công do gieo hạt vào mùa khô, thời điểm ban ngày hanh khô, ban đêm lạnh giá.\n" +
                    "\n" +
                    "Không từ bỏ ý định trồng lúa Việt Nam ở châu Phi, Văn Linh về Bắc Giang tìm mua giống lúa mới. Sau khi học hỏi kinh nghiệm nông nghiệp từ gia đình, anh quyết định chọn Khang Dân, bởi đây là giống lúa thuần chủng, có thể canh tác qua nhiều vụ mà không ảnh hưởng đến chất lượng giống.\n" +
                    "\n" +
                    "\"Nhiều người khi đó gạt đi, nói lúa nương không thành, chưa chắc lúa nước đã ổn\", anh chia sẻ. \"Nhưng tôi tự động viên mình: Thành công thì nở mày nở mặt, thất bại thì coi như một bài học, chứng tỏ lúa nước Việt Nam không thể phát triển được ở Angola, khi đó sẽ chuyển hướng sang canh tác ngô, khoai, sắn\".\n" +
                    "\n" +
                    "Tháng 11/2023, giữa mùa mưa ở Angola, Văn Linh mang thóc ra ngâm, gieo mạ thử nghiệm trên 4 sào ruộng. Trong những ngày đầu, anh liên tục phải kiểm tra mạ. \"Tôi rất lo lắng, không biết liệu Khang Dân có hợp thổ nhưỡng, khí hậu châu Phi hay không? Chưa kể nếu gieo thành công, có sâu bệnh, lấy đâu thuốc bảo vệ thực vật chuyên dụng\", anh kể.\n" +
                    "\n" +
                    "Mạ Khang Dân khi gieo xuống đã phát triển từng ngày, khiến anh thêm tự tin. Tết 2024, anh về Việt Nam thêm một tháng để tham vấn kinh nghiệm các chuyên gia rồi quay lại châu Phi, mang theo nhiều loại phân bón, thuốc bảo vệ thực vật, đúng lúc lúa chuẩn bị trổ đòng." +
                    "Đến tháng 4, lúa chín, Văn Linh cùng mọi người gặt, tuốt, phơi đủ ba nắng, thu được 1,5 tấn thóc. Anh chia cho mỗi thành viên Team châu Phi 40 kg thóc để làm giống gieo thử nghiệm vào mùa khô.\n" +
                    "\n" +
                    "Những thành viên nổi bật trong nhóm, có trang trại canh tác tại Angola như Nguyễn Văn Đông (Đông Paulo), Hùng Kaka, Thế Nhân, Quang Dũng, Công Giáp... đều gieo thóc giống vào đầu tháng 6 để thử nghiệm khả năng sinh trưởng của lúa Khang Dân vào mùa khô châu Phi.\n" +
                    "\n" +
                    "\"Chúng tôi giữ lại 7 bao thóc, phòng trường hợp thử nghiệm mùa khô thất bại, anh em vẫn còn thóc giống để cấy vào mùa mưa. Số còn lại tôi xát thành gạo chia cho dân hai bản, mỗi nhà một ít\", Văn Linh kể.\n" +
                    "\n" +
                    "Anh cũng khuyến khích bà con tiếp tục gieo thử nghiệm, tin rằng nếu dự án thành công, mọi người sẽ có gạo ăn, không còn nỗi lo thiếu lương thực vào mùa khô nữa. Khi thấy Văn Linh thành công trong thử nghiệm đầu tiên, \"nói được làm được\", người dân hai bản càng hưởng ứng nhiệt tình.\n" +
                    "\n" +
                    "Anh hướng dẫn 10 tổ trưởng về kỹ thuật ngâm, ủ mạ, chuẩn bị đất trước khi gieo, để họ truyền đạt lại với bà con.\n" +
                    "\n" +
                    "\"Toàn bộ vụ này là do phụ nữ hai bản cấy, có khi lên đến 70 người làm việc trên trang trại 100 ha\", Văn Linh cho biết. Nhiều người xem kênh YouTube cùng các chuyên gia nông nghiệp ở Việt Nam cũng liên lạc, tư vấn thêm cho nhóm về kỹ thuật canh tác." +
                    "Nhưng mùa khô châu Phi dường như quá khắc nghiệt so với lúa Khang Dân. Nhiệt độ ban đêm ở Angola mùa này có lúc hạ xuống 5-6℃, khiến cây lúa không phát triển được. Phần lớn trang trại thuộc Team châu Phi đã phải nhổ bỏ lúa để dồn sức cho vụ cấy mùa mưa.\n" +
                    "\n" +
                    "\"Chúng tôi đã chuẩn bị tinh thần rằng thời tiết sẽ rất khắc nghiệt và đây cũng không phải thất bại đầu tiên. Tôi và anh em trong nhóm luôn tin rằng thất bại là mẹ thành công, là cơ sở để chúng tôi đẩy mạnh trồng hoa màu thay thế lúa vào mùa khô năm tới\", Văn Linh cho hay.\n" +
                    "\n" +
                    "Mùa mưa năm nay ở Angola bắt đầu từ tháng 10, muộn hơn so với bình thường. Toàn bộ trang trại thuộc Team châu Phi đã bắt đầu gieo mạ, xác định đây sẽ là vụ mùa trọng điểm.\n" +
                    "\n" +
                    "\"Có sức người, sỏi đá cũng thành cơm. Việt Phi Farm đã gieo cấy mạ trên diện tích gấp 10 lần năm ngoái. Cây lúa sinh trưởng và phát triển tốt, tình hình rất khả quan. Chúng tôi hy vọng năm nay sẽ bội thu như năm trước, đem lại ấm no cho bà con\", Văn Linh nói.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/18/438030182-979577080359467-4259-7445-1378-1729262217.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=BTOEabRqNNWtkSonCUcmFg",
            "3 giờ trước",
            "Đọc nhiều nhất",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getGiaoDuc(): List<Post> {
    return listOf(
        Post(
            1,
            "Thầy giáo trẻ nhất được Hà Nội vinh danh",
            "Thầy Nguyễn Hữu Quyết, người trẻ nhất nhận giải thưởng Nhà giáo tâm huyết, sáng tạo 2024 của Hà Nội, từng là thủ khoa ở Đại học Sư phạm Hà Nội.\n" +
                    "\n" +
                    "Thầy Nguyễn Hữu Quyết sinh năm 1998, hiện là giáo viên dạy Giáo dục Kinh tế và pháp luật tại trường THPT Huỳnh Thúc Kháng, Hà Nội.\n" +
                    "\n" +
                    "Trong 70 người được trao giải \"Nhà giáo tâm huyết, sáng tạo\" năm nay, thầy giáo quê Hải Dương là người trẻ nhất. Quyết cũng là giáo viên đầu tiên của trường THPT Huỳnh Thúc Kháng nhận giải này.\n" +
                    "\n" +
                    "Đây là giải thưởng thường niên của thành phố, nhằm tôn vinh những giáo viên có những đóng góp giá trị, đạt nhiều thành tích." +
                    "Anh Quyết kể ngày nhỏ, mỗi khi ôn bài, anh không dùng sách hay bút, mà dùng phấn viết lên cánh cửa tôn. Họ hàng nhìn thấy cảnh cậu bé cặm cụi viết kín cửa, rồi lại xóa để viết tiếp thì đùa \"thích phấn và bảng như này thì sau làm giáo viên\". Tuy nhiên, lúc đó Quyết chưa có hình dung về nghề nghiệp tương lai.\n" +
                    "\n" +
                    "Ngày học lớp 10, qua sóng phát thanh, Quyết nghe được lá thư của một cô giáo gửi mẹ, chia sẻ những suy nghĩ về nghề \"trồng người\". Được truyền cảm hứng, Quyết xác định sẽ theo sư phạm.\n" +
                    "\n" +
                    "Năm 2016, Quyết trở thành tân sinh viên ngành Giáo dục công dân, thuộc khoa Lý luận chính trị - Giáo dục công dân, của trường Đại học Sư phạm Hà Nội. Anh cho hay chọn ngành này với mong muốn vừa có thể đứng lớp dạy học trò, đồng thời thỏa mãn niềm đam mê với các hoạt động đoàn, đội. Vì xác định mục tiêu từ đầu, Quyết không gặp nhiều khó khăn trong quá trình học. Anh tốt nghiệp sớm nửa năm với danh hiệu thủ khoa đầu ra của ngành, được nhận về làm việc tại trường THPT Huỳnh Thúc Kháng, từ tháng 12/2019.\n" +
                    "\n" +
                    "Ngay trong năm học đầu tiên, thầy Quyết được phân công dạy Giáo dục công dân và ôn thi tốt nghiệp cho một lớp 12, nổi tiếng là \"rất nghịch\". Nhiều đồng nghiệp ái ngại cho thầy Quyết, sợ thầy giáo trẻ bị bắt nạt, nhưng trái với lo lắng của mọi người, thầy thấy tự tin.\n" +
                    "\n" +
                    "Theo thầy, nhiều người nghĩ giáo viên trẻ sẽ gặp nhiều bất lợi, nhưng thực tế đây có thể là lợi thế.\n" +
                    "\n" +
                    "\"Người trẻ sẽ dễ nói chuyện, đồng cảm, thấu hiểu nhau hơn. Tôi cũng muốn có thể làm bạn, làm người đồng hành với học trò, nên tuổi tác không phải vấn đề\", thầy chia sẻ.\n" +
                    "\n" +
                    "Buổi đầu lên lớp, thầy nói chuyện với học trò, đưa ra nội quy môn học. Quá trình dạy, thầy cũng lồng ghép, chia sẻ thêm trải nghiệm của bản thân tại đại học với một số nội dung liên quan đến bài. Việc này giúp học sinh có kiến thức từ ví dụ thực tế, đồng thời cảm thấy gần gũi giáo viên hơn.\n" +
                    "\n" +
                    "\"Sau nửa học kỳ, các thầy cô bất ngờ, bảo không biết thầy Quyết cảm hóa như nào mà lớp ngoan hẳn\", thầy kể." +
                    "Mỗi kỳ nghỉ hè, thầy Quyết soạn giáo án, dành thời gian trong năm học để xây dựng phương pháp dạy mới, làm học liệu. Thầy thường dạy theo sơ đồ tư duy và từ khóa quan trọng, kết hợp mô hình trực quan để học sinh nhớ bài lâu hơn. Chẳng hạn khi dạy bài \"Công dân với sự nghiệp xây dựng và bảo vệ Tổ quốc\", thầy mất ba ngày làm sa bàn chiến dịch Điện Biên Phủ bằng bìa và chai nhựa.\n" +
                    "\n" +
                    "Vật liệu được thầy dùng làm mô hình dạy học thường là rác hoặc đồ dùng tái chế. Thầy Quyết là người chủ trì dự án \"Tái chế rác thải thành đồ dùng dạy học\", vào top 15 giải thưởng Tri thức trẻ vì giáo dục năm 2020; dự án \"Bảo tàng mini\" để trưng bày sản phẩm tái chế của học sinh, giành giải nhì cuộc thi Thanh niên sáng tạo vì khí hậu 2021.\n" +
                    "\n" +
                    "Biệt danh \"Quyết đồng nát\" của thầy xuất phát từ đó.\n" +
                    "\n" +
                    "Trong hơn 4 năm đi dạy, thầy Quyết nói có nhiều kỷ niệm với học trò. Biết thầy thích ăn đồ nếp, học sinh đã tặng thầy một gói xôi vào ngày sinh nhật. Cuối năm học, thầy cũng hay \"tặng\" lại học sinh những món quà đặc biệt như bản kiểm điểm của chính các em. Theo thầy, việc này vừa nhằm \"xí xóa\" chuyện không vui, nhưng cũng nhắc nhở học sinh không nên mắc lại những lỗi cũ.\n" +
                    "\n" +
                    "Có năm làm chủ nhiệm, thầy Quyết đổi mới buổi họp phụ huynh bằng cách cho học sinh tự thiết kế thiệp và viết thư cho bố mẹ. Phụ huynh sau đó cũng làm tương tự.\n" +
                    "\n" +
                    "\"Tôi mong cách này có thể phần nào giúp học trò và bố mẹ chia sẻ tâm tư, những lời động viên mà thường ngày khó nói với nhau\", thầy giáo nói." +
                    "Thầy Phan Như Hùng, Hiệu trưởng trường THPT Huỳnh Thúc Kháng, nhận xét thầy Quyết luôn say mê với công việc, không ngừng sáng tạo và hoàn thành tốt nhiệm vụ được giao. Ở vai trò Bí thư đoàn trường, thầy Quyết là người khởi xướng và chủ trì nhiều hoạt động.\n" +
                    "\n" +
                    "\"Sự trẻ trung, nhiệt huyết và sáng tạo của Quyết đã thổi luồng không khí học tập mới mẻ cho học sinh. Điều này rất phù hợp với chương trình mới với nhiều yêu cầu về đổi mới phương pháp dạy học\", thầy Hùng nói.\n" +
                    "\n" +
                    "Từ khi thầy Quyết về dạy ở trường, số học sinh đăng ký vào ngành Giáo dục công dân ở đại học có xu hướng tăng, trung bình khoảng 20 em mỗi năm, có năm hơn 30.\n" +
                    "\n" +
                    "\"Điều đó phần nào cho thấy thầy Quyết đã truyền được cảm hứng cho học trò về những gì mình đã và đang làm\", thầy Hùng chia sẻ.\n" +
                    "\n" +
                    "Thầy Quyết cho biết đã hoàn thành chương trình cao học, đặt mục tiêu lấy bằng tiến sĩ vào năm 30 tuổi. Xa hơn, thầy mong trở thành chuyên gia trong lĩnh vực giáo dục kỹ năng sống và an toàn cho học sinh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/9a354506-02b3-4646-a1a2-c8e6d4-3546-3973-1731230032.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=UkkGAMlsKn83G_Ut5DC3Rg",
            "1 giờ trước",
            "Giáo dục",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Đầu vào IELTS tăng, trường đại học dạy thêm ngoại ngữ 2",
            "Với khoảng 70% tân sinh viên có IELTS 5.5-7.0, Đại học Kinh tế Quốc dân, Ngoại thương mở rộng dạy tiếng Trung, Nhật, Hàn, nhằm tạo lợi thế cho người học khi xin việc.\n" +
                    "\n" +
                    "Năm nay, trường Đại học Kinh tế Quốc dân bắt đầu đưa tiếng Hàn Quốc và Nhật Bản vào danh sách ngoại ngữ 2, cùng với tiếng Pháp và Trung Quốc đã có từ năm 2012.\n" +
                    "\n" +
                    "Sinh viên ngành Ngôn ngữ Anh, Quản trị dịch vụ du lịch và lữ hành, Quản trị khách sạn bắt buộc học ngoại ngữ 2. Với những ngành còn lại, các em được khuyến khích, không yêu cầu đầu ra. Theo thống kê của trường, hơn 300 tân sinh viên đã đăng ký theo diện này.\n" +
                    "\n" +
                    "Nhiều đại học có xu hướng mở rộng dạy ngoại ngữ 2 bên cạnh tiếng Anh cho sinh viên, chủ yếu cho sinh viên tự chọn, không bắt buộc. Như trường Đại học Ngoại thương đang dạy 5 ngoại ngữ 2, gồm tiếng Trung, Nhật, Pháp, Nga, Tây Ban Nha; dự kiến bổ sung tiếng Đức và Hàn Quốc. Đại học Mỏ-Địa chất có tiếng Trung, Nhật, Hàn bên cạnh tiếng Anh; còn Đại học Nha Trang dạy ngoại ngữ 2 là tiếng Pháp, Trung, Nga, Nhật." +
                    "Theo TS Lê Anh Đức, Phó trưởng phòng phụ trách Quản lý đào tạo, trường Đại học Kinh tế Quốc dân, một trong những lý do khiến trường mở rộng dạy ngoại ngữ 2 là trình độ tiếng Anh đầu vào của sinh viên không ngừng tăng.\n" +
                    "\n" +
                    "Năm 2024, trường Đại học Kinh tế Quốc dân nhận gần 12.000 hồ sơ có IELTS (chứng chỉ tiếng Anh quốc tế), trong khi cách đây 5 năm chỉ 2.000. Khoảng 70% trong số sinh viên trúng tuyển có IELTS từ 5.5 trở lên, một nửa đạt trên 6.5 - tương đương mức chuẩn đầu ra cao nhất của trường.\n" +
                    "\n" +
                    "Trường Đại học Ngoại thương ghi nhận xu hướng tương tự. Năm nay, tỷ lệ tân sinh viên có IELTS từ 6.5 trở lên là 76%, từ 7.5 là 44%, cũng tăng mạnh so với giai đoạn trước.\n" +
                    "\n" +
                    "Ngoài ra, ông Đức cho rằng biết thêm ngoại ngữ tạo lợi thế cho sinh viên khi tìm việc làm sau tốt nghiệp. Trường quan tâm tiếng Trung Quốc, Nhật Bản và Hàn Quốc, bởi đây là những quốc gia phát triển hàng đầu châu Á.\n" +
                    "\n" +
                    "Thạc sĩ Phạm Thanh Hà, Phó trưởng phòng trách Quản lý đào tạo, trường Đại học Ngoại thương, đồng tình. Bà nhìn nhận ngôn ngữ không chỉ là công cụ giao tiếp, mà còn là cầu nối gắn liền với các giá trị văn hóa, lịch sử, xã hội, giúp người học am hiểu hơn bối cảnh, yêu cầu của thị trường quốc tế. Vì vậy, sử dụng thành thạo nhiều ngôn ngữ tác động không nhỏ đến sự sáng tạo, khả năng kết nối và nắm bắt cơ hội nghề nghiệp.\n" +
                    "\n" +
                    "\"Kết hợp giữa nền tảng tiếng Anh vững chắc, khả năng sử dụng ngoại ngữ thứ hai là yếu tố quan trọng giúp sinh viên nâng cao vị thế của mình trong thị trường lao động quốc tế\", bà Hà nói.\n" +
                    "\n" +
                    "Khi trình độ tiếng Anh của người học ngày càng cao, ông Đức dự đoán việc trường đại học phát triển dạy ngoại ngữ 2 là xu hướng tất yếu. Điều này nhằm đáp ứng nhu cầu của người học, đồng thời nâng cao chất lượng đào tạo của các trường.\n" +
                    "\n" +
                    "Thời gian tới, trường Đại học Ngoại thương dự kiến yêu cầu bắt buộc học ngoại ngữ 2 với một số chương trình, chứ không chỉ các ngành ngôn ngữ như hiện nay.\n" +
                    "\n" +
                    "Tại trường Đại học Mỏ-Địa chất, PGS.TS Nguyễn Đức Khoát, Trưởng phòng Đào tạo, cho biết cuối năm 2023, chương trình Ngôn ngữ Trung Quốc của trường đã được hội đồng thẩm định thông qua. Việc mở ngành mới hướng tới mục tiêu đào tạo tiếng Trung chuyên sâu cho sinh viên.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/08/233a1084-1729219029-2102-17292-8948-3536-1731062649.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=RPqxN81DtvS7hqc6i6u48g",
            "2 giờ trước",
            "Giáo dục",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "'Chạy đua' kiểm định tạo gánh nặng cho đại học' ",
            "Chi phí kiểm định chất lượng tốn kém, nhưng Luật lại bắt buộc 5 năm một lần, tạo ra gánh nặng tài chính lớn, ảnh hưởng tới phát triển, theo các đại học.\n" +
                    "\n" +
                    "Công tác kiểm định chất lượng giáo dục đại học là vấn đề được nhiều trường quan tâm, thảo luận tại tọa đàm về Luật giáo dục và Luật giáo dục đại học, cuối tuần qua ở TP HCM.\n" +
                    "\n" +
                    "Luật giáo dục đại học bắt buộc kiểm định tất cả chương trình đào tạo, cứ 5 năm một lần. Nếu đạt, các trường được tự xác định học phí, theo Nghị định 81 của Chính phủ. Có hai hình thức kiểm định, hoặc theo chuẩn của Bộ Giáo dục và Đào tạo, hoặc theo tiêu chuẩn của các tổ chức nước ngoài.\n" +
                    "\n" +
                    "PGS.TS Trần Tiến Khai, Trưởng phòng Đảm bảo chất lượng - Phát triển chương trình, Đại học Kinh tế TP HCM, nhìn nhận việc này còn nhiều bất cập.\n" +
                    "\n" +
                    "Theo ông, củng cố chất lượng hệ thống giáo dục đại học là cần thiết nhưng không cần chi tiết hóa đến mức bắt buộc phải kiểm tra, đánh giá tất cả các chương trình đào tạo. Các nước trên thế giới cũng hướng đến những chuẩn mực chung, nhưng gần như không ở đâu yêu cầu các đại học phải đạt kiểm định.\n" +
                    "\n" +
                    "\"Công tác kiểm định tạo ra gánh nặng tài chính rất lớn, không phải trường nào cũng kham nổi\", ông nói.\n" +
                    "\n" +
                    "Chu kỳ kiểm định 5 năm cũng không phù hợp. Luật giáo dục đại học cho phép các trường lựa chọn tổ chức kiểm định, trong khi Luật Đấu thầu bắt buộc phải đấu thầu, gây mất thời gian.\n" +
                    "\n" +
                    "Nhiều trường vừa được đánh giá xong không bao lâu đã phải chuẩn bị để tái kiểm định. Vì có nhiều chương trình, thời gian kiểm định không phải lúc nào cũng khớp nhau nên nếu không kịp sắp xếp, công tác tuyển sinh có thể bị ảnh hưởng.\n" +
                    "\n" +
                    "\"Điều này rất vô lý. Chương trình đã được kiểm định là chất lượng, không lẽ chỉ trong một thời gian ngắn mà tệ đi\", ông Khai đặt vấn đề." +
                    "PGS.TS Trần Thiên Phúc, Phó hiệu trưởng trường Đại học Bách khoa, đồng tình.\n" +
                    "\n" +
                    "\"Bối cảnh ngành nghề ngày nay thay đổi rất nhanh. Chúng ta cứ chạy theo kiểm định liên tục thì không còn thời gian phát triển chương trình\", ông Phúc nói.\n" +
                    "\n" +
                    "Ở góc độ khác, TS Thái Thị Tuyết Dung, phụ trách Ban Thanh tra - Pháp chế của Đại học Quốc gia TP HCM, nhận định thời gian qua nhiều trường chạy đua kiểm định. Theo bà, khi nhu cầu quá cao, chất lượng kiểm định cũng khó kiểm soát.\n" +
                    "\n" +
                    "\"Các trường muốn đánh giá đạt chuẩn để được tự xác định học phí. Trong một chừng mực nào đó, các trường làm kiểm định chỉ vì học phí thôi chứ nếu không, họ sẽ làm từ từ\", bà nói.\n" +
                    "\n" +
                    "Các chuyên gia đề xuất Bộ Giáo dục và Đào tạo khắc phục những bất cập này. Chẳng hạn, theo PGS Khai, Bộ nên công nhận chất lượng chương trình đào tạo ở những trường đã đạt kiểm định cấp cơ sở và có khoảng 50% chương trình đạt tiêu chuẩn. Cùng đó, ông mong kéo dài chu kỳ kiểm định lên 7 năm, có cơ chế chỉ định thầu để các trường lựa chọn đơn vị kiểm định." +
                    "Thứ trưởng Bộ Giáo dục và Đào tạo Hoàng Minh Sơn thừa nhận không nước nào yêu cầu đánh giá tất cả chương trình và cơ sở giáo dục đại học. Ở Việt Nam, công tác kiểm định có ba cấp độ: chương trình, cơ sở và hệ thống.\n" +
                    "\n" +
                    "\"Bộ đang nghiên cứu cách tiếp cận, theo xu hướng phân quyền, giao quyền tự chủ. Một cơ sở đại học ở mức độ như thế nào thì được tự kiểm định\", Thứ trưởng nói.\n" +
                    "\n" +
                    "Tính đến ngày 31/7, cả nước có hơn 1.900 chương trình được kiểm định, trong đó hơn 1.370 theo tiêu chuẩn trong nước, khoảng 570 theo tiêu chuẩn nước ngoài (Xem danh sách). Ở cấp độ cơ sở, hơn 200 trường đại học và 11 cao đẳng sư phạm đạt tiêu chuẩn của các tổ chức kiểm định.\n" +
                    "\n" +
                    "17 tổ chức kiểm định chất lượng, gồm 10 tổ chức nước ngoài, 7 trong nước được cấp phép hoạt động. Mỗi tổ chức có các tiêu chí đánh giá, trọng số và chi phí khác nhau.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/a0568ab7-b556-482b-9c2b-ae41e1-3592-9680-1731302425.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=Xjz3l2SHRXE6NHUj_W8qOg",
            "3 giờ trước",
            "Giáo dục",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "Học Tự động hóa hay Điện tử viễn thông có tương lai hơn?",
            "Em nghe nói học Tự động hóa khó nhưng dễ kiếm việc, còn Điện tử viễn thông đang bão hòa, em nên chọn ngành nào?.\n" +
                    "\n" +
                    "Em học lớp 12, đang tìm hiểu một số ngành kỹ thuật, trong đó có Tự động hóa và Điện tử viễn thông. Em thấy nhiều người nhận xét Tự động hóa khá khó, lại vất vả, phải làm ở các nhà máy, công trường nhưng dễ kiếm việc, lương ổn định. Với Điện tử viễn thông, em định học về bán dẫn hoặc các hệ thống mạng 4G, 5G hay IoT, tuy nhiên một số ý kiến nói ngành này đang bão hòa và phải thật giỏi mới có công việc tốt.\n" +
                    "\n" +
                    "Em mong mọi người tư vấn và cho lời khuyên về hai lựa chọn này. Em xin cảm ơn.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/22/Anhmanhinh20240806luc151509-17-5382-5475-1729588332.png?w=240&h=144&q=100&dpr=1&fit=crop&s=tlph1G0Lb9ebavVP8r-VeQ",
            "4 giờ trước",
            "Giáo dục",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ), Post(
            5,
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
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/T2-1731226922-8181-1731227235.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=m1i5PfjoUTxhRDvZyLtWkQ",
            "5 giờ trước",
            "Giáo dục",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

//"Tin tức", "Tuyển sinh", "Chân dung", "Du học", "Diễn đàn", "Học tiếng anh",   "Giáo dục 4.0"
// Category Items Data
fun getTinTuc(): List<Post> {
    return listOf(
        Post(
            1,
            "Ký ức của những nhà giáo đi B",
            "60 năm trước, nhiều giáo viên, sinh viên sư phạm \"không biết sợ chết là gì\", đi bộ nhiều tháng trời vào chi viện cho chiến trường miền Nam.\n" +
                    "\n" +
                    "Những kỷ niệm về một thời kỳ gian khó, hiểm nguy được nhiều nhà giáo ôn lại tại buổi gặp mặt do Sở Giáo dục và Đào tạo TP HCM tổ chức, ngày 11/11, nhân dịp 42 năm ngày nhà giáo Việt Nam.\n" +
                    "\n" +
                    "Ông Trịnh Hồng Sơn, 90 tuổi, giải thích \"nhà giáo đi B\" chỉ những nhà giáo, sinh viên miền Bắc vào chiến trường miền Nam dạy học và chiến đấu trong kháng chiến chống Mỹ.\n" +
                    "\n" +
                    "Đi B từ năm 1964, ông vẫn nhớ khi tập trung ở Phú Thọ, đoàn được Tổng bí thư Lê Duẩn, nhà thơ Tố Hữu, Bộ trưởng Phạm Ngọc Thạch đến thăm và động viên. Những người đi cùng ông Sơn ngày đó là giảng viên, sinh viên mới tốt nghiệp Đại học Tổng hợp (nay là trường Đại học Khoa học Tự nhiên) và Sư phạm Hà Nội.\n" +
                    "\n" +
                    "\"Với nhiệt huyết tuổi trẻ và lòng yêu nước, chúng tôi chỉ có một tâm nguyện là đi thật nhanh để sớm có mặt ở miền Nam, cùng đồng bào chiến đấu\", thầy Sơn kể." +
                    "Ông Sơn kể đoàn di chuyển vào Nam mất hơn hai tháng, đối mặt với nhiều gian khổ.\n" +
                    "\n" +
                    "\"Có khi đang đi thì gặp trận càn hoặc bị địch ném bom, hiểm nguy rình rập từng bước chân. Chúng tôi vượt Trường Sơn là nhờ ý chí\", ông nhớ lại.\n" +
                    "\n" +
                    "Vào chiến trường miền Nam, nhiều nhà giáo chuyển sang phục vụ quân đội, trực tiếp cầm súng chiến đấu. Ông và một số người khác hoạt động ở rừng Tây Ninh, viết sách giáo khoa cho người dân, cán bộ khu vực giải phóng.\n" +
                    "\n" +
                    "Bà Nguyễn Thị Yến Thu, Phó chủ tịch Hội Cựu giáo chức, kể viết đơn tình nguyện đi B khi 25 tuổi, vừa tốt nghiệp ngành Sư phạm Ngữ văn của Đại học Sư phạm Hà Nội. Trước đó, bà là lứa học sinh miền Nam được điều động ra Bắc học tập.\n" +
                    "\n" +
                    "\"Tôi quay về là lẽ đương nhiên, nhưng khâm phục nhất là nhiều anh chị em không quen biết ai, chưa từng đặt chân đến miền Nam, gác lại gia đình để sẵn sàng lên đường\", bà nói.\n" +
                    "\n" +
                    "Trong ký ức của bà, đoàn đi B là những chàng trai, cô gái vừa tốt nghiệp đại học nên còn \"khờ khạo\". Khi đến sông Nhật Lệ, Quảng Bình, còn bao nhiêu tiền, bà và các bạn mua gà vì nghĩ sau này ở rừng không dùng được. Đoàn đi bộ lên đỉnh núi, máy bay địch quần thảo trên đầu, còn đàn gà kêu vang. Lúc này, mọi người mới sợ bị địch phát hiện.\n" +
                    "\n" +
                    "\"Đội trưởng nói chết tới nơi rồi mà còn gà qué, chúng tôi chỉ biết ngồi cười vì lúc đó có biết sợ chết là gì\", bà Thu nhớ lại.\n" +
                    "\n" +
                    "Bà kể trên đường đi có những lúc hết gạo, cả đoàn ngồi dưới gốc cây kơ nia đập quả ăn cầm hơi. Hay khi vào rừng, vì khan hiếm nước ngọt nên tìm được một vũng nước đen ngòm mà bà phải nhắm mắt uống.\n" +
                    "\n" +
                    "Bà cho biết khi ra đi, không ai nghĩ đến việc ghi công, tất cả quyết tâm vì miền Nam. Sau khi đến chiến trường khu D (Đồng Nai), bà và đồng đội hoạt động trong rừng, vừa dạy bổ túc văn hóa cho cán bộ cách mạng vừa chiến đấu trong những trận địch càn quét. Hòa bình lập lại, bà quay về làm giáo viên." +
                    "Ông Nguyễn Hồ Hải, Phó bí thư thường trực Thành uỷ TP HCM, cho biết ngày nay khi nhắc đến cụm từ nhà giáo đi B hay nhà giáo nội đô, nhiều bạn trẻ có thể không biết.\n" +
                    "\n" +
                    "Những người đi B lúc đầu thuộc lực lượng vũ trang, nhưng sau khi Mặt trận Dân tộc giải phóng miền Nam được thành lập (tháng 12/1960) và phong trào cách mạng chuyển sang một giai đoạn mới, lực lượng đi B được mở rộng gồm kỹ sư, bác sĩ, nhà giáo, văn nghệ sĩ, phóng viên.... Việc này hoàn toàn bí mật, do Ủy ban Thống nhất Trung ương quản lý. Cán bộ đi B phải gửi lại tư trang, hồ sơ, kỷ vật và toàn bộ sơ yếu lý lịch, thẻ Đoàn, Đảng, ảnh gia đình, nhật ký.\n" +
                    "\n" +
                    "Ông cho hay trong giai đoạn 1961-1973 đã có 10 chuyến đi, hơn 2.700 thầy cô rời bục giảng các trường phổ thông, đại học ở Hà Nội và các địa phương phía Bắc. Họ vượt dãy Trường Sơn để vào miền Nam, được phân công về các chiến trường trọng yếu, từ miền Trung - Tây Nguyên đến Đông - Tây Nam Bộ và đã trở thành những \"nhà giáo cầm súng\".\n" +
                    "\n" +
                    "\"Họ thường xuyên đối mặt với B52, chất độc hóa học và những trận càn ác liệt của địch. Nhiều người đã anh dũng hy sinh hoặc để lại một phần thân thể trên chiến trường miền Nam, thậm chí có thầy cô đã ngã xuống ngay trước thời khắc ngày 30/4/1975 lịch sử\", ông Hải cho hay." +
                    "Còn nhà giáo nội đô là những thầy, cô giáo hoạt động âm thầm trong các đô thị miền Nam. Họ góp phần quan trọng trong truyền bá tư tưởng cách mạng, khích lệ lòng yêu nước và đấu tranh bảo vệ văn hóa dân tộc ngay giữa lòng địch. Ngoài ra, họ tham gia phát triển nền giáo dục giải phóng ở các căn cứ lõm và vùng địch hậu.\n" +
                    "\n" +
                    "Phần lớn phong trào đấu tranh của nhân dân, học sinh, sinh viên Sài Gòn - Chợ Lớn - Gia Định đều có sự tham gia của các nhà giáo nội đô. Nhiều người bị địch phát hiện, khủng bố gắt gao buộc phải thay tên đổi họ, sống dưới nhiều vỏ bọc để hoạt động và giảng dạy. Số khác bị địch bắt, tù đày nhưng vẫn giữ vững khí tiết của người trí thức cách mạng.\n" +
                    "\n" +
                    "Ông Hải cho hay sau khi đất nước thống nhất, thành phố đã \"cố gắng làm tất cả những gì có thể\" tri ân, ghi ơn những người con ưu tú từ mọi miền tổ quốc đã hy sinh vì mảng đất này. Tuy nhiên, thực tế vẫn còn một số việc chưa giải quyết hết.\n" +
                    "\n" +
                    "\"Thành phố sẽ tiếp tục lắng nghe, ghi nhận và giải quyết thấu đáo trong thời gian tới\", ông Hải nói.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/18e4ee23b341081f5150-1-1731323-1515-5715-1731323542.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=uT_t0MgRl6RH9muTL8NPGQ",
            "1 giờ trước",
            "Tin tức",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Giảng đường Đại học Đông Dương sau gần 100 năm",
            "Toà nhà Viện Đại học Đông Dương với sự giao thoa kiến trúc Á - Âu gần như được giữ nguyên, sau gần 100 năm xây dựng." +
                    "Tòa nhà Viện Đại học Đông Dương ở số 19 Lê Thánh Tông, Hà Nội, mang phong cách Đông Dương - sự kết hợp giữa kiến trúc kinh viện của châu Âu với giải pháp kiến trúc bản địa. Công trình do kiến trúc sư người Pháp Ernest Hébrard thiết kế năm 1924, hoàn thành năm 1927.\n" +
                    "\n" +
                    "Năm 1956, trường Đại học Tổng hợp Hà Nội được thành lập và tiếp quản các tòa nhà thuộc Viện. Hiện nay, đây là một trong những giảng đường của trường Đại học Khoa học Tự nhiên, là biểu tượng của Đại học Quốc gia Hà Nội." +
                    "Sảnh chính tòa nhà nổi bật với những chiếc cột cao trang trí. Sảnh có kết cấu hoành tráng, cao rộng, mang dáng hình một tháp chuông theo phong cách kiến trúc phục hưng châu Âu.\n" +
                    "\n" +
                    "Cửa ra vào chính theo dạng vòm, được trang trí bằng kính và kim loại, không chỉ làm đẹp cho công trình khi nhìn từ ngoài vào mà làm tăng tính thẩm mỹ cho khu đại sảnh khi nhìn từ trong ra." +
                    "Trên vòm trần tòa nhà là hình ảnh hai con chim phượng hoàng, biểu tượng uy quyền trong văn hóa Á Đông." +
                    "Bên trong hội trường lớn, nằm bên trái sảnh chính. Hội trường mang tên Ngụy Như Kon Tum - Hiệu trưởng đầu tiên của Đại học Tổng hợp Hà Nội.\n" +
                    "\n" +
                    "Trước kia, trên tường hội trường là tranh do họa sĩ Victor Tardieu, Hiệu trưởng đầu tiên của trường Cao đẳng Mỹ thuật Đông Dương, vẽ. Tranh mô tả cuộc sống người Hà Nội đầu thế kỷ XX, với sự hiện diện của 200 nhân vật đại diện cho xã hội Việt Nam đương thời. Tuy nhiên, do khí hậu nóng ẩm của Việt Nam và sau nhiều thập kỷ chiến tranh ác liệt, bức tranh này đã bị hư hỏng.\n" +
                    "\n" +
                    "Tháng 5/2006, nhân kỷ niệm 100 năm thành lập Viện Đại học Đông Dương, Đại học Quốc gia Hà Nội đã cho phục dựng tranh." +
                    "Tầng 2 của tòa nhà là Bảo tàng Sinh học đầu tiên ở Đông Dương và Việt Nam, được thành lập từ năm 1926.\n" +
                    "\n" +
                    "Nơi này hiện lưu trữ, bảo tồn hàng trăm nghìn vật mẫu động vật, thực vật, được sưu tầm từ cuối thế kỷ 19 đến nay. Trong số này, nhiều vật mẫu do các nguyên thủ quốc gia, nhà khoa học và bảo tàng nước ngoài tặng." +
                    "Mặt sau và góc sân của trường gần như không thay đổi sau 100 năm.\n" +
                    "\n" +
                    "Tại Hà Nội hiện còn ba tòa nhà giữ được nguyên bản lối kiến trúc Pháp từ đầu thế kỷ XX, gồm: Tòa nhà Nha Tài chính Đông Dương, nay là trụ sở Bộ Ngoại giao; Tòa nhà Viện Viễn đông Bác cổ, nay là Bảo tàng Lịch sử Việt Nam; Tòa nhà Viện Đại học Đông Dương, nay là trường Đại học Khoa học Tự nhiên, Đại học Quốc gia Hà Nội.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/09/HUY-9008-1731148452.jpg?w=1200&h=0&q=100&dpr=1&fit=crop&s=-hH_GOEC6ryK5fKMvfV9dw",
            "2 giờ trước",
            "Tin tức",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Đề minh họa 8 môn thi V-SAT",
            "Từ năm 2025, kỳ thi V-SAT có thêm môn Ngữ văn với hình thức kết hợp giữa trắc nghiệm và viết luận trên máy tính.\n" +
                    "\n" +
                    "Đề minh họa 8 môn thi V-SAT\n" +
                    "\n" +
                    "Ngày 10/11, Trung tâm Khảo thí quốc gia và Đánh giá chất lượng giáo dục, Bộ Giáo dục và Đào tạo, công bố đề minh họa kỳ thi đánh giá đầu vào đại học V-SAT.\n" +
                    "\n" +
                    "Kỳ thi có 8 môn Toán, Vật lý, Hóa học, Sinh học, Lịch sử, Địa lý, Tiếng Anh và Ngữ văn. Trừ Ngữ văn, thí sinh làm bài trong 90 phút, các môn còn lại đều trong 60 phút theo dạng trắc nghiệm. Thí sinh làm bài trên máy tính, có thể lựa chọn một hoặc nhiều môn thi tùy theo khối ngành định đăng ký xét tuyển.\n" +
                    "\n" +
                    "Đề thi các môn sẽ có các dạng câu hỏi trắc nghiệm đúng/sai, trắc nghiệm 4 lựa chọn, ghép hợp, trả lời ngắn hoặc viết luận.Với dạng câu hỏi trắc nghiệm đúng/sai, mỗi câu gồm 4 tiểu mục. Trả lời chính xác mỗi tiểu mục, thí sinh được 1 điểm. Nhưng nếu chính xác toàn bộ, các em được 6 điểm.\n" +
                    "\n" +
                    "Với các dạng câu hỏi còn lại, cách tính điểm gần tương tự. Riêng bài viết luận môn Ngữ văn được chấm theo hướng dẫn riêng, điểm tối đa là 30/15.Kỳ thi đánh giá đầu vào trên máy tính lần đầu tổ chức vào năm 2023, do 4 trường Đại học Ngân hàng TP HCM, Tài chính -Marketing, Sài Gòn và Mở TP HCM phối hợp với Trung tâm Khảo thí quốc gia và Đánh giá chất lượng giáo dục tổ chức.\n" +
                    "\n" +
                    "Đến nay, kỳ thi được 18 trường dùng để xét tuyển, với chỉ tiêu dự kiến khoảng 10-40%. Danh sách trường chấp nhận điểm V-SAT như sau:",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/20240402102626-1010653e4ecf37e-7585-7190-1731250386.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=vn-Bla5p9CLDS969VLloOA",
            "3 giờ trước",
            "Tin tức",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "Nghiên cứu để nhân viên trường học hưởng phụ cấp tương xứng",
            "Bộ Giáo dục đang nghiên cứu, đề xuất cho nhân viên trường học được hưởng phụ cấp tương xứng với vị trí, việc làm, theo Thứ trưởng Hoàng Minh Sơn.\n" +
                    "\n" +
                    "Ông Sơn nói điều này tại họp báo Chính phủ thường kỳ tháng 10, chiều 9/11.\n" +
                    "\n" +
                    "Thứ trưởng Giáo dục và Đào tạo cho biết nhân viên y tế, kế toán tại các trường học hiện là viên chức, nhưng vì không phải là nhà giáo nên họ không được hưởng các chính sách ưu đãi, phụ cấp như giáo viên. Bộ đề xuất Chính phủ sửa đổi một số chính sách, trong đó nghiên cứu để nhân viên trường học hưởng phụ cấp nghề phù hợp với vị trí, việc làm, tương xứng với tính chất, mức độ đào tạo.\n" +
                    "\n" +
                    "Cùng đó, Bộ tiếp tục rà soát, đánh giá mức độ phức tạp trong công việc của nhân viên trường học để làm cơ sở điều chỉnh chính sách hiện hành. Cơ quan này cũng đề nghị các tỉnh, thành phố quan tâm đến việc xét thăng hạng chức danh nghề nghiệp cho đội ngũ này theo quy định, nhằm đảm bảo quyền lợi, giúp họ cải thiện thu nhập.." +
                    "Theo thống kê của Bộ Giáo dục và Đào tạo, toàn quốc có khoảng 246.800 nhân viên làm việc trong trường học, thuộc nhóm viên chức chuyên ngành và chuyên môn dùng chung. Trong đó, 95.600 người thuộc diện biên chế, còn lại là nhân viên hợp đồng.\n" +
                    "\n" +
                    "Theo Nghị định 204 của Chính phủ, nhân viên trường học được hưởng lương theo hệ số 1,86-4,89, tương đương lương hàng tháng khoảng 4,35-11,4 triệu đồng.\n" +
                    "\n" +
                    "Ngoài ra, nhân viên y tế được hưởng phụ cấp ưu đãi 20%; kế toán, thủ quỹ, người phụ trách thiết bị thí nghiệm hưởng phụ cấp trách nhiệm 0,1-0,2%. Nhân viên văn thư, thư viện, công nghệ thông tin không có phụ cấp.\n" +
                    "\n" +
                    "Trong khi đó, cùng công việc này nhưng ở các cơ quan hành chính nhà nước khác, viên chức được hưởng phụ cấp công vụ 25%.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/09/img2473-1731145832642172865941-5345-6195-1731161815.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=nxlYF9uJ4AdqT-Ecc2QvnA",
            "4 giờ trước",
            "Tin tức",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ), Post(
            5,
            "Ba chính sách quan trọng trong dự thảo Luật Nhà giáo",
            "Được quyền tuyển dụng, giáo viên nhận lương cao nhất hay có thể nghỉ hưu sớm ở mầm non - những đề xuất nhiều năm qua ở ngành giáo dục chưa thành hiện thực, nay được đưa vào dự thảo Luật Nhà giáo.\n" +
                    "\n" +
                    "Dự thảo Luật Nhà giáo được xây dựng với 5 chính sách quan trọng gồm: định danh; tiêu chuẩn và chức danh nhà giáo; tuyển dụng, sử dụng và chế độ làm việc của nhà giáo; đào tạo, bồi dưỡng, đãi ngộ và tôn vinh; quản lý nhà nước về nhà giáo. Các chủ trương này đã được Quốc hội, Chính phủ thông qua.\n" +
                    "\n" +
                    "Bộ Giáo dục và Đào tạo nhận định việc xây dựng luật này là cần thiết bởi các quy định liên quan giáo viên, quyền và chế độ đãi ngộ với họ tản mát trong nhiều văn bản hoặc chưa được đề cập đầy đủ.\n" +
                    "\n" +
                    "Từ khi công bố dự thảo đầu tiên hồi tháng 5 đến nay, cơ quan soạn thảo đã 5 lần điều chỉnh. Một số đề xuất gây tranh cãi đã được bỏ như miễn học phí cho con giáo viên, cấp giấy phép hành nghề cho giáo viên.\n" +
                    "\n" +
                    "Dự thảo được đưa ra thảo luận tại Quốc hội ngày 9/11 có ba điểm đáng chú ý sau:\n" +
                    "\n" +
                    "Giao quyền tuyển dụng, sử dụng nhà giáo cho ngành giáo dục\n" +
                    "\n" +
                    "Dự thảo Luật Nhà giáo giao quyền chủ động cho ngành giáo dục trong tuyển dụng, sử dụng nhà giáo. Trong đó, Bộ Giáo dục và Đào tạo, Bộ Lao động, Thương binh và Xã hội (phụ trách đào tạo nghề) là cơ quan chủ trì xây dựng chiến lược, đề án, kế hoạch phát triển, tổng biên chế đội ngũ nhà giáo thuộc thẩm quyền quản lý.\n" +
                    "\n" +
                    "Hai Bộ này cũng sẽ được ban hành tiêu chí, tiêu chuẩn tuyển dụng; điều phối biên chế giáo viên trong các trường công lập. Các cơ quan quản lý giáo dục chủ trì, hoặc phân cấp cho các trường tuyển dụng, điều động, bố trí, đánh giá, bổ nhiệm. Phương thức tuyển dụng gồm xét tuyển hoặc thi tuyển, bắt buộc phải có phần thực hành sư phạm.\n" +
                    "\n" +
                    "Hiện, hai Bộ chỉ quản lý về chuyên môn đối với nhà giáo, không quản lý số lượng, biên chế, việc tuyển dụng, bổ nhiệm... Ở các địa phương, việc này được giao cho cơ quan Nội vụ làm đầu mối.\n" +
                    "\n" +
                    "Theo một số nhà quản lý, điều này dẫn đến thừa - thiếu cục bộ, khó khăn trong điều chuyển giáo viên từ nơi thừa sang nơi thiếu. Một số chế độ với giáo viên chưa được thực hiện kịp thời, thiếu tính thống nhất như chế độ trả tiền dạy thừa giờ, tổ chức thi thăng hạng cho giáo viên..." +
                    "Lương giáo viên cao nhất\n" +
                    "\n" +
                    "Dự thảo Luật Nhà giáo quy định lương của nhà giáo được xếp cao nhất trong hệ thống thang bậc lương hành chính sự nghiệp.\n" +
                    "\n" +
                    "Giáo viên được tuyển dụng lần đầu được tăng một bậc lương so với bảng lương hành chính thông thường; nhóm dạy mầm non và tiểu học hưởng phụ cấp ưu đãi nghề cao hơn hiện nay lần lượt 10 và 5%. Tổng ngân sách chi tăng thêm cho hai nhóm là 12.800 tỷ đồng một năm. Ngoài ra, giáo viên mầm non có thể nghỉ hưu sớm tối đa 5 tuổi so với quy định nếu có muốn mà không bị trừ tỷ lệ lương hưu.\n" +
                    "\n" +
                    "Trong đó, nguyện vọng nhà giáo được hưởng lương cao nhất từng được nhiều đời Bộ trưởng Giáo dục, đại biểu quốc hội đề xuất, nhưng chưa thành hiện thực." +
                    "Với các nhà giáo trẻ, ông Vũ Minh Đức, Cục trưởng Nhà giáo và Cán bộ quản lý giáo dục, ngày 11/10, cho hay họ hiện có lương khởi điểm thấp (hệ số 2,34, lương khoảng 6,8 triệu đồng). Bộ đã thống kê, khoảng 61% số thầy cô bỏ việc ở độ tuổi dưới 35 nên đề xuất tăng bậc lương để giữ chân họ. Nếu được thông qua, lương giáo viên cao hơn 14% so với các ngành, nghề khác.\n" +
                    "\n" +
                    "Với giáo viên mầm non, từ năm 2020 khi Bộ Luật lao động có hiệu lực, cả Bộ Giáo dục và Đào tạo, Tổng Liên đoàn Lao động Việt Nam đều kiến nghị nhóm này được vào danh mục ngành nghề nặng nhọc, độc hại để được nghỉ hưu sớm. Tuy nhiên, Bộ Lao động - Thương binh và Xã hội, cơ quan chủ trì việc này, cho là không có căn cứ.\n" +
                    "\n" +
                    "Ngoài ra, dự thảo Luật Nhà giáo quy định chính sách thu hút, trọng dụng người có trình độ cao, có tài năng, năng khiếu đặc biệt hay kỹ năng nghề cao; nhà giáo tham gia giảng dạy ở vùng đồng bào dân tộc thiểu số, miền núi, biên giới, hải đảo và vùng đặc biệt khó khăn.\n" +
                    "\n" +
                    "Không công khai thông tin sai phạm giáo viên khi chưa có kết luận\n" +
                    "\n" +
                    "Ngoài làm rõ những điều giáo viên không được làm, dự thảo Luật Nhà giáo cũng quy định các việc mà tổ chức, cá nhân không được làm với họ, như: không thực hiện đầy đủ chế độ, chính sách; công khai thông tin trong quá trình thanh tra, kiểm tra, xử lý vi phạm của nhà giáo khi chưa có kết luận của cơ quan có thẩm quyền; hoặc lan truyền, phát tán thông tin không chính xác về nhà giáo.\n" +
                    "\n" +
                    "Trước đó, cơ quan soạn thảo đề xuất không công khai thông tin về sai phạm của giáo viên khi chưa có kết luận chính thức, đã gây tranh cãi.\n" +
                    "\n" +
                    "Đại biểu Phạm Văn Hòa, Ủy viên Ủy ban Pháp luật, cho rằng như vậy là hạn chế quyền giám sát của người dân. Thực tế, nhiều sự việc bị phanh phui nhờ sự lên tiếng của học sinh và phụ huynh, nhất là vấn đề thu, chi trong trường học, các hành vi không phù hợp của thầy với trò.\n" +
                    "\n" +
                    "Tuy nhiên, Bộ nói việc này là cần thiết để bảo vệ nhà giáo, trong bối cảnh mạng xã hội, các phương tiện thông tin truyền thông trực tuyến phát triển mạnh như hiện nay. Giáo viên nếu có sai phạm đã có các chế tài xử lý theo quy định.\n" +
                    "\n" +
                    "\"Đặc điểm hoạt động nghề nghiệp của nhà giáo có tính chất đặc biệt, nếu không có phương án bảo vệ thì đối tượng chịu ảnh hưởng không chỉ là họ mà còn là người học\", Bộ nêu.\n" +
                    "\n" +
                    "Dự thảo Luật Nhà giáo nêu rõ giáo viên là viên chức (công lập), người lao động (ngoài công lập) đặc biệt. Tùy nơi công tác, họ thực hiện các quy định của luật Viên chức hoặc bộ Luật lao động, đồng thời theo các quy định đặc thù của luật Nhà giáo.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/04/thithpt-53-jpg-1730690296-5524-1730690344.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=O2xqDCjSwyKN7yJq2rEiiw",
            "5 giờ trước",
            "Tin tức",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getTuyenSinh(): List<Post> {
    return listOf(
        Post(
            1,
            "Đại học Kinh tế - Luật bỏ hai tổ hợp xét tuyển",
            "Từ năm 2025, trường Đại học Kinh tế - Luật không còn xét tuyển bằng tổ hợp A00 (Toán, Lý, Hóa) và D07 (Toán, Hóa, Tiếng Anh).\n" +
                    "\n" +
                    "Thạc sĩ Cù Xuân Tiến, Trưởng phòng Tuyển sinh và Công tác sinh viên, cho biết tin trên, tối 8/11.\n" +
                    "\n" +
                    "Cụ thể, trường dùng hai tổ hợp truyền thống là A01 (Toán, Lý, Tiếng Anh), D01 (Toán, Tiếng Anh, Ngữ văn), bổ sung thêm hai tổ hợp mới gồm Toán, Tiếng Anh, Tin học và Toán, Tiếng Anh, Giáo dục kinh tế và pháp luật.\n" +
                    "\n" +
                    "Ông Tiến cho biết điều chỉnh này dựa trên kết quả nghiên cứu dữ liệu tuyển sinh nhiều năm, cũng như thực tế triển khai chương trình 2018 ở các trường phổ thông. Hội đồng tuyển sinh Đại học Kinh tế - Luật nhận thấy xu hướng thí sinh đăng ký tổ hợp A00 và D07 ngày càng giảm.\n" +
                    "\n" +
                    "Mặt khác, Toán, Tiếng Anh, Giáo dục kinh tế và pháp luật là những môn học phù hợp với chương trình đào tạo ở lĩnh vực pháp luật, kinh tế của trường\n" +
                    "\n" +
                    "\"Tất cả các tổ hợp xét tuyển của trường đều có môn Toán và Tiếng Anh. Hai môn này cho thấy khả năng tư duy, năng lực ngoại ngữ để đáp ứng khả năng học đại học\", ông Tiến nói thêm." +
                    "Về phương thức tuyển sinh, Đại học Kinh tế - Luật dự kiến ba phương thức chính vào năm 2025, gồm: Xét tuyển thẳng và ưu tiên xét tuyển thẳng (tối đa 20% chỉ tiêu), xét điểm thi đánh giá năng lực (tối đa 40-60%) và điểm thi tốt nghiệp THPT (tối đa 30-50%).\n" +
                    "\n" +
                    "Trong khi, năm vừa qua trường tuyển 2.600 sinh viên bằng 5 phương thức, ngoài ba cách trên còn có xét chứng chỉ quốc tế kết hợp học bạ, ưu tiên xét tuyển (học bạ).\n" +
                    "\n" +
                    "Theo ông Tiến, các phương án tuyển sinh được xây dựng nhằm chọn lọc những thí sinh giỏi, phù hợp với yêu cầu đào tạo và đáp ứng nhu cầu khắt khe của thị trường lao động. Chi tiết sẽ được trường công bố trước tháng 2/2025.\n" +
                    "\n" +
                    "Năm 2025 là thời điểm lứa học sinh đầu tiên theo chương trình giáo dục phổ thông mới thi tốt nghiệp. Kỳ thi gồm hai môn bắt buộc là Toán và Ngữ văn. Ngoài ra, thí sinh được chọn hai trong các môn của chương trình giáo dục phổ thông, gồm: Hóa học, Vật lý, Sinh học, Địa lý, Lịch sử, Giáo dục kinh tế và pháp luật, Tin học, Công nghệ và Ngoại ngữ (Anh, Đức, Nga, Nhật, Pháp, Trung, Hàn).",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/08/thithpt-32-jpg-1731074577-1771-1731074813.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=Lh1qkYJc1m1u3DwB1sa0aQ",
            "1 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Muốn học Hàng không nhưng lo thất nghiệp",
            "Em muốn vào Học viện Hàng không Việt Nam, nhưng lo phải học xa nhà, học phí đắt, lại không có quan hệ thì ra trường thất nghiệp.\n" +
                    "\n" +
                    "Em là học sinh lớp 12, có mục tiêu học ngành Quản lý hoạt động bay ở Học viện Hàng không Việt Nam. Tuy nhiên, em ở Hà Nội mà trường trong TP HCM, bố mẹ không muốn em học xa nhà, lại không quen biết ai. Chưa kể học phí cũng cao, chi phí ăn ở tại TP HCM không hề rẻ.\n" +
                    "\n" +
                    "Em còn một điều lo lắng nữa là ngành này cũng đặc thù, sợ gia đình không có quan hệ thì khó xin việc làm. Mọi người tư vấn giúp, em có nên tiếp tục theo đuổi ngành học này nữa không.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/07/240529058185210251166773373328-8852-9925-1730948462.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=1e3kLH5IHQ9O71cmbNOTNg",
            "2 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Thí sinh thấp thỏm nếu cuối năm học mới biết điểm chuẩn xét tuyển sớm",
            "Tiến Minh trông chờ xét học bạ để giảm áp lực ở kỳ thi tốt nghiệp nên mong biết kết quả sớm, nếu lùi lịch đến 31/5, em sẽ thấp thỏm, lo lắng hơn.\n" +
                    "\n" +
                    "Tiến Minh, học sinh lớp 12 ở quận Nam Từ Liêm, Hà Nội, dự định theo ngành Công nghệ thông tin ở đại học. Dù các trường chưa công bố phương án tuyển sinh năm tới, Minh đã tính sẽ nộp vào Đại học Đại Nam, Phenikaa hay FPT.\n" +
                    "\n" +
                    "Nếu các trường ổn định cách xét tuyển như năm ngoái, Minh cần điểm học bạ 3-5 học kỳ, không bao gồm kỳ II lớp 12, biết kết quả vào khoảng tháng 4.\n" +
                    "\n" +
                    "\"Em yên tâm hơn vì sẽ biết phải làm gì tiếp theo, dù là đỗ hay trượt\", Minh nói.\n" +
                    "\n" +
                    "Vì thế, nam sinh hụt hẫng khi nghe tin có thể năm nay việc này sẽ bị lùi lại. Tại Hội nghị tổng kết kỳ thi tốt nghiệp THPT 2020-2024 hôm 31/10, ông Huỳnh Văn Chương, Cục trưởng Quản lý chất lượng, Bộ Giáo dục và Đào tạo, đề xuất không cho các đại học công bố điểm chuẩn xét tuyển sớm trước ngày 31/5 - thời điểm kết thúc năm học.\n" +
                    "\n" +
                    "\"Các trường vẫn sẽ thu hồ sơ từ sớm, rồi công bố điểm chuẩn muộn, như vậy chỉ khiến chúng em thấp thỏm hơn\", Minh bày tỏ.\n" +
                    "\n" +
                    "Ở Hòa Bình, Sa Trung Hiếu, trường THPT Mường Chiềng, huyện Đà Bắc, có cùng suy nghĩ. Hiếu định đăng ký xét tuyển bằng điểm học bạ vào một số trường, hy vọng đỗ sớm để giảm áp lực ở kỳ thi tốt nghiệp THPT vào cuối tháng 6.\n" +
                    "\n" +
                    "\"Nếu trúng tuyển sớm, em chỉ cần học vừa phải để đỗ tốt nghiệp\", nam sinh nói.\n" +
                    "\n" +
                    "Theo khảo sát của VnExpress hôm 3/11 với gần 1.000 người, 53% muốn công bố kết quả xét tuyển sớm trước khi kết thúc năm học để giảm áp lực cho thí sinh, chỉ 23% đồng tình với Cục trưởng Quản lý chất lượng.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/07/233a3318-1730776846-1519-17307-9447-2057-1730982487.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=vk6vS2ydMu1TXqFQM_x5uw",
            "3 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "Đại học Công thương TP HCM lần đầu tuyển khối C",
            "Trường Đại học Công thương TP HCM (HUIT) xét tuyển thêm 5 tổ hợp mới, trong đó 4 tổ hợp khối C.\n" +
                    "\n" +
                    "Ông Phạm Thái Sơn, Giám đốc Trung tâm Tuyển sinh và Truyền thông của trường, ngày 4/11 cho biết tin trên. Thay đổi nhằm tạo điều kiện cho những thí sinh có nền tảng khối C tiếp cận nhiều ngành, nghề của trường.\n" +
                    "\n" +
                    "\"Việc này còn giúp trường chọn lọc được những sinh viên có năng lực và nền tảng phù hợp với từng ngành học\", ông Sơn nói.\n" +
                    "\n" +
                    "Các tổ hợp được bổ sung là C00 (Văn, Sử, Địa), C01 (Văn, Toán, Lý), C02 (Văn, Toán, Hóa), C14 (Toán, Văn, Giáo dục Kinh tế và pháp luật), chủ yếu thuộc nhóm luật, quản trị kinh doanh, khách sạn.\n" +
                    "\n" +
                    "Ngoài ra, trường cũng thêm tổ hợp khác gồm ba môn Toán, Tin học và Tiếng Anh. Đây là tổ hợp lần đầu xuất hiện, do chương trình giáo dục phổ thông mới có môn Tin học. Trường dùng tổ hợp này để xét tuyển ngành Công nghệ thông tin, An toàn thông tin và Khoa học dữ liệu." +
                    "Mỗi năm, trường Đại học Công thương TP HCM tuyển khoảng 7.000 sinh viên. Hồi đầu tháng 10, trường cho biết dự kiến dành 15-20% chỉ tiêu để xét học bạ năm tới, giảm 10% so với năm nay.\n" +
                    "\n" +
                    "50-60% chỉ tiêu sẽ được dành để để xét điểm thi tốt nghiệp THPT, tương đương những năm gần đây. Phần còn lại, trường dự kiến xét bằng điểm đánh giá năng lực của Đại học Quốc gia TP HCM và Đại học Sư phạm TP HCM.\n" +
                    "\n" +
                    "Năm 2023, điểm chuẩn theo kết quả thi tốt nghiệp của trường Đại học Công thương TP HCM từ 17 đến 24,5, cao nhất ở ngành Marketing, kế đó là Thương mại điện tử, Logistics và quản lý chuỗi cung ứng với 23,75 điểm.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/04/951e2422-17fe-46f3-8da2-e1ee62-1390-2952-1730720650.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=MiAc1HKU_0TLX6eiEVYWgw",
            "3 giờ trước",
            "Tuyển sinh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            5,
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
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/T2-1731226922-8181-1731227235.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=m1i5PfjoUTxhRDvZyLtWkQ",
            "5 giờ trước",
            "Giáo dục",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getChanDung(): List<Post> {
    return listOf(
        Post(
            1,
            "Thầy giáo trẻ nhất được Hà Nội vinh danh",
            "Thầy Nguyễn Hữu Quyết, người trẻ nhất nhận giải thưởng Nhà giáo tâm huyết, sáng tạo 2024 của Hà Nội, từng là thủ khoa ở Đại học Sư phạm Hà Nội.\n" +
                    "\n" +
                    "Thầy Nguyễn Hữu Quyết sinh năm 1998, hiện là giáo viên dạy Giáo dục Kinh tế và pháp luật tại trường THPT Huỳnh Thúc Kháng, Hà Nội.\n" +
                    "\n" +
                    "Trong 70 người được trao giải \"Nhà giáo tâm huyết, sáng tạo\" năm nay, thầy giáo quê Hải Dương là người trẻ nhất. Quyết cũng là giáo viên đầu tiên của trường THPT Huỳnh Thúc Kháng nhận giải này.\n" +
                    "\n" +
                    "Đây là giải thưởng thường niên của thành phố, nhằm tôn vinh những giáo viên có những đóng góp giá trị, đạt nhiều thành tích." +
                    "Anh Quyết kể ngày nhỏ, mỗi khi ôn bài, anh không dùng sách hay bút, mà dùng phấn viết lên cánh cửa tôn. Họ hàng nhìn thấy cảnh cậu bé cặm cụi viết kín cửa, rồi lại xóa để viết tiếp thì đùa \"thích phấn và bảng như này thì sau làm giáo viên\". Tuy nhiên, lúc đó Quyết chưa có hình dung về nghề nghiệp tương lai.\n" +
                    "\n" +
                    "Ngày học lớp 10, qua sóng phát thanh, Quyết nghe được lá thư của một cô giáo gửi mẹ, chia sẻ những suy nghĩ về nghề \"trồng người\". Được truyền cảm hứng, Quyết xác định sẽ theo sư phạm.\n" +
                    "\n" +
                    "Năm 2016, Quyết trở thành tân sinh viên ngành Giáo dục công dân, thuộc khoa Lý luận chính trị - Giáo dục công dân, của trường Đại học Sư phạm Hà Nội. Anh cho hay chọn ngành này với mong muốn vừa có thể đứng lớp dạy học trò, đồng thời thỏa mãn niềm đam mê với các hoạt động đoàn, đội. Vì xác định mục tiêu từ đầu, Quyết không gặp nhiều khó khăn trong quá trình học. Anh tốt nghiệp sớm nửa năm với danh hiệu thủ khoa đầu ra của ngành, được nhận về làm việc tại trường THPT Huỳnh Thúc Kháng, từ tháng 12/2019.\n" +
                    "\n" +
                    "Ngay trong năm học đầu tiên, thầy Quyết được phân công dạy Giáo dục công dân và ôn thi tốt nghiệp cho một lớp 12, nổi tiếng là \"rất nghịch\". Nhiều đồng nghiệp ái ngại cho thầy Quyết, sợ thầy giáo trẻ bị bắt nạt, nhưng trái với lo lắng của mọi người, thầy thấy tự tin.\n" +
                    "\n" +
                    "Theo thầy, nhiều người nghĩ giáo viên trẻ sẽ gặp nhiều bất lợi, nhưng thực tế đây có thể là lợi thế.\n" +
                    "\n" +
                    "\"Người trẻ sẽ dễ nói chuyện, đồng cảm, thấu hiểu nhau hơn. Tôi cũng muốn có thể làm bạn, làm người đồng hành với học trò, nên tuổi tác không phải vấn đề\", thầy chia sẻ.\n" +
                    "\n" +
                    "Buổi đầu lên lớp, thầy nói chuyện với học trò, đưa ra nội quy môn học. Quá trình dạy, thầy cũng lồng ghép, chia sẻ thêm trải nghiệm của bản thân tại đại học với một số nội dung liên quan đến bài. Việc này giúp học sinh có kiến thức từ ví dụ thực tế, đồng thời cảm thấy gần gũi giáo viên hơn.\n" +
                    "\n" +
                    "\"Sau nửa học kỳ, các thầy cô bất ngờ, bảo không biết thầy Quyết cảm hóa như nào mà lớp ngoan hẳn\", thầy kể." +
                    "Mỗi kỳ nghỉ hè, thầy Quyết soạn giáo án, dành thời gian trong năm học để xây dựng phương pháp dạy mới, làm học liệu. Thầy thường dạy theo sơ đồ tư duy và từ khóa quan trọng, kết hợp mô hình trực quan để học sinh nhớ bài lâu hơn. Chẳng hạn khi dạy bài \"Công dân với sự nghiệp xây dựng và bảo vệ Tổ quốc\", thầy mất ba ngày làm sa bàn chiến dịch Điện Biên Phủ bằng bìa và chai nhựa.\n" +
                    "\n" +
                    "Vật liệu được thầy dùng làm mô hình dạy học thường là rác hoặc đồ dùng tái chế. Thầy Quyết là người chủ trì dự án \"Tái chế rác thải thành đồ dùng dạy học\", vào top 15 giải thưởng Tri thức trẻ vì giáo dục năm 2020; dự án \"Bảo tàng mini\" để trưng bày sản phẩm tái chế của học sinh, giành giải nhì cuộc thi Thanh niên sáng tạo vì khí hậu 2021.\n" +
                    "\n" +
                    "Biệt danh \"Quyết đồng nát\" của thầy xuất phát từ đó.\n" +
                    "\n" +
                    "Trong hơn 4 năm đi dạy, thầy Quyết nói có nhiều kỷ niệm với học trò. Biết thầy thích ăn đồ nếp, học sinh đã tặng thầy một gói xôi vào ngày sinh nhật. Cuối năm học, thầy cũng hay \"tặng\" lại học sinh những món quà đặc biệt như bản kiểm điểm của chính các em. Theo thầy, việc này vừa nhằm \"xí xóa\" chuyện không vui, nhưng cũng nhắc nhở học sinh không nên mắc lại những lỗi cũ.\n" +
                    "\n" +
                    "Có năm làm chủ nhiệm, thầy Quyết đổi mới buổi họp phụ huynh bằng cách cho học sinh tự thiết kế thiệp và viết thư cho bố mẹ. Phụ huynh sau đó cũng làm tương tự.\n" +
                    "\n" +
                    "\"Tôi mong cách này có thể phần nào giúp học trò và bố mẹ chia sẻ tâm tư, những lời động viên mà thường ngày khó nói với nhau\", thầy giáo nói." +
                    "Thầy Phan Như Hùng, Hiệu trưởng trường THPT Huỳnh Thúc Kháng, nhận xét thầy Quyết luôn say mê với công việc, không ngừng sáng tạo và hoàn thành tốt nhiệm vụ được giao. Ở vai trò Bí thư đoàn trường, thầy Quyết là người khởi xướng và chủ trì nhiều hoạt động.\n" +
                    "\n" +
                    "\"Sự trẻ trung, nhiệt huyết và sáng tạo của Quyết đã thổi luồng không khí học tập mới mẻ cho học sinh. Điều này rất phù hợp với chương trình mới với nhiều yêu cầu về đổi mới phương pháp dạy học\", thầy Hùng nói.\n" +
                    "\n" +
                    "Từ khi thầy Quyết về dạy ở trường, số học sinh đăng ký vào ngành Giáo dục công dân ở đại học có xu hướng tăng, trung bình khoảng 20 em mỗi năm, có năm hơn 30.\n" +
                    "\n" +
                    "\"Điều đó phần nào cho thấy thầy Quyết đã truyền được cảm hứng cho học trò về những gì mình đã và đang làm\", thầy Hùng chia sẻ.\n" +
                    "\n" +
                    "Thầy Quyết cho biết đã hoàn thành chương trình cao học, đặt mục tiêu lấy bằng tiến sĩ vào năm 30 tuổi. Xa hơn, thầy mong trở thành chuyên gia trong lĩnh vực giáo dục kỹ năng sống và an toàn cho học sinh.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/9a354506-02b3-4646-a1a2-c8e6d4-3546-3973-1731230032.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=UkkGAMlsKn83G_Ut5DC3Rg",
            "1 giờ trước",
            "Giáo dục",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Nữ sinh Bách khoa ba lần đạt giải Olympic Cơ học",
            "Muốn tìm tòi, đào sâu các môn khó của ngành Cơ khí, Thanh Nguyên đăng ký thi Olympic Cơ học và ba lần liên tiếp đạt giải.\n" +
                    "\n" +
                    "Thành tích này cùng bài báo khoa học đăng trên Tạp chí Cơ khí giúp Nguyễn Thị Thanh Nguyên, sinh viên năm cuối ngành Cơ khí, trường Đại học Bách khoa TP HCM, nhận giải thưởng Nữ sinh khoa học công nghệ năm 2024.\n" +
                    "\n" +
                    "Là nữ sinh hiếm hoi học Cơ khí, Nguyên từng tự hỏi về khả năng và cơ hội của em với ngành học được mặc định phù hợp với nam giới.\n" +
                    "\n" +
                    "\"Giải thưởng không chỉ là sự công nhận những nỗ lực mà còn là nguồn động lực rất lớn giúp em phấn đấu tiến về mục tiêu đã đề ra\", Nguyên chia sẻ." +
                    "Nguyên kể thời phổ thông rất tò mò về máy móc, thường tự tháo rồi lắp ráp đồ chơi, vật dụng trong nhà \"để xem bên trong có gì\". Em cũng thích thú nhìn các bác thợ sửa chữa máy móc, trong cửa hàng ngổn ngang vật dụng, mặt đất đen nhẻm vì dầu nhớt.\n" +
                    "\n" +
                    "\"Cảm giác một mình, tập trung toàn bộ tâm trí trong không gian riêng của mình rồi tìm ra nguyên lý hoạt động của một đồ vật đối với em rất thú vị\", Nguyên cho hay.\n" +
                    "\n" +
                    "Lựa chọn của Nguyên không được mẹ ủng hộ vì sợ con gái làm việc với máy móc nặng nề, cực nhọc. Nhưng chị gái ủng hộ em. Bằng trải nghiệm của mình và bạn bè, chị phân tích cho Nguyên thấy chỉ khi học ngành yêu thích mới đam mê tìm hiểu sâu. Nếu bỏ nhiều thời gian theo đuổi thứ mình không thích thì sau này sẽ khó bắt đầu lại. Những chia sẻ từ chị giúp Nguyên vững tin vào lựa chọn của mình.\n" +
                    "\n" +
                    "Bố mẹ chỉ buôn bán nhỏ, nên mục tiêu của Nguyên không chỉ học để hiểu mà còn đạt học bổng để giảm gánh nặng học phí. Năm đầu, chưa thật sự bắt nhịp được với cách học mới, em vuột mất khoản này ở kỳ II.\n" +
                    "\n" +
                    "Sang năm thứ hai, Nguyên thay đổi cách học, không để nước đến chân mới nhảy. Học xong bài nào, em làm ngay bài tập hôm đó, lưu ý những môn có nhiều công thức tính toán. Quy tắc này giúp nữ sinh duy trì thói quen học tập, dễ dàng gợi nhớ lại kiến thức khi chuẩn bị thi cuối kỳ. Nhờ đó, Nguyên đạt mục tiêu giành học bổng.\n" +
                    "\n" +
                    "Nhà ở quận 5, hàng ngày đến trường tại Thủ Đức bằng xe bus phải mất hơn ba tiếng nên Nguyên chọn ở ký túc xá để tiết kiệm thời gian và chi phí. Mỗi tháng, em gói ghém chi phí sinh hoạt không vượt quá hai triệu đồng.\n" +
                    "\n" +
                    "\"Nhiều người sẽ thấy cuộc sống của em tẻ nhạt vì gần như không đi chơi, ăn vặt hay uống trà sữa. Khi nào căng thẳng, em đạp xe vòng quanh ký túc xá rồi về học tiếp. Em hài lòng với thói quen như vậy\", Nguyên chia sẻ.\n" +
                    "\n" +
                    "Đi theo định hướng thiết kế máy, Nguyên càng học càng thấy hứng thú với các bài tập khó. Chẳng hạn, cùng một yêu cầu và nguyên liệu đầu vào, mỗi kỹ sư có thể đưa ra những phương án chế tạo khác nhau sao cho tiết kiệm và hiệu quả nhất.\n" +
                    "\n" +
                    "Nguyên cho hay xuyên suốt quá trình học tập, em chỉ tập trung vào câu hỏi \"mình đã hiểu bài hay chưa, có thể áp dụng vào thực tế không\".\n" +
                    "\n" +
                    "Theo Nguyên, Cơ khí được đánh giá là ngành khó vì kiến thức nhiều nhưng khô khan, nặng công thức, tính toán. Chỉ cần hổng một \"mắt xích\", sinh viên cũng dễ lung lay, mất gốc. Vì thế, dù có môn đã đủ điểm qua, nhưng nếu thấy chưa nắm chắc kiến thức, em vẫn \"đào xới\" lại cho đến khi hiểu rõ bản chất mới thôi.\n" +
                    "\n" +
                    "Nguyên lý máy là một trong số những môn như vậy. Học môn này từ năm thứ hai, em vẫn nghiên cứu, lật đi lật lại kiến thức đến tận năm cuối.\n" +
                    "\n" +
                    "Đây cũng là lý do khiến Nguyên đăng ký thi Olympic Cơ học năm 2024 ở môn Nguyên lý máy và giành giải ba. Trước đó, nữ sinh có hai năm liền thi ở môn Chi tiết máy, đạt giải nhì và ba.\n" +
                    "\n" +
                    "Thói quen đào sâu kiến thức cũng là cơ duyên để Nguyên có bài báo khoa học đầu tiên đăng trên Tạp chí Cơ khí hồi tháng 6/2023 với vai trò là tác giả chính. Khi giải bài toán tổng quát chọn bu-lông phù hợp giữa hộp giảm tốc và khung máy, Nguyên tìm hiểu kỹ hơn về cơ sở lý thuyết tính toán của bu-lông, vốn là chương khó nhất trong môn Chi tiết máy. Nhờ đó, nữ sinh hiểu sâu hơn về cách tính bu-lông trong các bài toán thực tế. Nguyên và nhóm bạn đã tạo ra một chương trình tính toán chọn bu-lông phù hợp chỉ bằng cách nhập thông số cụ thể, tiết kiệm thời gian trong việc tra bảng và kiểm tra lại độ bền của nó trong các máy móc thực tế.\n" +
                    "\n" +
                    "Nguyên ví dụ khi thiết kế máy móc, kỹ sư phải tính toán các chi tiết và chọn bu-lông có thông số phù hợp. Công đoạn này phải tính tay, mất ít nhất 4-5 tiếng với máy móc đơn giản. Nhờ chương trình tính toán mà nhóm lập ra, công đoạn này chỉ mất khoảng một tiếng.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/09/ca5d0b1308d5b08be9c4-4801-1731126227.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=L5kkk798bUF_FrLxlweFzg",
            "2 giờ trước",
            "Chân dung",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Bài luận về mẹ đưa cô gái Hải Phòng đến Harvard",
            "Kể về người mẹ chưa tốt nghiệp cấp 3 nhưng đã gầy dựng được một doanh nghiệp xây dựng nhỏ, Hoài Thanh, 22 tuổi, trúng tuyển chương trình MBA của trường Kinh doanh Harvard.\n" +
                    "\n" +
                    "Hoàng Thị Hoài Thanh là cựu sinh viên của Viện Kinh doanh - Quản trị, Đại học VinUni.\n" +
                    "\n" +
                    "\"Tôi cảm thấy biết ơn và tự hào. Để đỗ vào trường, ngoài thành tích học thuật, tôi còn được sếp chỉ dạy và bạn bè, đồng đội tốt hỗ trợ\", Thanh nói.\n" +
                    "\n" +
                    "Thông thường, các khóa học MBA (thạc sĩ Quản trị Kinh doanh) yêu cầu ứng viên đã có kinh nghiệm làm việc. Tuy nhiên, Harvard mở chương trình Deferred MBA, cho phép sinh viên năm cuối nộp hồ sơ sớm. Theo xếp hạng QS, trường Kinh doanh Harvard hiện trong top 3 về đào tạo MBA trên thế giới.\n" +
                    "\n" +
                    "Anh Kenneth Chong, thạc sĩ Luật Harvard, CEO công ty giáo dục Arrowster ở Mỹ, là một trong hai người viết thư giới thiệu Thanh với trường. Anh nhìn nhận việc trúng tuyển vào ngôi trường với tỷ lệ chấp nhận dưới 10% cho thấy khả năng xuất sắc của cô.\n" +
                    "\n" +
                    "Anh đánh giá Thanh có khả năng đưa ra quyết định và hành động nhanh chóng. Em cũng biết cách biến những hiểu biết về thị trường và người dùng trở thành chiến lược kinh doanh cụ thể.\n" +
                    "\n" +
                    "\"Tôi lập tức ấn tượng khi trò chuyện với Thanh hồi năm ngoái, đến mức đã mời bạn ấy về làm việc ngay lập tức\", Kenneth kể." +
                    "Thanh là cựu học sinh chuyên Anh của trường THPT chuyên Trần Phú, Hải Phòng. Cô từng giành giải nhất thi học sinh giỏi quốc gia môn tiếng Anh năm lớp 12; hai lần đạt huy chương vàng kỳ thi học sinh giỏi Duyên hải và đồng bằng Bắc Bộ năm lớp 10, 11. Cùng chứng chỉ IELTS 8.5, SAT 1580/1600, cô giành học bổng toàn phần vào trường Đại học VinUni cách đây 4 năm.\n" +
                    "\n" +
                    "Thanh cho biết ban đầu chưa có ý định học thạc sĩ vì muốn đi làm, tích lũy kinh nghiệm. Tuy nhiên, đầu năm ngoái, khi sang Đại học Cornell theo diện trao đổi, Thanh nhớ đến dự định du học nhưng phải gác lại vì dịch Covid-19. Thích môi trường học thuật và nghiên cứu ở đây, Thanh quyết tâm nối lại ước mơ đi học nước ngoài.\n" +
                    "\n" +
                    "Trong lúc ở Mỹ, cô chuẩn bị hồ sơ, thi GMAT đạt 720/800 điểm (bài thi đánh giá năng lực dành cho ứng viên bậc thạc sĩ về kinh doanh) và tìm công ty thực tập. Hồ sơ ứng tuyển chương trình MBA gồm nhiều thành phần. Thanh thuận lợi vì luôn ý thức duy trì điểm số tốt, tham gia hoạt động ngoại khóa từ năm thứ nhất và là một trong những người sáng lập UpYouth, tổ chức sinh viên hỗ trợ người trẻ Việt Nam khởi nghiệp.\n" +
                    "\n" +
                    "Cô cũng xin hai thư giới thiệu. Theo Thanh, người viết vừa phải thân thiết để kể những câu chuyện đặc biệt về ứng viên, vừa phải có uy tín nhất định. Ngoài Kenneth, Thanh còn được chủ tịch trường giới thiệu. Bà từng hướng dẫn em trong một dự án ngoại khóa.\n" +
                    "\n" +
                    "Với bài luận, trường đưa ra ba câu hỏi, yêu cầu mỗi bài viết gồm 200-250 từ về ảnh hưởng của những trải nghiệm trong cuộc sống tới ứng viên, cũng như cách họ dẫn dắt người khác. Một trong số đó, Thanh viết về mẹ.\n" +
                    "\n" +
                    "Mẹ cô sinh ra ở một vùng quê nghèo, chưa tốt nghiệp cấp ba. Ngày trước, bà thường đến các công trường xây dựng, lân la hỏi công nhân về gạch, cát và nguồn cung cấp vật liệu. Từ đó, bà lên mạng tìm hiểu kiến thức, dần dần trở thành một nhà thầu xây dựng có uy tín.\n" +
                    "\n" +
                    "Chứng kiến nỗ lực của mẹ, Thanh hiểu muốn lãnh đạo người khác, bản thân phải cố gắng và nỗ lực để có kết quả. Nhìn vào đó, nhân viên mới có động lực, sự tôn trọng để làm việc tốt hơn. Tinh thần làm việc chăm chỉ của mẹ đã truyền cảm hứng và ảnh hưởng lớn đến Thanh khi dẫn dắt các thành viên UpYouth sau này.\n" +
                    "\n" +
                    "Bài luận được Thanh hoàn thành sau hơn một tháng, với 28 bản thảo.\n" +
                    "\n" +
                    "Trong hai bài luận còn lại, cô cũng tìm cách kể câu chuyện bản thân để hội đồng tuyển sinh hiểu được bối cảnh, môi trường học tập, làm việc và bài học mà mình nhận được.\n" +
                    "\n" +
                    "Cô cho rằng điều cần chứng minh với trường không phải là mình giỏi hơn các ứng viên khác như thế nào mà là sự am hiểu về Việt Nam. Chẳng hạn, với câu hỏi mà Thanh nhận được ở vòng phỏng vấn: \"Nếu người trẻ Việt khởi nghiệp thì nên bắt đầu với ngành nào\".\n" +
                    "\n" +
                    "\"Câu trả lời của tôi là giáo dục\", Thanh kể. Cô cho hay người dân Việt Nam chi mạnh tay cho giáo dục nhất ở Đông Nam Á, bởi phụ huynh rất coi trọng việc học của con cái. Do đó, người trẻ có lợi thế cạnh tranh khi làm ở lĩnh vực này do có trải nghiệm thực tế.\n" +
                    "\n" +
                    "Tuy nhiên, khởi nghiệp với giáo dục cũng không dễ dàng. Khi hỗ trợ tư vấn các startup trẻ, em gợi ý các bạn nên làm theo mô hình B2B (doanh nghiệp tới doanh nghiệp) thay vì B2C (doanh nghiệp tới người tiêu dùng) để có doanh thu ổn định." +
                    "Thanh được phép hoãn nhập học tối đa 4 năm, để có thời gian đi làm. Cô hiện là đại diện Công ty Arrowster tại Việt Nam. Thanh nói hài lòng với công việc và dự định đi học sau khi đã có đủ trải nghiệm mong muốn.\n" +
                    "\n" +
                    "Học phí khóa MBA tại Harvard hiện khoảng 76.000 USD. Thanh cho hay chương trình có hỗ trợ tài chính, nhưng sẽ xét vào thời điểm ứng viên nhập học.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/thanh-9101-1731171869.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=jojeU4aHv2t-peBkEsGdDg",
            "3 giờ trước",
            "Chân dung",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            4,
            "Nữ sinh khoa Vũ khí giành giải thưởng khoa học công nghệ",
            "Từng hoang mang khi được phân vào khoa Vũ khí, Hoàng Thị Thương dần thấy hứng thú khi được tìm hiểu các thiết bị quân sự, giành giải thưởng Nữ sinh khoa học công nghệ 2024.\n" +
                    "\n" +
                    "Thương, 23 tuổi, là sinh viên năm cuối chuyên ngành Khí tài quang và Quang điện tử, khoa Vũ khí, Học viện Kỹ thuật quân sự. Dù từng chủ trì hai đề tài đạt kết quả xuất sắc cấp học viện, là tác giả một số bài báo đăng trên tạp chí trong nước, hội thảo quốc tế, Thương vẫn bất ngờ khi được Trung ương Đoàn trao giải thưởng Nữ sinh khoa học công nghệ.\n" +
                    "\n" +
                    "\"Mình biết nhiều bạn có thành tích nghiên cứu xuất sắc nên xác suất trở thành một trong 20 nữ sinh được vinh danh rất nhỏ\", Thương nói.Thương là cựu học sinh trường THPT Lương Đắc Bằng, huyện Hoằng Hóa, tỉnh Thanh Hóa. Mơ ước được rèn luyện trong môi trường quân đội từ nhỏ, Thương thường xuyên theo dõi thông tin về các trường khối này.\n" +
                    "\n" +
                    "Vốn đam mê Toán và Vật lý, thích tìm hiểu những hiện tượng và ứng dụng liên quan, Thương thích thú khi xem được một đoạn video về flycam tự cải tiến của các học viên Học viện Kỹ thuật quân sự. Thấy \"rất ngầu\", Thương quyết định đăng ký xét tuyển và trúng tuyển năm 2019.\n" +
                    "\n" +
                    "Các trường khối quân sự không cho chọn chuyên ngành từ đầu. Ngay khi nhập học, Thương phải tham gia khóa huấn luyện quân sự kéo dài 6 tháng tại trường Sĩ quan lục quân 1. Trở về trường sau thời gian huấn luyện vất vả, có những ngày mang 20 kg tư trang đi 5 km dưới mưa, Thương thêm hoang mang khi được phân vào chuyên ngành Khí tài quang và Quang điện tử.\n" +
                    "\n" +
                    "\"Mình rất bất ngờ vì trước đó muốn vào ngành Công nghệ thông tin. Mình không hiểu Khí tài quang là gì, chỉ biết chuyên ngành này nổi tiếng khó và hầu như chỉ dành cho nam giới\", Thương nhớ lại. \"Mình tự hỏi liệu có học nổi không\".\n" +
                    "\n" +
                    "Nữ sinh dành cả tháng đầu để tìm hiểu những kiến thức cơ bản nhất về chuyên ngành thông qua anh chị khóa trên và tài liệu. Thấy được tìm hiểu về các thiết bị quan sát trong quân sự như ống nhòm, Thương bắt đầu thấy thú vị." +
                    "Xác định sẽ tham gia nghiên cứu khoa học, Thương sớm xin tham gia đề tài. Lần đầu, Thương vào nhóm tìm hiểu lĩnh vực tâm lý học bởi chưa học nhiều về chuyên ngành, lại muốn làm quen với phương pháp nghiên cứu.\n" +
                    "\n" +
                    "Dù không liên quan đến ngành học, Thương thu nhận được nhiều điều, từ khả năng quan sát, đánh giá vấn đề đến các kỹ năng mềm và tính kiên trì. Đây là tiền đề để sang năm thứ ba, Thương nhận chủ trì đề tài \"Nghiên cứu chế tạo vi laser bằng máy in thương mại\".\n" +
                    "\n" +
                    "Thương kể hoàn thành đề tài sau 10 tháng. Tuy nhiên, không ít lần nữ sinh và các bạn cảm thấy bế tắc. Bởi trong suốt 7-8 tháng đầu, cả nhóm vẫn không tìm ra hướng đi, dù đã thử nghiệm nhiều lần.\n" +
                    "\n" +
                    "\"Thật không hề dễ chịu. Nhưng mình yêu cảm giác khi vấn đề được giải quyết\", Thương chia sẻ.\n" +
                    "\n" +
                    "Sau đó, nữ sinh chủ trì thêm một đề tài khác là \"Nghiên cứu xây dựng mô hình thiết bị phun vi giọt trong chế tạo vi laser\", được Học viện Kỹ thuật quân sự đánh giá đạt mức xuất sắc.\n" +
                    "\n" +
                    "Thời gian này, Thương có hai bài báo đăng trong kỷ yếu Hội nghị Khoa học tự nhiên cho các nhà khoa học trẻ, nghiên cứu sinh và học viên cao học đến từ các nước Đông Nam Á, và hội nghị quốc tế về khoa học vật liệu tiên tiến và công nghệ nano.\n" +
                    "\n" +
                    "Thương cũng là đồng tác giả một bài báo đăng trên tạp chí Communication in Physics của Viện Vật lý, Viện Hàn lâm Khoa học và Công nghệ Việt Nam; đạt giải khuyến khích cuộc thi Tuổi trẻ sáng tạo trong quân đội.\n" +
                    "\n" +
                    "Về học tập, nữ sinh hiện có điểm tổng kết 8.5/10, từng đạt giải ba Olympic Toán học sinh, sinh viên toàn quốc.\n" +
                    "\n" +
                    "\"Mỗi thành tích đạt được đều đặc biệt, cho thấy sự kiên trì, nỗ lực và kỷ luật của bản thân\", Thương nhìn nhận.Dạy và hướng dẫn Thương nghiên cứu gần ba năm qua, PGS.TS Tạ Văn Dương, Trưởng phòng Thí nghiệm, Bộ môn Khí tài quang học, khoa Vũ khí, đánh giá học trò có tinh thần tự giác cao, chịu khó học hỏi, tác phong làm việc khoa học và khả năng giải quyết vấn đề tốt.\n" +
                    "\n" +
                    "\"Tôi chỉ cần đưa ra vấn đề và một số gợi ý, Thương sẽ chủ động lập kế hoạch, phân công nhiệm vụ cho nhóm, tự nghiên cứu tài liệu và kiên trì thực hiện các thí nghiệm liên tục cho đến khi đạt được kết quả\", thầy Dương nói.\n" +
                    "\n" +
                    "Thầy cũng ấn tượng với sự khéo tay của Thương. Nữ sinh từng tự tay đan tặng thầy một bó hoa hướng dương bằng len, nhân dịp 20/11.\n" +
                    "\n" +
                    "Đan len hay nghe nhạc, đọc sách là cách Thương tái tạo năng lượng sau những tuần học tập và rèn luyện cường độ cao. Trong môi trường quân đội, học viên phải chấp hành nghiêm 11 chế độ trong ngày cùng rất nhiều nhiệm vụ khác. Điều này buộc Thương phải sắp xếp kế hoạch rất cụ thể để có thời gian tự học, tự nghiên cứu nhưng vẫn phải có thời gian thư giãn, tránh stress.\n" +
                    "\n" +
                    "Thương sẽ tốt nghiệp vào tháng 12. Nữ sinh dự định học thạc sĩ để tiếp tục theo đuổi con đường nghiên cứu khoa học.\n" +
                    "\n" +
                    "\"Mình mong muốn được cùng các thầy cô ở trường tham gia các đề tài lớn hơn và đóng góp được nhiều kết quả thiết thực hơn\", Thương nói.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/06/19a887c40affb2a1ebee-2055-1730882470.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=_-RHXAl_P3JMzTlwQlHo9A",
            "4 giờ trước",
            "Chân dung",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            5,
            "Tiến sĩ biết 7 ngoại ngữ được ĐH Quốc gia TP HCM tuyển theo diện 'xuất sắc",
            "TS Trịnh Quang Vinh trúng tuyển Đại học Quốc gia TP HCM theo diện \"nhà khoa học trẻ xuất sắc\" với kinh nghiệm giảng dạy, nghiên cứu ở nhiều lĩnh vực, biết 7 ngoại ngữ.\n" +
                    "\n" +
                    "TS Vinh, 37 tuổi nhận tin trúng tuyển hồi tháng 5, về làm việc tại trường Đại học Khoa học Tự nhiên. Anh là một trong 14 người đầu tiên được đại học này tuyển dụng theo đề án thu hút nhà khoa học trẻ xuất sắc VNU 350.\n" +
                    "\n" +
                    "Trước đó, anh tốt nghiệp tiến sĩ ngành Quản trị và Chính sách giáo dục, trường Đại học Quốc gia Chi Nan, Đài Loan (Trung Quốc).\n" +
                    "\n" +
                    "\"Đại học Khoa học Tự nhiên là nơi mình gắn bó suốt thời đại học, thạc sĩ, đúng nghĩa đi một vòng thật xa rồi trở lại mái nhà xưa\", anh Vinh nói.\n" +
                    "\n" +
                    "Theo giới thiệu của Đại học Quốc gia TP HCM, từ khi tốt nghiệp đại học vào năm 2009 đến nay, anh Vinh đã đi qua 31 quốc gia và vùng lãnh thổ, giảng dạy gần 40 môn học, ở các lĩnh vực: Giáo dục khai phóng và liên ngành; Khoa học Xã hội và Nhân văn; Ngôn ngữ (Trung Quốc, Thái Lan, Myanmar, Việt Nam); Vật lý và Y học hạt nhân.\n" +
                    "\n" +
                    "\"Trong những giấc mơ viển vông nhất thời phổ thông, tôi cũng chưa từng nghĩ có thể đi dạy, trải nghiệm nhiều lĩnh vực và nhiều nơi trên thế giới đến vậy\", anh Vinh chia sẻ." +
                    "Anh Vinh kể những năm 2000, thi đại học là điều xa vời, càng không kể đến việc được định hướng hay tư vấn ngành nghề bởi bố mẹ đều chưa học hết cấp 1. Trong một lần gặp các sinh viên khoa Vật lý của trường Đại học Khoa học Tự nhiên hồi cuối năm lớp 11, anh được rủ \"thi vào khoa cho vui\".\n" +
                    "\n" +
                    "\"Hết lớp 12, tôi thi đại học với tâm thế đỗ thì vui, không thì đi làm kiếm sống, phụ giúp gia đình. May mắn là tôi đỗ vào khoa Vật lý - Vật lý kỹ thuật\", anh Vinh nhớ lại.\n" +
                    "\n" +
                    "Năm 2010, sau khi tốt nghiệp, anh Vinh học lên thạc sĩ chuyên ngành Vật lý, Nguyên tử và Năng lượng cao, song song làm việc hành chính, trợ giảng ở một số trường đại học. Thử thách đến với anh khi học xong cũng là lúc dự án điện hạt nhân đình trệ. Anh và nhiều người khác vốn được đào tạo ngành này phải tỏa ra đi tìm việc khác.\n" +
                    "\n" +
                    "Đây cũng là bước ngoặt khiến anh thay đổi định hướng. Với nền tảng từ việc trợ giảng, anh chuyển hướng sang giảng dạy, nghiên cứu về giáo dục. Theo anh, để giảng dạy tốt cần hiểu tận ngọn nguồn của hệ thống, phương pháp, công cụ và những yếu tố ảnh hưởng đến giáo dục. Năm 2014, Vinh sang Đài Loan, theo chương trình tiến sĩ với học bổng toàn phần.\n" +
                    "\n" +
                    "\"Tôi nhận ra mình hứng thú với lĩnh vực giáo dục, thấy thành quả đào tạo của mình thông qua sự chững chạc, hiểu biết của sinh viên\", anh Vinh nói.\n" +
                    "\n" +
                    "Đăng ký chương trình học bằng tiếng Anh nhưng phần lớn thời gian trên lớp, thầy cô, bạn bè lại trao đổi bằng tiếng Trung. Ngoài ra, trong sinh hoạt hàng ngày, mọi người cũng dùng ngôn ngữ này khiến anh Vinh gặp không ít bất tiện. Anh sau đó dành thời gian hè tự học tiếng Trung. Nhờ môi trường thực hành và sử dụng liên tục, hơn một năm sau, Vinh thành thạo và thi đạt chứng chỉ. Anh liền đăng ký học thêm chương trình thạc sĩ chuyên ngành giảng dạy bằng tiếng Trung.\n" +
                    "\n" +
                    "Ở Đài Loan, các dự án, chương trình nghiên cứu về giáo dục hầu như bằng tiếng Trung. Nhờ ngoại ngữ mới, anh tìm kiếm và tham gia các dự án của nhiều tổ chức. Cơ hội đi Mỹ và nhiều nước châu Âu cũng đến thông qua các hội thảo khoa học hoặc các chuyến nghiên cứu.\n" +
                    "\n" +
                    "Anh Vinh thường dành một tháng mùa hè đi tình nguyện. Anh từng dạy học cho trẻ em ở Lào, Myanmar, Thái Lan. Trước những chuyến đi này, anh tranh thủ tự học hoặc đăng ký các lớp ngôn ngữ Đông Nam Á ở trường.\n" +
                    "\n" +
                    "Nhờ đó, anh Vinh cho hay có thể sử dụng được 7 ngôn ngữ, ở nhiều mức độ. Trong đó, tiếng Anh và tiếng Trung (phổ thông) là thành thạo nhất. Ngoài ra, anh biết tiếng Nhật, Hàn, Thái, Myanmar, Lào, Quảng Đông (tiếng địa phương ở miền nam Trung Quốc).\n" +
                    "\n" +
                    "Để học hiệu quả, khi tìm hiểu bất kỳ thứ tiếng nào, anh đều so sánh, tìm điểm tương đồng với tiếng mẹ đẻ để có phương pháp học phù hợp. Anh chia các ngôn ngữ thành ba nhóm: phát âm, hệ chữ viết hoặc cấu trúc, ngữ pháp giống tiếng Việt.\n" +
                    "\n" +
                    "Theo anh, tiếng Trung, Hàn, Nhật có cách phát âm gần giống tiếng Việt nên thuận lợi hơn. Với nhóm ngôn ngữ này, anh tiếp cận nghe, nói trước vì dễ nhớ, dần dần xây dựng vốn từ vựng rồi học ngữ pháp, cách viết.\n" +
                    "\n" +
                    "Với lợi thế về ngoại ngữ, luận án tiến sĩ của anh Vinh được viết bằng bốn thứ tiếng (Việt, Trung, Thái, Anh). Anh Vinh cho hay đây là luận án đầu tiên của Đại học Quốc gia Chi Nan được thực hiện bằng bốn ngôn ngữ, đạt điểm 93/100.\n" +
                    "\n" +
                    "Tốt nghiệp tiến sĩ năm 2018, anh bỏ cơ hội ở lại trường làm nghiên cứu sau tiến sĩ để trở về Việt Nam, tham gia xây dựng chương trình đào tạo cho một số trường đại học.\n" +
                    "\n" +
                    "Là đồng nghiệp tại Đại học Quản lý và Công nghệ TP HCM, TS Hà Triệu Huy, giảng viên môn Giáo dục khai phóng, đánh giá anh Vinh bản lĩnh trong nghiên cứu, thực hành giáo dục.\n" +
                    "\n" +
                    "Anh Vinh có hai bằng sáng chế về mô hình giáo dục khai phóng được Bộ Khoa học Công nghệ và Bộ Văn hóa Thể thao và Du lịch công nhận. Khái niệm này được nhắc đến nhiều ở Việt Nam thời gian gần đây nhưng xây dựng hệ thống, mô hình giáo dục ra sao để đáp ứng yêu cầu thì chưa nhiều trường làm được.\n" +
                    "\n" +
                    "Trên cơ sở khung chương trình đào tạo cho từng chuyên ngành, anh Vinh đã nghiên cứu kết hợp những môn học cần thiết để đáp ứng chuẩn đầu ra.\n" +
                    "\n" +
                    "\"Anh sắp xếp công việc khoa học, thấu đáo, sẵn sàng chia sẻ kinh nghiệm, hỗ trợ đồng nghiệp cùng phát triển. Tôi học hỏi và chịu ảnh hưởng nhiều từ anh Vinh\", TS Huy nói.\n" +
                    "\n" +
                    "Trở về mái nhà xưa ở vị trí giảng viên, nghiên cứu Khoa học liên ngành, anh Vinh nói thách thức không nhỏ là phải chứng minh năng lực trong vai trò \"nhà khoa học trẻ xuất sắc\".\n" +
                    "\n" +
                    "\"Xu hướng khoa học liên ngành đã rất phát triển trên thế giới, để giải quyết các vấn đề xã hội cần sự phối hợp rất nhiều ngành nhưng ở Việt Nam còn quá mới. Tôi muốn thử thách mình với cái mới\", anh nói.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/30/20240214-125532-536-1730256282-1516-1730256288.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=oNnC1lyrbTtnqlNkz1Yc6g",
            "5 giờ trước",
            "Chân dung",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getDuHoc(): List<Post> {
    return listOf(
        Post(
            1,
            "Chính phủ New Zealand lần đầu cấp học bổng đại học cho người Việt",
            "Chính phủ New Zealand cấp 14 suất học bổng hệ đại học cho học sinh Việt Nam, mỗi suất 15.000 NZD (hơn 220 triệu đồng).\n" +
                    "\n" +
                    "Cơ quan Giáo dục New Zealand (ENZ) chiều 11/11 cho biết đây là lần đầu có học bổng chính phủ ở bậc này cho du học sinh Việt Nam.\n" +
                    "\n" +
                    "Theo ông Ben Burrowes, quyền Giám đốc Điều hành khối quốc tế của ENZ, việc này nhằm thúc đẩy quan hệ hợp tác giáo dục song phương giữa New Zealand với Việt Nam, hướng đến kỷ niệm 50 năm quan hệ hợp tác vào năm sau.\n" +
                    "\n" +
                    "14 ứng viên xuất sắc sẽ nhận học bổng khi nhập học tại một trong 8 đại học công lập của nước này, gồm Đại học Auckland, Công nghệ Auckland, Massey, Waikato, Victoria Wellington, Canterbury, Lincoln và Otago. Tất cả nằm trong nhóm 2% (top 300) theo bảng xếp hạng đại học thế giới QS 2025." +
                    "Học bổng dự kiến nhận hồ sơ vào tháng 5/2025, áp dụng cho kỳ nhập học tháng 2/2026. Thông tin chi tiết sẽ được thông báo sau.\n" +
                    "\n" +
                    "Trước đó, Chính phủ New Zealand đã cấp học bổng dành cho học sinh trung học (NZSS) và sau đại học (Manaaki).",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/sinh-vien-3871-1731316025.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=t2dlAmMRcFjAoAJiJ2nZ4w",
            "1 giờ trước",
            "Du học",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Triển lãm học bổng Mỹ với 1.000 suất lên đến 100%",
            "Đại diện hơn 40 trường THPT, đại học Mỹ phỏng vấn học bổng trực tiếp học sinh Việt Nam tại \"Triển lãm học bổng mùa thu\" do Nam Anh Scholarships tổ chức.\n" +
                    "\n" +
                    "Sự kiện diễn ra vào ngày 22/12, tại Hà Nội, TP HCM và Đà Nẵng. Học sinh, sinh viên có thể đăng ký tham gia triển lãm để có cơ hội gặp gỡ trực tiếp đại diện gần 40 trường hàng đầu Mỹ; phỏng vấn; tìm hiểu chương trình học bổng du học Mỹ và nghe tư vấn 1:1 về các ngành học xu hướng, có thu nhập cao sau khi ra trường. Mỗi trường sẽ dành phỏng vấn học bổng từ 50% đến 100% cho học sinh có tính cách, sở trường và niềm đam mê nổi bật." +
                    "Sự kiện tạo điều kiện cho các bạn trẻ tiếp xúc với nhiều chương trình học bổng, từ đó, giảm bớt vấn đề tài chính, một trong những rào cản lớn nhất với du học sinh. Ngoài ra, các chuyên gia từ các trường và Nam Anh Scholarships tư vấn 1-1 về lộ trình, chọn trường, ngành học theo năng lực, tài chính, nguyện vọng để các bạn chuyển bị kỹ hơn cho hành trình du học.\n" +
                    "\n" +
                    "Theo đó, các chuyên gia, cố vấn viên sẽ cung cấp chính xác về yêu cầu tuyển sinh, cơ hội nhận học bổng, ngành học và các thông tin quan trọng về nhà ở, chương trình học. Các trường đều có học bổng giá trị trao cho cá nhân ưu tú. Với khả năng học tập tốt ở các môn khoa học tự nhiên và tiếng Anh, học sinh Việt Nam sẽ được các trường học Mỹ đánh giá cao, ưu tiên xét cấp học bổng." +
                    "Trước đó, ngày 19-22/10, Nam Anh Scholarships đã tổ chức triển lãm với sự tham gia của nhiều trường THPT và đại học Mỹ tại Hà Nội, TP HCM, Đà Nẵng. Trong buổi triển lãm, thầy Nguyen Do - Giám đốc vận hành và là thạc sĩ giáo dục Đại học John Hopkins đã chia sẻ về chiến lược ứng tuyển đại học Mỹ top đầu với mục tiêu hỗ trợ học sinh Việt Nam chinh phục khối trường danh giá nhất.\n" +
                    "\n" +
                    "Nam Anh Scholarships là đơn vị tư vấn du học với hơn 18 năm kinh nghiệm, dẫn dắt bởi thầy Nam Đỗ - thạc sĩ giáo dục Mỹ. Đơn vị đã đồng hành đã đồng hành với hàng ngàn học sinh, sinh viên du học thành công tại các trường chất lượng ở Mỹ.\n" +
                    "\n" +
                    "Công ty đã hỗ trợ hơn 1000 học sinh đạt học bổng Mỹ mỗi năm; đại diện xúc tiến học bổng cho hơn 100 tổ chức giáo dục tại Mỹ, trong đó có Truman State University, Curry College, La Roche University, Storm King School, Linsly School,Washington Academy, North Cross School..." +
                    "Đại diện Nam Anh Scholarships chia sẻ, với chuỗi sự kiện \"Triển lãm săn học bổng Mỹ\" sắp diễn ra tại ba thành phố lớn, đơn vị kỳ vọng có thể giúp các bạn trẻ tự tin thể hiện bản thân, ước mơ để nhận học bổng giá trị cao, nhanh chóng hoàn thành ước mơ du học Mỹ.\n" +
                    "\n" +
                    "Hiện, Nam Anh Scholarships có bốn văn phòng tại bốn thành phố lớn cùng với đội ngũ chuyên gia, cố vấn, nhân sự đào tạo và tư vấn viên chuyên nghiệp.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/image003-2209-1731312402.png?w=680&h=0&q=100&dpr=1&fit=crop&s=eM1lXrgK_Kb4V1gc8i5LPA",
            "2 giờ trước",
            "Du học",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Canada dừng ưu tiên xử lý thị thực của du học sinh Việt",
            "Canada bất ngờ đóng chương trình SDS - vốn để tăng tốc xử lý visa du học và không yêu cầu chứng minh tài chính với học sinh ở 14 nước và vùng lãnh thổ, gồm Việt Nam.\n" +
                    "\n" +
                    "Thông tin được đăng trên website của chính phủ Canada, hôm 8/11 và có hiệu lực ngay.\n" +
                    "\n" +
                    "SDS (Student Direct Stream) là sáng kiến của Bộ Di trú, Người tị nạn và Quốc tịch Canada (IRCC) cách đây 6 năm, nhằm ưu tiên xử lý thị thực (visa) du học sinh của 14 quốc gia và vùng lãnh thổ.\n" +
                    "\n" +
                    "Khi theo diện này, học sinh không cần chứng minh tài chính, giảm thiểu thủ tục, được nộp hồ sơ trực tuyến, cùng một số ưu tiên khác. Thời gian xử lý thị thực của chương trình SDS khoảng 7 tuần, nhanh hơn thời hạn xử lý thông thường là 11 tuần.\n" +
                    "\n" +
                    "Trên website, IDP - tổ chức giáo dục quốc tế, cung cấp dịch vụ hỗ trợ du học, cho biết khoảng 14.000 du học sinh Việt Nam sang Canada theo diện SDS." +
                    "Chính sách mới tiếp nối loạt động thái cắt giảm lượng du học sinh đến Canada, trong bối cảnh số người nhập cư tăng, gây áp lực lên thị trường nhà ở.\n" +
                    "\n" +
                    "Hồi tháng 9, Canada thông báo sẽ cấp 437.000 giấy phép du học trong năm 2025, giảm khoảng 10% so với năm nay. Ứng viên muốn xin giấy phép làm việc sau tốt nghiệp (PGWP) phải nộp thêm chứng chỉ tiếng Anh hoặc tiếng Pháp bậc B2 trở lên với sinh viên đại học và B1 trở lên đối với sinh viên cao đẳng. Những du học sinh đến Canada sau ngày 1/11 còn phải theo học những ngành trong danh sách của IRCC mới có thể nộp đơn xin PGWP.\n" +
                    "\n" +
                    "Trước đó, mức chứng minh tài chính được tăng lên hơn 20.600 CAD (15.200 USD), gấp đôi so với yêu cầu 10.000 CAD vốn đã tồn tại hàng chục năm. Ngoài ra, du học sinh thạc sĩ và tiến sĩ phải nộp chứng thực học tập từ tỉnh, bang hoặc vùng lãnh thổ khi xin giấy phép.\n" +
                    "\n" +
                    "Canada thu hút hơn một triệu sinh viên quốc tế vào năm 2023, là một trong hai điểm đến du học hàng đầu, cùng với Mỹ. Theo một số liệu năm 2022, khoảng 40%, sinh viên nước ngoài ở Canada đến từ Ấn Độ, sinh viên Trung Quốc đứng thứ hai với khoảng 12%. Số sinh viên Việt Nam là hơn 16.000.\n" +
                    "\n" +
                    "Chi phí trung bình của bậc cử nhân ở Canada khoảng 36.000 CAD (654 triệu đồng) một năm, gồm học phí, sinh hoạt phí.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/09/462689466-948672120622915-4804-1532-5720-1731122081.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=VWbmJRJT_J0pwS3kjkvBAg",
            "3 giờ trước",
            "Du học",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getDienDan(): List<Post> {
    return listOf(
        Post(
            1,
            "'Chạy đua' kiểm định tạo gánh nặng cho đại học' ",
            "Chi phí kiểm định chất lượng tốn kém, nhưng Luật lại bắt buộc 5 năm một lần, tạo ra gánh nặng tài chính lớn, ảnh hưởng tới phát triển, theo các đại học.\n" +
                    "\n" +
                    "Công tác kiểm định chất lượng giáo dục đại học là vấn đề được nhiều trường quan tâm, thảo luận tại tọa đàm về Luật giáo dục và Luật giáo dục đại học, cuối tuần qua ở TP HCM.\n" +
                    "\n" +
                    "Luật giáo dục đại học bắt buộc kiểm định tất cả chương trình đào tạo, cứ 5 năm một lần. Nếu đạt, các trường được tự xác định học phí, theo Nghị định 81 của Chính phủ. Có hai hình thức kiểm định, hoặc theo chuẩn của Bộ Giáo dục và Đào tạo, hoặc theo tiêu chuẩn của các tổ chức nước ngoài.\n" +
                    "\n" +
                    "PGS.TS Trần Tiến Khai, Trưởng phòng Đảm bảo chất lượng - Phát triển chương trình, Đại học Kinh tế TP HCM, nhìn nhận việc này còn nhiều bất cập.\n" +
                    "\n" +
                    "Theo ông, củng cố chất lượng hệ thống giáo dục đại học là cần thiết nhưng không cần chi tiết hóa đến mức bắt buộc phải kiểm tra, đánh giá tất cả các chương trình đào tạo. Các nước trên thế giới cũng hướng đến những chuẩn mực chung, nhưng gần như không ở đâu yêu cầu các đại học phải đạt kiểm định.\n" +
                    "\n" +
                    "\"Công tác kiểm định tạo ra gánh nặng tài chính rất lớn, không phải trường nào cũng kham nổi\", ông nói.\n" +
                    "\n" +
                    "Chu kỳ kiểm định 5 năm cũng không phù hợp. Luật giáo dục đại học cho phép các trường lựa chọn tổ chức kiểm định, trong khi Luật Đấu thầu bắt buộc phải đấu thầu, gây mất thời gian.\n" +
                    "\n" +
                    "Nhiều trường vừa được đánh giá xong không bao lâu đã phải chuẩn bị để tái kiểm định. Vì có nhiều chương trình, thời gian kiểm định không phải lúc nào cũng khớp nhau nên nếu không kịp sắp xếp, công tác tuyển sinh có thể bị ảnh hưởng.\n" +
                    "\n" +
                    "\"Điều này rất vô lý. Chương trình đã được kiểm định là chất lượng, không lẽ chỉ trong một thời gian ngắn mà tệ đi\", ông Khai đặt vấn đề." +
                    "PGS.TS Trần Thiên Phúc, Phó hiệu trưởng trường Đại học Bách khoa, đồng tình.\n" +
                    "\n" +
                    "\"Bối cảnh ngành nghề ngày nay thay đổi rất nhanh. Chúng ta cứ chạy theo kiểm định liên tục thì không còn thời gian phát triển chương trình\", ông Phúc nói.\n" +
                    "\n" +
                    "Ở góc độ khác, TS Thái Thị Tuyết Dung, phụ trách Ban Thanh tra - Pháp chế của Đại học Quốc gia TP HCM, nhận định thời gian qua nhiều trường chạy đua kiểm định. Theo bà, khi nhu cầu quá cao, chất lượng kiểm định cũng khó kiểm soát.\n" +
                    "\n" +
                    "\"Các trường muốn đánh giá đạt chuẩn để được tự xác định học phí. Trong một chừng mực nào đó, các trường làm kiểm định chỉ vì học phí thôi chứ nếu không, họ sẽ làm từ từ\", bà nói.\n" +
                    "\n" +
                    "Các chuyên gia đề xuất Bộ Giáo dục và Đào tạo khắc phục những bất cập này. Chẳng hạn, theo PGS Khai, Bộ nên công nhận chất lượng chương trình đào tạo ở những trường đã đạt kiểm định cấp cơ sở và có khoảng 50% chương trình đạt tiêu chuẩn. Cùng đó, ông mong kéo dài chu kỳ kiểm định lên 7 năm, có cơ chế chỉ định thầu để các trường lựa chọn đơn vị kiểm định." +
                    "Thứ trưởng Bộ Giáo dục và Đào tạo Hoàng Minh Sơn thừa nhận không nước nào yêu cầu đánh giá tất cả chương trình và cơ sở giáo dục đại học. Ở Việt Nam, công tác kiểm định có ba cấp độ: chương trình, cơ sở và hệ thống.\n" +
                    "\n" +
                    "\"Bộ đang nghiên cứu cách tiếp cận, theo xu hướng phân quyền, giao quyền tự chủ. Một cơ sở đại học ở mức độ như thế nào thì được tự kiểm định\", Thứ trưởng nói.\n" +
                    "\n" +
                    "Tính đến ngày 31/7, cả nước có hơn 1.900 chương trình được kiểm định, trong đó hơn 1.370 theo tiêu chuẩn trong nước, khoảng 570 theo tiêu chuẩn nước ngoài (Xem danh sách). Ở cấp độ cơ sở, hơn 200 trường đại học và 11 cao đẳng sư phạm đạt tiêu chuẩn của các tổ chức kiểm định.\n" +
                    "\n" +
                    "17 tổ chức kiểm định chất lượng, gồm 10 tổ chức nước ngoài, 7 trong nước được cấp phép hoạt động. Mỗi tổ chức có các tiêu chí đánh giá, trọng số và chi phí khác nhau.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/11/a0568ab7-b556-482b-9c2b-ae41e1-3592-9680-1731302425.jpg?w=680&h=0&q=100&dpr=1&fit=crop&s=Xjz3l2SHRXE6NHUj_W8qOg",
            "1 giờ trước",
            "Diễn đàn",
            "Thứ 4, 6/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Thí sinh thấp thỏm nếu cuối năm học mới biết điểm chuẩn xét tuyển sớm",
            "Tiến Minh trông chờ xét học bạ để giảm áp lực ở kỳ thi tốt nghiệp nên mong biết kết quả sớm, nếu lùi lịch đến 31/5, em sẽ thấp thỏm, lo lắng hơn.\n" +
                    "\n" +
                    "Tiến Minh, học sinh lớp 12 ở quận Nam Từ Liêm, Hà Nội, dự định theo ngành Công nghệ thông tin ở đại học. Dù các trường chưa công bố phương án tuyển sinh năm tới, Minh đã tính sẽ nộp vào Đại học Đại Nam, Phenikaa hay FPT.\n" +
                    "\n" +
                    "Nếu các trường ổn định cách xét tuyển như năm ngoái, Minh cần điểm học bạ 3-5 học kỳ, không bao gồm kỳ II lớp 12, biết kết quả vào khoảng tháng 4.\n" +
                    "\n" +
                    "\"Em yên tâm hơn vì sẽ biết phải làm gì tiếp theo, dù là đỗ hay trượt\", Minh nói.\n" +
                    "\n" +
                    "Vì thế, nam sinh hụt hẫng khi nghe tin có thể năm nay việc này sẽ bị lùi lại. Tại Hội nghị tổng kết kỳ thi tốt nghiệp THPT 2020-2024 hôm 31/10, ông Huỳnh Văn Chương, Cục trưởng Quản lý chất lượng, Bộ Giáo dục và Đào tạo, đề xuất không cho các đại học công bố điểm chuẩn xét tuyển sớm trước ngày 31/5 - thời điểm kết thúc năm học.\n" +
                    "\n" +
                    "\"Các trường vẫn sẽ thu hồ sơ từ sớm, rồi công bố điểm chuẩn muộn, như vậy chỉ khiến chúng em thấp thỏm hơn\", Minh bày tỏ.\n" +
                    "\n" +
                    "Ở Hòa Bình, Sa Trung Hiếu, trường THPT Mường Chiềng, huyện Đà Bắc, có cùng suy nghĩ. Hiếu định đăng ký xét tuyển bằng điểm học bạ vào một số trường, hy vọng đỗ sớm để giảm áp lực ở kỳ thi tốt nghiệp THPT vào cuối tháng 6.\n" +
                    "\n" +
                    "\"Nếu trúng tuyển sớm, em chỉ cần học vừa phải để đỗ tốt nghiệp\", nam sinh nói.\n" +
                    "\n" +
                    "Theo khảo sát của VnExpress hôm 3/11 với gần 1.000 người, 53% muốn công bố kết quả xét tuyển sớm trước khi kết thúc năm học để giảm áp lực cho thí sinh, chỉ 23% đồng tình với Cục trưởng Quản lý chất lượng.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/07/233a3318-1730776846-1519-17307-9447-2057-1730982487.jpg?w=240&h=144&q=100&dpr=1&fit=crop&s=vk6vS2ydMu1TXqFQM_x5uw",
            "2 giờ trước",
            "Diễn đàn",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "Thứ trưởng Giáo dục: Không cố định môn thi thứ ba vào lớp 10",
            "169\n" +
                    "Giáo dụcTin tứcThứ năm, 31/10/2024, 15:45 (GMT+7)\n" +
                    "Thứ trưởng Giáo dục: Không cố định môn thi thứ ba vào lớp 10\n" +
                    "Nhiều trường THCS dạy lệch, đã chấn chỉnh nhưng vẫn theo tâm lý thi gì học nấy, nên Bộ Giáo dục mới dự kiến đổi môn thứ ba thi lớp 10 hàng năm, theo Thứ trưởng Phạm Ngọc Thưởng.\n" +
                    "\n" +
                    "Bên lề hội nghị Tổng kết kỳ thi tốt nghiệp THPT giai đoạn 2020-2024, ngày 31/10, ông Phạm Ngọc Thưởng, Thứ trưởng Bộ Giáo dục và Đào tạo, nói \"tinh thần phương án thi vào lớp 10\" sẽ gồm ba môn. Trong đó Toán, Ngữ văn là môn bắt buộc. Môn thứ ba do địa phương lựa chọn trong những môn có tính điểm còn lại, không cố định hàng năm.\n" +
                    "\n" +
                    "\"Môn thi thứ ba có thể lặp lại nhưng cách nhau ít nhất một năm\", ông cho biết.\n" +
                    "\n" +
                    "Theo ông Thưởng, việc không cố định môn thứ ba nhằm tránh chuyện học lệch, học tủ. Qua kiểm tra và ghi nhận thực tế, Bộ nhận thấy có nhiều trường THCS chỉ dạy trọng tâm ba môn thi vào lớp 10 ngay từ đầu năm lớp 9.\n" +
                    "\n" +
                    "Trong khi đó, chương trình giáo dục THCS hướng đến học cơ bản, đồng đều để học sinh có đủ năng lực, phẩm chất tiếp tục vào bậc THPT hoặc chuyển sang giáo dục nghề nghiệp. Phẩm chất, năng lực của học trò được hình thành, tổng hợp từ nhiều môn học. Do đó, thầy trò phải dạy và học bình đẳng giữa các môn, trừ hai môn cơ bản là Toán, Văn.\n" +
                    "\n" +
                    "\"Bộ đã kiểm tra, chấn chỉnh việc học lệch, học tủ rất nhiều. Nhưng phần lớn có tâm lý thi thế nào thì học như vậy, cho nên phải quản lý nghiêm\", ông Thưởng nói.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/10/31/73a00042-1730362111-6169-17303-8526-8108-1730366236.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=a73hgEmNcKY7HZetVYXTqg",
            "3 giờ trước",
            "Diễn đàn",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getHocTiengAnh(): List<Post> {
    return listOf(
        Post(
            1,
            "20 cách an ủi bằng tiếng Anh",
            "Đôi khi, người xung quanh cần được an ủi khi gặp chuyện không may. Sau đây là 20 cách để chúng ta an ủi, xoa dịu họ bằng tiếng Anh.\n" +
                    "\n" +
                    "Chẳng hạn, nếu ai đó cảm thấy tội lỗi hoặc xấu hổ vì một điều gì đó ngoài tầm kiểm soát của họ, ta có thể nói:\n" +
                    "\n" +
                    "- It wasn't your fault: Đó không phải lỗi của bạn đâu.\n" +
                    "\n" +
                    "- Nobody blames you (for it): Không ai đổ lỗi cho bạn (vì chuyện đó) đâu.\n" +
                    "\n" +
                    "- You couldn't help it/ There was nothing you could have done: Bạn cũng không thể làm gì khác mà.\n" +
                    "\n" +
                    "Để giúp người đối diện cảm thấy vấn đề bớt trầm trọng hơn có những cách sau:\n" +
                    "\n" +
                    "- It doesn’t matter: Chuyện đó không quan trọng đâu.\n" +
                    "\n" +
                    "- I've seen much worse than that: Tôi từng thấy chuyện tệ hơn thế nhiều rồi.\n" +
                    "\n" +
                    "- Nobody/Not many people noticed: Không ai/Không nhiều người để ý đâu.\n" +
                    "\n" +
                    "- It's not the end of the world: Chưa phải là tận thế đâu (Lưu ý: câu này chỉ nên được sử dụng cho những tình huống thực sự không quan trọng, nếu không, bạn sẽ vô tình khiến người nghe cảm thấy cảm xúc của mình không được coi trọng).\n" +
                    "\n" +
                    "Nếu người trò chuyện cùng bạn cảm thấy tồi tệ vì họ là người gây ra lỗi, một số câu đơn giản để an ủi họ là:\n" +
                    "\n" +
                    "- Everyone makes mistakes sometimes: Ai mà thỉnh thoảng chẳng mắc lỗi.\n" +
                    "\n" +
                    "- Nobody's perfect: Không ai là hoàn hảo mà.\n" +
                    "\n" +
                    "- It’ll soon blow over: Nó sẽ sớm qua thôi.\n" +
                    "\n" +
                    "- Everyone will have forgotten about it in a couple of days: Vài ngày nữa mọi người sẽ quên hết ấy mà.\n" +
                    "\n" +
                    "Khi ai đó lo lắng về việc họ sắp phải làm, bạn dùng những mẫu câu an ủi thông dụng:\n" +
                    "\n" +
                    "- Don't worry, you’ll be great!: Đừng lo lắng, bạn sẽ ổn thôi!\n" +
                    "\n" +
                    "- There's no need to worry: Không cần phải lo lắng đâu.\n" +
                    "\n" +
                    "- It won't be as difficult as you think: Nó sẽ không khó khăn như bạn nghĩ đâu.\n" +
                    "\n" +
                    "- It will all be fine in the end: Mọi chuyện sẽ ổn thôi.\n" +
                    "\n" +
                    "- You'll find a way through this, I'm sure: Bạn sẽ tìm ra cách để vượt qua thôi, tôi chắc chắn là vậy.\n" +
                    "\n" +
                    "Cuối cùng, để bày tỏ sự ủng hộ của mình, người nói có thể nói những lời động viên:\n" +
                    "\n" +
                    "We'll all be rooting for you: Chúng tôi sẽ ủng hộ bạn.\n" +
                    "\n" +
                    "We'll be cheering you on: Chúng tôi sẽ cổ vũ cho bạn.\n" +
                    "\n" +
                    "Is there anything I/we can do to help?: Tôi/chúng tôi có thể làm gì để giúp bạn không?",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/10/open-id-3306-1731218514.png?w=300&h=180&q=100&dpr=1&fit=crop&s=7NsZRtvEv8H9dSjmaJ97Fg",
            "1 giờ trước",
            "Học tiếng anh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Phân biệt 'color' và 'collar'",
            "'Color' (màu sắc) và 'collar' (cổ áo) chỉ khác nhau một âm, làm thế nào để phân biệt và nói đúng hai từ này.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/07/color-1730971456-1730971471-2803-1730971577.png?w=300&h=180&q=100&dpr=1&fit=crop&s=gjK7E_f3IznUTqMstMKjPg",
            "2 giờ trước",
            "Học tiếng anh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "4 từ tiếng Anh về bầu cử tổng thống Mỹ",
            "'Election day', 'the polls', 'swing states'... được nhắc đến nhiều trong ngày 5/11, khi người dân Mỹ bỏ phiếu để định đoạt người trở thành tổng thống.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/06/tranhluantrumpharris7877172870-4487-5052-1730869603.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=dw_YAbwho3tb8SaYU4t-5w",
            "3 giờ trước",
            "Học tiếng anh",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}

fun getGiaoDucNew(): List<Post> {
    return listOf(
        Post(
            1,
            "Nam sinh 15 tuổi học FUNiX Wings theo đuổi ngành công nghệ thông tin",
            "Nguyễn Hoàng Minh (15 tuổi, Thanh Hóa) được bố mẹ ủng hộ theo học khóa FUNiX Wings để theo đuổi ngành công nghệ thông tin khi vào đại học.\n" +
                    "\n" +
                    "Ngay từ những năm đầu cấp hai, Hoàng Minh đã thể hiện niềm yêu thích với công nghệ. Cậu thích mày mò tìm hiểu về game, mạng, máy tính thông qua Internet. Minh đặc biệt yêu thích và có năng khiếu với môn Tin học ở trường, thường tự tìm hiểu trên Youtube và các diễn đàn về lập trình.\n" +
                    "\n" +
                    "Nhận thấy thiên hướng của con nên bố mẹ Hoàng Minh đã khuyến khích và ủng hộ. Chị Lê Thị Hồng Vân, mẹ của nam sinh cho biết gia đình tạo mọi điều kiện để con học tập và phát triển theo đúng khả năng, sở thích. Biết con mê Tin học nhưng chị không hiểu nhiều về ngành này. Vì thế, người mẹ đã bỏ công tìm hiểu về các khóa học để giúp con có một hành trang tốt hơn cho tương lai." +
                    "Biết đến FUNiX và khóa học Wings dành cho lứa tuổi học sinh, chị Hồng Vân nhận thấy đây là chương trình học phù hợp với con mình. \"Con có thể học online bài bản và hệ thống những kiến thức về công nghệ thông tin với kiến thức cập nhật và thực tế, từ đó hiểu hơn về công nghệ thông tin, phát huy thế mạnh và bồi đắp sở thích sẵn có. Đồng thời, con cũng có thể tích lũy dần những tín chỉ để chuyển tiếp đại học nếu muốn\", người mẹ nhận định.\n" +
                    "\n" +
                    "Nhập học ngày 23/9, Minh làm quen với mô hình học tập hoàn toàn mới. Một tuần 5 buổi, Minh sẽ vào Zoom để học với các mentor. Hai môn học đầu tiên của Minh là Kiến thức cơ bản về ngành Công nghệ thông tin (IT Fundamental) và Trợ lý AI trong công nghệ thông tin (AI Assistant in IT).\n" +
                    "\n" +
                    "Minh chia sẻ, lúc đầu cậu có chút hụt hẫng vì cách học mới yêu cầu sự chủ động cao, thầy cô ít khi nói chuyện và tương tác với học sinh. Nhưng khi học đủ lâu cậu thấy thú vị.\n" +
                    "\n" +
                    "Các video bài giảng bằng tiếng Anh, có phụ đề tiếng Việt và cậu có thể tua để xem lại bất kỳ chỗ nào nếu chưa hiểu. Trong giờ học 45 phút, Minh được trả lời những câu hỏi mang tính thực hành, áp dụng kiến thức ngay khiến buổi học không quá cứng nhắc. \"Kèm theo đó là sự giúp đỡ từ các mentor và việc kiểm tra lại kiến thức sau khi học đã khiến cho buổi học không bị nhàm chán, lại dễ hiểu\", Minh cho biết.\n" +
                    "\n" +
                    "Hiện học lớp 10A4, trường THPT Đông Sơn 1, Minh cân đối học công nghệ với lịch ở trường để theo học hiệu quả. Cậu học trò 15 tuổi cũng phải bố trí để làm bài, học bài đầy đủ, đảm bảo cả trên lớp lẫn FUNiX. Đôi khi cậu gặp phải những thách thức về mặt kiến thức như bài khó học, hay các lỗi kỹ thuật trong khi làm bài tập. Để khắc phục, cậu xem kỹ các video bài giảng, dành thời gian để nghiền ngẫm kiến thức và đặt câu hỏi, nhờ mentor trợ giúp ngay khi có vấn đề.\n" +
                    "\n" +
                    "\"Các mentor hỗ trợ em tận tình. Đôi khi, các thầy cô mentor còn tỉ mỉ chụp từng bước cách làm để em có thể thực hiện bằng được\", Minh chia sẻ.\n" +
                    "\n" +
                    "Nhờ nỗ lực của bản thân và sự nhiệt tình giúp đỡ của hannah, mentor, Hoàng Minh đã nắm bắt tốt kiến thức của cả hai môn học đầu tiên trong chương trình Wings. Ở môn một - Kiến thức cơ bản về ngành CNTT, Minh hiểu hơn về cấu trúc máy tính, mạng Internet, cách sử dụng Internet an toàn, hiệu quả. Môn học giúp cậu có cái nhìn rộng hơn về ngành, từ đó hiểu cách vận hành và tổ chức trong công việc về IT và nhìn thấy rõ hơn định hướng nghề nghiệp của bản thân muốn trở thành lập trình viên thì cần chuẩn bị những gì, vị trí này có cơ hội ra sao trong tương lai.\n" +
                    "\n" +
                    "Ở môn học thứ hai là Trợ lý AI trong CNTT, Minh ấn tượng phần nội dung về AI và chatbot. Qua các bài giảng, cậu học trò cảm thấy bất ngờ trước những thông tin, kiến thức bổ ích về các công cụ AI như ChatGPT, Midjourney và nhiều công cụ AI phổ biến khác.\n" +
                    "\n" +
                    "\"Càng học em càng cảm thấy thú vị trước sức mạnh và công dụng thực sự của những ứng dụng Trí tuệ nhân tạo này nếu chúng được dùng đúng cách. Học online nhưng cách học mới mẻ, thú vị khiến em tin rằng mình có thể chinh phục tốt những môn học tiếp theo dù chúng có khó hơn\", Minh nói.\n" +
                    "\n" +
                    "Sau hai tháng cho con học FUNiX, chị Hồng Vân, mẹ của Minh nhận thấy con trai học tập trung, tự giác và hiệu quả. Con thường chia sẻ về những kiến thức hay ho mình học được, chẳng hạn như các kiến thức về AI.\n" +
                    "\n" +
                    "\"Con trở nên tích cực và vui vẻ. Giờ học cũng vào những khung giờ phù hợp, không ảnh hưởng đến việc học ở trường của con. Mong rằng FUNiX Wings sẽ giúp con ngày càng tự tin hơn, không còn bỡ ngỡ khi vào đại học\", chị Hồng Vân chia sẻ.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/07/Image-986679571-ExtractWord-0-6858-1897-1730948621.png?w=680&h=0&q=100&dpr=1&fit=crop&s=Q1ki4OFcm2D3zgMZFOtblA",
            "1 giờ trước",
            "Giáo dục 4.0",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            2,
            "Nam sinh chuyên Toán học trực tuyến nuôi ước mơ lập trình viên giỏi",
            "Nguyễn Văn Tú chinh phục thành công khóa Khoa học máy tính với Python tại FUNiX sau 3 tháng học, thỏa đam mê với lập trình và biết thêm nhiều kiến thức mới.\n" +
                    "\n" +
                    "Trong thời đại công nghệ số phát triển, kỹ năng lập trình đã không chỉ dành riêng cho người lớn hoặc chuyên gia công nghệ, việc học sinh học lập trình đã trở thành xu hướng giáo dục toàn cầu hiện nay. Sớm nhận biết điều này, bố mẹ của Nguyễn Văn Tú đã ủng hộ con trai khi cậu muốn theo học lập trình tại FUNiX qua lời giới thiệu của một người bạn.\n" +
                    "\n" +
                    "\"Hai vợ chồng đều làm nông nghiệp, không có kiến thức về công nghệ thông tin, nhưng con rất đam mê nên gia đình sẵn sàng đầu tư cho con theo học. Mong sau này con có thể ứng dụng công nghệ vào công việc, cuộc sống để đỡ vất vả\", anh Nguyễn Văn Chúc, bố của Tú nói." +
                    "Từ nhỏ, Nguyễn Văn Tú đã yêu thích công nghệ thông tin. Cậu học sinh lớp 10 chuyên Toán, trường THPT Chuyên Sơn La, tỉnh Sơn La thường tự học qua sách vở hoặc xem hướng dẫn code trên Internet. Cậu thần tượng chuyên gia công nghệ hàng đầu Việt Nam như anh Nguyễn Hà Đông - \"cha đẻ\" của game Flappy bird, hay những doanh nhân công nghệ nổi tiếng thế giới như tỷ phú Bill Gates - Đồng sáng lập Tập đoàn Microsoft, Steve Jobs - cựu tổng giám đốc điều hành của Apple.\n" +
                    "\n" +
                    "Văn Tú thừa nhận, điều thu hút cậu là những thách thức kỹ thuật phức tạp, đòi hỏi khả năng tư duy logic, sáng tạo, logic và giải quyết vấn đề cùng sự kiên nhẫn để có thể tìm ra giải pháp xử lý.\n" +
                    "\n" +
                    "Trước FUNiX, Tú đã tiếp xúc với lập trình thông qua chương trình học ở trên trường và cậu tự mày mò thêm qua Youtube. Từ khi bắt đầu khoá học Khoa học máy tính với Python, mỗi tuần Tú dành ba buổi học lập trình Code Combat cùng mentor. Luôn hứng thú với các giờ học nên cậu không muốn nghỉ buổi học nào. Vì vậy, Tú sắp xếp lịch học phù hợp để không bị chồng chéo với lịch học trên lớp.\n" +
                    "\n" +
                    "\"Chương trình học rất thú vị, không hề khó dù học online. Hấp dẫn nhất với em là việc mentor cho học kiến thức và thực hành xen kẽ nhau nên em hiểu bài khá nhanh. Thầy dạy cũng nhiệt tình và sẵn sàng giải đáp mọi thắc mắc khi em gặp bài khó\", Tú chia sẻ." +
                    "Cậu bạn cho biết thêm, cậu luôn đọc kỹ lý thuyết trước mỗi buổi học để có thể làm thực hành tốt. Ngoài học zoom cùng thầy giáo, nếu bài tập chưa hoàn thành Tú sẽ dành thêm thời gian để nghĩ các dòng code phù hợp cho bài tập của buổi đó.\n" +
                    "\n" +
                    "Trải qua ba học phần của khoá học một cách nhanh chóng, cậu bạn lớp 10 luôn thấy hứng thú với mỗi kiến thức mới về công nghệ. Trong các dự án đã làm được, cậu tâm đắc nhất khi làm ra một màn chơi gần giống với game Flappy bird. \"Học FUNiX giúp em hiểu được cách các dòng code hoạt động ra sao cũng như luyện cho em biết cách xử lý tình huống với các bài tập đa dạng\", nam sinh chuyên Toán nói thêm.\n" +
                    "\n" +
                    "Sau khi hoàn thành khóa học, Tú cho biết muốn tiếp tục chinh phục các khóa học IT khác ở FUNiX, để trau dồi thêm nhiều kiến thức mới và nâng cao hơn. Cậu chia sẻ mơ ước trở thành một một lập trình viên giỏi để có thể tạo ra nhiều sản phẩm hữu ích cho cuộc sống.\n" +
                    "\n" +
                    "Đồng hành cùng Tú trong khoá học, mentor Minh Mẫn dành nhiều lời khen ngợi cho cậu học trò nhỏ: \"Tú rất đam mê với việc học, đặc biệt là trong lĩnh vực lập trình. Với khả năng thao tác nhanh nhẹn và thông minh, Tú luôn hoàn thành xuất sắc các cấp độ. Từ CS1 đến CS3, Tú không chỉ nắm vững các lý thuyết mà còn chinh phục được nhiều level và thử thách trong Codecombat. Sự nỗ lực không ngừng của Tú chắc chắn sẽ mang lại nhiều thành công\".\n" +
                    "\n" +
                    "Dù công việc bận rộn, bố mẹ Tú luôn quan tâm và ủng hộ đam mê của con trai. Anh Nguyễn Chúc thấy hài lòng khi con luôn tự giác, chủ động và yêu thích việc học công nghệ thông tin. Anh cũng đánh giá cao và hài lòng trước sự sát sao của mentor và quyết định cho Tú học thêm những khóa học nâng cao tại \"trường mây\" trước khi bước vào hệ đại học, để con có thể theo đuổi sở thích với IT, có định hướng rõ ràng hơn cho công việc tương lai.",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/05/g2-1730771204-4686-1730771236.jpg?w=300&h=180&q=100&dpr=1&fit=crop&s=9t2u9sNme_qDUewXC7t1ng",
            "2 giờ trước",
            "Giáo dục 4.0",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        ),
        Post(
            3,
            "AHT Tech hợp tác FUNiX tìm kiếm nguồn nhân lực IT chất lượng",
            "AHT Tech hợp tác chiến lược về đào tạo và tuyển dụng với FUNiX ngày 28/10, mục tiêu đón đầu nguồn nhân sự chất lượng, đồng thời góp phần đào tạo nhân lực ngành CNTT.\n" +
                    "\n" +
                    "Theo thỏa thuận hợp tác giữa hai đơn vị trong tháng 10, Công ty Cổ phần AHT Tech sẽ cử các chuyên gia giàu kinh nghiệm tham gia làm người định hướng (mentor), đóng góp phát triển chương trình đào tạo bám sát nhu cầu và xu hướng thị trường. Doanh nghiệp cũng mở rộng cơ hội thực tập và làm việc với học viên tiềm năng.\n" +
                    "\n" +
                    "Ông Nguyễn Mạnh Hà - Tổng giám đốc công ty đánh giá cao mô hình đào tạo trực tuyến cũng như chất lượng nguồn đào tạo từ FUNiX. Bởi lẽ, hình thức đào tạo online này không chỉ đón đầu xu thế của tương lai, mà còn đáp ứng những yêu cầu tất yếu trong ngành IT như độ cập nhật nhanh chóng, tính thực tiễn cao. Đặc biệt, mô hình học với mentor mang đến cơ hội tiếp cận với những chuyên gia giàu kinh nghiệm, giúp người học tiếp thu kiến thức hiệu quả, đồng thời được trang bị những góc nhìn thực tế về doanh nghiệp, việc làm." +
                    "\"AHT Tech từng tiếp nhận và tuyển dụng nhiều học viên FUNiX, qua đó nhận thấy các bạn đều có thái độ làm việc nghiêm túc, chí tiến thủ và khả năng thực chiến cao. Giữa hai đơn vị có nhiều điểm tương đồng, phù hợp, là cơ sở để công ty mong muốn trở thành đối tác chiến lược của FUNiX trong đào tạo, tuyển dụng\", ông Mạnh Hà khẳng định.\n" +
                    "\n" +
                    "Thông qua hợp tác, công ty mong muốn có thể mở rộng nguồn nhân lực chất lượng, chuẩn bị cho những bước phát triển trong thời gian tới. Cụ thể, AHT Tech đang tuyển dụng hàng chục vị trí IT ở các level khác nhau, chú trọng các kỹ năng chuyên môn như lập trình Python, Odoo, JS, .Net, Java...\n" +
                    "\n" +
                    "\"Công ty đánh giá cao các ứng viên có nền tảng kiến thức chuyên môn vững vàng cùng kỹ năng mềm quan trọng như: kỹ năng tự học, kỹ năng giao tiếp, tinh thần chủ động cao\", chị Đỗ Minh Phượng, Giám đốc Nhân sự AHT Tech chia sẻ.\n" +
                    "\n" +
                    "Cũng theo chị Phượng, dải lương tại AHT Tech ở mức 8 - 15 triệu đồng một tháng với cấp bậc fresher và junior, 13 - 25 triệu đồng một tháng với cấp bậc middle, 25 - 45 triệu đồng một tháng với cấp bậc senior và có thể đến trên 80 triệu đồng một tháng với các vị trí cấp cao hơn như Techlead, Solution Architect... Ngoài lương, thưởng tháng 13, công ty còn nhiều đãi ngộ như thưởng hiệu quả công việc; du lịch, teambuilding, đào tạo nội bộ về kỹ năng mềm, kỹ năng chuyên môn hay hỗ trợ tài chính để nhân viên học các chứng chỉ quốc tế..." +
                    "Tại lễ ký kết, ông Nguyễn Thành Nam, nhà sáng lập FUNiX đánh giá cao cơ hội hợp tác cùng AHT Tech. Ông tin tưởng điều này có thể mở rộng cơ hội việc làm công nghệ cho sinh viên. Thỏa thuận hợp tác nằm trong Chương trình FUNiX Industrial Partnership do FUNiX triển khai với các doanh nghiệp IT, giúp học viên có môi trường học tập gắn với thực tiễn, để từ đó sớm tự tin trên hành trình định hướng nghề nghiệp tương lai.\n" +
                    "\n" +
                    "Thành lập từ tháng 8/2007, AHT Tech hiện là một trong những công ty đa quốc gia, thuộc top đầu lĩnh vực cung cấp giải pháp tư vấn công nghệ toàn diện tập trung vào ngành thương mại và trải nghiệm Số. Công ty hiện có hơn 400 nhân sự, 9 chi nhánh và văn phòng đại diện ở Việt Nam, Nhật Bản, Mỹ, Đức, Thụy Điển và Australia với hơn 1.000 khách hàng và hàng nghìn dự án thành công trong và ngoài nước. Công ty được các đối tác đánh giá cao bởi các giải pháp hàng đầu như: Odoo, Acumatica, Liferay, Salesforce, Magento, BigCommerce, Larksuite, Zoho... Năm 2021, AHT Tech đã được vinh danh trong giải thưởng Doanh nghiệp vừa và nhỏ xuất sắc châu Á năm (SME100 Awards 2021).\n" +
                    "\n" +
                    "Trong tương lai gần, AHT Tech sẽ đẩy mạnh phát triển các giải pháp ERP, eCommerce, Customer Experience, Digital Workplace đa lĩnh vực tại thị trường Việt Nam, Malaysia, Australia, Mỹ, Hong Kong, Singapore...",
            "https://vcdn1-vnexpress.vnecdn.net/2024/11/04/Image-ExtractWord-0-Out-5822-1730685735.png?w=300&h=180&q=100&dpr=1&fit=crop&s=is6bITQ8qdEUrniewHhgNQ",
            "3 giờ trước",
            "Giáo dục 4.0",
            "Thứ 4, 06/11/2024 03:07 (GMT+7)"
        )
    )
}