package com.example.proconomyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import java.util.*

class view_calendar : AppCompatActivity() {
    var selected_month: String = ""
    var selected_day: String = ""
    var selected_year: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_calendar)

        val datePicker = findViewById<DatePicker>(R.id.date_Picker)
        val today = Calendar.getInstance()
        datePicker.init(today.get(Calendar.YEAR), today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)

        ) { view, year, month, day ->
            val month = month + 1
            val msg = "You Selected: $day/$month/$year"
            selected_month = month.toString()
            selected_day = day.toString()
            selected_year = year.toString()
            Toast.makeText(this@view_calendar, msg, Toast.LENGTH_SHORT).show()
        }
    }

    fun select_time(view: View) {
        val myIn = Intent(this, mentee_select_time::class.java)
        startActivity(myIn)
    }


}