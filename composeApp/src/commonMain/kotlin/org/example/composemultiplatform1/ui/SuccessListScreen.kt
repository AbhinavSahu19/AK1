package org.example.composemultiplatform1.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.example.composemultiplatform1.model.Breach

@Composable
fun SuccessListScreen(
    list: List<Breach>
){
    LazyColumn (
        modifier = Modifier.fillMaxSize()
    ){
        items(list){breach ->
            BreachItemCard(breach)
        }
    }
}
