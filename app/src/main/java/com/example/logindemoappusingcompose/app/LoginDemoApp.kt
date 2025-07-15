package com.example.logindemoappusingcompose.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.logindemoappusingcompose.navigation.LoginDemoAppRouter
import com.example.logindemoappusingcompose.navigation.Screen
import com.example.logindemoappusingcompose.screens.LoginScreen

@Composable
fun LoginDemoApp() {
    Surface (
        modifier = Modifier.fillMaxWidth(),
        color = Color.White
    ) {
        Crossfade(targetState = LoginDemoAppRouter.currentScreen) { currentState ->
            when(currentState.value) {

                is Screen.LoginScreen-> {
                    LoginScreen()
                }

                is Screen.SignUpScreen-> {

                }

                is Screen.TermsAndConditionScreen->{

                }

            }
        }
    }
}