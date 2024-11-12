package com.example.clock

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun WorldClockTopBar(
    setting: String,
    nameClock: String,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = onClick
                ) {
                    Text(
                        text = setting,
                        fontSize = 11.sp,
                        fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                        fontWeight = FontWeight.Medium
                    )
                }
                Box(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = CircleShape,
                        ),
                ) {
                    IconButton(onClick = onClick) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = null
                        )
                    }
                }
            }
            Text(
                text = nameClock,
                fontSize = 20.sp,
                fontFamily = FontFamily(listOf(Font(R.font.montserrat_semibold))),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}

@Composable
fun AlarmClockTopBar(
    setting: String,
    nameClock: String,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
            .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = onClick
                ) {
                    Text(
                        text = setting,
                        fontSize = 11.sp,
                        fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                        fontWeight = FontWeight.Medium
                    )
                }
                Box(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = CircleShape,
                        ),
                ) {
                    IconButton(onClick = onClick) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = null
                        )
                    }
                }
            }
            Text(
                text = nameClock,
                fontSize = 20.sp,
                fontFamily = FontFamily(listOf(Font(R.font.montserrat_semibold))),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}
@Composable
fun StopwatchTopBar(
    setting: String,
    nameClock: String,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = onClick
                ) {
                    Text(
                        text = setting,
                        fontSize = 11.sp,
                        fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                        fontWeight = FontWeight.Medium
                    )
                }
                Box(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = CircleShape,
                        ),
                ) {
                    IconButton(onClick = onClick) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = null
                        )
                    }
                }
            }
            Text(
                text = nameClock,
                fontSize = 20.sp,
                fontFamily = FontFamily(listOf(Font(R.font.montserrat_semibold))),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}
@Composable
fun TimerTopBar(
    setting: String,
    nameClock: String,
    onClick: () -> Unit
){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    onClick = onClick
                ) {
                    Text(
                        text = setting,
                        fontSize = 11.sp,
                        fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                        fontWeight = FontWeight.Medium
                    )
                }
                Box(
                    modifier = Modifier
                        .background(
                            color = Color.White,
                            shape = CircleShape,
                        ),
                ) {
                    IconButton(onClick = onClick) {
                        Icon(
                            imageVector = Icons.Filled.Add,
                            contentDescription = null
                        )
                    }
                }
            }
            Text(
                text = nameClock,
                fontSize = 20.sp,
                fontFamily = FontFamily(listOf(Font(R.font.montserrat_semibold))),
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}


@Composable
fun NavContainerTopBar(
    navController: NavHostController,
){
    NavHost(
        navController = navController,
        startDestination = "Мировые часы",
        modifier = Modifier
    ){
        composable("Мировые часы"){
            WorldClockTopBar(
                setting = "Настройки",
                nameClock = "Мировые часы",
                onClick = {}
            )
        }
        composable("Будильник") {
            AlarmClockTopBar(
                setting = "Настройки",
                nameClock = "Будильник",
                onClick = {}
            )
        }
        composable("Секундомер") {
            StopwatchTopBar(
                setting = "Настройки",
                nameClock = "Секундомер",
                onClick = {}
            )
        }
        composable("Таймер") {
            TimerTopBar(
                setting = "Настройки",
                nameClock = "Таймер",
                onClick = {}
            )
        }
    }
}