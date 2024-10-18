package org.example.composemultiplatform1.di

import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin {
        config?.invoke(this)
        modules(apiServiceModule, networkModule, repositoryModule, viewModelModule)
    }
}