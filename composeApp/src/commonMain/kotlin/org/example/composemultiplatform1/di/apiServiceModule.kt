package org.example.composemultiplatform1.di

import org.example.composemultiplatform1.network.ApiService
import org.example.composemultiplatform1.network.ApiServiceImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val apiServiceModule = module {
    singleOf(::ApiServiceImpl).bind<ApiService>()
}