package org.example.composemultiplatform1

import androidx.compose.ui.window.ComposeUIViewController
import org.example.composemultiplatform1.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) { App() }