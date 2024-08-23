package io.nasiri.common.fab

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import io.nasiri.common.R

@Composable
fun FABMain(onClick: () -> Unit = { }) {
    FloatingActionButton(
        modifier = Modifier.padding(end = 10.dp, bottom = 36.dp),
        shape = CircleShape,
        onClick = onClick
    ) {
        Icon(
            modifier = Modifier.size(32.dp),
            painter = painterResource(id = R.drawable.ic_plus),
            contentDescription = null
        )
    }
}