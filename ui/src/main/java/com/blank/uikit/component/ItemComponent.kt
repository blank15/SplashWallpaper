package com.blank.uikit.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.blank.domain.model.ImageData

@Composable
fun onImageLoading() {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
    ) {
        CircularProgressIndicator()
    }
}

@Composable
fun ItemComponent(imageData: ImageData, modifier: Modifier = Modifier) {

    val shape = RoundedCornerShape(10.dp)
    Box(
        modifier
            .padding(8.dp)
            .background(color = Color.White, shape),
        contentAlignment = Alignment.BottomStart
    ) {
        ImageComponent(url = imageData.thumb,
            modifier = Modifier
                .clip(shape),
            onImageLoading = {
                onImageLoading()
            })
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(start = 8.dp)
        ) {
            ImageComponent(url = imageData.profileUser.imgProfile,
                modifier = Modifier
                    .clip(CircleShape)
                    .size(18.dp),
                onImageLoading = {
                    onImageLoading()
                })
            Text(
                text = imageData.profileUser.name,
                fontSize = 10.sp,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis,
                color = Color.White,
                modifier = Modifier.padding(10.dp)
            )
        }
    }

}

