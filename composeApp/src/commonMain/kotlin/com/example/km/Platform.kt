package com.example.km

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform