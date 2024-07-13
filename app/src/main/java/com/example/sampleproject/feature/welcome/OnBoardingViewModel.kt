package com.example.sampleproject.feature.welcome

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.sampleproject.data.response.Resources
import com.example.sampleproject.model.ApiResponse
import com.example.sampleproject.model.Drug
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.updateAndGet
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OnBoardingViewModel @Inject constructor(private val medicineUseCase: MedicineUseCase) :
    ViewModel(
    ) {
    private var medicineState = MutableStateFlow(OnBoardingState())

    val _medicineState = medicineState.asStateFlow()

    fun fetchMedicines() {
        viewModelScope.launch(Dispatchers.IO) {
            loading()
            medicineUseCase.invoke { response ->
                finishLoading()
                when (response) {
                    is Resources.Success -> {
                        response.data?.let { populateData(it) }
                    }

                    is Resources.Error -> {
                        //TODO add error use case here

                    }
                }
            }

        }

    }

    private fun populateData(apiResponse: ApiResponse) {
        //TODO refactor the backend api to avoid unnecessary iterations use the proper Json validation and formating
        val drugList = mutableListOf<Drug>()

        apiResponse.problems.forEach { problem ->
            problem.diabetes?.forEach { condition ->
                condition.medications.forEach { medication ->
                    medication.medicationsClasses.forEach { medicationClass ->
                        medicationClass.className.forEach { className ->
                            drugList.addAll(className.associatedDrug)
                        }
                    }
                }
            }

            problem.asthma?.forEach { condition ->
                condition.medications.forEach { medication ->
                    medication.medicationsClasses.forEach { medicationClass ->
                        medicationClass.className.forEach { className ->
                            drugList.addAll(className.associatedDrug)
                        }
                    }
                }
            }

            problem.diarrhea?.forEach { condition ->
                condition.medications.forEach { medication ->
                    medication.medicationsClasses.forEach { medicationClass ->
                        medicationClass.className.forEach { className ->
                            drugList.addAll(className.associatedDrug)
                        }
                    }
                }
            }
        }

        medicineState.updateAndGet { medicineState ->
            medicineState.copy(
                medicineList = apiResponse,
                drugList = drugList
            )
        }
    }

    private fun loading() {
        medicineState.updateAndGet { medicineState ->
            medicineState.copy(isLoadingRequired = true)
        }
    }

    private fun finishLoading() {
        medicineState.updateAndGet { medicineState ->
            medicineState.copy(isLoadingRequired = false)
        }
    }
}