package io.nasiri.wchat

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import dagger.hilt.android.AndroidEntryPoint
import io.nasiri.common.fab.FABMain
import io.nasiri.common.head.MainHeader
import io.nasiri.common.navigation.BottomNavigation
import io.nasiri.groups.GroupsScreen
import io.nasiri.wchat.ui.theme.WChatTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WChatTheme {
                Scaffold(
                    topBar = { MainHeader() },
                    bottomBar = {  BottomNavigation()},
                    floatingActionButton = { FABMain() },
                    floatingActionButtonPosition = FabPosition.EndOverlay,
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .padding(innerPadding)
                            .padding(horizontal = 10.dp)
                    ) {
                        GroupsScreen()
                    }
                }
            }
        }
    }
}