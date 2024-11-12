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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
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
import com.example.clock.ui.theme.Constants

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
        topBar ={
            NavContainerTopBar(navController = navController)
        },
        bottomBar = {
           Column(
               verticalArrangement = Arrangement.SpaceBetween,
               horizontalAlignment = Alignment.CenterHorizontally
               ) {
               Box(
                   modifier = Modifier
                       .fillMaxWidth()
                       .height(1.dp)
                       .background(color = Color.White.copy(0.5f))
               )
               BottomNavigationBar(navController = navController)
           }
        },
       content =  { padding ->
//           NavHostContainerBottomBar(navController = navController, padding = padding)
           Box(modifier = Modifier.padding(padding))
    }
  )
}

@Preview
@Composable
fun WorldClockPreview(){
    Surface(color = Color(0xFF282323)) {
        WorldClock()
    }
}

    @Composable
fun BottomNavigationBar(
    navController: NavHostController
){
    BottomNavigation(
        backgroundColor = (Color(0xFF404040))
        ) {

        val navBackStackEntry by navController.currentBackStackEntryAsState()

        val currentRoute = navBackStackEntry?.destination?.route

        Constants.BottomNavItems.forEach { navItem ->
            BottomNavigationItem(
                selected = currentRoute == navItem.route,
                onClick = {
                    navController.navigate(navItem.route)
                },
                icon = {
                    Icon(imageVector = navItem.icon, contentDescription = navItem.label)
                },
                label = {
                    Text(
                        text = navItem.label,
                        fontSize = 11.sp,
                        )
                },
                alwaysShowLabel = false
            )
        }
    }
}



