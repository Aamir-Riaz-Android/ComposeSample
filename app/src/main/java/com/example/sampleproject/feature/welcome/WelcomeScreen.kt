package com.example.sampleproject.feature.welcome

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.example.sampleproject.components.DrugCard
import com.example.sampleproject.utils.nav_graph.RootNavRoutes
import com.example.sampleproject.utils.utility_functions.getGreetingMessage

@Composable
fun WelcomeScreen(
    username: String = "",
    navHostController: NavHostController,
    viewModel: OnBoardingViewModel
) {
    val medicineState by viewModel._medicineState.collectAsStateWithLifecycle()
    var greeting by remember {
        mutableStateOf("")
    }
    var disPlayLoader by remember {
        mutableStateOf(false)
    }
    disPlayLoader = medicineState.isLoadingRequired

    LaunchedEffect(key1 = Unit, block = {
        greeting = getGreetingMessage()
        viewModel.fetchMedicines()
    })
    Box(modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "$greeting, $username!",
                fontSize = 24.sp,
                modifier = Modifier.padding(bottom = 16.dp)
            )

            LazyColumn {
                itemsIndexed(medicineState.drugList) { index, drug ->
                    DrugCard(drug) {
                        navHostController.navigate("${RootNavRoutes.DetailsScreen.route}/$index")
                    }
                }
            }
            if (disPlayLoader) {
                Box(
                    modifier = Modifier
                        .fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }

            }
        }
    }
}

