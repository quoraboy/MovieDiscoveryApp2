package com.moviediscovery.app.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.usecase.GetBookmarkedMoviesUseCase
import com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase
import com.moviediscovery.app.domain.usecase.SearchBookmarksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BookmarksViewModel @Inject constructor(
    private val getBookmarkedMoviesUseCase: GetBookmarkedMoviesUseCase,
    private val removeBookmarkUseCase: RemoveBookmarkUseCase,
    private val searchBookmarksUseCase: SearchBookmarksUseCase
) : ViewModel() {

    private val _searchQuery = MutableStateFlow("")
    val searchQuery: StateFlow<String> = _searchQuery.asStateFlow()

    private val _uiState = MutableStateFlow(BookmarksUiState())
    val uiState: StateFlow<BookmarksUiState> = _uiState.asStateFlow()

    val bookmarkedMovies: Flow<List<Movie>> = getBookmarkedMoviesUseCase()

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
    }

    fun getSearchResults(): Flow<List<Movie>> {
        return if (_searchQuery.value.isBlank()) {
            bookmarkedMovies
        } else {
            searchBookmarksUseCase(_searchQuery.value)
        }
    }

    fun removeBookmark(movieId: Int) {
        viewModelScope.launch {
            try {
                removeBookmarkUseCase(movieId)
                _uiState.value = _uiState.value.copy(
                    message = "Movie removed from bookmarks"
                )
            } catch (e: Exception) {
                _uiState.value = _uiState.value.copy(
                    error = e.localizedMessage ?: "Failed to remove bookmark"
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

data class BookmarksUiState(
    val isLoading: Boolean = false,
    val error: String? = null,
    val message: String? = null
)