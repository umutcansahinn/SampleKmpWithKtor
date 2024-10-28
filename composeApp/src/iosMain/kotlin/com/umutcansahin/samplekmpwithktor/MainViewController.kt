package com.umutcansahin.samplekmpwithktor

import androidx.compose.runtime.remember
import androidx.compose.ui.window.ComposeUIViewController
import com.umutcansahin.samplekmpwithktor.network.InsultCensorClient
import com.umutcansahin.samplekmpwithktor.network.createHttpClient
import io.ktor.client.engine.darwin.Darwin

fun MainViewController() = ComposeUIViewController {
    App(
        client = remember {
            InsultCensorClient(createHttpClient(Darwin.create()))
        }
    )
}

