package com.moviediscovery.app.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086B\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/moviediscovery/app/domain/usecase/GetMovieDetailsUseCase;", "", "repository", "Lcom/moviediscovery/app/domain/repository/MovieRepository;", "(Lcom/moviediscovery/app/domain/repository/MovieRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/moviediscovery/app/common/Resource;", "Lcom/moviediscovery/app/domain/model/Movie;", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetMovieDetailsUseCase {
    @org.jetbrains.annotations.NotNull()
    private final com.moviediscovery.app.domain.repository.MovieRepository repository = null;
    
    @javax.inject.Inject()
    public GetMovieDetailsUseCase(@org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.domain.repository.MovieRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.moviediscovery.app.common.Resource<com.moviediscovery.app.domain.model.Movie>>> $completion) {
        return null;
    }
}