package com.example.ibank.ui.app.screen.main.Search

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draganddrop.DragAndDropModifierNode
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomInoutFieldExchange
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.theme.Purple

@Composable
fun Exchange() {

    Column(

        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        
        CustomMainAppBar(title = "Exchange")
        
        Spacer(modifier = Modifier.height(24.dp))

        Image(

            painter = painterResource(id = R.drawable.exchange_main_img),
            contentDescription = "exchange_main_img"
                
        )
        
        Spacer(modifier = Modifier.height(32.dp))

        CustomInoutFieldExchange(

            onValueChange = {},
            title = "Amount"

        )

        Image(

            modifier = Modifier
                .padding(vertical = 24.dp),

            painter = painterResource(id = R.drawable.arrow_main),
            contentDescription = ""

        )

        CustomInoutFieldExchange(

            onValueChange = {},
            title = "Amount"

        )

        Spacer(modifier = Modifier.height(64.dp))

        CustomButtonAuth(

            color = Purple,
            text = "Exchange",
            click = { /*TODO*/ },
            paddingHorizontal = 16

        )


    }

}

@Composable
@Preview(showBackground = true)
private fun ExchangePreview() {

    Exchange()

}