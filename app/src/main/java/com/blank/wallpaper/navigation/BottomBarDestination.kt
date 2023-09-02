package com.blank.wallpaper.navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Collections
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material.icons.rounded.Collections
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Info
import androidx.compose.ui.graphics.vector.ImageVector
import com.blank.home.R as homeRes
import com.blank.collection.R as collectionRes
import com.blank.about.R as aboutRes

enum class BottomBarDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val titleTextId: Int,
) {
    HOME(
        selectedIcon = Icons.Rounded.Home,
        unselectedIcon = Icons.Outlined.Home,
        titleTextId = homeRes.string.home_name
    ),
    COLLECTION(
        selectedIcon = Icons.Rounded.Collections,
        unselectedIcon = Icons.Outlined.Collections,
        titleTextId = collectionRes.string.collection_name
    ),
    ABOUT(
        selectedIcon = Icons.Rounded.Info,
        unselectedIcon = Icons.Outlined.Info,
        titleTextId = aboutRes.string.about_name
    )
}