package com.moviediscovery.app.presentation.ui.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.moviediscovery.app.R
import com.moviediscovery.app.presentation.ui.screens.BookmarksScreen
import com.moviediscovery.app.presentation.ui.screens.HomeScreen
import com.moviediscovery.app.presentation.ui.screens.MovieDetailsScreen
import com.moviediscovery.app.presentation.ui.screens.SearchScreen

sealed class Screen(val route: String, val titleResId: Int, val icon: @Composable () -> Unit) {
    object Home : Screen("home", R.string.home, { Icon(Icons.Default.Home, contentDescription = null) })
    object Search : Screen("search", R.string.search, { Icon(Icons.Default.Search, contentDescription = null) })
    object Bookmarks : Screen("bookmarks", R.string.bookmarks, { Icon(Icons.Default.Favorite, contentDescription = null) })
    object MovieDetails : Screen("movie_details/{movieId}", R.string.movie_details, { Icon(Icons.Default.Home, contentDescription = null) }) {
        fun createRoute(movieId: Int) = "movie_details/$movieId"
    }
}

@Composable
fun MovieDiscoveryNavigation() {
    val navController = rememberNavController()
    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val bottomBarScreens = listOf(Screen.Home, Screen.Search, Screen.Bookmarks)

    Scaffold(
        bottomBar = {
            if (currentDestination?.route in bottomBarScreens.map { it.route }) {
                NavigationBar {
                    bottomBarScreens.forEach { screen ->
                        NavigationBarItem(
                            icon = screen.icon,
                            label = { Text(stringResource(screen.titleResId)) },
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                navController.navigate(screen.route) {
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    launchSingleTop = true
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) {
                HomeScreen(
                    onMovieClick = { movieId ->
                        navController.navigate(Screen.MovieDetails.createRoute(movieId))
                    }
                )
            }
            
            composable(Screen.Search.route) {
                SearchScreen(
                    onMovieClick = { movieId ->
                        navController.navigate(Screen.MovieDetails.createRoute(movieId))
                    }
                )
            }
            
            composable(Screen.Bookmarks.route) {
                BookmarksScreen(
                    onMovieClick = { movieId ->
                        navController.navigate(Screen.MovieDetails.createRoute(movieId))
                    }
                )
            }
            
            composable(Screen.MovieDetails.route) { backStackEntry ->
                val movieId = backStackEntry.arguments?.getString("movieId")?.toIntOrNull() ?: 0
                MovieDetailsScreen(
                    movieId = movieId,
                    onBackClick = { navController.popBackStack() }
                )
            }
        }
    }
}