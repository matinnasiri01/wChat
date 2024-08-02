package io.nasiri.chats

import androidx.compose.runtime.Composable
import io.nasiri.chats.chats.RecentChats
import io.nasiri.chats.stories.Stories

@Composable
fun ChatsScreen() {
    Stories()
    RecentChats()
}