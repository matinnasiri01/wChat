package io.nasiri.chats.stories

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import io.nasiri.common.R

@Composable
fun ItemS(modifier: Modifier = Modifier, isAddButton: Boolean = false) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(72.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.primary.copy(alpha = .3f), CircleShape)
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            if (isAddButton)
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = stringResource(id = R.string.cd_story)
                )
            else
                AsyncImage(
                    modifier = Modifier.matchParentSize(),
                    model = "https://cdn.nody.ir/files/2021/09/05/nody-%D8%B9%DA%A9%D8%B3-%D8%B3%D8%A7%D8%AF%D9%87-%D8%A7%D9%85%D8%A7-%D8%B2%DB%8C%D8%A8%D8%A7-1630849462.jpg",
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = if (isAddButton) stringResource(id = R.string.add_story) else "Test")
    }
}