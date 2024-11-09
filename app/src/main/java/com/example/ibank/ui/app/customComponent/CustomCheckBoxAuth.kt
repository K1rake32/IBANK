package com.example.ibank.ui.app.customComponent

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import com.example.ibank.ui.theme.GrayForCheckBox
import com.example.ibank.ui.theme.Purple

@Composable
fun CustomCheckBoxAuth(

    isChecked: Boolean,
    onCheckedChange: (Boolean) -> Unit

) {


    Checkbox(

        checked = isChecked,
        onCheckedChange = { newState ->

           onCheckedChange(newState)

        },

        colors = CheckboxDefaults.colors(

            checkedColor = GrayForCheckBox,
            uncheckedColor = GrayForCheckBox,
            checkmarkColor = Purple

        )

    )


}