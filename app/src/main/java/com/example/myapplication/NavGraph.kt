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
    //val weatherViewModel = WeatherViewmodel()
    NavHost(navController = navController, startDestination = SCREEN_A) {
        composable<SCREEN_A> {
            ScreenA(onClick = {
                navController.navigate(SCREEN_B) {
                    launchSingleTop
                }
            })
        }
        composable<SCREEN_B> {
            ScreenB(onClick = {
                navController.navigate(SCREEN_C)
            })
        }
        composable<SCREEN_C> {
            ScreenC(onClick = {
                navController.navigate(SCREEN_A) {
                    popUpTo<SCREEN_A> {
                        inclusive = true
                    }
                }
            })
        }
    }
}