package com.example.projektwyjazdzadaniemobilne_09122022

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {
    lateinit var calendar: CalendarView
    lateinit var iloscdni: TextView
    lateinit var pocz_wyj: TextView
    lateinit var koniec_wyj: TextView
    private var startDate: Calendar = Calendar.getInstance()
    private var endDate: Calendar = Calendar.getInstance()
    private var wybrana: Calendar = Calendar.getInstance()
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


            if (btn_poczwyj.isSelected){
                wybrana.set(year, month, day)
                if (wybrana.time.after(endDate.time)){
                    startDate.set(year, month, day)
                    koniec_wyj.text = ""
                    val startDateString = dateFormat.format(startDate.time)
                    pocz_wyj.text = startDateString
                }
                else{
                startDate.set(year, month, day)
                val startDateString = dateFormat.format(startDate.time)
                pocz_wyj.text = startDateString
                val iloscdniwyjazdu = (endDate.getTimeInMillis() - startDate.getTimeInMillis()) / 86400000
                iloscdni.text = "${iloscdniwyjazdu.absoluteValue+1}"
                }
            }
            else if (btn_koniecwyj.isSelected){
                wybrana.set(year, month, day)
                    if (wybrana.time.before(startDate.time)){
                        Toast.makeText(this, "nie można wybrac daty powrotu, która jest szybciej niz data startu", Toast.LENGTH_SHORT).show()
                }
                    else{
                        endDate.set(year, month, day)
                        val endDateString = dateFormat.format(endDate.time)
                        koniec_wyj.text = endDateString
                        val iloscdniwyjazdu = (endDate.getTimeInMillis() - startDate.getTimeInMillis()) / 86400000
                        iloscdniwyjazdu.absoluteValue+1
                        iloscdni.text = "${iloscdniwyjazdu.absoluteValue+1}"
                    }
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