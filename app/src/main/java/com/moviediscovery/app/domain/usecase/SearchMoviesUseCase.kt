package com.moviediscovery.app.domain.usecase

import androidx.paging.PagingData
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class SearchMoviesUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(query: String): Flow<PagingData<Movie>> {
        return repository.searchMovies(query)
    }
}