package com.example.mad_exam.ui.theme.screen.components



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_exam.R
import com.example.mad_exam.ui.theme.screen.EventScreen

@Composable

fun EventHeader() {
    Column {
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = painterResource(id = R.drawable.event),
                contentDescription = "Event Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
            )
            // Add gradient overlay for better text visibility
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(Color.Black.copy(alpha = 0.4f))
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Title: Make it center-aligned and more prominent
        Text(
            text = "Tech Conference 2024",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Subtitle: Make it smaller and lighter
        Text(
            text = "Mehsana, Gujarat | 2.5 km away",
            fontSize = 14.sp,
            color = Color.Gray,
            modifier = Modifier.padding(horizontal = 16.dp)
        )

        Spacer(modifier = Modifier.height(8.dp))

        // Description: Padding for better spacing and alignment
        Text(
            text = "This is a detailed description of the event...",
            fontSize = 14.sp,
            color = Color.White,
            modifier = Modifier.padding(horizontal = 16.dp)
        )
    }
}

@Composable
@Preview
fun previewEventHeader(){
    EventScreen()
}