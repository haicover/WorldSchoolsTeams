package com.example.worldschoolsteams.ui.screen.game

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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.worldschoolsteams.R


@Composable
fun GamesScreen(navController: NavHostController) {
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
                painter = painterResource(id = R.drawable.logo1),
                contentDescription = "Logo",
                modifier = Modifier
                    .size(30.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Text(
                text = "Trò chơi",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xff8B2323)
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
        //Game Snake
        Row(
            modifier = Modifier
                .clickable { }
                .border(
                    BorderStroke(1.dp, Color(0x80A9A9A9)),
                    shape = RoundedCornerShape(5.dp)
                )
                .clip(RoundedCornerShape(5.dp)),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.gamesnake),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp),
            )
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .weight(0.3f),
            ) {
                Text(
                    text = "Game Snake",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.Bottom)
                    .padding(end = 20.dp, bottom = 20.dp)
            ) {
                Row(
                    modifier = Modifier
                        .width(70.dp)
                        .height(30.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xffFF9800))
                        .clickable(onClick = {navController.navigate("gameSnake")}),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Person Icon",
                        tint = Color(0xFFffffff)
                    )
                    Text(
                        text = "Chơi",
                        fontSize = 12.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(start = 5.dp)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        //Game Tic tac toe
        Row(
            modifier = Modifier
                .clickable { }
                .border(
                    BorderStroke(1.dp, Color(0x80A9A9A9)),
                    shape = RoundedCornerShape(5.dp)
                )
                .clip(RoundedCornerShape(5.dp)),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.gametictactoe),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp),
            )
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .weight(0.3f),
            ) {
                Text(
                    text = "Game Tic tac toe",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.Bottom)
                    .padding(end = 20.dp, bottom = 20.dp)
                    .border(
                        BorderStroke(1.dp, Color(0x80A9A9A9)),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .padding(3.dp)
                        .width(100.dp)
                        .height(30.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xffFFffff))
                        .clickable(onClick = {}),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Person Icon",
                        tint = Color(0xFF000000)
                    )
                    Text(
                        text = "Sắp ra mắt",
                        fontSize = 12.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        //Game Sudoku
        Row(
            modifier = Modifier
                .clickable { }
                .border(
                    BorderStroke(1.dp, Color(0x80A9A9A9)),
                    shape = RoundedCornerShape(5.dp)
                )
                .clip(RoundedCornerShape(5.dp)),
            horizontalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = painterResource(id = R.drawable.gamesudoku),
                contentDescription = "Logo",
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp),
            )
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .weight(0.3f),
            ) {
                Text(
                    text = "Game Sudoku",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000),
                )
            }
            Box(
                modifier = Modifier
                    .align(Alignment.Bottom)
                    .padding(end = 20.dp, bottom = 20.dp)
                    .border(
                        BorderStroke(1.dp, Color(0x80A9A9A9)),
                        shape = RoundedCornerShape(20.dp)
                    )
            ) {
                Row(
                    modifier = Modifier
                        .padding(3.dp)
                        .width(100.dp)
                        .height(30.dp)
                        .clip(RoundedCornerShape(20.dp))
                        .background(Color(0xffFFffff))
                        .clickable(onClick = {}),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Icon(
                        imageVector = Icons.Default.PlayArrow,
                        contentDescription = "Person Icon",
                        tint = Color(0xFF000000)
                    )
                    Text(
                        text = "Sắp ra mắt",
                        fontSize = 12.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.weight(1f)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewGameList() {
    GamesScreen(navController = rememberNavController())
}


