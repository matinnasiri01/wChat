package io.nasiri.story.show

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun SSS(modifier: Modifier = Modifier) {

    Row(modifier.padding(10.dp)) {

        CustomIndicator(x = 200.dp)
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