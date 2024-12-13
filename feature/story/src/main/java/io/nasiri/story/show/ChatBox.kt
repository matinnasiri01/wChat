package io.nasiri.story.show

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.twotone.Send
import androidx.compose.material.icons.twotone.Send
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.unit.dp


/* todo Edit!* */
@Composable
fun ChatBox(modifier: Modifier = Modifier) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)
            .clip(RoundedCornerShape(40.dp))
            .background(Color.LightGray.copy(.3f))
            .padding(10.dp)
    ) {
        BasicTextField(modifier = Modifier
            .weight(6f)
            .padding(start = 10.dp),
            keyboardOptions = KeyboardOptions(imeAction = ImeAction.Send),
            value = "Reply Story...",
            onValueChange = {})

        IconButton(modifier = Modifier.weight(1f), onClick = { /*TODO*/ }) {
            Icon(
                modifier = Modifier
                    .background(Color.Blue.copy(.5f), CircleShape)
                    .padding(12.dp),
                imageVector = Icons.AutoMirrored.TwoTone.Send,
                contentDescription = null
            )
        }
    }
}
