package com.example.sampleproject

import com.example.sampleproject.feature.login.LoginViewModel
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class LoginUnitTestCase {
    @Test
  fun testLoginFlow() = runTest {
      val viewModel = LoginViewModel()
      viewModel.onUserEmailUpdated("testUser")
        assertEquals("testUser", viewModel.loginState.value.emailId)
  }
}