package com.blank.domain.model

data class ImageData(
    val id: Int = 0,
    val thumb: String = "",
    val fullImage: String = "",
    val description: String = "",
    val totalLike: Int = 0,
    val profileUser: ProfileUser = ProfileUser()
)

data class ProfileUser(
    val name: String = "",
    val location: String = "",
    val imgProfile: String = "",
    val bio: String = ""
)