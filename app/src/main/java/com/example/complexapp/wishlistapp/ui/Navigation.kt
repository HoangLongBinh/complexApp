package com.example.complexapp.wishlistapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.complexapp.wishlistapp.Screen
import com.example.complexapp.wishlistapp.data.WishViewModel

@Composable
fun Navigation(
    viewModel: WishViewModel = androidx.lifecycle.viewmodel.compose.viewModel(),
    navController: NavHostController = rememberNavController()
) {
    //add a nav host
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) {
            HomeView(viewModel = viewModel, navController = navController)  //register HomeView screen
        }
        composable(Screen.AddScreen.route) {
            AddEditDetailView(viewModel = viewModel, navController = navController)  //register Add Screen
        }
    }

}