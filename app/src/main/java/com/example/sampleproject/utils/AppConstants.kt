package com.example.sampleproject.utils

object AppConstants {
    const val STAGING_BASE_URL = "https://run.mocky.io/v3/"
    val EMAIL_REGEX = "[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,64}".toRegex()

    //Routes
    const val ROUTE_LOGIN_SCREEN = "login_screen"
    const val ROUTE_WELCOME_SCREEN = "welcome_screen"
    const val ROUTE_DETAILS_SCREEN = "details_screen"
}