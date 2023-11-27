package com.example.kotlinmultiplataformmovieapp.di

import com.example.kotlinmultiplataformmovieapp.data.remote.MovieService
import com.example.kotlinmultiplataformmovieapp.data.remote.RemoteDataSource
import com.example.kotlinmultiplataformmovieapp.data.repository.MovieRepositoryImpl
import com.example.kotlinmultiplataformmovieapp.domain.repository.MovieRepository
import com.example.kotlinmultiplataformmovieapp.domain.usecase.GetMovieUseCase
import com.example.kotlinmultiplataformmovieapp.domain.usecase.GetMoviesUseCase
import com.example.kotlinmultiplataformmovieapp.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(),get()) }
    factory { MovieService() }
}

private val utilityModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    single<MovieRepository> { MovieRepositoryImpl(get()) }
    factory { GetMoviesUseCase() }
    factory { GetMovieUseCase() }
}

private val sharedModules = listOf(domainModule, dataModule, utilityModule)

fun getSharedModuler() = sharedModules