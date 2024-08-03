package io.nasiri.common.items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun CallItem(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(bottom = 8.dp)
            .clickable { },
        horizontalAlignment = Alignment.End
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                AsyncImage(
                    modifier = Modifier
                        .size(62.dp)
                        .clip(CircleShape),
                    model = "https://cdn.nody.ir/files/2021/09/05/nody-%D8%B9%DA%A9%D8%B3-%D8%B3%D8%A7%D8%AF%D9%87-%D8%A7%D9%85%D8%A7-%D8%B2%DB%8C%D8%A8%D8%A7-1630849462.jpg",
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                )
                Column(modifier = Modifier.padding(start = 4.dp)) {
                    Text(text = "Matin Nasiri")
                    Text(text = buildAnnotatedString {
                        append("Voice message")
                    })
                }
            }
            Icon(imageVector = Icons.Default.KeyboardArrowDown, contentDescription = null)
        }
        Box(
            modifier = Modifier
                .fillMaxWidth(0.82f)
                .padding(top = 8.dp)
                .height(.5f.dp)
                .background(Color.Black.copy(alpha = 0.1f))
        )
    }
}
