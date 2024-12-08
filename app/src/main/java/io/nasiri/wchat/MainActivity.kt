package io.nasiri.wchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import dagger.hilt.android.AndroidEntryPoint
import io.nasiri.chat.ChatBox
import io.nasiri.common.prsetting.PSS
import io.nasiri.story.show.SSS
import io.nasiri.wchat.ui.theme.WChatTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            WChatTheme {
                SSS()
            }
        }
    }
}