package com.example.clock

import android.graphics.drawable.Icon
import android.icu.text.CaseMap.Title
import android.media.Image
import android.os.Bundle
import android.provider.AlarmClock
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.RoundRect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.clock.ui.theme.ClockTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ClockTheme {
                WorldClock()
            }
        }
    }
}

@Composable
fun WorldClock(
){
    Scaffold(
        bottomBar = {
            Box(
             modifier = Modifier
                 .fillMaxWidth()
                 .background(
                     color = Color(0xFF404040)
                 ),
                contentAlignment = Alignment.Center
            ){
                 Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(17.dp, 9.5.dp),
                     horizontalArrangement = Arrangement.SpaceBetween,
                     verticalAlignment = Alignment.CenterVertically
                 ){
                     WC(
                         worldClock = "Мировые часы"
                     )
                     AlarmClock(
                         alarmClock = "Будильник"
                     )
                     Stopwatch(
                         stopwatch = "Секундомер"
                     )
                     Timer(
                         timer = "Тфймер"
                     )
                 }
            }
        }
    ) {
        Box(
            modifier = Modifier
                .padding(it),
        )
    }
}


@Composable
fun WC(
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
            fontWeight = FontWeight.Medium,
        )
    }
}
@Composable
fun AlarmClock(
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
            fontWeight = FontWeight.Medium,
        )
    }
}
@Composable
fun Stopwatch(
    stopwatch: String,
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
            fontWeight = FontWeight.Medium,
        )
    }
}
@Composable
fun Timer(
    timer: String,
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
            fontWeight = FontWeight.Medium,
        )
    }
}


@Preview
@Composable
fun WorldClockPreview(){
        WorldClock()
}



