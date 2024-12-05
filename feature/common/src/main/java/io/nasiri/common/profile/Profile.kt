package io.nasiri.common.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun Profile(
    modifier: Modifier = Modifier,
    profileSize: Dp = 52.dp,
    profileColor: Color = Color(0x64D1B38C),
    profileIcon: ImageVector = Icons.Default.Person
) {
    Box(
        modifier = modifier
            .size(profileSize)
            .background(profileColor, CircleShape),
        contentAlignment = Alignment.Center
    ) {
        Icon(
            modifier = Modifier.size(26.dp),
            imageVector = profileIcon,
            contentDescription = "profile image"
        )
    }
}