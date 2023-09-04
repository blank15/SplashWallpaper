package com.blank.home.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.blank.domain.model.ImageData
import com.blank.uikit.component.ItemComponent
import com.blank.uikit.util.UiState


@Composable
fun HomeScreen(
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let {
        when (it) {
            is UiState.Loading -> {
                viewModel.getWallpaperContent()
            }

            is UiState.Success -> {
                HomeContent(imageData = it.data, navigateToDetail)
            }

            is UiState.Error -> {}
        }
    }

}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    imageData: List<ImageData>,
    navigateToDetail: (Int) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        verticalItemSpacing = 8.dp,
        contentPadding = PaddingValues(5.dp),
    ) {
        items(imageData) {
            ItemComponent(it,
                modifier = Modifier.clickable {
                    navigateToDetail(it.id)
                })
        }
    }
}


