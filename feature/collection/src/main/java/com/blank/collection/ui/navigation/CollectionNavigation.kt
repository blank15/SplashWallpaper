package com.blank.collection.ui.navigation
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.blank.collection.ui.CollectionScreen


const val collectionRoute = "collection_route"

fun NavController.navigateToCollection(navOptions: NavOptions? = null){
    this.navigate(collectionRoute,navOptions)
}

fun NavGraphBuilder.collectionScreen(){
    composable(collectionRoute){
        CollectionScreen()
    }
}