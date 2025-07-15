package com.example.logindemoappusingcompose.screens

import android.widget.Space
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.logindemoappusingcompose.R
import com.example.logindemoappusingcompose.components.HeadingTextComponent
import com.example.logindemoappusingcompose.components.MyTextFieldComponent
import com.example.logindemoappusingcompose.components.NormalTextComponent

@Composable
fun LoginScreen() {

    Surface (
        modifier = Modifier.fillMaxSize().background(Color.White).padding(28.dp)
    ) {
        Column {
            NormalTextComponent(value = stringResource(R.string.login))
            HeadingTextComponent(value = stringResource(R.string.welcome))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextFieldComponent(
                lableValue = stringResource(R.string.email),
                painterResource = painterResource(id = R.drawable.email),
                onTextSelected = {

                },
                errorStatus = false
            )
        }
    }

}