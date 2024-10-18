package org.example.composemultiplatform1.di

import org.example.composemultiplatform1.repository.Repository
import org.example.composemultiplatform1.repository.RepositoryImpl
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val repositoryModule = module {
    singleOf(::RepositoryImpl).bind<Repository>()
}