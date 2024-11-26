package com.example.clock.ui.worldClock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.clock.Header

@Composable
fun WorldClockScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            Header(
                nameClock = "Мировые часы",
                onClick = {}
            )
        }
    ) { padding ->
        Box(modifier = modifier.padding(padding))
    }
}