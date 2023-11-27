package com.example.kotlinmultiplataformmovieapp.android

import android.app.Application
import com.example.kotlinmultiplataformmovieapp.android.di.appModule
import com.example.kotlinmultiplataformmovieapp.di.getSharedModules
import org.koin.core.context.startKoin

class Movie : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin{
            modules(appModule + getSharedModules())
        }
    }
}