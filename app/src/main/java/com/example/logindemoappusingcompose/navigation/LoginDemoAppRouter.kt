package com.example.logindemoappusingcompose.navigation

import android.graphics.pdf.content.PdfPageGotoLinkContent.Destination
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen() {
    object LoginScreen : Screen()
    object SignUpScreen : Screen()
    object TermsAndConditionScreen : Screen()
}


object LoginDemoAppRouter {

    val currentScreen : MutableState<Screen> = mutableStateOf(Screen.LoginScreen)

    fun navigateTo(destination: Screen) {
        currentScreen.value = destination
    }
}