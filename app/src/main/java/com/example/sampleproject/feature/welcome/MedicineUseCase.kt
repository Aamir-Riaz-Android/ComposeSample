package com.example.sampleproject.feature.welcome

import com.example.sampleproject.data.response.Resources
import com.example.sampleproject.model.ApiResponse
import javax.inject.Inject

class MedicineUseCase @Inject constructor(
    private val medicineRepository: MedicineRepository
) {
    suspend operator fun invoke(
        onResponse: (Resources<ApiResponse?>) -> Unit
    ) {
        try {
            val medicineList = medicineRepository.getAllMedicines()
            onResponse(Resources.Success(medicineList))

        } catch (e: Exception) {
            // TODO: Refactor error string
            onResponse(Resources.Error(e.message))
        }
    }
}