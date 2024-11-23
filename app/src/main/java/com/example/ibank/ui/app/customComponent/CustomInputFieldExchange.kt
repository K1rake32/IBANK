package com.example.ibank.ui.app.customComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.Placeholder
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.example.ibank.R
import com.example.ibank.ui.theme.Black
import com.example.ibank.ui.theme.DividerColor
import com.example.ibank.ui.theme.GrayForBorder
import com.example.ibank.ui.theme.InterestingKind
import com.example.ibank.ui.theme.PlaceHolderText
import com.example.ibank.ui.theme.White

@Composable
fun CustomInoutFieldExchange(

    onValueChange: (String) -> Unit,
    title: String

) {

    var textExchangeValue = remember{mutableStateOf("")}



    TextField(

        modifier = Modifier
            .padding(horizontal = 16.dp)
            .border(

                width = 1.dp,
                shape = RoundedCornerShape(15.dp),
                color = GrayForBorder


            ),


        value = textExchangeValue.value,
        onValueChange = { newText ->

            textExchangeValue.value = newText
            onValueChange(newText)

        },

        placeholder = {

            Text(

                text = title,
                style = MaterialTheme.typography.PlaceHolderText

            )

        },

        colors = TextFieldDefaults.colors(

            focusedContainerColor = White,
            unfocusedContainerColor = White,
            unfocusedIndicatorColor = Color.Transparent,
            focusedIndicatorColor = Color.Transparent,
            focusedTextColor = Black,
            unfocusedTextColor = Black

        ),

        trailingIcon = {

            Row(

                modifier = Modifier
                    .padding(end = 10.dp),

                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)

            ) {

                Box(

                    modifier = Modifier
                        .background(GrayForBorder)
                        .width(1.dp)
                        .height(34.dp)

                )


                Text(

                    text = "USD",
                    style = MaterialTheme.typography.InterestingKind

                )

                Image(

                    painter = painterResource(id = R.drawable.arrow_up_bot),
                    contentDescription = "arrow"

                )

            }

        }

    )

}


@Composable
@Preview(showBackground = true)
private fun CustomInoutFieldExchangePreview() {

    CustomInoutFieldExchange(onValueChange = {}, title = "Amount")

}


