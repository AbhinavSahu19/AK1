package org.example.composemultiplatform1.di

import org.example.composemultiplatform1.ui.HomeViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::HomeViewModel)
}