package com.moviediscovery.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moviediscovery.app.common.Resource
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.usecase.AddBookmarkUseCase
import com.moviediscovery.app.domain.usecase.GetMovieDetailsUseCase
import com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase
import com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieDetailsViewModel @Inject constructor(
    private val getMovieDetailsUseCase: GetMovieDetailsUseCase,
    private val addBookmarkUseCase: AddBookmarkUseCase,
    private val removeBookmarkUseCase: RemoveBookmarkUseCase,
    private val isMovieBookmarkedUseCase: IsMovieBookmarkedUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(MovieDetailsUiState())
    val uiState: StateFlow<MovieDetailsUiState> = _uiState.asStateFlow()

    fun loadMovieDetails(movieId: Int) {
        viewModelScope.launch {
            getMovieDetailsUseCase(movieId).collect { resource ->
                _uiState.value = _uiState.value.copy(
                    movieDetails = resource,
                    isLoading = resource is Resource.Loading,
                    error = if (resource is Resource.Error) resource.message else null
                )
            }
        }
    }

    fun toggleBookmark(movie: Movie) {
        viewModelScope.launch {
            try {
                val isBookmarked = isMovieBookmarkedUseCase(movie.id)
                if (isBookmarked) {
                    removeBookmarkUseCase(movie.id)
                    _uiState.value = _uiState.value.copy(
                        message = "Removed from bookmarks",
                        movieDetails = (_uiState.value.movieDetails as? Resource.Success)?.let {
                            it.data?.let { movie ->
                                Resource.Success(movie.copy(isBookmarked = false))
                            } ?: Resource.Error("Movie data is missing")
                        } ?: _uiState.value.movieDetails
                    )
                } else {
                    addBookmarkUseCase(movie)
                    _uiState.value = _uiState.value.copy(
                        message = "Added to bookmarks",
                        movieDetails = (_uiState.value.movieDetails as? Resource.Success)?.let {
                            it.data?.let { movie ->
                                Resource.Success(movie.copy(isBookmarked = true))
                            } ?: Resource.Error("Movie data is missing")
                        } ?: _uiState.value.movieDetails
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

data class MovieDetailsUiState(
    val movieDetails: Resource<Movie> = Resource.Loading(),
    val isLoading: Boolean = false,
    val error: String? = null,
    val message: String? = null
)