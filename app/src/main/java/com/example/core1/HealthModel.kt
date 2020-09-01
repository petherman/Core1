package com.example.core1

import android.content.Context
import android.widget.*
import androidx.lifecycle.ViewModel

class HealthModel : ViewModel() {
    val healthval = 10;
    val healthtxt = findViewById<TextView>(R.id.health)

}