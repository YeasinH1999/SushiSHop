package com.yhproject.sushishop.navigations

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yhproject.sushishop.pages.IntroPage
import com.yhproject.sushishop.pages.MenuPage

@Composable
fun Navigation(navController: NavHostController) {

    val navController = rememberNavController()

    NavHost(
        navController = navController, startDestination = Pages.IntroPage.route
    ){
        composable(route = Pages.IntroPage.route){
            IntroPage(navController = navController)
        }

        composable(route = Pages.MenuPage.route){
            MenuPage()
        }
    }

}