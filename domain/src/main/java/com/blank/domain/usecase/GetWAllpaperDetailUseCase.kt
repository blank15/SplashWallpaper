package com.blank.domain.usecase

import com.blank.domain.model.ImageData
import com.blank.domain.repository.WallpaperRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetWallpaperDetailUseCase @Inject constructor(
    private val wallpaperRepository: @JvmSuppressWildcards WallpaperRepository
) {
    operator fun invoke(id: Int): Flow<ImageData> {
        return flowOf(wallpaperRepository.getDetailWallpaper(id))
    }


}