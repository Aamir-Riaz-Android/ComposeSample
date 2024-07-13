package com.example.sampleproject.feature.welcome

import com.example.sampleproject.data.remote.NetworkApiService
import com.example.sampleproject.model.ApiResponse
import javax.inject.Inject

class MedicineRepository @Inject constructor(
     private val networkApiService: NetworkApiService
) {
    suspend fun getAllMedicines(): ApiResponse? {
        return networkApiService.getMedicineList().body()
    }
}