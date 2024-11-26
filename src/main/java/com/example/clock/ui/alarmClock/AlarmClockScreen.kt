package com.example.clock.ui.alarmClock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.clock.Header

@Composable
fun AlarmClockScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            Header(
                nameClock = "Будильник",
                onClick = {}
            )
        }
    ) { padding ->
        Box(modifier = modifier.padding(padding))
    }
}