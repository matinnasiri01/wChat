package io.nasiri.common.items

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.profile.Profile

val lightStyle = TextStyle(color = Color.Gray, fontSize = 14.sp)

@Composable
fun CCI(modifier: Modifier = Modifier) {

    val profileIcon = Icons.Default.Person
    val profileColor = Color(0x64D1B38C)
    val name = "Matin Nasiri"
    val lastMessage = "Hi Alex!"
    val lastTimeSendMessage = "00:02"
    val haveNewMessage = true

    Row(
        modifier = modifier
            .fillMaxWidth()
            .height(72.dp)
            .padding(horizontal = 4.dp)
            .drawWithContent {
                drawContent()
                drawLine(
                    Color.LightGray, Offset(10f, size.height), Offset(size.width - 10f, size.height)
                )
            }, verticalAlignment = Alignment.CenterVertically
    ) {

        Profile()

        Box(
            modifier = Modifier
                .fillMaxHeight(.6f)
                .weight(1f)
                .padding(start = 10.dp)
        ) {

            Text(modifier = Modifier, text = name, fontWeight = FontWeight.Bold)
            Text(
                modifier = Modifier.align(Alignment.BottomStart),
                text = lastMessage,
                style = lightStyle
            )
            Text(
                modifier = Modifier.align(Alignment.TopEnd),
                text = lastTimeSendMessage,
                style = lightStyle,
                textAlign = TextAlign.End
            )
            Text(
                modifier = Modifier.align(Alignment.BottomEnd),
                text = if (haveNewMessage) "\uD83D\uDFE3" else "",
                fontSize = 6.sp,
                textAlign = TextAlign.End
            )
        }
    }
}