package com.example.kotlinmultiplataformmovieapp.data.remote

@kotlinx.serialization.Serializable
internal data class MoviesResponse(
    val result: List<MovieRemote>
)
