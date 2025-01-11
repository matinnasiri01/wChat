package io.nasiri.profile.edit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.nasiri.common.button.Button
import io.nasiri.common.R

@Composable
fun EditProfileScreen(modifier: Modifier = Modifier) {
    Scaffold {
        Box(
            modifier = modifier
                .fillMaxSize()
                .padding(it)
        ) {
            Button(
                icon = R.drawable.ic_arrow, modifier = Modifier.padding(top = 14.dp, start = 14.dp)
            ) { }
            Button(
                icon = R.drawable.ic_tick,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 14.dp, end = 14.dp)
            ) { }

            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(modifier = Modifier.size(120.dp, 136.dp)) {
                    Image(
                        modifier = Modifier
                            .size(120.dp)
                            .clip(CircleShape),
                        painter = painterResource(id = R.drawable.ic_google),
                        contentDescription = null
                    )
                    Box(
                        modifier = Modifier
                            .align(Alignment.BottomCenter)
                            .size(34.dp)
                            .clip(CircleShape)
                            .background(MaterialTheme.colorScheme.onPrimary)
                            .clickable { },
                        contentAlignment = Alignment.Center
                    ) {
                        Icon(
                            tint = MaterialTheme.colorScheme.primary,
                            painter = painterResource(id = R.drawable.ic_pen20),
                            contentDescription = null
                        )
                    }
                }
                Spacer(modifier = Modifier.height(40.dp))
                OutlinedTextField(value = "Sara Rahmani",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Name") })
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(
                    value = "sararahmani@gmail.com",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "Email") },
                    enabled = false
                )
                Spacer(modifier = Modifier.height(12.dp))
                OutlinedTextField(value = "@sararahmani",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { Text(text = "ID") })
            }
        }
    }
}