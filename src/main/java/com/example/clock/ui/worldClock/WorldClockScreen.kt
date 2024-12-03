package com.example.clock.ui.worldClock

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import com.example.clock.Header
import com.example.clock.R

@Composable
fun WorldClockScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(
        topBar = {
            Header(
                nameClock = "Мировые часы",
                items = listOf("Редакт.", "Настройки"),
                iconMore = ImageVector.vectorResource(R.drawable.more)
            )
        }
    ) { padding ->
        Box(modifier = modifier.padding(padding))
    }
}