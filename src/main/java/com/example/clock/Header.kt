package com.example.clock

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Header(
    nameClock: String,
    modifier: Modifier = Modifier,
    items: List<String>,
    iconMore: ImageVector
) {

    val isExpanded = remember {
        mutableStateOf(false)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(30.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            ExposedDropdownMenuBox(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 200.dp),
                expanded = isExpanded.value,
                onExpandedChange = { isExpanded.value = it },
                content = {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .menuAnchor(),
                        contentAlignment = Alignment.CenterEnd
                    ) {
                        Icon(
                            imageVector = iconMore,
                            contentDescription = null
                        )
                    }
                    ExposedDropdownMenu(
                        expanded = isExpanded.value,
                        onDismissRequest = { isExpanded.value = false }
                    ) {
                        items.forEach { item ->
                            DropdownMenuItem(
                                text = { Text(text = item) },
                                onClick = {
                                    isExpanded.value = false
                                }
                            )
                        }
                    }
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            Box {
                Text(
                    text = nameClock,
                    fontSize = 20.sp,
                    fontFamily = FontFamily(listOf(Font(R.font.montserrat_semibold))),
                    fontWeight = FontWeight.SemiBold
                )
            }
        }
    }

}

@Preview
@Composable
private fun HeaderPreview() {
    Header(
        nameClock = stringResource(R.string.setting),
        items = listOf("Редакт.", "Настройки"),
        iconMore = ImageVector.vectorResource(R.drawable.more)
    )
}
