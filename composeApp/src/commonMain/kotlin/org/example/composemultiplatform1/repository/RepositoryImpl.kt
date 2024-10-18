package org.example.composemultiplatform1.repository

import kotlinx.coroutines.awaitCancellation
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import org.example.composemultiplatform1.model.Breach
import org.example.composemultiplatform1.network.ApiService
import org.example.composemultiplatform1.utils.ResponseModel

class RepositoryImpl(
    private val apiService: ApiService
) : Repository{
    override fun getAllBreaches(): Flow<ResponseModel<List<Breach>>> = flow{
        emit(ResponseModel.Loading)

        try {
            val response = apiService.getBreaches()
            emit(ResponseModel.Success(response))
        }catch (e: Exception){
            emit(ResponseModel.Error(e.message ?: "Unknown Error Occurred"))
        }

    }
}