package com.example.clock.ui.alarmClock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.clock.Header
import com.example.clock.R

@Composable
fun AlarmClockScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            Header(
                nameClock = "Будильник",
                items = listOf("Редакт.", "Настройки"),
                iconMore = ImageVector.vectorResource(R.drawable.more)
            )
        }
    ) { padding ->
        Box(modifier = modifier.padding(padding))
    }
}