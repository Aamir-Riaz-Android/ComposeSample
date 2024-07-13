package com.example.sampleproject.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.example.sampleproject.ui.theme.SecondaryGray2
import com.example.sampleproject.ui.theme.inputFieldRoundedShape

@Composable
fun InputTextField(
    modifier: Modifier = Modifier,
    textStyle: TextStyle = MaterialTheme.typography.bodyMedium,
    shape: Shape = MaterialTheme.shapes.inputFieldRoundedShape,
    maxLines: Int = Int.MAX_VALUE,
    //regex: Regex,
    keyboardType: KeyboardType,
    singleLine: Boolean = false,
    isEnabled: Boolean = true,
    isReadOnly: Boolean = false,
    colors: TextFieldColors = TextFieldDefaults.colors(
        focusedIndicatorColor = Color.Transparent,
        unfocusedIndicatorColor = Color.Transparent,
        disabledIndicatorColor = Color.Transparent,
        errorIndicatorColor = Color.Transparent
    ),
    hint: String = "",
    hintColor: Color = SecondaryGray2,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions(keyboardType = keyboardType),
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    errorMessage: String? = null,
    errorIndicationColor: Color = Red,
    trailingIcon: @Composable (() -> Unit)? = null,
    value: String = "",
    onValueChanged: (String) -> Unit
) {
    Column {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = if (errorMessage.isNullOrEmpty()) {
                        Color.Transparent
                    } else {
                        errorIndicationColor
                    },
                    shape = shape
                )
                .padding(4.dp),
        ) {
            TextField(
                modifier = modifier.height(56.dp),
                textStyle = textStyle,
                shape = shape,
                maxLines = maxLines,
                singleLine = singleLine,
                colors = colors,
                placeholder = {
                    Text(
                        text = hint, color = if (errorMessage.isNullOrEmpty()) {
                            hintColor
                        } else {
                            errorIndicationColor
                        }
                    )
                },
                visualTransformation = visualTransformation,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                trailingIcon = trailingIcon,
                value = value,
                onValueChange = onValueChanged,
                enabled = isEnabled,
                readOnly = isReadOnly,
            )
        }

        if (errorMessage?.isNotEmpty() == true) {
            Text(
                text = errorMessage,
                modifier = Modifier.padding(top = 4.dp),
                style = MaterialTheme.typography.bodySmall,
                color = Red
            )
        }
    }
}