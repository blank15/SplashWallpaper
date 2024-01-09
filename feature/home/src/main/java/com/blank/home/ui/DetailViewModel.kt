package com.blank.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blank.domain.model.ImageData
import com.blank.uikit.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
//    private val getWallpaperDetailUseCase:  GetWallpaperDetailUseCase
) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<ImageData>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<ImageData>>
        get() = _uiState

    fun getWallpaperDetail(id: Int) {
        viewModelScope.launch {
//            getWallpaperDetailUseCase(id)
//                .catch {
//                    _uiState.value = UiState.Error(it.message.toString())
//                }.collect {
//                    _uiState.value = UiState.Success(it)
//                }
        }
    }
}