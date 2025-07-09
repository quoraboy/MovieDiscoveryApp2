package com.moviediscovery.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B/\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0013R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u0006!"}, d2 = {"Lcom/moviediscovery/app/presentation/viewmodel/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "getTrendingMoviesUseCase", "Lcom/moviediscovery/app/domain/usecase/GetTrendingMoviesUseCase;", "getNowPlayingMoviesUseCase", "Lcom/moviediscovery/app/domain/usecase/GetNowPlayingMoviesUseCase;", "addBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/AddBookmarkUseCase;", "removeBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;", "isMovieBookmarkedUseCase", "Lcom/moviediscovery/app/domain/usecase/IsMovieBookmarkedUseCase;", "(Lcom/moviediscovery/app/domain/usecase/GetTrendingMoviesUseCase;Lcom/moviediscovery/app/domain/usecase/GetNowPlayingMoviesUseCase;Lcom/moviediscovery/app/domain/usecase/AddBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/IsMovieBookmarkedUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/moviediscovery/app/presentation/viewmodel/HomeUiState;", "nowPlayingMovies", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/moviediscovery/app/domain/model/Movie;", "getNowPlayingMovies", "()Lkotlinx/coroutines/flow/Flow;", "trendingMovies", "getTrendingMovies", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "clearMessage", "toggleBookmark", "movie", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.GetTrendingMoviesUseCase getTrendingMoviesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.GetNowPlayingMoviesUseCase getNowPlayingMoviesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.AddBookmarkUseCase addBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase isMovieBookmarkedUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.moviediscovery.app.presentation.viewmodel.HomeUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.HomeUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> trendingMovies = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> nowPlayingMovies = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.GetTrendingMoviesUseCase getTrendingMoviesUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.GetNowPlayingMoviesUseCase getNowPlayingMoviesUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.AddBookmarkUseCase addBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase isMovieBookmarkedUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.HomeUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getTrendingMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getNowPlayingMovies() {
        return null;
    }
    
    public final void toggleBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.model.Movie movie) {
    }
    
    public final void clearMessage() {
    }
    
    public final void clearError() {
    }
}