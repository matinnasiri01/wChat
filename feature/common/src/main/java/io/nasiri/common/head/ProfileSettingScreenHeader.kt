package io.nasiri.common.head

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import io.nasiri.common.R
import io.nasiri.common.items.lightStyle
import io.nasiri.common.profile.Profile

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileSettingScreenHeader() {

    TopAppBar(title = {
        Column {
            Text(text = "Profile")
        }
    }, navigationIcon = {
        IconButton(
            onClick = { /*TODO*/ }, modifier = Modifier.background(Color.Black, CircleShape)
        ) {
            Icon(
                imageVector = Icons.AutoMirrored.Filled.KeyboardArrowLeft, contentDescription = null
            )
        }
    }, actions = {
        IconButton(onClick = { }) {
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = stringResource(id = R.string.cd_profile),
                modifier = Modifier.size(48.dp)
            )
        }
    })
}