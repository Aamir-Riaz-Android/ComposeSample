package com.example.sampleproject.utils.nav_graph

import com.example.sampleproject.utils.AppConstants.ROUTE_DETAILS_SCREEN
import com.example.sampleproject.utils.AppConstants.ROUTE_LOGIN_SCREEN
import com.example.sampleproject.utils.AppConstants.ROUTE_WELCOME_SCREEN

sealed class RootNavRoutes(
    val route: String
) {
    data object LoginScreen : RootNavRoutes(ROUTE_LOGIN_SCREEN)
    data object OnBoardingScreen : RootNavRoutes(ROUTE_WELCOME_SCREEN)
    data object DetailsScreen : RootNavRoutes(ROUTE_DETAILS_SCREEN)
}


