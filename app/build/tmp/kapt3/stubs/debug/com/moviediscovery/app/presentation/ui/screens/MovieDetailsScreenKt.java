package com.moviediscovery.app.presentation.ui.screens;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u001a$\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\fH\u0003\u001a(\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007\u00a8\u0006\u0014"}, d2 = {"CastCard", "", "castMember", "Lcom/moviediscovery/app/domain/model/Cast;", "DetailItem", "label", "", "value", "MovieDetailsContent", "movie", "Lcom/moviediscovery/app/domain/model/Movie;", "onBookmarkClick", "Lkotlin/Function1;", "MovieDetailsScreen", "movieId", "", "onBackClick", "Lkotlin/Function0;", "viewModel", "Lcom/moviediscovery/app/presentation/viewmodel/MovieDetailsViewModel;", "app_debug"})
public final class MovieDetailsScreenKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @androidx.compose.runtime.Composable()
    public static final void MovieDetailsScreen(int movieId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> onBackClick, @org.jetbrains.annotations.NotNull()
    com.moviediscovery.app.presentation.viewmodel.MovieDetailsViewModel viewModel) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void MovieDetailsContent(com.moviediscovery.app.domain.model.Movie movie, kotlin.jvm.functions.Function1<? super com.moviediscovery.app.domain.model.Movie, kotlin.Unit> onBookmarkClick) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void DetailItem(java.lang.String label, java.lang.String value) {
    }
    
    @androidx.compose.runtime.Composable()
    private static final void CastCard(com.moviediscovery.app.domain.model.Cast castMember) {
    }
}