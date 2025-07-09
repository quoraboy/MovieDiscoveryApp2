package com.moviediscovery.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0017J\u000e\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\rR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013\u00a8\u0006$"}, d2 = {"Lcom/moviediscovery/app/presentation/viewmodel/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "searchMoviesUseCase", "Lcom/moviediscovery/app/domain/usecase/SearchMoviesUseCase;", "addBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/AddBookmarkUseCase;", "removeBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;", "isMovieBookmarkedUseCase", "Lcom/moviediscovery/app/domain/usecase/IsMovieBookmarkedUseCase;", "(Lcom/moviediscovery/app/domain/usecase/SearchMoviesUseCase;Lcom/moviediscovery/app/domain/usecase/AddBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/IsMovieBookmarkedUseCase;)V", "_searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiState", "Lcom/moviediscovery/app/presentation/viewmodel/SearchUiState;", "searchQuery", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "searchResults", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/moviediscovery/app/domain/model/Movie;", "getSearchResults", "()Lkotlinx/coroutines/flow/Flow;", "uiState", "getUiState", "clearError", "", "clearMessage", "clearSearch", "toggleBookmark", "movie", "updateSearchQuery", "query", "app_debug"})
@kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class, kotlinx.coroutines.ExperimentalCoroutinesApi.class})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.SearchMoviesUseCase searchMoviesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.AddBookmarkUseCase addBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase isMovieBookmarkedUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.moviediscovery.app.presentation.viewmodel.SearchUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.SearchUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> searchResults = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.SearchMoviesUseCase searchMoviesUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.AddBookmarkUseCase addBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.IsMovieBookmarkedUseCase isMovieBookmarkedUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.SearchUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getSearchResults() {
        return null;
    }
    
    public final void updateSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void clearSearch() {
    }
    
    public final void toggleBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.model.Movie movie) {
    }
    
    public final void clearMessage() {
    }
    
    public final void clearError() {
    }
}