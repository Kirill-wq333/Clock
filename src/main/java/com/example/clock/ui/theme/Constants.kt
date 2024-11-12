package com.example.clock.ui.theme

import AlarmClock
import Stopwatch
import Timer
import WorldLine


object Constants {
    val BottomNavItems = listOf(
        BottomNavItem(
            label = "Мировые часы",
            icon = WorldLine,
            route = "мировые часы"
        ),
        BottomNavItem(
            label = "Будильник",
            icon = AlarmClock,
            route = "будильник"
        ),
        BottomNavItem(
            label = "Секундомер",
            icon = Stopwatch,
            route = "секундомер"
        ),
        BottomNavItem(
            label = "Таймер",
            icon = Timer,
            route = "таймер"
        )
    )
}