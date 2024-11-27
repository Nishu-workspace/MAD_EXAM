package com.example.mad_exam.ui.theme.screen.components

import androidx.compose.runtime.Composable



import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn

import androidx.compose.material3.Text

import androidx.compose.ui.Modifier

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_exam.ui.theme.data.Review


@Composable
fun ReviewsSection() {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(
            text = "Reviews",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(8.dp))

        // Static reviews
        ReviewCard(
            userName = "Alice Johnson",
            rating = 5,
            reviewText = "Great event! Well-organized and informative."
        )
        ReviewCard(
            userName = "Bob Smith",
            rating = 4,
            reviewText = "Really enjoyed the keynote speaker. Would recommend!"
        )
        ReviewCard(
            userName = "Charlie Davis",
            rating = 4,
            reviewText = "Good event overall, but some sessions were too short."
        )
    }
}

