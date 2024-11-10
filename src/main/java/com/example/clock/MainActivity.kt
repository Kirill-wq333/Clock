package com.example.clock

import android.os.Bundle
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
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.clock.ui.theme.ClockTheme
//import com.example.clock.ui.theme.Constants

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
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
//           BottomNavigationBar(navController = navController)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color(0xFF404040)
                    )
            ){
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(17.dp, 9.5.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
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
                        timer = "Таймер"
                    )
                }
            }
        },
       content =  {
//           NavHostContainer(navController = navController, padding = it)
         Box(modifier = Modifier
         .padding(it))
    }
  )
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
                fontWeight = FontWeight.Medium
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
                fontWeight = FontWeight.Medium
            )

    }
}
@Composable
fun Stopwatch(
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
fun Timer(
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


@Preview
@Composable
fun WorldClockPreview(){
    Surface(color = Color(0xFF282323)) {
        WorldClock()
    }

}

@Composable
fun NavHostContainer(
    navController: NavHostController,
    padding: PaddingValues
) {
    NavHost(
        navController = navController,
        startDestination = "Мировые часы",
        modifier = Modifier
            .padding(paddingValues = padding),
        ){
        composable("Мировое часы") {
            WC(
                worldClock = "Мировые часы"
            )
        }
        composable("Будильник") {
            AlarmClock(
                alarmClock = "Будильник"
            )
        }
        composable("Секундомер") {
            Stopwatch(
                stopwatch = "Секундомер"
            )
        }
        composable("Таймер") {
            Timer(
                timer = "Таймер"
            )
        }

    }

}


//    @Composable
//fun BottomNavigationBar(
//    navController: NavHostController
//){
//    BottomNavigation(
//        backgroundColor = Color(0xFF0F9D58)) {
//
//        val navBackStackEntry by navController.currentBackStackEntryAsState()
//
//        val currentRoute = navBackStackEntry?.destination?.route
//
//        Constants.BottomNavItems.forEach { navItem ->
//            BottomNavigationItem(
//                selected = currentRoute == navItem.route,
//                onClick = {
//                    navController.navigate(navItem.route)
//                },
//                label = {
//                    Text(text = navItem.label)
//                },
//                alwaysShowLabel = false
//            )
//        }
//    }
//}



