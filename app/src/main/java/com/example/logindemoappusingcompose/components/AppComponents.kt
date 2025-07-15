package com.example.logindemoappusingcompose.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.logindemoappusingcompose.ui.theme.TextColor
import com.example.logindemoappusingcompose.ui.theme.primary

@Composable
fun NormalTextComponent(value : String) {
    Text(
        text = value,
        modifier = Modifier.fillMaxWidth()
            .heightIn(min = 40.dp),
        style = TextStyle(
            fontStyle = FontStyle.Normal,
            fontSize = 24.sp,
            fontWeight = FontWeight.Normal
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

@Composable
fun HeadingTextComponent(value : String) {
    Text(
        text = value,
        modifier = Modifier.fillMaxWidth(),
        style = TextStyle(
            fontStyle = FontStyle.Normal,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        ),
        color = TextColor,
        textAlign = TextAlign.Center
    )
}

@Composable
fun MyTextFieldComponent(lableValue : String,painterResource: Painter,
                         onTextSelected : (String) -> Unit, errorStatus : Boolean = false) {
    val textValue = remember {
        mutableStateOf("")
    }

    OutlinedTextField(
        label = { Text(text = lableValue) },
        modifier = Modifier.fillMaxWidth().clip(ComponentShapes.small),
        colors = TextFieldDefaults.colors(
            focusedTextColor = primary,
            focusedLabelColor = primary,
            cursorColor = primary
        ),
        keyboardOptions = KeyboardOptions.Default,
        value = textValue.value,
        onValueChange = {
            textValue.value = it
            onTextSelected(it)
        },

        leadingIcon = {
            Icon(painter = painterResource, contentDescription = "")
        },

        isError = !errorStatus
    )
}

