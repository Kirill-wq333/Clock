package com.example.clock.ui.worldClock

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.clock.Header
import com.example.clock.R

@Composable
fun WorldClockScreen(
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    Scaffold(
        topBar = {
            Header(
                nameClock = "Мировые часы",
                items = listOf("Редакт.", "Настройки"),
                iconMore = ImageVector.vectorResource(R.drawable.more)
            )
        }
    ) { padding ->
        Box(modifier = modifier.padding(padding)){
            MainCities()
        }
    }
}

@Composable
fun MainCities(
    modifier: Modifier = Modifier,
) {

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .padding(start = 15.dp, end = 15.dp)
    ) {

    }
}

@Composable
fun CityBoxItem(
    modifier: Modifier = Modifier,
    city: String,
    time: String
) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color(0xFFAEAEAE).copy(0.1f))
            .clip(shape = RoundedCornerShape(10.dp))
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ){
            Column {
                TextItem(
                    text = "",
                    color = Color(0xFF808080),
                    fontSize = 8.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_bold)))
                )
                TextItem(
                    text = city,
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_bold)))
                )
            }
            TextItem(
                text = time,
                color = Color.White,
                fontSize = 24.sp,
                fontWeight = FontWeight.Light,
                fontFamily = FontFamily(listOf(Font(R.font.montserrat_lightitalic)))
            )
        }
    }
}

@Composable
private fun TextItem(
    text: String,
    color: Color,
    fontSize: TextUnit,
    fontWeight: FontWeight,
    fontFamily: FontFamily
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize,
        fontWeight = fontWeight,
        fontFamily = fontFamily
    )
}

@Preview
@Composable
private fun CityBox() {
    CityBoxItem(city = "Москва", time = "14:00")
}