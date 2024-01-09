package com.blank.home.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.blank.designsystem.theme.WallpaperTheme
import com.blank.domain.model.ImageData
import com.blank.domain.model.ProfileUser
import com.blank.home.R
import com.blank.uikit.component.ImageComponent
import com.blank.uikit.util.UiState


@Composable
fun DetailItemScreen(
    idImage: Int,
    modifier: Modifier = Modifier,
    navigateBack: () -> Unit,
    viewModel: DetailViewModel = hiltViewModel(),

    ) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let {
        when (it) {
            is UiState.Loading -> {
                viewModel.getWallpaperDetail(idImage)
            }

            is UiState.Success -> {
                DetailContent(detailData = it.data, onBackClick = navigateBack)
            }

            is UiState.Error -> {}
        }
    }
}

@Composable
fun onImageLoading() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun DetailContent(
    detailData: ImageData,
    onBackClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Box {
            ImageComponent(url = detailData.fullImage)
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = stringResource(R.string.back),
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { onBackClick() }
            )
        }
        Column {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 8.dp)
            ) {
                ImageComponent(
                    url = detailData.profileUser.imgProfile,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(20.dp),
                )
                Text(
                    text = detailData.profileUser.name,
                    fontSize = 14.sp,
                    modifier = Modifier.padding(10.dp)
                )

                Spacer(
                    Modifier
                        .weight(1f)
                        .fillMaxHeight()
                )
                Icon(
                    imageVector = Icons.Default.Favorite,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.size(10.dp)
                )
                Text(
                    text = detailData.totalLike.toString(),
                    fontSize = 12.sp,
                    modifier = Modifier.padding(horizontal = 8.dp)
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(start = 8.dp)
            ) {
                Icon(
                    imageVector = Icons.Default.LocationOn,
                    contentDescription = null,
                    tint = Color.Gray,
                    modifier = Modifier.size(10.dp)
                )
                Text(
                    text = detailData.profileUser.location,
                    fontSize = 12.sp,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Text(
                text = detailData.profileUser.bio,
                fontSize = 10.sp,
                modifier = Modifier.padding(10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DetailContentPreview() {
    WallpaperTheme {
        DetailContent(detailData = data, onBackClick = { })
    }
}

private val data = ImageData(
    id = 1,
    thumb = "https://images.unsplash.com/photo-1531975474574-e9d2732e8386?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0OTYxMzF8MHwxfHNlYXJjaHwxfHxpbmRvbmVzaWF8ZW58MHx8fHwxNjkzNzUzOTI2fDA&ixlib=rb-4.0.3&q=80&w=400",
    description = "Speaking of tourist destinations, there will be no end. Moreover, this nature is infinite to be explored. Glancing at a town in the southeast corner of the city of Malang is hidden a destination that in recent months began to rise and not out of the list of hunting photos of nature explorers.\r\n\r\nYes! Lumajang City, not only famous for its waterfall destinations. There is also a unique destination of this mountain go international background, especially if not Mount Semeru. Actually this is not a tourist spot, but the dramatic landscape of his dream lens is the eye of nature explorers.",
    fullImage = "https://images.unsplash.com/photo-1531975474574-e9d2732e8386?crop=entropy&cs=srgb&fm=jpg&ixid=M3w0OTYxMzF8MHwxfHNlYXJjaHwxfHxpbmRvbmVzaWF8ZW58MHx8fHwxNjkzNzUzOTI2fDA&ixlib=rb-4.0.3&q=85",
    totalLike = 581,
    profileUser = ProfileUser(
        name = "Ifan Bima",
        location = "Based in Malang, East Java, Indonesia",
        imgProfile = "https://images.unsplash.com/profile-1531636037432-f05593d1ced9?ixlib=rb-4.0.3&crop=faces&fit=crop&w=128&h=128",
        bio = "↟ Outdoor Photography Lifestyle ↟\r\nℹ Hello my name is ifan, i live in Indonesia. I really like outdoor activities and create works by conveying impression through my color and characteristic.",

        )
)