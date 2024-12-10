package io.nasiri.story.show

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import io.nasiri.common.items.calculateLengthSize


@Composable
fun StoryCounter(
    modifier: Modifier = Modifier, count: Int = 5, seen: Float = .3f, spase: Int = 10
) {
    val eachSize = calculateLengthSize(
        max = LocalConfiguration.current.screenWidthDp, count = count, spase = spase
    )
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(10.dp),
        horizontalArrangement = Arrangement.spacedBy(spase.dp)
    ) {
        calculatePercent(count = count, size = seen).forEach {
            CustomIndicator(x = eachSize.dp, percent = it)
        }
    }
}

fun calculatePercent(count: Int, size: Float): List<Float> {
    require(count >= 0) { "Count must be non-negative" }
    require(size in 0f..1f) { "Size must be between 0 and 1" }

    val totalFilled = count * size
    val fullItems = totalFilled.toInt()
    val fractionalPart = totalFilled - fullItems

    return List(count) { index ->
        when {
            index < fullItems -> 1f
            index == fullItems && fractionalPart > 0 -> fractionalPart
            else -> 0f
        }
    }
}

@Composable
fun CustomIndicator(
    x: Dp,
    percent: Float = 0f,
    strokeWidth: Float = 20f,
    frColor: Color = Color.Red,
    bgColor: Color = Color.Black
) {
    Canvas(modifier = Modifier.width(x)) {
        drawLine(
            color = bgColor,
            start = Offset.Zero,
            end = Offset(size.width, 0f),
            strokeWidth = strokeWidth,
            cap = StrokeCap.Round,
        )
        drawLine(
            color = if (percent == 0f) Color.Transparent else frColor,
            start = Offset.Zero,
            end = Offset(size.width * percent.coerceIn(0f, 1f), 0f),
            strokeWidth = strokeWidth * .8f,
            cap = StrokeCap.Round,
        )
    }
}