package com.blank.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blank.home.ui.DetailItemScreen
import com.blank.home.ui.HomeScreen

const val homeRoute = "home_route"
const val detailItemRoute ="detail_item_route"

fun NavController.navigateToHome(navOptions: NavOptions? = null){
    this.navigate(homeRoute,navOptions)
}

fun NavGraphBuilder.homeScreen(){
    composable(homeRoute){
        HomeScreen()
    }
}

fun NavController.navigateToDetailItem(navOptions: NavOptions? = null){
    this.navigate(detailItemRoute,navOptions)
}

fun NavGraphBuilder.detailItemRouteScreen(){
    composable(detailItemRoute){
        DetailItemScreen()
    }
}