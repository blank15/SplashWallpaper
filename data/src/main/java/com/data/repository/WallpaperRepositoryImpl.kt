package com.data.repository

import com.blank.domain.model.ImageData
import com.blank.domain.repository.WallpaperRepository
import com.data.model.FakeImageResponse
import com.data.model.ImageResponseDTO
import javax.inject.Inject

class WallpaperRepositoryImpl @Inject constructor() : WallpaperRepository {
    private val wallpaperData = mutableListOf<ImageResponseDTO>()

    init {
        if (wallpaperData.isEmpty()) {
            wallpaperData.addAll(FakeImageResponse.dummyImage)
        }
    }

    override fun getWallpaperData(): List<ImageData> {
        return wallpaperData.map { it.mapToDomainModel() }
    }

    override fun getDetailWallpaper(id: Int): ImageData =
        wallpaperData.find { it.id == id }?.mapToDomainModel() ?: ImageData()
}