package org.example.composemultiplatform1.repository

import kotlinx.coroutines.flow.Flow
import org.example.composemultiplatform1.model.Breach
import org.example.composemultiplatform1.utils.ResponseModel

interface Repository {
    fun getAllBreaches() : Flow<ResponseModel<List<Breach>>>
}