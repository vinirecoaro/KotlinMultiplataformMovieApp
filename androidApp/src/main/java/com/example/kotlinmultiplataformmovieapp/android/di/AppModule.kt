package com.example.kotlinmultiplataformmovieapp.android.di

import com.example.kotlinmultiplataformmovieapp.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { HomeViewModel(get()) }
}