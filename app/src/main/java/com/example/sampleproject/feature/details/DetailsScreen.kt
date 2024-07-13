package com.example.sampleproject.feature.details

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavHostController
import com.example.sampleproject.components.DrugCard
import com.example.sampleproject.feature.welcome.OnBoardingViewModel

@Composable
fun DetailsScreen(
    drugId: Int,
    navHostController: NavHostController,
    viewModel: OnBoardingViewModel
) {
    val medicineState by viewModel._medicineState.collectAsStateWithLifecycle()
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        DrugCard(drug = medicineState.drugList[drugId]) {
        }
    }
}
