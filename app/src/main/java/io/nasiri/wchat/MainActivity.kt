package io.nasiri.wchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import dagger.hilt.android.AndroidEntryPoint
import io.nasiri.chat.ChatScreen
import io.nasiri.home.HomeScreen
import io.nasiri.wchat.ui.theme.WChatTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WChatTheme {
                ChatScreen()
            }
        }
    }
}