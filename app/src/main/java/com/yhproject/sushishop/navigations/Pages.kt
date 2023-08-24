package com.yhproject.sushishop.navigations

sealed class Pages (val route : String){

    object IntroPage : Pages("intro_page")
    object MenuPage : Pages("menu_page")

}