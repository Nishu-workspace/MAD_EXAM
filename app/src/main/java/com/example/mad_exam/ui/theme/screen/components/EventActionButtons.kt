package com.example.mad_exam.ui.theme.screen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun EventActionButtons() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 24.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Button(
            onClick = { /* Handle Buy Tickets click */ },
            modifier = Modifier.width(160.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF0061F2)) // Blue button
        ) {
            Text(text = "Buy Tickets")
        }

        Button(
            onClick = { /* Handle Add to Calendar click */ },
            modifier = Modifier.width(160.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFB1B1B1)) // Grey button
        ) {
            Text(text = "Add to Calendar")
        }
    }
}