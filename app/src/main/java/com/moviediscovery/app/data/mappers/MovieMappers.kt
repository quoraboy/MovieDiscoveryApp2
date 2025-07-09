package com.moviediscovery.app.data.mappers

import com.moviediscovery.app.data.local.entities.MovieEntity
import com.moviediscovery.app.data.remote.dto.CastDto
import com.moviediscovery.app.data.remote.dto.GenreDto
import com.moviediscovery.app.data.remote.dto.MovieDto
import com.moviediscovery.app.data.remote.dto.ProductionCompanyDto
import com.moviediscovery.app.domain.model.Cast
import com.moviediscovery.app.domain.model.Genre
import com.moviediscovery.app.domain.model.Movie
import com.moviediscovery.app.domain.model.ProductionCompany

fun MovieDto.toDomainModel(): Movie {
    return Movie(
        id = id,
        title = title,
        overview = overview,
        posterPath = posterPath,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        voteAverage = voteAverage,
        voteCount = voteCount,
        popularity = popularity,
        genres = genres?.map { it.toDomainModel() },
        runtime = runtime,
        budget = budget,
        revenue = revenue,
        tagline = tagline,
        productionCompanies = productionCompanies?.map { it.toDomainModel() },
        cast = credits?.cast?.map { it.toDomainModel() }
    )
}

fun GenreDto.toDomainModel(): Genre {
    return Genre(
        id = id,
        name = name
    )
}

fun ProductionCompanyDto.toDomainModel(): ProductionCompany {
    return ProductionCompany(
        id = id,
        name = name,
        logoPath = logoPath
    )
}

fun CastDto.toDomainModel(): Cast {
    return Cast(
        id = id,
        name = name,
        character = character,
        profilePath = profilePath
    )
}

fun Movie.toEntity(): MovieEntity {
    return MovieEntity(
        id = id,
        title = title,
        overview = overview,
        posterPath = posterPath,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        voteAverage = voteAverage,
        voteCount = voteCount,
        popularity = popularity,
        genres = genres,
        runtime = runtime,
        budget = budget,
        revenue = revenue,
        tagline = tagline,
        productionCompanies = productionCompanies,
        cast = cast
    )
}

fun MovieEntity.toDomainModel(): Movie {
    return Movie(
        id = id,
        title = title,
        overview = overview,
        posterPath = posterPath,
        backdropPath = backdropPath,
        releaseDate = releaseDate,
        voteAverage = voteAverage,
        voteCount = voteCount,
        popularity = popularity,
        genres = genres,
        runtime = runtime,
        budget = budget,
        revenue = revenue,
        tagline = tagline,
        productionCompanies = productionCompanies,
        cast = cast,
        isBookmarked = true
    )
}