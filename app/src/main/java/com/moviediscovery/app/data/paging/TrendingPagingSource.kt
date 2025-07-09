package com.moviediscovery.app.data.paging

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.moviediscovery.app.data.mappers.toDomainModel
import com.moviediscovery.app.data.remote.api.MovieApi
import com.moviediscovery.app.domain.model.Movie
import java.text.SimpleDateFormat
import java.util.*

class TrendingPagingSource(
    private val api: MovieApi
) : PagingSource<Int, Movie>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        return try {
            val page = params.key ?: 1
            
            val response = api.getTrendingMovies(
                page = page
            )
            
            val movies = response.results.map { it.toDomainModel() }
            
            LoadResult.Page(
                data = movies,
                prevKey = if (page == 1) null else page - 1,
                nextKey = if (page >= response.totalPages) null else page + 1
            )
        } catch (e: Exception) {
            Log.d("TrendingPagingSource", "Error loading page: ${e.message}")
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }
}