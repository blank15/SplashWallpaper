package com.data.model

data class ImageResponse(
    val id: Int,
    val thumb: String,
    val fullImage: String,
    val description: String,
    val totalLike: Int,
    val profileUser: ProfileUserResponse
)

data class ProfileUserResponse(
    val name: String,
    val location: String,
    val imgProfile: String,
    val bio: String
)