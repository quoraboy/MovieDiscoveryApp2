package com.moviediscovery.app.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Movie(
    val id: Int,
    val title: String,
    val overview: String?,
    val posterPath: String?,
    val backdropPath: String?,
    val releaseDate: String?,
    val voteAverage: Double,
    val voteCount: Int,
    val popularity: Double,
    val genres: List<Genre>? = null,
    val runtime: Int? = null,
    val budget: Long? = null,
    val revenue: Long? = null,
    val tagline: String? = null,
    val productionCompanies: List<ProductionCompany>? = null,
    val cast: List<Cast>? = null,
    val isBookmarked: Boolean = false
) : Parcelable

@Parcelize
data class Genre(
    val id: Int,
    val name: String
) : Parcelable

@Parcelize
data class ProductionCompany(
    val id: Int,
    val name: String,
    val logoPath: String?
) : Parcelable

@Parcelize
data class Cast(
    val id: Int,
    val name: String,
    val character: String,
    val profilePath: String?
) : Parcelable