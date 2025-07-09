package com.moviediscovery.app.data.remote.api

import com.moviediscovery.app.data.remote.dto.GenresResponse
import com.moviediscovery.app.data.remote.dto.MovieDto
import com.moviediscovery.app.data.remote.dto.MovieResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface MovieApi {
    
    @GET("discover/movie")
    suspend fun getTrendingMovies(
        @Query("include_adult") includeAdult: Boolean = false,
        @Query("include_video") includeVideo: Boolean = false,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1,
        @Query("sort_by") sortBy: String = "popularity.desc",
        @Query("with_release_type") releaseType: String = "2|3"
    ): MovieResponse
    
    @GET("movie/now_playing")
    suspend fun getNowPlayingMovies(
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1,
        @Query("region") region: String = "US"
    ): MovieResponse
    
    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Query("language") language: String = "en-US",
        @Query("append_to_response") appendToResponse: String = "credits"
    ): MovieDto
    
    @GET("search/movie")
    suspend fun searchMovies(
        @Query("query") query: String,
        @Query("include_adult") includeAdult: Boolean = false,
        @Query("language") language: String = "en-US",
        @Query("page") page: Int = 1
    ): MovieResponse
    
    @GET("genre/movie/list")
    suspend fun getGenres(
        @Query("language") language: String = "en-US"
    ): GenresResponse
    
    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
        const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/"
        const val POSTER_SIZE = "w500"
        const val BACKDROP_SIZE = "w1280"
        const val PROFILE_SIZE = "w185"

        fun getImageUrl(path: String?, size: String = POSTER_SIZE): String {
            return if (!path.isNullOrBlank()) {
                val normalizedPath = if (path.startsWith("/")) path else "/$path"
                "${IMAGE_BASE_URL}${size}$normalizedPath"
            } else {
                "https://via.placeholder.com/500x750?text=No+Image"
            }
        }
        
        fun getBackdropUrl(path: String?): String {
            return if (path != null) {
                "${IMAGE_BASE_URL}${BACKDROP_SIZE}${path}"
            } else {
                "https://via.placeholder.com/1280x720?text=No+Backdrop"
            }
        }
        
        fun getProfileUrl(path: String?): String {
            return if (path != null) {
                "${IMAGE_BASE_URL}${PROFILE_SIZE}${path}"
            } else {
                "https://via.placeholder.com/185x278?text=No+Photo"
            }
        }
    }
}