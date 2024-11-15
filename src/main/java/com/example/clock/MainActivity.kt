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

import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
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
    val navController = rememberNavController()
    Scaffold(
        topBar ={
            NavContainerTopBar(navController = navController)
        },
        bottomBar = {
            NavigateBottomBar(navController = navController)

        },
       content =  { padding ->
           Box(modifier = Modifier
               .padding(padding))
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





