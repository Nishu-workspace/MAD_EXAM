package com.example.mad_exam.ui.theme.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mad_exam.R
import com.example.mad_exam.ui.theme.screen.components.EventActionButtons
import com.example.mad_exam.ui.theme.screen.components.EventHeader
import com.example.mad_exam.ui.theme.screen.components.EventSection
import com.example.mad_exam.ui.theme.screen.components.ReviewsSection
import com.example.mad_exam.ui.theme.screen.components.ScheduleCard

@Composable
fun EventScreen() {
    Column(modifier = Modifier.fillMaxSize()) {
        EventSection() // Static Event Details
        Spacer(modifier = Modifier.height(16.dp))

        ReviewsSection() // Static Reviews Section
        EventActionButtons() // Action Buttons at the bottom
    }
}

@Composable
@Preview(showBackground = true)
fun EventScreenPreview() {
    EventScreen()
}