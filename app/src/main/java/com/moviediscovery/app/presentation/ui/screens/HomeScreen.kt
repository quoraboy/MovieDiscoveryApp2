package com.moviediscovery.app.presentation.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.collectAsLazyPagingItems
import com.moviediscovery.app.R
import com.moviediscovery.app.presentation.ui.components.MovieSection
import com.moviediscovery.app.presentation.viewmodel.HomeViewModel

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HomeScreen(
    onMovieClick: (Int) -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val uiState by viewModel.uiState.collectAsState()
    val trendingMovies = viewModel.trendingMovies.collectAsLazyPagingItems()
    val nowPlayingMovies = viewModel.nowPlayingMovies.collectAsLazyPagingItems()
    
    val isRefreshing = trendingMovies.loadState.refresh is LoadState.Loading ||
            nowPlayingMovies.loadState.refresh is LoadState.Loading
    
    val pullRefreshState = rememberPullRefreshState(
        refreshing = isRefreshing,
        onRefresh = {
            trendingMovies.refresh()
            nowPlayingMovies.refresh()
        }
    )

    // Handle messages
    LaunchedEffect(uiState.message) {
        uiState.message?.let {
            // Show snackbar or toast
            viewModel.clearMessage()
        }
    }

    LaunchedEffect(uiState.error) {
        uiState.error?.let {
            // Show error snackbar
            viewModel.clearError()
        }
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .pullRefresh(pullRefreshState)
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                Text(
                    text = stringResource(R.string.app_name),
                    style = MaterialTheme.typography.headlineMedium,
                    color = MaterialTheme.colorScheme.primary
                )
            }

            item {
                MovieSection(
                    title = stringResource(R.string.trending_movies),
                    movies = trendingMovies,
                    onMovieClick = onMovieClick,
                    onBookmarkClick = { movie -> viewModel.toggleBookmark(movie) }
                )
            }

            item {
                MovieSection(
                    title = stringResource(R.string.now_playing_movies),
                    movies = nowPlayingMovies,
                    onMovieClick = onMovieClick,
                    onBookmarkClick = { movie -> viewModel.toggleBookmark(movie) }
                )
            }
        }

        PullRefreshIndicator(
            refreshing = isRefreshing,
            state = pullRefreshState,
            modifier = Modifier.align(Alignment.TopCenter)
        )
    }
}