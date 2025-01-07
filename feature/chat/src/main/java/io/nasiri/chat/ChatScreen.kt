package io.nasiri.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.button.Button
import io.nasiri.common.chatbox.ChatBox
import io.nasiri.common.R
import io.nasiri.common.chatitem.DayTag
import io.nasiri.common.chatitem.ItemSender

@Composable
fun ChatScreen(modifier: Modifier = Modifier) {
    Scaffold {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
        ) {

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(rememberScrollState())
                    .align(Alignment.BottomCenter)
                    .padding(horizontal = 14.dp)
                    .padding(bottom = 66.dp, top = 80.dp)
            ) {
                ItemSender()
                ItemSender()
                DayTag()
                ItemSender(test = false)
                ItemSender(test = false)
                ItemSender(test = false)
                ItemSender()
                DayTag()
                ItemSender(test = false)
                ItemSender(test = false)
                ItemSender()
                DayTag()
                ItemSender(test = false)
                ItemSender(test = false)
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(14.dp)
            ) {
                Button(icon = R.drawable.ic_arrow) { }
                Row(
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .weight(2f)
                        .height(60.dp)
                        .clip(RoundedCornerShape(16.dp))
                        .background(Color.Black)
                        .clickable { },
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Spacer(modifier = Modifier.width(20.dp))
                    Box(
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .border(
                                1.dp, Color.Red, CircleShape
                            )
                            .background(Color.White)
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Matin Nasiri",
                        color = Color.White,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                    Text(
                        text = "Online", color = Color.White, fontSize = 8.sp
                    )
                }
                Button(icon = R.drawable.ic_more) { }
            }
            ChatBox(modifier = Modifier.align(Alignment.BottomCenter))
        }
    }
}
