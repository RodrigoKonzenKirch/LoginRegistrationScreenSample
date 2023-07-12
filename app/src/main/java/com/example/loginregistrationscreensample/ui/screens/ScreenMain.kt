package com.example.loginregistrationscreensample.ui.screens

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginregistrationscreensample.navigation.Routes
import com.example.loginregistrationscreensample.ui.screens.forgot_password.ForgotPassword
import com.example.loginregistrationscreensample.ui.screens.login.LoginPage
import com.example.loginregistrationscreensample.ui.screens.sign_up.SignUp

@Composable
fun ScreenMain(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.Login.route) {

        composable(Routes.Login.route) {
            LoginPage(navController = navController)
        }

        composable(Routes.SignUp.route) {
            SignUp(navController = navController)
        }

        composable(Routes.ForgotPassword.route) {
            ForgotPassword(navController = navController)
        }

    }
}
