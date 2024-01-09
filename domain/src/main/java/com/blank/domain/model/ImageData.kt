package com.blank.domain.model

data class ImageData(
    val id: Int = 0,
    val thumb: String = "",
    val fullImage: String = "",
    val description: String = "",
    val totalLike: Int = 0,
    val profileUser: ProfileUser = ProfileUser()
) {
    private fun mapToDomainModel(): ImageData {
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

data class ProfileUser(
    val name: String = "",
    val location: String = "",
    val imgProfile: String = "",
    val bio: String = ""
)
