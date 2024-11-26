package com.example.clock


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

        BottomItem(
            selected = currentRoute == "WorldClock",
            onClick = { navController.navigate("WorldClock") },
            nameBottom = "Мировые часы"
        )
        BottomItem(
            selected = currentRoute == "AlarmClock",
            onClick = { navController.navigate("AlarmClock") },
            nameBottom = "Будильник"
        )
        BottomItem(
            selected = currentRoute == "Stopwatch",
            onClick = { navController.navigate("Stopwatch") },
            nameBottom = "Секундомер"
        )
        BottomItem(
            selected = currentRoute == "Timer",
            onClick = { navController.navigate("Timer") },
            nameBottom = "Таймер"
        )
    }
}


@Composable
fun BottomItem(
    selected: Boolean,
    onClick: () -> Unit,
    nameBottom: String
) {
    BottomNavigation {
        BottomNavigationItem(
            selected = selected,
            onClick = { onClick() },
            icon = {
                Icon(
                    imageVector = ImageVector.vectorResource(R.drawable.world_line),
                    contentDescription = null
                )
            },
            label = {
                Text(
                    text = nameBottom,
                    fontSize = 11.sp,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_medium))),
                    fontWeight = FontWeight.Medium
                )
            },
            alwaysShowLabel = false
        )
    }
}



