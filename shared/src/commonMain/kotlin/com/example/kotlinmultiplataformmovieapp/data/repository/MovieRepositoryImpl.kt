package com.example.kotlinmultiplataformmovieapp.data.repository

import com.example.kotlinmultiplataformmovieapp.data.remote.RemoteDataSource
import com.example.kotlinmultiplataformmovieapp.data.util.toMovie
import com.example.kotlinmultiplataformmovieapp.domain.model.Movie
import com.example.kotlinmultiplataformmovieapp.domain.repository.MovieRepository

internal class MovieRepositoryImpl(private val remoteDataSource : RemoteDataSource) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
       return remoteDataSource.getMovies(page = page).result.map {
           it.toMovie()
       }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }
}