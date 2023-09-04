package com.blank.domain.usecase

import com.blank.domain.model.ImageData
import com.blank.domain.model.ProfileUser
import com.data.model.ImageResponse
import com.data.repository.WallpaperRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetWallpaperContentUseCase @Inject constructor(
    private val wallpaperRepository: WallpaperRepository
) {

    operator fun invoke(): Flow<List<ImageData>> {
        return wallpaperRepository.getWallpaperData().mapToDomainModel()
    }

    private fun List<ImageResponse>.mapToDomainModel(): Flow<List<ImageData>> = flow {
        val listImageData = map {
            ImageData(
                it.id, it.thumb, it.fullImage, it.description, it.totalLike,
                ProfileUser(
                    it.profileUser.name,
                    it.profileUser.location,
                    it.profileUser.imgProfile,
                    it.profileUser.bio
                )
            )
        }
        emit(listImageData)
    }
}