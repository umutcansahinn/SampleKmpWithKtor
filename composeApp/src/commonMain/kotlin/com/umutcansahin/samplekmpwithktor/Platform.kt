package com.umutcansahin.samplekmpwithktor

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform