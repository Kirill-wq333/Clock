package com.example.clock

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun NavigateBottomBar(
    navController: NavHostController,
){
    BottomNavigation(
        backgroundColor = (Color.White),
        elevation = 10.dp,
        modifier = Modifier
            .padding(bottom = 40.dp)
    ){
        val navBackStackEntry = navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry.value?.destination?.route

        BottomNavigationItem(
            selected = currentRoute == "Мировые часы",
            onClick = { navController.navigate("Мировые часы")},
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.world_line),
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Мировые часы",
                    fontSize = 11.sp,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                    fontWeight = FontWeight.Medium
                )
            },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            selected = currentRoute == "Будильник",
            onClick = { navController.navigate("Будильник")},
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.alarm_clock),
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Будильник",
                    fontSize = 11.sp,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                    fontWeight = FontWeight.Medium
                )
            },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            selected = currentRoute == "Секундомер",
            onClick = { navController.navigate("Секундомер")},
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.stopwatch),
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Секундомер",
                    fontSize = 11.sp,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                    fontWeight = FontWeight.Medium
                )
            },
            alwaysShowLabel = false
        )
        BottomNavigationItem(
            selected = currentRoute == "Таймер",
            onClick = { navController.navigate("Таймер")},
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.timer),
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = "Таймер",
                    fontSize = 11.sp,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                    fontWeight = FontWeight.Medium
                )
            },
            alwaysShowLabel = false
        )
    }
}




