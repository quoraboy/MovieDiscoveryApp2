package com.moviediscovery.app.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\nH&J \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\r0\nH\u00a6@\u00a2\u0006\u0002\u0010\bJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012J\u0014\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\nH&J\u0014\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\nH&J\u0016\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012J\u0016\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0011H\u00a6@\u00a2\u0006\u0002\u0010\u0012J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000b0\n2\u0006\u0010\u001a\u001a\u00020\u001bH&J\u001c\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00140\n2\u0006\u0010\u001a\u001a\u00020\u001bH&\u00a8\u0006\u001d"}, d2 = {"Lcom/moviediscovery/app/domain/repository/MovieRepository;", "", "addBookmark", "", "movie", "Lcom/moviediscovery/app/domain/model/Movie;", "(Lcom/moviediscovery/app/domain/model/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllBookmarks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBookmarkedMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getGenres", "Lcom/moviediscovery/app/common/Resource;", "Lcom/moviediscovery/app/domain/model/Genre;", "getMovieDetails", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Landroidx/paging/PagingData;", "getTrendingMovies", "isMovieBookmarked", "", "removeBookmark", "searchBookmarks", "query", "", "searchMovies", "app_debug"})
public abstract interface MovieRepository {
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getTrendingMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getNowPlayingMovies();
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieDetails(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.moviediscovery.app.common.Resource<com.moviediscovery.app.domain.model.Movie>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.moviediscovery.app.common.Resource<java.util.List<com.moviediscovery.app.domain.model.Genre>>>> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> getBookmarkedMovies();
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isMovieBookmarked(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.model.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object removeBookmark(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllBookmarks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> searchBookmarks(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
}