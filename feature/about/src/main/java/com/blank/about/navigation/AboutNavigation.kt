package com.blank.about.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blank.about.ui.AboutScreen

const val aboutRoute = "about_route"
fun NavController.navigateToAbout(navOptions: NavOptions? = null){
    this.navigate(aboutRoute,navOptions)
}

fun NavGraphBuilder.aboutScreen(){
    composable(aboutRoute){
        AboutScreen()
    }
}