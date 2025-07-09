package com.moviediscovery.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u001aR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lcom/moviediscovery/app/presentation/viewmodel/MovieDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "getMovieDetailsUseCase", "Lcom/moviediscovery/app/domain/usecase/GetMovieDetailsUseCase;", "addBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/AddBookmarkUseCase;", "removeBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;", "isMovieBookmarkedUseCase", "Lcom/moviediscovery/app/domain/usecase/IsMovieBookmarkedUseCase;", "(Lcom/moviediscovery/app/domain/usecase/GetMovieDetailsUseCase;Lcom/moviediscovery/app/domain/usecase/AddBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/IsMovieBookmarkedUseCase;)V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/moviediscovery/app/presentation/viewmodel/MovieDetailsUiState;", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "clearError", "", "clearMessage", "loadMovieDetails", "movieId", "", "toggleBookmark", "movie", "Lcom/moviediscovery/app/domain/model/Movie;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class MovieDetailsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.GetMovieDetailsUseCase getMovieDetailsUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.AddBookmarkUseCase addBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase isMovieBookmarkedUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.moviediscovery.app.presentation.viewmodel.MovieDetailsUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.MovieDetailsUiState> uiState = null;
    
    @javax.inject.Inject()
    public MovieDetailsViewModel(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.GetMovieDetailsUseCase getMovieDetailsUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.AddBookmarkUseCase addBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase isMovieBookmarkedUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.MovieDetailsUiState> getUiState() {
        return null;
    }
    
    public final void loadMovieDetails(int movieId) {
    }
    
    public final void toggleBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.model.Movie movie) {
    }
    
    public final void clearMessage() {
    }
    
    public final void clearError() {
    }
}