package com.example.ibank.ui.app.screen.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomInputAuthField
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.theme.MinorAuthText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.Strings
import com.example.ibank.ui.theme.TeamConditionsText
import com.example.ibank.ui.theme.White
import com.example.ibank.ui.theme.WhiteForButton

@Composable
fun ForgotPasswordStart(

    onForgotPassword: () -> Unit,
    onForgotPasswordCode: () -> Unit

) {

    val number = remember {
        mutableStateOf("")
    }

    val isButtonEnabled = number.value.length > 10

    Column(

        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        CustomMainAppBar(title = "Forgot password")

        Spacer(modifier = Modifier.height(24.dp))

        Card(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .background(color = White),

                shape = RoundedCornerShape(15.dp),

                elevation = CardDefaults.cardElevation(7.dp),

                colors = CardDefaults.cardColors(containerColor = White)

        ) {

            Column(

                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp, bottom = 16.dp)
                    .fillMaxWidth()

            ) {

                Text(

                    text = Strings.TypeNumber,
                    style = MaterialTheme.typography.MinorAuthText

                )
                
                Spacer(modifier = Modifier.height(16.dp))

                CustomInputAuthField(

                    placeHolder = "(+84)",
                    onValueChange = {number.value = it},
                    paddingHorizontal = 0,
                    image = null,
                    isNumber = true

                )
                
                Spacer(modifier = Modifier.height(24.dp))
                
                Text(

                    text = Strings.VerifyNumber,
                    style = MaterialTheme.typography.TeamConditionsText

                )
                
                Spacer(modifier = Modifier.height(24.dp))

                val buttonColor = if(isButtonEnabled) Purple else WhiteForButton

                CustomButtonAuth(

                    color = buttonColor,
                    text = "Send",
                    paddingHorizontal = 0,
                    click = if (isButtonEnabled) {

                        {onForgotPasswordCode()}

                    } else {
                        {}
                    }


                )

            }

        }

    }

}