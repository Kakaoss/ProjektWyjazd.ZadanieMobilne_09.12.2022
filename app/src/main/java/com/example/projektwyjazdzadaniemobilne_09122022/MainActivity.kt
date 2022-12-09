package com.example.projektwyjazdzadaniemobilne_09122022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var calendar: CalendarView
    lateinit var iloscdni: TextView
    lateinit var pocz_wyj: TextView
    lateinit var koniec_wyj: TextView
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pocz_wyj = findViewById(R.id.poczatek_wyjazdu)
        koniec_wyj = findViewById(R.id.koniec_wyjazdu)
        iloscdni = findViewById(R.id.textDlWyjazdu)
        calendar = findViewById(R.id.calendar)

        calendar.setOnClickListener {


        }
    }
}