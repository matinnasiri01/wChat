package io.nasiri.common.head

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import io.nasiri.common.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainHeader() {

    val clientFirstName = "Oji"

    TopAppBar(title = {
        Text(text = "Welcome $clientFirstName\uD83D\uDC4B")
    }, actions = {
        IconButton(onClick = { }, modifier = Modifier.background(Color.Black, CircleShape)) {
            Icon(
                painter = painterResource(id = R.drawable.ic_profile),
                contentDescription = stringResource(id = R.string.cd_profile),
                modifier = Modifier.size(22.dp)
            )
        }
    })
}