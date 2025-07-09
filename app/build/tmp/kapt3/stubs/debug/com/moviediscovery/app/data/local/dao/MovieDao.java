package com.moviediscovery.app.data.local.dao;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000eH\'J\u000e\u0010\u0010\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u0016\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00a2\u0006\u0002\u0010\bJ\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000f0\u000e2\u0006\u0010\u0016\u001a\u00020\u0017H\'\u00a8\u0006\u0018"}, d2 = {"Lcom/moviediscovery/app/data/local/dao/MovieDao;", "", "clearAllBookmarks", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBookmark", "movie", "Lcom/moviediscovery/app/data/local/entities/MovieEntity;", "(Lcom/moviediscovery/app/data/local/entities/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteBookmarkById", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllBookmarkedMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getBookmarkCount", "getBookmarkedMovie", "insertBookmark", "isMovieBookmarked", "", "searchBookmarks", "query", "", "app_debug"})
@androidx.room.Dao()
public abstract interface MovieDao {
    
    @androidx.room.Query(value = "SELECT * FROM bookmarked_movies ORDER BY bookmarkedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.data.local.entities.MovieEntity>> getAllBookmarkedMovies();
    
    @androidx.room.Query(value = "SELECT * FROM bookmarked_movies WHERE id = :movieId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBookmarkedMovie(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.moviediscovery.app.data.local.entities.MovieEntity> $completion);
    
    @androidx.room.Query(value = "SELECT EXISTS(SELECT 1 FROM bookmarked_movies WHERE id = :movieId)")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object isMovieBookmarked(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion);
    
    @androidx.room.Insert(onConflict = 1)
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object insertBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.data.local.entities.MovieEntity movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBookmark(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.data.local.entities.MovieEntity movie, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM bookmarked_movies WHERE id = :movieId")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteBookmarkById(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "DELETE FROM bookmarked_movies")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object clearAllBookmarks(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT COUNT(*) FROM bookmarked_movies")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getBookmarkCount(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Integer> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM bookmarked_movies WHERE title LIKE \'%\' || :query || \'%\' OR overview LIKE \'%\' || :query || \'%\' ORDER BY bookmarkedAt DESC")
    @org.jetbrains.annotations.NotNull()
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.moviediscovery.app.data.local.entities.MovieEntity>> searchBookmarks(@org.jetbrains.annotations.NotNull()
    java.lang.String query);
}