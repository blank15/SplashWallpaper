package com.blank.domain.usecase

import com.blank.domain.model.ImageData
import com.blank.domain.repository.WallpaperRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetWallpaperContentUseCase @Inject constructor(
    private val wallpaperRepository: WallpaperRepository
) {

    operator fun invoke(): Flow<List<ImageData>> {
        return flowOf(wallpaperRepository.getWallpaperData())
    }

}