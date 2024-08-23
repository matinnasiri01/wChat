package io.nasiri.common.items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun MainItem(modifier: Modifier = Modifier, enable: Boolean? = null) {
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
                        .statusColor(enable = enable ?: true)
                        .clip(CircleShape),
                    model = "https://cdn.nody.ir/files/2021/09/05/nody-%D8%B9%DA%A9%D8%B3-%D8%B3%D8%A7%D8%AF%D9%87-%D8%A7%D9%85%D8%A7-%D8%B2%DB%8C%D8%A8%D8%A7-1630849462.jpg",
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                )
                Column(
                    modifier = Modifier.padding(start = 6.dp),
                    verticalArrangement = Arrangement.spacedBy(4.dp)
                ) {
                    Text(text = "Matin Nasiri")
                    Text(text = buildAnnotatedString {
                        append("Voice message")
                    })
                }
            }
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalAlignment = Alignment.End
            ) {
                Text(text = "10:25 pm", color = Color.Unspecified.copy(alpha = .4f))
                Badge { Text(text = "2") }
            }
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

fun Modifier.statusColor(
    enable: Boolean = true,
    position: Offset? = null, color: Color = Color.Green, background: Color = Color.White
): Modifier = this.drawWithContent {
    drawContent()
    if (!enable) return@drawWithContent
    val center = position ?: Offset(size.width - 25, size.height - 25)
    drawCircle(color = background, 20f, center = center)
    drawCircle(color = color, 12f, center = center)
}