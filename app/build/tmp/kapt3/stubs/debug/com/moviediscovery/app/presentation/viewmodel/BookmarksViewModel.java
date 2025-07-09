package com.moviediscovery.app.presentation.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0012\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u000bR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/moviediscovery/app/presentation/viewmodel/BookmarksViewModel;", "Landroidx/lifecycle/ViewModel;", "getBookmarkedMoviesUseCase", "Lcom/moviediscovery/app/domain/usecase/GetBookmarkedMoviesUseCase;", "removeBookmarkUseCase", "Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;", "searchBookmarksUseCase", "Lcom/moviediscovery/app/domain/usecase/SearchBookmarksUseCase;", "(Lcom/moviediscovery/app/domain/usecase/GetBookmarkedMoviesUseCase;Lcom/moviediscovery/app/domain/usecase/RemoveBookmarkUseCase;Lcom/moviediscovery/app/domain/usecase/SearchBookmarksUseCase;)V", "_searchQuery", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_uiState", "Lcom/moviediscovery/app/presentation/viewmodel/BookmarksUiState;", "bookmarkedMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/moviediscovery/app/domain/model/Movie;", "getBookmarkedMovies", "()Lkotlinx/coroutines/flow/Flow;", "searchQuery", "Lkotlinx/coroutines/flow/StateFlow;", "getSearchQuery", "()Lkotlinx/coroutines/flow/StateFlow;", "uiState", "getUiState", "clearError", "", "clearMessage", "getSearchResults", "removeBookmark", "movieId", "", "updateSearchQuery", "query", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class BookmarksViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.GetBookmarkedMoviesUseCase getBookmarkedMoviesUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.usecase.SearchBookmarksUseCase searchBookmarksUseCase = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> searchQuery = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.moviediscovery.app.presentation.viewmodel.BookmarksUiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.BookmarksUiState> uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> bookmarkedMovies = null;
    
    @javax.inject.Inject()
    public BookmarksViewModel(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.GetBookmarkedMoviesUseCase getBookmarkedMoviesUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.RemoveBookmarkUseCase removeBookmarkUseCase, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.usecase.SearchBookmarksUseCase searchBookmarksUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getSearchQuery() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.moviediscovery.app.presentation.viewmodel.BookmarksUiState> getUiState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> getBookmarkedMovies() {
        return null;
    }
    
    public final void updateSearchQuery(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> getSearchResults() {
        return null;
    }
    
    public final void removeBookmark(int movieId) {
    }
    
    public final void clearMessage() {
    }
    
    public final void clearError() {
    }
}