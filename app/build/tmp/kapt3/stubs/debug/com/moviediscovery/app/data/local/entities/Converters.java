package com.moviediscovery.app.data.local.entities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\bH\u0007J\u001a\u0010\f\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\bH\u0007J\u001a\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u001a\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/moviediscovery/app/data/local/entities/Converters;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromCastList", "", "value", "", "Lcom/moviediscovery/app/domain/model/Cast;", "fromGenreList", "Lcom/moviediscovery/app/domain/model/Genre;", "fromProductionCompanyList", "Lcom/moviediscovery/app/domain/model/ProductionCompany;", "toCastList", "toGenreList", "toProductionCompanyList", "app_debug"})
public final class Converters {
    @org.jetbrains.annotations.NotNull()
    private final com.google.gson.Gson gson = null;
    
    public Converters() {
        super();
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromGenreList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.moviediscovery.app.domain.model.Genre> value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.moviediscovery.app.domain.model.Genre> toGenreList(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromProductionCompanyList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.moviediscovery.app.domain.model.ProductionCompany> value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.moviediscovery.app.domain.model.ProductionCompany> toProductionCompanyList(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String fromCastList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.moviediscovery.app.domain.model.Cast> value) {
        return null;
    }
    
    @androidx.room.TypeConverter()
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.moviediscovery.app.domain.model.Cast> toCastList(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
        return null;
    }
}