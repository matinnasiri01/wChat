package io.nasiri.common.chatbox

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.R
import io.nasiri.common.theme.rounded32

@Composable
fun ChatBox(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 14.dp)
            .clip(rounded32)
            .background(MaterialTheme.colorScheme.onPrimary)
            .padding(4.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BasicTextField(
            modifier = Modifier
                .weight(3f)
                .padding(start = 12.dp, end = 10.dp),
            value = "reply to story...",
            onValueChange = { },
            textStyle = TextStyle(color = MaterialTheme.colorScheme.primary, fontSize = 12.sp)
        )
        Box(
            modifier = Modifier
                .size(56.dp)
                .clip(rounded32)
                .background(MaterialTheme.colorScheme.primary)
                .clickable { }, contentAlignment = Alignment.Center
        ) {
            Icon(
                tint = MaterialTheme.colorScheme.onPrimary,
                painter = painterResource(id = R.drawable.ic_send),
                contentDescription = null
            )
        }
    }
}
