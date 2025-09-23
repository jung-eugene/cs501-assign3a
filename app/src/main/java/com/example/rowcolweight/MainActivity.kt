package com.example.rowcolweight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { WeightSplitDemo() }
    }
}

@Composable
fun WeightSplitDemo() {
    Row(Modifier.fillMaxSize()) {
        // Left: 25%
        Box(
            modifier = Modifier
                .weight(1f)
                .fillMaxHeight()
                .background(Color(0xFFB3E5FC)),
            contentAlignment = Alignment.Center
        ) { Text("25%") }

        // Right: 75% with 2:3:5 column
        Column(
            modifier = Modifier
                .weight(3f)
                .fillMaxHeight()
        ) {
            Box(
                modifier = Modifier
                    .weight(2f)           // 20% of screen height
                    .fillMaxWidth()
                    .background(Color(0xFFFFCDD2)),
                contentAlignment = Alignment.Center
            ) { Text("2 (20%)") }

            Box(
                modifier = Modifier
                    .weight(3f)           // 30%
                    .fillMaxWidth()
                    .background(Color(0xFFC8E6C9)),
                contentAlignment = Alignment.Center
            ) { Text("3 (30%)") }

            Box(
                modifier = Modifier
                    .weight(5f)           // 50%
                    .fillMaxWidth()
                    .background(Color(0xFFD1C4E9)),
                contentAlignment = Alignment.Center
            ) { Text("5 (50%)") }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWeightSplitDemo() {
    WeightSplitDemo()
}
