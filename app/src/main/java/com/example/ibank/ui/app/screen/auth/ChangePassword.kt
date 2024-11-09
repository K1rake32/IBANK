package com.example.ibank.ui.app.screen.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomInputAuthField
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.theme.MinorAuthText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.White
import com.example.ibank.ui.theme.WhiteForButton

@Composable
fun ChangePassword(

    onChangePassword: () -> Unit,
    onSuccessfullyPassword: () -> Unit

) {

    val newPassword = remember {
        mutableStateOf("")
    }

    val confirmPassword = remember {
        mutableStateOf("")
    }

    val isButtonPasswordEnabled = newPassword.value.length > 4 && confirmPassword.value.length > 4 && newPassword.value == confirmPassword.value

    Column(
        
        modifier = Modifier
            .fillMaxSize()
        
    ) {
        
        CustomMainAppBar(title = "Change password")
        
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
                    .padding(16.dp)

            ) {


                Text(

                    text = "Type your new password",
                    style = MaterialTheme.typography.MinorAuthText

                )

                Spacer(modifier = Modifier.height(8.dp))

                CustomInputAuthField(

                    placeHolder = "",
                    onValueChange = { newPassword.value = it},
                    image = R.drawable.show_icon_auth,
                    paddingHorizontal = 0,
                    isPasswordField = true

                )

                Spacer(modifier = Modifier.height(20.dp))

                Text(

                    text = "Confirm password",
                    style = MaterialTheme.typography.MinorAuthText

                )

                Spacer(modifier = Modifier.height(8.dp))

                CustomInputAuthField(

                    placeHolder = "",
                    onValueChange = { confirmPassword.value = it},
                    image = R.drawable.show_icon_auth,
                    paddingHorizontal = 0,
                    isPasswordField = true

                )

                Spacer(modifier = Modifier.height(64.dp))

                val colorButtonPassword = if (isButtonPasswordEnabled) Purple else WhiteForButton

                CustomButtonAuth(

                    color = colorButtonPassword,
                    text = "Change password",
                    click = if(isButtonPasswordEnabled)
                    {
                        {onSuccessfullyPassword()}
                    } else {
                        {}
                           },
                    paddingHorizontal = 16

                )

            }

        }
        
    }

}