package com.blank.home.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.staggeredgrid.LazyVerticalStaggeredGrid
import androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells
import androidx.compose.foundation.lazy.staggeredgrid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.blank.designsystem.theme.WallpaperTheme
import com.blank.domain.model.ImageData
import com.blank.uikit.component.ItemComponent


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val dummyData = mutableListOf(
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693335920607-82c9e696614a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693335920607-82c9e696614a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693335920607-82c9e696614a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693335920607-82c9e696614a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693335920607-82c9e696614a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693335920607-82c9e696614a?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHwzfHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),
        ImageData(
            1,
            "https://images.unsplash.com/photo-1693239492381-ca83f56fea43?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfGFsbHw0fHx8fHx8Mnx8MTY5MzUzMzk0M3w&ixlib=rb-4.0.3&q=80&w=400",
            title = "Title"
        ),

    )
    LazyVerticalStaggeredGrid(
        columns = StaggeredGridCells.Fixed(3),
        verticalItemSpacing = 8.dp,
        contentPadding = PaddingValues(5.dp),
    ) {
      items(dummyData){
          ItemComponent(it)
      }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    WallpaperTheme {
        HomeScreen()
    }
}

