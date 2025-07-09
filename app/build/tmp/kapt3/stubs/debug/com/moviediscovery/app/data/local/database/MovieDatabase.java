package com.moviediscovery.app.data.local.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/moviediscovery/app/data/local/database/MovieDatabase;", "Landroidx/room/RoomDatabase;", "()V", "movieDao", "Lcom/moviediscovery/app/data/local/dao/MovieDao;", "Companion", "app_debug"})
@androidx.room.Database(entities = {com.moviediscovery.app.data.local.entities.MovieEntity.class}, version = 1, exportSchema = false)
@androidx.room.TypeConverters(value = {com.moviediscovery.app.data.local.entities.Converters.class})
public abstract class MovieDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String DATABASE_NAME = "movie_database";
    @kotlin.jvm.Volatile()
    @org.jetbrains.annotations.Nullable()
    private static volatile com.moviediscovery.app.data.local.database.MovieDatabase INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final com.moviediscovery.app.data.local.database.MovieDatabase.Companion Companion = null;
    
    public MovieDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.moviediscovery.app.data.local.dao.MovieDao movieDao();
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/moviediscovery/app/data/local/database/MovieDatabase$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/moviediscovery/app/data/local/database/MovieDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.moviediscovery.app.data.local.database.MovieDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}