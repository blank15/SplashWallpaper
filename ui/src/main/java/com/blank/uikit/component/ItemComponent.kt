package com.blank.uikit.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import com.blank.designsystem.theme.WallpaperTheme
import com.blank.domain.model.ImageData


@Composable
fun ItemComponent(imageData: ImageData, modifier: Modifier = Modifier) {
    val painter = rememberAsyncImagePainter(
        model = ImageRequest.Builder(LocalContext.current)
            .data(imageData.thumb)
            .size(Size.ORIGINAL)
            .build()
    )
    val shape =  RoundedCornerShape(10.dp)
    Box(
        modifier
            .padding(8.dp)
            .background(color = Color.White,shape),
        contentAlignment = Alignment.BottomStart
    ) {
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .clip(shape)

        )
        Text(
            text = imageData.title,
            color = Color.White,
            modifier = Modifier.padding(10.dp)
        )
    }

}

@Preview(showBackground = true)
@Composable
fun ImageItemPreview() {
    WallpaperTheme {
        ItemComponent(com.blank.domain.model.ImageData(1, "", "Title"))
    }
}