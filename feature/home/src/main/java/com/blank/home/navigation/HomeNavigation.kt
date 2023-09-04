package com.blank.home.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.blank.home.ui.DetailItemScreen
import com.blank.home.ui.HomeScreen

const val homeRoute = "home_route"
const val detailItemRoute = "detail_item_route"
const val detailIdImageArgs = "detailIdImage"

fun NavController.navigateToHome(navOptions: NavOptions? = null){
    this.navigate(homeRoute,navOptions)
}

fun NavGraphBuilder.homeScreen(
    navigateToDetail: (Int) -> Unit,
) {
    composable(homeRoute) {
        HomeScreen(navigateToDetail)
    }
}

fun NavController.navigateToDetailItem(idImage: Int) {
    this.navigate("$detailItemRoute/$idImage")
}

fun NavGraphBuilder.detailItemRouteScreen(onBackPress: () -> Unit) {
    composable(
        route = "$detailItemRoute/{$detailIdImageArgs}",
        arguments = listOf(navArgument(detailIdImageArgs) { type = NavType.IntType }),
    ) {
        val id = it.arguments?.getInt(detailIdImageArgs) ?: 0
        DetailItemScreen(
            id,
            navigateBack = onBackPress
        )
    }
}

