package com.moviediscovery.app.data.local.dao

import androidx.room.*
import com.moviediscovery.app.data.local.entities.MovieEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface MovieDao {
    
    @Query("SELECT * FROM bookmarked_movies ORDER BY bookmarkedAt DESC")
    fun getAllBookmarkedMovies(): Flow<List<MovieEntity>>
    
    @Query("SELECT * FROM bookmarked_movies WHERE id = :movieId")
    suspend fun getBookmarkedMovie(movieId: Int): MovieEntity?
    
    @Query("SELECT EXISTS(SELECT 1 FROM bookmarked_movies WHERE id = :movieId)")
    suspend fun isMovieBookmarked(movieId: Int): Boolean
    
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBookmark(movie: MovieEntity)
    
    @Delete
    suspend fun deleteBookmark(movie: MovieEntity)
    
    @Query("DELETE FROM bookmarked_movies WHERE id = :movieId")
    suspend fun deleteBookmarkById(movieId: Int)
    
    @Query("DELETE FROM bookmarked_movies")
    suspend fun clearAllBookmarks()
    
    @Query("SELECT COUNT(*) FROM bookmarked_movies")
    suspend fun getBookmarkCount(): Int
    
    @Query("SELECT * FROM bookmarked_movies WHERE title LIKE '%' || :query || '%' OR overview LIKE '%' || :query || '%' ORDER BY bookmarkedAt DESC")
    fun searchBookmarks(query: String): Flow<List<MovieEntity>>
}