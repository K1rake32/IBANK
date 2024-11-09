package com.example.ibank.ui.app.screen.auth

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.customComponent.AppBarCustomAuth
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomCheckBoxAuth
import com.example.ibank.ui.app.customComponent.CustomInputAuthField
import com.example.ibank.ui.app.customComponent.CustomTeamConditions
import com.example.ibank.ui.theme.Black
import com.example.ibank.ui.theme.DontHaveAccountText
import com.example.ibank.ui.theme.MinorWelcomeText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.SignUpText
import com.example.ibank.ui.theme.Strings
import com.example.ibank.ui.theme.WelcomText
import com.example.ibank.ui.theme.White
import com.example.ibank.ui.theme.WhiteForButton

@Composable
fun SignUpAuth(

    onNavigateToSignIn: () -> Unit

) {

    val name = remember {
        mutableStateOf("")
    }

    val email = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }

    val checkedState = remember {
        mutableStateOf(false)
    }

    val isButtonEnabled = name.value.isNotEmpty() && email.value.isNotEmpty() && password.value.isNotEmpty() && checkedState.value

            Column(

        modifier = Modifier

            .fillMaxSize()
            .background(Purple)

    ) {

        AppBarCustomAuth(title = "Sign up")

        Spacer(
            modifier = Modifier
                .fillMaxHeight(0.01f)
        )

        Box(

            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(White)

        ) {

            Column(


            ) {

                Column(

                    modifier = Modifier
                        .padding(start = 24.dp, top = 24.dp),

                    horizontalAlignment = Alignment.Start

                ) {

                    Text(

                        text = Strings.WelcomeUs,
                        style = MaterialTheme.typography.WelcomText

                    )

                    Text(

                        text = Strings.NewAccount,
                        style = MaterialTheme.typography.MinorWelcomeText

                    )

                }

                Spacer(modifier = Modifier.height(32.dp))

                Column(

                    modifier = Modifier
                        .fillMaxWidth(),

                    horizontalAlignment = Alignment.CenterHorizontally

                ) {


                    Image(

                        painter = painterResource(id = R.drawable.register_main),
                        contentDescription = ""

                    )

                    Spacer(modifier = Modifier.height(32.dp))

                    CustomInputAuthField(

                        placeHolder = "Name",
                        image = null,
                        paddingHorizontal = 24,
                        onValueChange = {name.value = it}

                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    CustomInputAuthField(

                        placeHolder = "Text input",
                        image = null,
                        paddingHorizontal = 24,
                        onValueChange = {email.value = it}

                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    CustomInputAuthField(

                        placeHolder = "Password",
                        image = R.drawable.icon_for_input,
                        onValueChange = {password.value = it},
                        paddingHorizontal = 24,
                        isPasswordField = true


                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(

                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp),

                        verticalAlignment = Alignment.CenterVertically

                    ) {

                        CustomCheckBoxAuth(

                            isChecked = checkedState.value,
                            onCheckedChange = { newState ->

                                checkedState.value = newState

                            }

                        )
                        
                        CustomTeamConditions(text = Strings.TeamConditions)

                    }
                    
                    Spacer(modifier = Modifier.height(32.dp))

                    val buttonColor = if(isButtonEnabled) Purple else WhiteForButton

                    CustomButtonAuth(

                        color = buttonColor,
                        text = "Sign up",
                        paddingHorizontal = 24,
                        click = {}

                    )

                    Spacer(modifier = Modifier.height(16.dp))

                    Row(

                        modifier = Modifier
                            .fillMaxWidth(),

                        horizontalArrangement = Arrangement.Center

                    ) {

                        Text(

                            text = Strings.HaveAccount,
                            style = MaterialTheme.typography.DontHaveAccountText

                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(

                            text = "Sign In",
                            style = MaterialTheme.typography.SignUpText,

                            modifier = Modifier
                                .clickable {

                                    onNavigateToSignIn()

                                }

                        )

                    }

                }
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
private fun SignUpPreview() {

    SignUpAuth(onNavigateToSignIn = {})

}