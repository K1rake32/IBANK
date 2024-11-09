package com.example.ibank.ui.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.fragment.app.FragmentActivity
import androidx.navigation.compose.rememberNavController
import com.example.ibank.ui.app.screen.auth.AuthNavGraph
import com.example.ibank.ui.app.screen.auth.SignInAuth
import com.example.ibank.ui.app.screen.auth.SignUpAuth
import com.example.ibank.ui.theme.IBankTheme
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.White
import com.google.accompanist.systemuicontroller.rememberSystemUiController

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            IBankTheme {

                val navController = rememberNavController()
                
                SetBarColor(color = Purple)
                
                Surface (

                    modifier = Modifier
                        .fillMaxWidth(),

                        color = White

                ) {

                    AuthNavGraph()

                }
            }
        }
    }
}

@Composable
private fun SetBarColor(color: Color) {

    val systemUiController = rememberSystemUiController()

    SideEffect {

        systemUiController.setSystemBarsColor(

            color = color

        )

    }

}