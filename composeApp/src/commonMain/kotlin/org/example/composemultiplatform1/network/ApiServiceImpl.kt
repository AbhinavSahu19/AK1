package org.example.composemultiplatform1.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import org.example.composemultiplatform1.model.Breach

class ApiServiceImpl(
    private val httpClient: HttpClient
): ApiService{
    val END_POINT = "breaches"
    override suspend fun getBreaches() : List<Breach> = httpClient.get("$BASE_API_URL$END_POINT").body()
}