package com.data.model

import com.blank.domain.model.ImageData
import com.blank.domain.model.ProfileUser

data class ImageResponseDTO(
    val id: Int,
    val thumb: String,
    val fullImage: String,
    val description: String,
    val totalLike: Int,
    val profileUser: ProfileUserResponseDTO
) {
    fun mapToDomainModel(): ImageData {
        return ImageData(
            this.id, this.thumb, this.fullImage, this.description, this.totalLike,
            ProfileUser(
                this.profileUser.name,
                this.profileUser.location,
                this.profileUser.imgProfile,
                this.profileUser.bio
            )
        )
    }
}

data class ProfileUserResponseDTO(
    val name: String,
    val location: String,
    val imgProfile: String,
    val bio: String
)