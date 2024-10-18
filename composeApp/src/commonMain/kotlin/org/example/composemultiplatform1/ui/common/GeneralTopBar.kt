package org.example.composemultiplatform1.ui.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun GeneralTopBar(){
    Box (
        modifier = Modifier.statusBarsPadding()
    )
}