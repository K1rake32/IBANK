package com.example.ibank.ui.app.customComponent

import android.icu.text.ListFormatter.Width
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.ibank.ui.theme.AuthButtonText
import com.example.ibank.ui.theme.Purple


@Composable
fun CustomButtonAuth(

    color: Color,
    text: String,
    click: () -> Unit,
    paddingHorizontal: Int,
    modifier: Modifier = Modifier,
    isMaxWidth: Boolean = true,
    width: Dp = Dp.Unspecified,
    padding: Dp = 12.dp

) {

    Button(

        modifier = Modifier
            .padding(horizontal = paddingHorizontal.dp)
            .then(if (isMaxWidth) Modifier.fillMaxWidth() else Modifier.width(width))
            .clip(RoundedCornerShape(15.dp)),
            colors = ButtonDefaults.buttonColors(color),

        onClick = click,

        contentPadding = PaddingValues(
            start = padding,
            top = padding,
            end = padding,
            bottom = padding
        )

    ) {

        Text(

            text = text,
            style = MaterialTheme.typography.AuthButtonText

        )

    }

}