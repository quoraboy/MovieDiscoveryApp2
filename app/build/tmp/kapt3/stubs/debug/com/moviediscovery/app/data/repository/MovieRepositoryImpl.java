package com.moviediscovery.app.data.repository;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\u00020\bH\u0096@\u00a2\u0006\u0002\u0010\rJ\u0014\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000fH\u0016J \u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u00120\u000fH\u0096@\u00a2\u0006\u0002\u0010\rJ\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00120\u000f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u000fH\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u000fH\u0016J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u0016\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00a2\u0006\u0002\u0010\u0017J\u001c\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00100\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u001c\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00190\u000f2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/moviediscovery/app/data/repository/MovieRepositoryImpl;", "Lcom/moviediscovery/app/domain/repository/MovieRepository;", "api", "Lcom/moviediscovery/app/data/remote/api/MovieApi;", "dao", "Lcom/moviediscovery/app/data/local/dao/MovieDao;", "(Lcom/moviediscovery/app/data/remote/api/MovieApi;Lcom/moviediscovery/app/data/local/dao/MovieDao;)V", "addBookmark", "", "movie", "Lcom/moviediscovery/app/domain/model/Movie;", "(Lcom/moviediscovery/app/domain/model/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearAllBookmarks", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBookmarkedMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getGenres", "Lcom/moviediscovery/app/common/Resource;", "Lcom/moviediscovery/app/domain/model/Genre;", "getMovieDetails", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Landroidx/paging/PagingData;", "getTrendingMovies", "isMovieBookmarked", "", "removeBookmark", "searchBookmarks", "query", "", "searchMovies", "app_debug"})
public final class MovieRepositoryImpl implements com.moviediscovery.app.domain.repository.MovieRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.data.remote.api.MovieApi api = null;
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.data.local.dao.MovieDao dao = null;
    
    @javax.inject.Inject()
    public MovieRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.data.remote.api.MovieApi api, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.data.local.dao.MovieDao dao) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getTrendingMovies() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> getNowPlayingMovies() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<androidx.paging.PagingData<com.moviediscovery.app.domain.model.Movie>> searchMovies(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getMovieDetails(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.moviediscovery.app.common.Resource<com.moviediscovery.app.domain.model.Movie>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getGenres(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.moviediscovery.app.common.Resource<java.util.List<com.moviediscovery.app.domain.model.Genre>>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> getBookmarkedMovies() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object isMovieBookmarked(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object addBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.model.Movie movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object removeBookmark(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object clearAllBookmarks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.domain.model.Movie>> searchBookmarks(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
        return null;
    }
}