package com.moviediscovery.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.usecase.AddBookmarkUseCase
import com.moviediscovery.app.domain.usecase.GetNowPlayingMoviesUseCase
import com.moviediscovery.app.domain.usecase.GetTrendingMoviesUseCase
import com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase
import com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getTrendingMoviesUseCase: GetTrendingMoviesUseCase,
    private val getNowPlayingMoviesUseCase: GetNowPlayingMoviesUseCase,
    private val addBookmarkUseCase: AddBookmarkUseCase,
    private val removeBookmarkUseCase: RemoveBookmarkUseCase,
    private val isMovieBookmarkedUseCase: IsMovieBookmarkedUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())
    val uiState: StateFlow<HomeUiState> = _uiState.asStateFlow()

    val trendingMovies: Flow<PagingData<Movie>> = getTrendingMoviesUseCase()
        .cachedIn(viewModelScope)

    val nowPlayingMovies: Flow<PagingData<Movie>> = getNowPlayingMoviesUseCase()
        .cachedIn(viewModelScope)

    fun toggleBookmark(movie: Movie) {
        viewModelScope.launch {
            try {
                val isBookmarked = isMovieBookmarkedUseCase(movie.id)
                if (isBookmarked) {
                    removeBookmarkUseCase(movie.id)
                    _uiState.value = _uiState.value.copy(
                        message = "Removed from bookmarks"
                    )
                } else {
                    addBookmarkUseCase(movie)
                    _uiState.value = _uiState.value.copy(
                        message = "Added to bookmarks"
                    )
                }
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    error = e.localizedMessage ?: "An error occurred"
                )
            }
        }
    }

    fun clearMessage() {
        _uiState.value = _uiState.value.copy(message = null)
    }

    fun clearError() {
        _uiState.value = _uiState.value.copy(error = null)
    }
}

data class HomeUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val message: String? = null
)