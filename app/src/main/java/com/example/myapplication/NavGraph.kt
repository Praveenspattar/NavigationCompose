package com.example.myapplication

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.screens.ScreenA
import com.example.myapplication.screens.ScreenB
import com.example.myapplication.screens.ScreenC

@Composable
fun Nav() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A") {
        composable(route = "A") {
            ScreenA(navController)
        }
        composable(route = "B") {
            ScreenB(navController)
        }
        composable(route = "C") {
            ScreenC(navController)
        }
    }
}