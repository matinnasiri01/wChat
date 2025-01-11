package io.nasiri.profile.show

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.button.Button
import io.nasiri.common.R
import io.nasiri.common.theme.bold18
import io.nasiri.common.theme.bold22
import io.nasiri.common.theme.bold32
import io.nasiri.common.theme.rounded16

@Composable
fun ShowProfileScreen(modifier: Modifier = Modifier) {
    val owner = false
    Scaffold {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Button(
                icon = R.drawable.ic_arrow, modifier = Modifier.padding(top = 14.dp, start = 14.dp)
            ) {

            }
            if (owner) Button(
                icon = R.drawable.ic_pen24,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 14.dp, end = 14.dp)
            ) {

            }

            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier.size(120.dp),
                    painter = painterResource(id = R.drawable.ic_google),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.height(40.dp))
                Text(text = "Sara Rahmani", style = bold32)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "sararahmani@gmail.com", fontSize = 18.sp)
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    modifier = Modifier.clickable { },
                    text = "@sararahmani",
                    color = Color.Blue,
                    style = bold18
                )
            }
            ProfileButton(owner = owner)
        }
    }
}

@Composable
fun BoxScope.ProfileButton(modifier: Modifier = Modifier, owner: Boolean = false) {
    Row(
        modifier = modifier
            .align(Alignment.BottomCenter)
            .fillMaxWidth()
            .height(120.dp)
            .padding(horizontal = 40.dp)
            .padding(bottom = 40.dp)
            .clip(rounded16)
            .background(MaterialTheme.colorScheme.onPrimary)
            .clickable { },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (owner) {
            Icon(
                tint = MaterialTheme.colorScheme.primary,
                painter = painterResource(id = R.drawable.ic_logout),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(8.dp))
        }

        Text(
            color = MaterialTheme.colorScheme.primary,
            text = if (owner) "Logout" else "Continue chatting",
            style = bold22
        )
    }
}