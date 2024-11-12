package com.example.clock

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

class BottomBar {
}@Composable
fun WorldClockBottomBar(
    worldClock: String
){
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.world_line),
            contentDescription = null
        )
        Text(
            text = worldClock,
            fontSize = 11.sp,
            color = Color.White,
            fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
            fontWeight = FontWeight.Medium
        )

    }
}
@Composable
fun AlarmClockBottomBar(
    alarmClock: String
){
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.alarm_clock),
            contentDescription = null
        )
        Text(
            text = alarmClock,
            fontSize = 11.sp,
            color = Color.White,
            fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
            fontWeight = FontWeight.Medium
        )

    }
}
@Composable
fun StopwatchBottomBar(
    stopwatch: String
){
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.stopwatch),
            contentDescription = null
        )

        Text(
            text = stopwatch,
            fontSize = 11.sp,
            color = Color.White,
            fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
            fontWeight = FontWeight.Medium
        )

    }
}
@Composable
fun TimerBottomBar(
    timer: String
){
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.timer),
            contentDescription = null
        )
        Text(
            text = timer,
            fontSize = 11.sp,
            color = Color.White,
            fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
            fontWeight = FontWeight.Medium
        )

    }
}


@Composable
fun NavHostContainerBottomBar(
    navController: NavHostController,
    padding: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = "Мировые часы",
        modifier = Modifier
            .padding(paddingValues = padding),
        contentAlignment = Alignment.Center
    ){
        composable("Мировые часы") {
            WorldClockBottomBar(
                worldClock = "Мировые часы"
            )
        }
        composable("Будильник") {
            AlarmClockBottomBar(
                alarmClock = "Будильник"
            )
        }
        composable("Секундомер") {
            StopwatchBottomBar(
                stopwatch = "Секундомер"
            )
        }
        composable("Таймер") {
            TimerBottomBar(
                timer = "Таймер"
            )
        }
    }
}