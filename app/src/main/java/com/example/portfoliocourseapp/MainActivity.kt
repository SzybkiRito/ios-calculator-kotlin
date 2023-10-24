package com.example.portfoliocourseapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.portfoliocourseapp.screens.main_screen.Screen.MainScreen
import com.example.portfoliocourseapp.ui.theme.PortfolioCourseAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PortfolioCourseAppTheme {
                MainScreen()
            }
        }
    }
}