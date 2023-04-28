package com.example.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.navigation.screen.DetailsScreen
import com.example.navigation.screen.HomeScreen
import com.example.navigation.screen.Screen

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(route = Screen.Home.route) { HomeScreen(navController) }
        composable(route = Screen.Details.route) { DetailsScreen(navController) }
    }
}