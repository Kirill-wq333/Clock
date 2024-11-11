package com.example.clock.ui.theme

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.DateRange


object Constants {
    val BottomNavItems = listOf(
        BottomNavItem(
            label = "Мировые часы",
            icon = Icons.Filled.CheckCircle,
            route = "мировые часы"
        ),
        BottomNavItem(
            label = "Будильник",
            icon = Icons.Filled.CheckCircle,
            route = "будильник"
        ),
        BottomNavItem(
            label = "Секундомер",
            icon = Icons.Filled.CheckCircle,
            route = "секундомер"
        ),
        BottomNavItem(
            label = "Таймер",
            icon = Icons.Filled.CheckCircle,
            route = "таймер"
        )
    )
}