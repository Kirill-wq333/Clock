package com.example.clock.ui.theme

import AlarmClock
import Stopwatch
import Timer
import WorldLine
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Warning


object Constants {
    val BottomNavItems = listOf(
        BottomNavItem(
            icon = Icons.Filled.Warning,
            label = "Мировые часы",
            route = "мировые часы"
        ),
        BottomNavItem(
            icon = Icons.Filled.Warning,
            label = "Будильник",
            route = "будильник"
        ),
        BottomNavItem(
            icon = Icons.Filled.Warning,
            label = "Секундомер",
            route = "секундомер"
        ),
        BottomNavItem(
            icon = Icons.Filled.Warning,
            label = "Таймер",
            route = "таймер"
        )
    )
}