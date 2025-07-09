package com.moviediscovery.app.data.local.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.moviediscovery.app.domain.model.Cast
import com.moviediscovery.app.domain.model.Genre
import com.moviediscovery.app.domain.model.ProductionCompany

@Entity(tableName = "bookmarked_movies")
data class MovieEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val overview: String?,
    val posterPath: String?,
    val backdropPath: String?,
    val releaseDate: String?,
    val voteAverage: Double,
    val voteCount: Int,
    val popularity: Double,
    val genres: List<Genre>?,
    val runtime: Int?,
    val budget: Long?,
    val revenue: Long?,
    val tagline: String?,
    val productionCompanies: List<ProductionCompany>?,
    val cast: List<Cast>?,
    val bookmarkedAt: Long = System.currentTimeMillis()
)

class Converters {
    private val gson = Gson()
    
    @TypeConverter
    fun fromGenreList(value: List<Genre>?): String? {
        return gson.toJson(value)
    }
    
    @TypeConverter
    fun toGenreList(value: String?): List<Genre>? {
        return if (value == null) null else {
            val listType = object : TypeToken<List<Genre>>() {}.type
            gson.fromJson(value, listType)
        }
    }
    
    @TypeConverter
    fun fromProductionCompanyList(value: List<ProductionCompany>?): String? {
        return gson.toJson(value)
    }
    
    @TypeConverter
    fun toProductionCompanyList(value: String?): List<ProductionCompany>? {
        return if (value == null) null else {
            val listType = object : TypeToken<List<ProductionCompany>>() {}.type
            gson.fromJson(value, listType)
        }
    }
    
    @TypeConverter
    fun fromCastList(value: List<Cast>?): String? {
        return gson.toJson(value)
    }
    
    @TypeConverter
    fun toCastList(value: String?): List<Cast>? {
        return if (value == null) null else {
            val listType = object : TypeToken<List<Cast>>() {}.type
            gson.fromJson(value, listType)
        }
    }
}