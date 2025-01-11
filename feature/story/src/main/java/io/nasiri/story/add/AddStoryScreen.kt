package io.nasiri.story.add

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.button.Button
import io.nasiri.common.R
import io.nasiri.common.theme.rounded16

@Composable
fun AddStoryScreen(modifier: Modifier = Modifier) {
    Scaffold {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Button(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 14.dp, end = 14.dp),
                icon = R.drawable.ic_close
            ) { }

            Row(
                modifier = Modifier.align(Alignment.Center),
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Options(icon = R.drawable.ic_gallery, title = "Gallery") {}
                Options(icon = R.drawable.ic_camera, title = "Camera") {}
            }

        }
    }
}

@Composable
fun Options(
    modifier: Modifier = Modifier, @DrawableRes icon: Int, title: String, onClick: () -> Unit
) {
    Column(
        modifier = modifier
            .size(92.dp, 82.dp)
            .clip(rounded16)
            .background(
                MaterialTheme.colorScheme.onPrimary
            )
            .clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Icon(
            modifier = Modifier.size(24.dp),
            painter = painterResource(id = icon),
            contentDescription = null,
            tint = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(text = title, color = MaterialTheme.colorScheme.primary, fontSize = 12.sp)
    }
}