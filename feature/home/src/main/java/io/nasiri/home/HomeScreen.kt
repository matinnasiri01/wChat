package io.nasiri.home

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.R
import io.nasiri.common.chatitem.ChatItem
import io.nasiri.common.storyitem.StoryItem

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold {
        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
                .padding(horizontal = 14.dp)
                .padding(top = 16.dp)
        ) {
            Header()
            Spacer(modifier = Modifier.height(46.dp))
            Story()
            Spacer(modifier = Modifier.height(16.dp))
            Chat()
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun Header(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(text = "WCHAT", fontSize = 32.sp, fontWeight = FontWeight.Bold)
        Row {
            Box(
                modifier = Modifier
                    .size(42.dp)
                    .clip(CircleShape)
                    .background(Color.Black)
                    .clickable { }, contentAlignment = Alignment.Center
            ) {
                Icon(
                    tint = Color.White,
                    painter = painterResource(id = R.drawable.ic_notification),
                    contentDescription = null
                )
            }
            Spacer(modifier = Modifier.width(10.dp))
            Box(modifier = Modifier
                .size(42.dp)
                .clip(CircleShape)
                .background(Color.Black)
                .clickable { })
        }
    }
}

@Composable
fun Story(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {

        Text(text = "Story", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(rememberScrollState()),
            horizontalArrangement = Arrangement.spacedBy(6.dp)
        ) {
            repeat(6) {
                repeat(6) {
                    StoryItem()
                }
            }

        }
    }
}

@Composable
fun Chat(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Text(text = "Recent Chat", fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(16.dp))
        repeat(6) {
            ChatItem()
            Spacer(modifier = Modifier.height(10.dp))
        }

    }
}