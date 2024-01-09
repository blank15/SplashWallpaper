package com.blank.domain.repository

import com.blank.domain.model.ImageData

interface WallpaperRepository {
    fun getWallpaperData(): List<ImageData>

    fun getDetailWallpaper(id: Int): ImageData
}