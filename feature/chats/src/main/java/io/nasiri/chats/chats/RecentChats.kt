package io.nasiri.chats.chats

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.nasiri.common.R
import io.nasiri.common.items.MainItem

@Composable
fun RecentChats(modifier: Modifier = Modifier) {
    Column(modifier = modifier.fillMaxWidth()) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(id = R.string.recent_chats),
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.Bold
            )
            Row(
                modifier = Modifier.clickable { }, verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(22.dp)
                        .padding(end = 6.dp),
                    tint = Color.Black.copy(alpha = .4f),
                    painter = painterResource(id = R.drawable.ic_archive),
                    contentDescription = stringResource(
                        id = R.string.cd_archive
                    )
                )
                Text(
                    text = stringResource(id = R.string.archive_chats),
                    color = Color.Black.copy(alpha = .4f)
                )
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Column {
            repeat(20) {
                MainItem()
            }
        }
    }
}