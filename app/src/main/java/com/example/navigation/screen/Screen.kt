package com.example.navigation.screen

sealed class Screen(val route: String){
    object Home: Screen(route = "home_screen")
    object Details: Screen(route = "details_screen")
}
