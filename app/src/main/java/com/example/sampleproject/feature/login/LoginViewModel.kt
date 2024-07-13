package com.example.sampleproject.feature.login

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.updateAndGet
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() : ViewModel() {

    val TAG = "LoginViewModel()"
    private var _loginState: MutableStateFlow<LoginState> =
        MutableStateFlow(LoginState())

    val loginState = _loginState.asStateFlow()

    fun onUserEmailUpdated(value: String) {
        _loginState.updateAndGet { loginState ->
            loginState.copy(
                emailId = value
            )
        }
    }
}