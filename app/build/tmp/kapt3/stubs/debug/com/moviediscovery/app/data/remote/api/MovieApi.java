package com.moviediscovery.app.data.remote.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u0018\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J,\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u000b\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\fJ,\u0010\r\u001a\u00020\u000e2\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u0010\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0011JJ\u0010\u0012\u001a\u00020\u000e2\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u0015\u001a\u00020\u00142\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\n2\b\b\u0003\u0010\u0016\u001a\u00020\u00052\b\b\u0003\u0010\u0017\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0018J6\u0010\u0019\u001a\u00020\u000e2\b\b\u0001\u0010\u001a\u001a\u00020\u00052\b\b\u0003\u0010\u0013\u001a\u00020\u00142\b\b\u0003\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u000f\u001a\u00020\nH\u00a7@\u00a2\u0006\u0002\u0010\u001b\u00a8\u0006\u001d"}, d2 = {"Lcom/moviediscovery/app/data/remote/api/MovieApi;", "", "getGenres", "Lcom/moviediscovery/app/data/remote/dto/GenresResponse;", "language", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetails", "Lcom/moviediscovery/app/data/remote/dto/MovieDto;", "movieId", "", "appendToResponse", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNowPlayingMovies", "Lcom/moviediscovery/app/data/remote/dto/MovieResponse;", "page", "region", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingMovies", "includeAdult", "", "includeVideo", "sortBy", "releaseType", "(ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "query", "(Ljava/lang/String;ZLjava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
public abstract interface MovieApi {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String POSTER_SIZE = "w500";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BACKDROP_SIZE = "w1280";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PROFILE_SIZE = "w185";
    @org.jetbrains.annotations.NotNull()
    public static final com.moviediscovery.app.data.remote.api.MovieApi.Companion Companion = null;
    
    @retrofit2.http.GET(value = "discover/movie")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getTrendingMovies(@retrofit2.http.Query(value = "include_adult")
    boolean includeAdult, @retrofit2.http.Query(value = "include_video")
    boolean includeVideo, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "sort_by")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sortBy, @retrofit2.http.Query(value = "with_release_type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String releaseType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.moviediscovery.app.data.remote.dto.MovieResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/now_playing")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getNowPlayingMovies(@retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @retrofit2.http.Query(value = "region")
    @org.jetbrains.annotations.NotNull()
    java.lang.String region, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.moviediscovery.app.data.remote.dto.MovieResponse> $completion);
    
    @retrofit2.http.GET(value = "movie/{movie_id}")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getMovieDetails(@retrofit2.http.Path(value = "movie_id")
    int movieId, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Query(value = "append_to_response")
    @org.jetbrains.annotations.NotNull()
    java.lang.String appendToResponse, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.moviediscovery.app.data.remote.dto.MovieDto> $completion);
    
    @retrofit2.http.GET(value = "search/movie")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object searchMovies(@retrofit2.http.Query(value = "query")
    @org.jetbrains.annotations.NotNull()
    java.lang.String query, @retrofit2.http.Query(value = "include_adult")
    boolean includeAdult, @retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.moviediscovery.app.data.remote.dto.MovieResponse> $completion);
    
    @retrofit2.http.GET(value = "genre/movie/list")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getGenres(@retrofit2.http.Query(value = "language")
    @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.moviediscovery.app.data.remote.dto.GenresResponse> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004J\u0010\u0010\r\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/moviediscovery/app/data/remote/api/MovieApi$Companion;", "", "()V", "BACKDROP_SIZE", "", "BASE_URL", "IMAGE_BASE_URL", "POSTER_SIZE", "PROFILE_SIZE", "getBackdropUrl", "path", "getImageUrl", "size", "getProfileUrl", "app_debug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BASE_URL = "https://api.themoviedb.org/3/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String POSTER_SIZE = "w500";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String BACKDROP_SIZE = "w1280";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String PROFILE_SIZE = "w185";
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getImageUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        java.lang.String size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBackdropUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String path) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getProfileUrl(@org.jetbrains.annotations.Nullable()
        java.lang.String path) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}