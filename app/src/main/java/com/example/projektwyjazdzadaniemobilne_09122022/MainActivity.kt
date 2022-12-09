package com.example.projektwyjazdzadaniemobilne_09122022

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var calendar: CalendarView
    lateinit var iloscdni: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iloscdni = findViewById(R.id.textDlWyjazdu)
        calendar = findViewById(R.id.calendar)


    }
}