package com.blank.domain.usecase

import com.blank.domain.model.ImageData
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf

class GetWallpaperContentUseCase {

    operator fun invoke() : Flow<List<ImageData>> {
        return flowOf(listOf<ImageData>())
    }
}