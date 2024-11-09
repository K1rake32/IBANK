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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.FragmentActivity
import com.example.ibank.R
import com.example.ibank.ui.app.BiometrickControll.BiometricAuthIndicator
import com.example.ibank.ui.app.customComponent.AppBarCustomAuth
import com.example.ibank.ui.app.customComponent.CustomButtonAuth
import com.example.ibank.ui.app.customComponent.CustomInputAuthField
import com.example.ibank.ui.theme.DontHaveAccountText
import com.example.ibank.ui.theme.ForgotPasswordText
import com.example.ibank.ui.theme.MinorWelcomeText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.SignUpText
import com.example.ibank.ui.theme.Strings
import com.example.ibank.ui.theme.WelcomText
import com.example.ibank.ui.theme.White
import com.example.ibank.ui.theme.WhiteForButton

@Composable
fun SignInAuth(onNavigationToSignUp: () -> Unit, onForgotPassword: () -> Unit) {

    val username = remember {
        mutableStateOf("")
    }

    val password = remember {
        mutableStateOf("")
    }

    val isButtonEnabled = username.value.isNotEmpty() && password.value.isNotEmpty()

    val biometricAuthIndicator = BiometricAuthIndicator(LocalContext.current as FragmentActivity)

        Column(

            modifier = Modifier

                .fillMaxSize()
                .background(Purple)

        ) {

            AppBarCustomAuth(title = "Sign in")

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

                            text = Strings.Welcome,
                            style = MaterialTheme.typography.WelcomText

                        )

                        Text(

                            text = Strings.MinorWelcome,
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

                            painter = painterResource(id = R.drawable.auth_main),
                            contentDescription = ""

                        )

                        Spacer(modifier = Modifier.height(32.dp))

                        CustomInputAuthField(

                            placeHolder = "Text input",
                            image = null,
                            paddingHorizontal = 24,
                            onValueChange = {username.value = it}

                        ) 
                        
                        Spacer(modifier = Modifier.height(20.dp))

                        CustomInputAuthField(

                            placeHolder = "Password",
                            image = R.drawable.show_icon_auth,
                            paddingHorizontal = 24,
                            onValueChange = {password.value = it},
                            isPasswordField = true

                        )
                        
                        Spacer(modifier = Modifier.height(12.dp))

                        Row(
                            
                            modifier = Modifier
                                .padding(horizontal = 27.dp)
                                .fillMaxWidth(),
                            
                            horizontalArrangement = Arrangement.End
                            
                        ) {
                            
                            Text(

                                text = Strings.ForgotPassword,
                                style = MaterialTheme.typography.ForgotPasswordText,

                                modifier = Modifier
                                    .clickable { onForgotPassword() }

                            )
                            
                        }

                        Spacer(modifier = Modifier.height(40.dp))

                        val colorButtonSignIn = if(isButtonEnabled) Purple else WhiteForButton

                        CustomButtonAuth(

                            color = colorButtonSignIn,
                            text = "Sign in",
                            paddingHorizontal = 24,
                            click = {}
                        )
                        
                        Spacer(modifier = Modifier.height(24.dp))


                        val activity = LocalContext.current as FragmentActivity

                        var message by remember {
                            mutableStateOf("")
                        }

                        Image(

                            painter = painterResource(id = R.drawable.finger_print),
                            contentDescription = "finger print",

                            modifier = Modifier
                                .clickable {

                                    biometricAuthIndicator.promptBiometricAuth(

                                        title = "Login",
                                        subTitle = "Use your finger print or face id",
                                        negativeButtonText = "cancel",
                                        fragmentActivity = activity,
                                        onSuccess = {

                                            message = "Success"

                                        },

                                        onFailed = {

                                            message = "Wrong finger print or face id"

                                        },

                                        onError = { _, error ->

                                            message = error

                                        }

                                    )

                                }


                        )
                        
                        Spacer(modifier = Modifier.height(24.dp))

                        Row(

                            modifier = Modifier
                                .fillMaxWidth(),

                            horizontalArrangement = Arrangement.Center

                        ) {
                            
                            Text(

                                text = Strings.DontHaveAccount,
                                style = MaterialTheme.typography.DontHaveAccountText,

                            )
                            
                            Spacer(modifier = Modifier.width(11.dp))

                            Text(

                                text = "Sign Up",
                                style = MaterialTheme.typography.SignUpText,

                                modifier = Modifier
                                    .clickable {

                                        onNavigationToSignUp()

                                    }

                            )

                        }

                    }

                }

            }

        }

}