package com.example.ibank.ui.app.screen.auth

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TabRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.unit.dp
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomInputAuthField
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.theme.FeedbackNumberText
import com.example.ibank.ui.theme.MinorAuthText
import com.example.ibank.ui.theme.PlaceHolderText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.Strings
import com.example.ibank.ui.theme.White
import com.example.ibank.ui.theme.WhiteForButton

@Composable
fun ForgoPasswordCode(

    onForgotPasswordCode: () -> Unit,
    onChangePassword: () -> Unit

) {

    val codeResend = remember {
        mutableStateOf("")
    }

    val isButtonCodeEnabled = codeResend.value.length == 4

    Column(
        
        modifier = Modifier
            .fillMaxSize(),
        
        horizontalAlignment = Alignment.CenterHorizontally
        
    ) {
        
        CustomMainAppBar(title = Strings.ForgotPassword) 
        
        Spacer(modifier = Modifier.height(24.dp))

        Card(

            modifier = Modifier
                .padding(24.dp)
                .fillMaxWidth(),

            shape = RoundedCornerShape(15.dp),

            elevation = CardDefaults.cardElevation(7.dp),

            colors = CardDefaults.cardColors(containerColor = White)


        ) {

            Column(

                modifier = Modifier
                    .padding(horizontal = 16.dp)
                    .padding(top = 16.dp, bottom = 16.dp)
                    .fillMaxWidth(),

            ) {

                Text(

                    text = "Type a code",
                    style = MaterialTheme.typography.MinorAuthText

                )

                Spacer(modifier = Modifier.height(16.dp))

                Row(

                    horizontalArrangement = Arrangement.spacedBy(8.dp),

                    modifier = Modifier
                        .fillMaxWidth(),

                    verticalAlignment = Alignment.CenterVertically
                ) {

                    CustomInputAuthField(

                        placeHolder = "Code",
                        onValueChange = {codeResend.value = it},
                        image = null,
                        paddingHorizontal = 0,
                        isNumber = true,
                        isMaxWidth = false,
                        width = 180.dp

                    )

                    CustomButtonAuth(

                        color = Purple,
                        text = "Resend",
                        click = {},
                        paddingHorizontal = 0,
                        isMaxWidth = false,
                        width = 130.dp,
                        padding = 16.dp

                    )

                }
                
                Spacer(modifier = Modifier.height(24.dp))
                
                Text(

                    text = "We texted you a code to verify your\nphone number (+84) 0398829xxx",
                    style = MaterialTheme.typography.FeedbackNumberText

                )
                
                Spacer(modifier = Modifier.height(10.dp))
                
                Text(

                    text = Strings.FeedbackNumber,
                    style = MaterialTheme.typography.FeedbackNumberText

                )
                
                Spacer(modifier = Modifier.height(32.dp))

                val buttonColor = if(isButtonCodeEnabled) Purple else WhiteForButton

                CustomButtonAuth(

                    color = buttonColor,
                    text = "Change password",
                    click = {onChangePassword()},
                    paddingHorizontal = 0

                )

            }

        }
    }

}