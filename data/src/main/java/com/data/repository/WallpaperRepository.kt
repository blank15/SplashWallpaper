package com.data.repository

import com.data.model.FakeImageResponse
import com.data.model.ImageResponse
import javax.inject.Inject

class WallpaperRepository @Inject constructor() {
    private val wallpaperData = mutableListOf<ImageResponse>()

    init {
        if (wallpaperData.isEmpty()) {
            wallpaperData.addAll(FakeImageResponse.dummyImage)
        }
    }

    fun getWallpaperData(): List<ImageResponse> {
        return wallpaperData
    }

    fun getDetailWallpaper(id: Int): ImageResponse? = wallpaperData.find { it.id == id }
}