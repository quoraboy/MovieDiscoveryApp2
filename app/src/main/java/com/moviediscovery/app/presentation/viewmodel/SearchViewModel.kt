package com.moviediscovery.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.usecase.AddBookmarkUseCase
import com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase
import com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase
import com.moviediscovery.app.domain.usecase.SearchMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.debounce
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.launch
import javax.inject.Inject

@OptIn(FlowPreview::class, ExperimentalCoroutinesApi::class)
@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchMoviesUseCase: SearchMoviesUseCase,
    private val addBookmarkUseCase: AddBookmarkUseCase,
    private val removeBookmarkUseCase: RemoveBookmarkUseCase,
    private val isMovieBookmarkedUseCase: IsMovieBookmarkedUseCase
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _uiState = MutableStateFlow(SearchUiState())
    val uiState: StateFlow<SearchUiState> = _uiState.asStateFlow()

    val searchResults: Flow<PagingData<Movie>> = searchQuery
        .debounce(500)
        .filter { it.trim().isNotEmpty() }
        .flatMapLatest { query ->
            searchMoviesUseCase(query).cachedIn(viewModelScope)
        }

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun clearSearch() {
        _searchQuery.value = ""
    }

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

data class SearchUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val message: String? = null
)