package com.example.clock.ui.timer

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.clock.Header

@Composable
fun TimerScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            Header(
                nameClock = "Таймер",
                onClick = {}
            )
        }
    ) { padding ->
        Box(modifier = modifier.padding(padding))
    }
}