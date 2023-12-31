package com.blank.home.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blank.domain.model.ImageData
import com.blank.domain.usecase.GetWallpaperContentUseCase
import com.blank.uikit.util.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getWallpaperContentUseCase: GetWallpaperContentUseCase
) : ViewModel() {

    private val _uiState: MutableStateFlow<UiState<List<ImageData>>> =
        MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<ImageData>>>
        get() = _uiState

    fun getWallpaperContent() {
        viewModelScope.launch {
            getWallpaperContentUseCase()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }.collect {
                    _uiState.value = UiState.Success(it)
                }
        }
    }
}