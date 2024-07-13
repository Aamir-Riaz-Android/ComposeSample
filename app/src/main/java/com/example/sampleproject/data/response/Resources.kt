package com.example.sampleproject.data.response

sealed class Resources<T>(val data: T? = null, val message: String? = null) {
    class Success<T>(data: T? = null) : Resources<T>(data)
    class Error<T>(message: String? = null, data: T? = null) : Resources<T>(data, message)
}