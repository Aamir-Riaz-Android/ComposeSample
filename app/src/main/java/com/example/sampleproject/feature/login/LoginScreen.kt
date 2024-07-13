package com.example.sampleproject.feature.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.example.sampleproject.components.InputTextField
import com.example.sampleproject.utils.AppConstants.EMAIL_REGEX
import com.example.sampleproject.utils.nav_graph.RootNavRoutes

@Composable
fun LoginPage(navController: NavHostController) {
    val viewModel: LoginViewModel = hiltViewModel()
    val loginState by viewModel.loginState.collectAsStateWithLifecycle()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {


        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(
                    start = 30.dp,
                    end = 30.dp,
                    top = 30.dp
                ),
        ) {
            Text(
                text = "Login",
                color = Color(26, 26, 26, 255),
                fontSize = TextUnit(value = 32f, type = TextUnitType.Sp),
                fontWeight = FontWeight.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 20.dp,
                        top = 20.dp
                    ),
                textAlign = TextAlign.Center
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                InputTextField(
                    hint = "Email",
                    value = loginState.emailId,
                    visualTransformation = VisualTransformation.None,
                    //regex = EMAIL_REGEX,
                    errorMessage = "",
                    keyboardType = KeyboardType.Text,
                ) { enteredEmail ->
                    viewModel.onUserEmailUpdated(enteredEmail)
                }
            }

            Spacer(modifier = Modifier.size(20.dp))
            Button(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .height(50.dp)
                    .clip(RoundedCornerShape(50.dp))
                    .background(
                        Color(
                            26, 26, 26, 255
                        )
                    ),
                onClick = {
                    navController.navigate("${RootNavRoutes.OnBoardingScreen.route}/${loginState.emailId}")
                },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(26, 26, 26, 255),
                    contentColor = Color.White
                )
            ) {
                Text(
                    text = "Login",
                    style = TextStyle(
                        color = Color.White,
                        fontSize = TextUnit(value = 16f, type = TextUnitType.Sp),
                        fontWeight = FontWeight.Black
                    )
                )
            }

        }
    }
}