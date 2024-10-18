package org.example.composemultiplatform1

import android.app.Application
import org.example.composemultiplatform1.di.initKoin
import org.koin.android.ext.koin.androidContext


class AK1Application : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@AK1Application)
        }
    }
}