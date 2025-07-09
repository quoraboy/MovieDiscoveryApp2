package com.moviediscovery.app.data.remote.dto

import com.google.gson.annotations.SerializedName

data class MovieDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("overview")
    val overview: String?,
    @SerializedName("poster_path")
    val posterPath: String?,
    @SerializedName("backdrop_path")
    val backdropPath: String?,
    @SerializedName("release_date")
    val releaseDate: String?,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int,
    @SerializedName("popularity")
    val popularity: Double,
    @SerializedName("genre_ids")
    val genreIds: List<Int>? = null,
    @SerializedName("genres")
    val genres: List<GenreDto>? = null,
    @SerializedName("runtime")
    val runtime: Int? = null,
    @SerializedName("budget")
    val budget: Long? = null,
    @SerializedName("revenue")
    val revenue: Long? = null,
    @SerializedName("tagline")
    val tagline: String? = null,
    @SerializedName("production_companies")
    val productionCompanies: List<ProductionCompanyDto>? = null,
    @SerializedName("credits")
    val credits: CreditsDto? = null
)

data class GenreDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String
)

data class ProductionCompanyDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("logo_path")
    val logoPath: String?
)

data class CreditsDto(
    @SerializedName("cast")
    val cast: List<CastDto>
)

data class CastDto(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("character")
    val character: String,
    @SerializedName("profile_path")
    val profilePath: String?
)

data class MovieResponse(
    @SerializedName("page")
    val page: Int,
    @SerializedName("results")
    val results: List<MovieDto>,
    @SerializedName("total_pages")
    val totalPages: Int,
    @SerializedName("total_results")
    val totalResults: Int
)

data class GenresResponse(
    @SerializedName("genres")
    val genres: List<GenreDto>
)