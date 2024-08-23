package io.nasiri.common.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.nasiri.common.R

@Composable
fun BottomNavigation(selected: Boolean = false) {

    val navigationItems = mapOf(
        R.string.chat to R.drawable.ic_chat,
        R.string.groups to R.drawable.ic_groups,
        R.string.calls to R.drawable.ic_phone
    ).toList()

    NavigationBar(
        modifier = Modifier
            .circleCutout()
            .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp)),
        containerColor = Color.LightGray
    ) {
        Row(Modifier.padding(end = 68.dp)) {
            navigationItems.forEachIndexed { i, item ->
                Row(
                    modifier = Modifier.weight(1f),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Row(modifier = Modifier
                        .clip(RoundedCornerShape(16.dp))
                        .background(if (selected) Color.Blue.copy(alpha = .3f) else Color.Transparent)
                        .clickable { /* todo navigate */ }
                        .padding(horizontal = 8.dp, vertical = 4.dp),
                        verticalAlignment = Alignment.CenterVertically) {
                        Icon(
                            modifier = Modifier.size(24.dp),
                            painter = painterResource(id = item.second),
                            contentDescription = null
                        )
                        if (selected) {
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(text = stringResource(id = item.first))
                        }
                    }
                }
            }
        }
    }
}

fun Modifier.circleCutout(
    fabSize: Dp = 36.dp, widthPos: Int = 150, backGround: Color = Color.LightGray
) = this.drawWithContent {

    val r = fabSize.toPx()
    val width = size.width - widthPos

    drawContent()
    drawRect(color = Color.White, topLeft = Offset(width - r - r / 3, 0f), size = Size(r.times(2) + r / 1.5f, r / 4))
    drawCircle(color = Color.White, radius = r, center = Offset(width, 0f))
    drawCircle(color = backGround, radius = r / 3, center = Offset(width + r + r / 4 + 3.4f, r / 3))
    drawCircle(color = backGround, radius = r / 3, center = Offset(width - r - (r / 4 + 3.4f), r / 3))
}