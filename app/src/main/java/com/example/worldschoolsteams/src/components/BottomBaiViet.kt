package com.example.worldschoolsteams.src.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.worldschoolsteams.R


@Composable
    Row(
        modifier = Modifier
            .fillMaxWidth()
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Icon Search
            Icon(
                imageVector = Icons.Default.ArrowBack,
                tint = Color.Gray,
                modifier = Modifier.size(25.dp)
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(0.dp),
            modifier = Modifier.padding(end = 15.dp)
        ) {
            IconButton(onClick = {}) {
                Text(
                    "Aa",
                    fontStyle = FontStyle.Normal,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    fontSize = 25.sp
                )
            }
                Icon(
                    painter = painterResource(id = R.drawable.message),
                    contentDescription = "comment Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(25.dp)
                )
            }
            IconButton(onClick = { /* Do something when notification icon is clicked */ }) {
                Icon(
                    painter = painterResource(id = R.drawable.bookmark),
                    contentDescription = "luu Icon",
                    tint = Color.Gray,
                    modifier = Modifier.size(25.dp)
                )
            }
        Icon(
            painter = painterResource(id = R.drawable.chiase),
            tint = Color.Gray,
            modifier = Modifier.size(25.dp)
        )
    }
}
        }


@Preview(showBackground = true)
@Composable
fun PreviewBottomBaiViet() {
}