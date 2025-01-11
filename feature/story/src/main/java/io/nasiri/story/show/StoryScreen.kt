package io.nasiri.story.show

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.R
import io.nasiri.common.button.Button
import io.nasiri.common.chatbox.ChatBox

@Composable
fun StoryScreen(modifier: Modifier = Modifier) {
    Scaffold {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
        ) {

            Button(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(14.dp),
                icon = R.drawable.ic_close
            ) { }
            UserProfile(modifier = Modifier.padding(14.dp))
            ChatBox(modifier = Modifier.align(Alignment.BottomCenter))

        }


    }
}

@Composable
fun UserProfile(modifier: Modifier = Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        Box(
            modifier = Modifier
                .size(40.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary)
                .border(1.dp, MaterialTheme.colorScheme.onPrimary, CircleShape)
        )
        Spacer(modifier = Modifier.width(6.dp))
        Text(text = "Morina Ghose", fontSize = 12.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.width(2.dp))
        Text(text = "1h", fontSize = 8.sp)
    }
}
