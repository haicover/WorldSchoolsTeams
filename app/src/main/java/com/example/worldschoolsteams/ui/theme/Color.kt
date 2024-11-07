package com.example.worldschoolsteams.ui.theme

import androidx.compose.ui.graphics.Color
import com.google.firebase.annotations.concurrent.Background

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val LightGreen = Color(0xFF8DA25A)
val DarkGreen = Color(0xFF2D321D)


sealed class ThemeColors(
    val background: Color,
    val surface:Color,
    val primary:Color,
    val text:Color
){
    data object Night:ThemeColors(
        background = Color(0xff000000),
        surface = Color(0xff000000),
        primary = Color(0xff4fb64c),
        text = Color(0xffffffff)
    )
    data object Day:ThemeColors(
        background = Color(0xffffffff),
        surface = Color(0xffffffff),
        primary = Color(0xffffc107),
        text = Color(0xff000000)
    )
}