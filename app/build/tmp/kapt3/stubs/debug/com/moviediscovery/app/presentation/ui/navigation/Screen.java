package com.moviediscovery.app.presentation.ui.navigation;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B*\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\u0002\u0010\nR\u001c\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u0015\u0016\u0017\u0018\u00a8\u0006\u0019"}, d2 = {"Lcom/moviediscovery/app/presentation/ui/navigation/Screen;", "", "route", "", "titleResId", "", "icon", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "getIcon", "()Lkotlin/jvm/functions/Function0;", "getRoute", "()Ljava/lang/String;", "getTitleResId", "()I", "Bookmarks", "Home", "MovieDetails", "Search", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen$Bookmarks;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen$Home;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen$MovieDetails;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen$Search;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String route = null;
    private final int titleResId = 0;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function0<kotlin.Unit> icon = null;
    
    private Screen(java.lang.String route, int titleResId, kotlin.jvm.functions.Function0<kotlin.Unit> icon) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final int getTitleResId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function0<kotlin.Unit> getIcon() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moviediscovery/app/presentation/ui/navigation/Screen$Bookmarks;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Bookmarks extends com.moviediscovery.app.presentation.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.moviediscovery.app.presentation.ui.navigation.Screen.Bookmarks INSTANCE = null;
        
        private Bookmarks() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moviediscovery/app/presentation/ui/navigation/Screen$Home;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Home extends com.moviediscovery.app.presentation.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.moviediscovery.app.presentation.ui.navigation.Screen.Home INSTANCE = null;
        
        private Home() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/moviediscovery/app/presentation/ui/navigation/Screen$MovieDetails;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen;", "()V", "createRoute", "", "movieId", "", "app_debug"})
    public static final class MovieDetails extends com.moviediscovery.app.presentation.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.moviediscovery.app.presentation.ui.navigation.Screen.MovieDetails INSTANCE = null;
        
        private MovieDetails() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String createRoute(int movieId) {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/moviediscovery/app/presentation/ui/navigation/Screen$Search;", "Lcom/moviediscovery/app/presentation/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Search extends com.moviediscovery.app.presentation.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull()
        public static final com.moviediscovery.app.presentation.ui.navigation.Screen.Search INSTANCE = null;
        
        private Search() {
        }
    }
}