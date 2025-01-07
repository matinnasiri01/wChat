package io.nasiri.common.chatitem

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ColumnScope.ItemSender(modifier: Modifier = Modifier, test: Boolean = true) {
    val ali = if (test) Alignment.End else Alignment.Start
    val pointer = if (test) Pair(0f, 32f) else Pair(32f, 0f)
    Column(modifier = modifier.align(ali)) {
        Text(
            text = "Hello",
            color = Color.White,
            modifier = Modifier
                .clip(RoundedCornerShape(32f, 32f, pointer.first, pointer.second))
                .background(Color.Black)
                .padding(14.dp, 10.dp)
        )
        Text(text = "02:34", fontSize = 6.sp, modifier = Modifier.align(ali))
    }
}


@Composable
fun ColumnScope.DayTag(modifier: Modifier = Modifier) {
    Text(
        text = "Today",
        color = Color.White,
        modifier = modifier
            .align(Alignment.CenterHorizontally)
            .clip(RoundedCornerShape(32f))
            .background(Color.Black)
            .padding(14.dp, 10.dp)
    )
}