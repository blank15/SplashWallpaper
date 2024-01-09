package com.data.di

import com.blank.domain.repository.WallpaperRepository
import com.data.repository.WallpaperRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface DataModule {
    @Binds
    fun bindWallpaperRepository(wallpaperRepositoryImpl: WallpaperRepositoryImpl): WallpaperRepository

}