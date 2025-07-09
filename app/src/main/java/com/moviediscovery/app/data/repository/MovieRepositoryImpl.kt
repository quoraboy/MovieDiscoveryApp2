package com.moviediscovery.app.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.moviediscovery.app.common.Resource
import com.moviediscovery.app.data.local.dao.MovieDao
import com.moviediscovery.app.data.mappers.toDomainModel
import com.moviediscovery.app.data.mappers.toEntity
import com.moviediscovery.app.data.paging.NowPlayingPagingSource
import com.moviediscovery.app.data.paging.SearchPagingSource
import com.moviediscovery.app.data.paging.TrendingPagingSource
import com.moviediscovery.app.data.remote.api.MovieApi
import com.moviediscovery.app.domain.model.Genre
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.repository.MovieRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepositoryImpl @Inject constructor(
    private val api: MovieApi,
    private val dao: MovieDao
) : MovieRepository {

    override fun getTrendingMovies(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { TrendingPagingSource(api) }
        ).flow
    }

    override fun getNowPlayingMovies(): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { NowPlayingPagingSource(api) }
        ).flow
    }

    override fun searchMovies(query: String): Flow<PagingData<Movie>> {
        return Pager(
            config = PagingConfig(
                pageSize = 20,
                enablePlaceholders = false
            ),
            pagingSourceFactory = { SearchPagingSource(api, query) }
        ).flow
    }

    override suspend fun getMovieDetails(movieId: Int): Flow<Resource<Movie>> = flow {
        try {
            emit(Resource.Loading())
            val movieDetails = api.getMovieDetails(movieId)
            val isBookmarked = dao.isMovieBookmarked(movieId)
            val movie = movieDetails.toDomainModel().copy(isBookmarked = isBookmarked)
            emit(Resource.Success(movie))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }

    override suspend fun getGenres(): Flow<Resource<List<Genre>>> = flow {
        try {
            emit(Resource.Loading())
            val genres = api.getGenres().genres.map { it.toDomainModel() }
            emit(Resource.Success(genres))
        } catch (e: Exception) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        }
    }

    override fun getBookmarkedMovies(): Flow<List<Movie>> {
        return dao.getAllBookmarkedMovies().map { entities ->
            entities.map { it.toDomainModel() }
        }
    }

    override suspend fun isMovieBookmarked(movieId: Int): Boolean {
        return dao.isMovieBookmarked(movieId)
    }

    override suspend fun addBookmark(movie: Movie) {
        dao.insertBookmark(movie.toEntity())
    }

    override suspend fun removeBookmark(movieId: Int) {
        dao.deleteBookmarkById(movieId)
    }

    override suspend fun clearAllBookmarks() {
        dao.clearAllBookmarks()
    }

    override fun searchBookmarks(query: String): Flow<List<Movie>> {
        return dao.searchBookmarks(query).map { entities ->
            entities.map { it.toDomainModel() }
        }
    }
}