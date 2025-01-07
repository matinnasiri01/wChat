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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.button.Button
import io.nasiri.common.R

@Composable
fun ShowProfileScreen(modifier: Modifier = Modifier) {
    val owner = true
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
            if (owner)
                Button(
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
                Text(text = "Sara Rahmani", fontWeight = FontWeight.Bold, fontSize = 32.sp)
                Spacer(modifier = Modifier.height(12.dp))
                Text(text = "sararahmani@gmail.com", fontSize = 18.sp)
                Spacer(modifier = Modifier.height(12.dp))
                Text(
                    modifier = Modifier.clickable { },
                    text = "@sararahmani",
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold,
                    fontSize = 18.sp
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
            .clip(RoundedCornerShape(16.dp))
            .background(Color.Black)
            .clickable { },
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (owner) {
            Icon(
                tint = Color.White,
                painter = painterResource(id = R.drawable.ic_logout),
                contentDescription = null
            )
            Spacer(modifier = Modifier.width(8.dp))
        }

        Text(
            color = Color.White,
            text = if (owner) "Logout" else "Continue chatting",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp
        )
    }
}