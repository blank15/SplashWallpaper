package com.blank.domain.usecase

import com.blank.domain.model.ImageData
import com.blank.domain.model.ProfileUser
import com.data.model.ImageResponse
import com.data.repository.WallpaperRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flowOf
import javax.inject.Inject

class GetWallpaperDetailUseCase @Inject constructor(
    private val wallpaperRepository: WallpaperRepository
) {

    operator fun invoke(id: Int): Flow<ImageData> {
        return wallpaperRepository.getDetailWallpaper(id)?.mapToDomainModel() ?: flowOf(ImageData())
    }

    private fun ImageResponse.mapToDomainModel(): Flow<ImageData> {
        val imageData = ImageData(
            this.id, this.thumb, this.fullImage, this.description, this.totalLike,
            ProfileUser(
                this.profileUser.name,
                this.profileUser.location,
                this.profileUser.imgProfile,
                this.profileUser.bio
            )
        )
        return flowOf(imageData)
    }
}