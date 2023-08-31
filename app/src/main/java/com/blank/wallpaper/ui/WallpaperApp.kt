package com.blank.wallpaper.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavGraph.Companion.findStartDestination

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.blank.about.navigation.aboutScreen
import com.blank.about.navigation.navigateToAbout
import com.blank.collection.ui.navigation.collectionScreen
import com.blank.collection.ui.navigation.navigateToCollection
import com.blank.designsystem.theme.WallpaperTheme
import com.blank.home.navigation.detailItemRouteScreen
import com.blank.home.navigation.homeRoute
import com.blank.home.navigation.homeScreen
import com.blank.home.navigation.navigateToHome
import com.blank.wallpaper.navigation.BottomBarDestination

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
){
    val bottomBarItem = BottomBarDestination.values().asList()
    Scaffold(
        bottomBar = {
          BottomBar(destination = bottomBarItem, navController = navController)
        },
        modifier = modifier,
    ) {innerPadding ->
        NavHost(navController = navController, startDestination = homeRoute,
            modifier= modifier.padding(innerPadding)){

            homeScreen()
            collectionScreen()
            aboutScreen()
            detailItemRouteScreen()

        }
    }

}

@Composable
private fun BottomBar(
    destination: List<BottomBarDestination>,
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavigationBar(modifier = modifier) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()

        destination.forEach {item ->
            val isSelected = navBackStackEntry?.destination?.route?.contains(item.name,true) ?: false
            val name = stringResource(id = item.titleTextId)
            NavigationBarItem(
                icon = {
                        if(isSelected){
                            Icon(
                                imageVector = item.selectedIcon,
                                contentDescription = name
                            )
                        }else
                        {
                            Icon(
                                imageVector = item.unselectedIcon,
                                contentDescription = name
                            )
                        }
                },
                label = {
                    Text(name)
                },
                selected = isSelected,
                onClick = {
                   navigateTopLevel(item,navController)
                }
            )
        }
    }
}

private fun navigateTopLevel(bottomBarDestination: BottomBarDestination,navController: NavHostController){
    val navOptions = navOptions {
        popUpTo(navController.graph.findStartDestination().id){
            saveState =true
        }
        restoreState = true
        launchSingleTop = true
    }
    when(bottomBarDestination){
        BottomBarDestination.HOME -> navController.navigateToHome(navOptions = navOptions)
        BottomBarDestination.COLLECTION -> navController.navigateToCollection(navOptions = navOptions)
        BottomBarDestination.ABOUT -> navController.navigateToAbout(navOptions = navOptions)
    }
}

@Preview(showBackground = true)
@Composable
fun WallpaperAppPreview(){
    WallpaperTheme {
        AppHost()
    }
}