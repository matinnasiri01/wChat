package io.nasiri.chats.stories

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.rotate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import io.nasiri.common.R
import kotlinx.coroutines.delay

@Composable
fun ItemS(
    modifier: Modifier = Modifier,
    isAddButton: Boolean = false,
    rotationDurationMillis: Int = 1000,
    rotationIncrement: Float = 50f,
    rotationMax: Float = 250f
) {
    var targetValue by remember { mutableFloatStateOf(0f) }

    val animatedValue by animateFloatAsState(
        targetValue = targetValue,
        label = "",
        animationSpec = tween(
            durationMillis = rotationDurationMillis / (rotationMax / rotationIncrement).toInt(),
            easing = LinearEasing
        )
    )

    LaunchedEffect(Unit) {
        while (true) {
            targetValue = (targetValue + rotationIncrement) % rotationMax
            delay(rotationDurationMillis.toLong())
        }
    }

    StoryItemContent(
        modifier = modifier,
        animatedValue = animatedValue,
        isAddButton = isAddButton
    )
}

@Composable
fun StoryItemContent(
    modifier: Modifier = Modifier,
    animatedValue: Float,
    isAddButton: Boolean
) {
    Column(modifier = modifier, horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = Modifier
                .size(72.dp)
                .drawBehind {
                    if (isAddButton) return@drawBehind
                    rotate(animatedValue) {
                        drawCircle(
                            brush = Brush.horizontalGradient(
                                listOf(Color.Red, Color.Blue)
                            ),
                            radius = 106f
                        )
                    }
                }
                .clip(CircleShape)
                .background(
                    MaterialTheme.colorScheme.primary.copy(alpha = .3f),
                    CircleShape
                )
                .clickable { },
            contentAlignment = Alignment.Center
        ) {
            if (isAddButton) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(id = R.drawable.ic_plus),
                    contentDescription = stringResource(id = R.string.cd_story)
                )
            } else {
                AsyncImage(
                    modifier = Modifier.matchParentSize(),
                    model = "https://cdn.nody.ir/files/2021/09/05/nody-%D8%B9%DA%A9%D8%B3-%D8%B3%D8%A7%D8%AF%D9%87-%D8%A7%D9%85%D8%A7-%D8%B2%DB%8C%D8%A8%D8%A7-1630849462.jpg",
                    contentScale = ContentScale.Crop,
                    contentDescription = null,
                )
            }
        }
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = if (isAddButton) stringResource(id = R.string.add_story) else "Test")
    }
}