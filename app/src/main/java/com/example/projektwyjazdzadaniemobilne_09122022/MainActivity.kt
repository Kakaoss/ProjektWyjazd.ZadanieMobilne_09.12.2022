package com.example.projektwyjazdzadaniemobilne_09122022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date

class MainActivity : AppCompatActivity() {
    lateinit var calendar: CalendarView
    lateinit var iloscdni: TextView
    lateinit var pocz_wyj: TextView
    lateinit var koniec_wyj: TextView
    private var startDate: Calendar = Calendar.getInstance()
    private var endDate: Calendar = Calendar.getInstance()
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pocz_wyj = findViewById(R.id.poczatek_wyjazdu)
        koniec_wyj = findViewById(R.id.koniec_wyjazdu)
        iloscdni = findViewById(R.id.textDlWyjazdu)
        calendar = findViewById(R.id.calendar)


        val btn_poczwyj = findViewById<Button>(R.id.btnPoczWyj)
        val btn_koniecwyj = findViewById<Button>(R.id.btnKoniecWyj)

        calendar.minDate = Date().time
        calendar.maxDate = Date().time + 63113852000

        calendar.setOnDateChangeListener { _, year, month, day ->
            val dateFormat = SimpleDateFormat("yyyy-MM-dd")

            val endDateString = dateFormat.format(endDate.time)
            if (btn_poczwyj.isSelected){
                startDate.set(year, month, day)
                val startDateString = dateFormat.format(startDate.time)
                pocz_wyj.text = startDateString
            }
        }
        btn_poczwyj.setOnClickListener {
            btn_poczwyj.isSelected = true
            btn_koniecwyj.isSelected = false
        }
        btn_koniecwyj.setOnClickListener {
            btn_koniecwyj.isSelected = true
            btn_poczwyj.isSelected = false
        }
    }
}