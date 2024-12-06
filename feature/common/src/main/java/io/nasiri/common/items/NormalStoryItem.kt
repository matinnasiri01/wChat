package io.nasiri.common.items

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.unit.dp

@Composable
fun NSI(modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .size(62.dp)
        .clip(CircleShape)
        .background(Color.Green)
        .clickable { }
        .drawRing()

    )
}

fun Modifier.drawRing(ringStroke: Float = 6f): Modifier = drawWithContent {

    val ringSize = Size(size.width - ringStroke, size.height - ringStroke)
    val ringTopLeft = Offset(ringStroke / 2, ringStroke / 2)
    val storySize = 12
    val profileColor = Color(0x64D1B38C)
    val ringBackground = Color.White

    drawContent()
    drawArc(
        size = ringSize,
        color = ringBackground,
        startAngle = 0f,
        sweepAngle = 360f,
        useCenter = false,
        style = Stroke(width = ringStroke),
        topLeft = ringTopLeft
    )
    calculatePairs(storySize).forEach { pair ->
        drawArc(
            size = ringSize,
            color = profileColor,
            startAngle = pair.first,
            sweepAngle = pair.second,
            useCenter = false,
            style = Stroke(width = ringStroke / 2, cap = StrokeCap.Round),
            topLeft = ringTopLeft
        )
    }
}

fun calculatePairs(n: Int, space: Float = 10f): List<Pair<Float, Float>> {
    val cln = n.coerceIn(1, 10)
    if (cln == 1) return listOf(Pair(0f, 360f))
    val lengthEach = (360 - cln * space) / cln
    return List(cln) { i ->
        val start = 90f + i * (lengthEach + space)
        Pair(start, lengthEach)
    }
}