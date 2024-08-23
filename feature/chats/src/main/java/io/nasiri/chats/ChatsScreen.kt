package io.nasiri.chats

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DividerDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import io.nasiri.chats.chats.RecentChats
import io.nasiri.chats.stories.Stories

@Composable
fun ChatsScreen() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        Stories()
        HorizontalDivider(
            modifier = Modifier
                .padding(vertical = 24.dp)
                .fillMaxWidth(.9f),
            color = DividerDefaults.color.copy(alpha = .3f)
        )
        RecentChats()
    }
}
