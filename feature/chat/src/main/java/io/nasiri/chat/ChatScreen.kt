package io.nasiri.chat

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import io.nasiri.common.constants.Constants.BackGroundShape
import io.nasiri.common.head.ChatHeader
import io.nasiri.common.items.lightStyle

@Composable
fun ChatScreen(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier,
        topBar = { ChatHeader() },
        bottomBar = { ChatBox() }
    ) { inn ->

        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(inn)
                .clip(BackGroundShape)
                .background(Color.Blue.copy(.4f))
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            TextTime()
            ChatItem(text = "Hi Alex!", isMe = true)
            ChatItem(text = "Hi Matin")
            ChatItem(text = "what's up?")
        }

    }

}

@Composable
fun ColumnScope.TextTime(
    modifier: Modifier = Modifier, time: String = "Today"
) {
    Text(
        text = time,
        modifier = modifier
            .padding(bottom = 10.dp)
            .align(Alignment.CenterHorizontally)
            .clip(RoundedCornerShape(30.dp))
            .background(Color.LightGray.copy(.9f))
            .padding(horizontal = 20.dp, vertical = 12.dp)
    )
}


@Composable
fun ColumnScope.ChatItem(modifier: Modifier = Modifier, text: String, isMe: Boolean = false) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier
            .align(if (isMe) Alignment.End else Alignment.Start)
            .padding(horizontal = 10.dp)
            .padding(bottom = 8.dp),
    ) {
        Text(
            text = text,
            modifier = Modifier
                .clip(RoundedCornerShape(30.dp))
                .background(Color.LightGray.copy(.9f))
                .padding(horizontal = 20.dp, vertical = 12.dp)
        )
        Text(
            modifier = Modifier.align(if (isMe) Alignment.End else Alignment.Start),
            text = "01:24",
            style = lightStyle
        )
    }
}