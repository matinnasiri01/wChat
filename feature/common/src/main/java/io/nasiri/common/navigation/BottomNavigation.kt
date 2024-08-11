package io.nasiri.common.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.material3.NavigationBarItem
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.ContentDrawScope
import androidx.compose.ui.unit.dp

@Composable
fun BottomNavigation(icons: List<Int> = listOf(1, 2, 3)) {
    var nIndex = 0

    NavigationBar(
        modifier = Modifier
            .drawWithContent { cutout(Color.LightGray) }
            .clip(RoundedCornerShape(topEnd = 16.dp, topStart = 16.dp)),
        containerColor = Color.LightGray
    ) {
        icons.forEachIndexed { index, _ ->
            NavigationBarItem(
                selected = nIndex == index,
                onClick = { nIndex = index },
                icon = { Icon(imageVector = Icons.Default.Home, contentDescription = null) }
            )
        }
    }

}

fun ContentDrawScope.cutout(
    backGround: Color,
    r: Float = 36.dp.toPx(),
    width: Float = size.width - 140
) {
    drawContent()
    drawRect(
        color = Color.White,
        topLeft = Offset(width - r - r / 3, 0f),
        size = Size(r.times(2) + r / 1.5f, r / 4)
    )
    drawCircle(color = Color.White, radius = r, center = Offset(width, 0f))
    drawCircle(color = backGround, radius = r / 3, center = Offset(width + r + r / 4 + 3.4f, r / 3))
    drawCircle(color = backGround, radius = r / 3, center = Offset(width - r - (r / 4 + 3.4f), r / 3))
}