package com.example.hyassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.hyassistant.ui.home.HomeScreen
import com.example.hyassistant.ui.theme.HyassistantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {
            HyassistantTheme {
                HomeScreen()
            }
        }
    }
}
