package com.moviediscovery.app.domain.usecase

import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetBookmarkedMoviesUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(): Flow<List<Movie>> {
        return repository.getBookmarkedMovies()
    }
}

class AddBookmarkUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(movie: Movie) {
        repository.addBookmark(movie)
    }
}

class RemoveBookmarkUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int) {
        repository.removeBookmark(movieId)
    }
}

class IsMovieBookmarkedUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int): Boolean {
        return repository.isMovieBookmarked(movieId)
    }
}

class SearchBookmarksUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(query: String): Flow<List<Movie>> {
        return repository.searchBookmarks(query)
    }
}