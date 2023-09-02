package com.blank.home.ui

import androidx.lifecycle.ViewModel
import com.blank.domain.usecase.GetWallpaperContentUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getWallpaperContentUseCase: GetWallpaperContentUseCase
) : ViewModel() {


}