package org.example.composemultiplatform1.network

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import org.example.composemultiplatform1.model.Breach

interface ApiService{
    suspend fun getBreaches() : List<Breach>
}
