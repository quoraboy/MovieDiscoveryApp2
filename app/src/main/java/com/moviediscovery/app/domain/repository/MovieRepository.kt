package com.moviediscovery.app.domain.repository

import androidx.paging.PagingData
import com.moviediscovery.app.domain.model.Genre
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.common.Resource
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    
    fun getTrendingMovies(): Flow<PagingData<Movie>>
    
    fun getNowPlayingMovies(): Flow<PagingData<Movie>>
    
    fun searchMovies(query: String): Flow<PagingData<Movie>>
    
    suspend fun getMovieDetails(movieId: Int): Flow<Resource<Movie>>
    
    suspend fun getGenres(): Flow<Resource<List<Genre>>>
    
    // Bookmarks
    fun getBookmarkedMovies(): Flow<List<Movie>>
    
    suspend fun isMovieBookmarked(movieId: Int): Boolean
    
    suspend fun addBookmark(movie: Movie)
    
    suspend fun removeBookmark(movieId: Int)
    
    suspend fun clearAllBookmarks()
    
    fun searchBookmarks(query: String): Flow<List<Movie>>
}