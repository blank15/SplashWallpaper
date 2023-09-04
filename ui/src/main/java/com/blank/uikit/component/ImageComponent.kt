package com.blank.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size

@Composable
fun ImageComponent(
    url: String,
    modifier: Modifier = Modifier,
    onImageLoading: @Composable () -> Unit
) {
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data(url)
            .crossfade(true)
            .transformations(
            )
            .size(Size.ORIGINAL)
            .build()

    )

    if (painter.state is AsyncImagePainter.State.Loading) {
        onImageLoading
    }

    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = modifier,
    )
}