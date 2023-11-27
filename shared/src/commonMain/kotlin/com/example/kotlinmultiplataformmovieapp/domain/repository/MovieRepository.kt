package com.example.kotlinmultiplataformmovieapp.domain.repository

import com.example.kotlinmultiplataformmovieapp.domain.model.Movie

internal interface MovieRepository {

    suspend fun getMovies(page : Int) : List<Movie>

    suspend fun getMovie(movieId : Int) : Movie
}