package org.example.composemultiplatform1.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import org.example.composemultiplatform1.model.Breach
import org.example.composemultiplatform1.repository.Repository
import org.example.composemultiplatform1.utils.ResponseModel

class HomeViewModel(
    private val repository: Repository
) : ViewModel(){
    private val _breaches = MutableStateFlow<ResponseModel<List<Breach>>>(ResponseModel.Loading)
    val breaches : StateFlow<ResponseModel<List<Breach>>> = _breaches

    init {
        getAllBreaches()
    }

    fun getAllBreaches(){
        viewModelScope.launch {
            repository.getAllBreaches().collect { _breaches.value = it }
        }
    }
}