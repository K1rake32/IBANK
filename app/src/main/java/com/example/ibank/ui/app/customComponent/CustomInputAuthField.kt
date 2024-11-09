package com.example.ibank.ui.app.customComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.materialIcon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.traceEventEnd
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.ContentInfoCompat.Flags
import com.example.ibank.R
import com.example.ibank.ui.theme.Black
import com.example.ibank.ui.theme.GrayForBorder
import com.example.ibank.ui.theme.PlaceHolderText
import com.example.ibank.ui.theme.White


@Composable
fun CustomInputAuthField(
    placeHolder: String,
    onValueChange: (String) -> Unit,
    image: Int?,
    paddingHorizontal: Int,
    isPasswordField: Boolean = false,
    isNumber: Boolean = false,
    modifier: Modifier = Modifier,
    isMaxWidth: Boolean = true,
    width: Dp = Dp.Unspecified
) {

    var textInputField by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    TextField(
        modifier = Modifier
            .padding(horizontal = paddingHorizontal.dp)
            .then(if(isMaxWidth) Modifier.fillMaxWidth() else Modifier.width(width))
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(15.dp),
                color = GrayForBorder
            ),

        value = textInputField,
        onValueChange = { newText ->
            textInputField = newText
            onValueChange(newText)
        },

        colors = TextFieldDefaults.colors(

            focusedContainerColor = White,
            unfocusedContainerColor = White,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            focusedTextColor = Black,
            unfocusedTextColor = Black

        ),

        placeholder = {
            Text(
                text = placeHolder,
                style = MaterialTheme.typography.PlaceHolderText
            )
        },

        singleLine = true,

        visualTransformation = if (isPasswordField && !passwordVisible) PasswordVisualTransformation() else VisualTransformation.None,

        keyboardOptions = KeyboardOptions.Default.copy(
            keyboardType = if (isNumber) KeyboardType.Number else KeyboardType.Text
        ),

        trailingIcon = {
            if (isPasswordField) {

                IconButton(onClick = { passwordVisible = !passwordVisible }) {

                    val icon = if (passwordVisible) R.drawable.icon_for_input else R.drawable.show_icon_auth

                    Image(

                        painter = painterResource(id = icon),
                        contentDescription = if (passwordVisible) "Hide password" else "Show password"

                    )
                }
            }
        }
    )
}
