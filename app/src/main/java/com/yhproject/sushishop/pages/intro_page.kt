package com.yhproject.sushishop.pages

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yhproject.sushishop.R
import com.yhproject.sushishop.navigations.Pages
import com.yhproject.sushishop.ui.theme.colorGrey
import com.yhproject.sushishop.ui.theme.colorLightRed
import com.yhproject.sushishop.ui.theme.colorRed

@Composable
fun IntroPage(modifier: Modifier = Modifier, navController: NavController) {
    Column (
        verticalArrangement = Arrangement.SpaceEvenly,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .background(color = colorRed)
            .fillMaxSize()
            .padding(all = 20.dp)
    ){

        // shop name ---
        Text(
            text = "SUSHI MAN",
            style = TextStyle(fontSize = 28.sp),
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
        )

        Spacer(modifier = modifier.height(height = 20.dp))

        // icon ---
        Box (
            modifier
                .padding(50.dp)
                .align(alignment = CenterHorizontally)
        ){
            Image(painter = painterResource(id = R.drawable.salmon_eggs), contentDescription = "")
        }

        Spacer(modifier = modifier.height(height = 20.dp))

        // title ---
        Text(
            text = "THE TASTE OF JAPANESE FOOD",
            style = TextStyle(fontSize = 34.sp),
            fontFamily = FontFamily.SansSerif,
            color = Color.White,
        )

        Spacer(modifier = modifier.height(height = 10.dp))

        // subtitle ---
        Text(
            text = "Feel the taste of the most popular Japanese food from anywhere and anytime",
            color = colorGrey,
            lineHeight = 30.sp
        )

        Spacer(modifier = modifier.height(height = 20.dp))

        // get started button ---
        Box (
            modifier
                .height(60.dp)
                .fillMaxWidth()
                .background(colorLightRed, shape = RoundedCornerShape(40.dp))
                .clip(RoundedCornerShape(40.dp))
                .clickable { navController.navigate(route = Pages.MenuPage.route) },
            contentAlignment = Center
        ){
            
            Row(
                horizontalArrangement = Arrangement.Center,
            ){
                Text(
                    text = "Get Started",
                    color = Color.White,
                )
                
                Spacer(modifier = modifier.width(width = 10.dp))
                
                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "",
                    tint = Color.White,
                )
            }
        }

        Spacer(modifier = modifier.height(height = 10.dp))

    }

} //! --- IntroPage --- !\\