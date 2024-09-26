package com.example.worldschoolsteams.ui.screen.podcasts

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.worldschoolsteams.R
import com.example.worldschoolsteams.src.model.PodcastItem

//class PodcastViewModel : ViewModel() {
//    private val _podcasts = mutableStateListOf<PodcastItem>()
//    val podcasts: List<PodcastItem> get() = _podcasts
//
//    init {
//        // Fetch data from API or local database
//        _podcasts.addAll(
//            listOf(
//                PodcastItem(
//                    1,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 1",
//                    "Description 1"
//                ),
//
//                PodcastItem(
//                    2,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 2",
//                    "Description 2"
//                ),
//                PodcastItem(
//                    3,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 3",
//                    "Description 3"
//                ),
//                PodcastItem(
//                    4,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 4",
//                    "Description 4"
//                ),
//                PodcastItem(
//                    5,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 5",
//                    "Description 5"
//                ),
//                PodcastItem(
//                    6,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 6",
//                    "Description 6"
//                ),
//                PodcastItem(
//                    7,
//                    "https://music.youtube.com/watch?v=DP8994i2yKA&si=oj4AHbSiYCgc3vxM",
//                    "https://vcdn1-vnexpress.vnecdn.net/2024/10/25/img-5195-jpg-1729783179-3183-1-2050-9655-1729789745.jpg?w=220&h=132&q=100&dpr=1&fit=crop&s=QoOKaU2h9tbwiTvArJR8VQ",
//                    "Podcast 7",
//                    "Description 7"
//                )
//            )
//        )
//    }
//}

