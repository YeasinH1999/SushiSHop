package com.yhproject.sushishop

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.view.WindowCompat
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.yhproject.sushishop.navigations.Navigation

class MainActivity : ComponentActivity() {

    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            WindowCompat.setDecorFitsSystemWindows(
                window, false
            )

            navController = rememberNavController()
            Navigation(navController = navController)
        }
    }
}