package com.example.ibank.ui.app.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.theme.ChangePasswordText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.Strings
import com.example.ibank.ui.theme.TeamConditionsText

@Composable
fun SuccessfullyPassword(

    onConfirmAuth: () -> Unit

) {

    Column(

        modifier = Modifier
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        CustomMainAppBar(title = "")
        
        Spacer(modifier = Modifier.height(24.dp))

        Image(

            painter = painterResource(id = R.drawable.succesfully_pasword),
            contentDescription = "Sucesfully"

        )

        Spacer(modifier = Modifier.height(32.dp))

        Text(

            text = Strings.SuccessPassword,
            style = MaterialTheme.typography.ChangePasswordText

        )
        
        Spacer(modifier = Modifier.height(24.dp))

        Text(

            text = Strings.MinorSuccessPassword,
            style = MaterialTheme.typography.TeamConditionsText

        )

        Spacer(modifier = Modifier.height(32.dp))

        CustomButtonAuth(

            color = Purple,
            text = "OK",
            click = onConfirmAuth,
            paddingHorizontal = 24

        )

    }

}

@Composable
@Preview(showBackground = true)
fun SuccessfullyPasswordPreview() {

    SuccessfullyPassword(onConfirmAuth = {})

}

