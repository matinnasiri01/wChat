package io.nasiri.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Icon
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
import io.nasiri.common.head.MainHeader
import io.nasiri.common.items.CCI
import io.nasiri.common.items.NSI

@Composable
fun HomeScreen() {
    Scaffold(topBar = { MainHeader() }) { inner ->
        LazyColumn(
            modifier = Modifier.padding(inner), verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            item {
                StorySection()
            }
            item {
                MainChatContent()
            }
        }
    }
}


@Composable
fun StorySection(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(horizontal = 10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text(text = "Story", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        LazyRow(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
            items(6) {
                NSI()
            }
        }
    }
}

@Composable
fun MainChatContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(topStart = 60f, topEnd = 60f))
            .background(Color.LightGray)
            .padding(horizontal = 10.dp)
    ) {
        Spacer(modifier = Modifier.height(10.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth(.2f)
                .height(2.dp)
                .clip(CircleShape)
                .background(Color.Gray)
                .align(Alignment.CenterHorizontally)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "Recent Chat", fontSize = 20.sp, fontWeight = FontWeight.Bold)
            Row(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Green.copy(.3f))
                    .padding(horizontal = 12.dp, vertical = 6.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier.size(14.dp),
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = null
                )
                Text(
                    modifier = Modifier.padding(start = 4.dp),
                    text = "Archive Chat",
                    fontSize = 14.sp
                )
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        repeat(10) {
            CCI()
        }
    }

}