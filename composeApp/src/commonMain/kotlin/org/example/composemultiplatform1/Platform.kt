package org.example.composemultiplatform1

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform