package com.example.sampleproject.feature.welcome

import com.example.sampleproject.model.ApiResponse
import com.example.sampleproject.model.Drug

data class OnBoardingState(
    var isLoadingRequired: Boolean = false,
    var apiErrorMessage: String = "",
    var medicineList: ApiResponse? = null,
    var drugList: List<Drug> = emptyList()
)
