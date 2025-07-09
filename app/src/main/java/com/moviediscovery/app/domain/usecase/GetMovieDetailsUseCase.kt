package com.moviediscovery.app.domain.usecase

import com.moviediscovery.app.common.Resource
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetMovieDetailsUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    suspend operator fun invoke(movieId: Int): Flow<Resource<Movie>> {
        return repository.getMovieDetails(movieId)
    }
}