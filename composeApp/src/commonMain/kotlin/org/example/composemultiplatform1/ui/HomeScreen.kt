package org.example.composemultiplatform1.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import org.example.composemultiplatform1.model.Breach
import org.example.composemultiplatform1.ui.common.ErrorScreen
import org.example.composemultiplatform1.ui.common.GeneralBottomBar
import org.example.composemultiplatform1.ui.common.GeneralTopBar
import org.example.composemultiplatform1.ui.common.LoadingScreen
import org.example.composemultiplatform1.utils.ResponseModel
import org.koin.compose.viewmodel.koinViewModel
import org.koin.core.annotation.KoinExperimentalAPI

@OptIn(KoinExperimentalAPI::class)
@Composable
fun HomeScreen(){
    val viewModel = koinViewModel<HomeViewModel>()
    val breaches by viewModel.breaches.collectAsState()
    Scaffold (
        topBar = { GeneralTopBar() },
        bottomBar = { GeneralBottomBar() }
    ){
        when (breaches) {
            is ResponseModel.Error -> {
                ErrorScreen(
                    modifier = Modifier.fillMaxSize(),
                    (breaches as ResponseModel.Error).errorMsg,
                    viewModel::getAllBreaches
                )
            }

            ResponseModel.Loading -> {
                LoadingScreen(modifier = Modifier.fillMaxSize())
            }

            is ResponseModel.Success -> {
                SuccessListScreen((breaches as ResponseModel.Success<List<Breach>>).data)
            }
        }

    }
}

