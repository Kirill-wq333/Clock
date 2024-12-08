package com.example.clock

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.clock.ui.alarmClock.AlarmClockScreen
import com.example.clock.ui.stopswatch.StopwatchScreen
import com.example.clock.ui.theme.ClockTheme
import com.example.clock.ui.timer.TimerScreen
import com.example.clock.ui.worldClock.WorldClockScreen


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClockTheme {
                Clock()
            }
        }
    }
}

@Composable
fun Clock() {
    var presses by remember { mutableIntStateOf(0) }
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { NavigateBottomBar(navController = navController) },
        floatingActionButton = {
            FloatingActionButton(onClick = { presses++ }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        },
        floatingActionButtonPosition = FabPosition.Center,
        content = { padding ->
            Box(
                modifier = Modifier
                    .padding(padding)
            ) {
                NavHost(
                    navController = navController,
                    startDestination = "WorldClock",
                    modifier = Modifier
                ) {
                    composable("WorldClock") {
                        WorldClockScreen()
                    }
                    composable("AlarmClock") {
                        AlarmClockScreen()
                    }
                    composable("Stopwatch") {
                        StopwatchScreen()
                    }
                    composable("Timer") {
                        TimerScreen()
                    }
                }
            }
        }
    )
}

@Preview
@Composable
fun WorldClockPreview(){
    Surface(color = Color(0xFF282323)) {
        Clock()
    }
}





