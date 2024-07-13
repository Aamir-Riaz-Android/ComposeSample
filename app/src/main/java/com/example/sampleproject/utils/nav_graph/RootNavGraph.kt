package com.example.sampleproject.utils.nav_graph

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.sampleproject.feature.details.DetailsScreen
import com.example.sampleproject.feature.login.LoginPage
import com.example.sampleproject.feature.welcome.OnBoardingViewModel
import com.example.sampleproject.feature.welcome.WelcomeScreen


@Composable
fun RootNavigationGraph(
    navHostController: NavHostController,
    onBoardingViewModel: OnBoardingViewModel = hiltViewModel()
) {
    NavHost(
        navController = navHostController,
        startDestination = RootNavRoutes.LoginScreen.route

    ) {
        composable(route = RootNavRoutes.LoginScreen.route) {
            LoginPage(navController = navHostController)
        }
        composable(
            route = "${RootNavRoutes.OnBoardingScreen.route}/{user}",
            arguments = listOf(navArgument("user") { type = NavType.StringType })
        ) { backStackEntry ->
            val user = backStackEntry.arguments?.getString("user") ?: ""
            WelcomeScreen(
                username = user,
                navHostController = navHostController,
                viewModel = onBoardingViewModel
            )
        }
        composable(
            route = "${RootNavRoutes.DetailsScreen.route}/{clickedId}",
            arguments = listOf(navArgument("clickedId") { type = NavType.IntType })

        ) { backStackEntry ->
            val drugId: Int = backStackEntry.arguments?.getInt("clickedId") ?: 0
            DetailsScreen(
                drugId = drugId,
                navHostController = navHostController,
                viewModel = onBoardingViewModel
            )
        }

    }
}