package com.example.sampleproject.data.remote

import com.example.sampleproject.model.ApiResponse
import retrofit2.Response
import retrofit2.http.GET

interface NetworkApiService {
    @GET("a901bc78-03f2-4cff-aa51-8f3f9520170f")
    suspend fun getMedicineList(): Response<ApiResponse>
}