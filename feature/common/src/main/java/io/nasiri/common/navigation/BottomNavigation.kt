package io.nasiri.common.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigation(icons: List<Int> = listOf(1, 2, 3)) {
    var nIndex = 0
    NavigationBar(modifier = Modifier.clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp))) {
        icons.forEachIndexed { index, i ->
            NavigationBarItem(
                selected = nIndex == index,
                onClick = { nIndex = index },
                icon = {
                    Icon(imageVector = Icons.Default.Home, contentDescription = null)
                }
            )
        }
    }

}