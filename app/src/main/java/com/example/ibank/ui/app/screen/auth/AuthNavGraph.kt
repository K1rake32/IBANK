package com.example.ibank.ui.app.screen.auth

import androidx.biometric.BiometricPrompt.AuthenticationResult
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.example.ibank.ui.app.BottomNavigation.BottomItem
import com.example.ibank.ui.app.screen.main.HomeScreen
import com.example.ibank.ui.app.screen.main.SearchScreen

@Composable
fun AuthNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(navController = navController, startDestination = "sign_in") {

        composable("sign_in") {
            SignInAuth(
                onNavigationToSignUp = {
                    navController.navigate("sign_up")
                },
                onForgotPassword = {
                    navController.navigate("forgot_password")
                }
            )
        }

        composable("sign_up") {
            SignUpAuth(
                onNavigateToSignIn = {
                    navController.navigate("sign_in")
                }
            )
        }

        composable("forgot_password") {
            ForgotPasswordStart(
                onForgotPassword = {
                    navController.navigate("sign_in")
                },
                onForgotPasswordCode = {
                    navController.navigate("forgot_password_code")
                }
            )
        }

        composable("forgot_password_code") {
            ForgoPasswordCode(
                onForgotPasswordCode = {
                    navController.navigate("forgot_password")
                },
                onChangePassword = {
                    navController.navigate("change_password")
                }
            )
        }

        composable("change_password") {
            ChangePassword(
                onChangePassword = {
                    navController.navigate("forgot_password")
                },
                onSuccessfullyPassword = {
                    navController.navigate("success_change_password")
                }
            )
        }

        composable("success_change_password") {
            SuccessfullyPassword(
                onConfirmAuth = {
                    navController.navigate("main_graph")
                }



            )
        }

        navigation(startDestination = "home_screen", route = "main_graph") {
            composable("home_screen") { HomeScreen() }
            composable("search_screen") { SearchScreen() }
        }

    }
}