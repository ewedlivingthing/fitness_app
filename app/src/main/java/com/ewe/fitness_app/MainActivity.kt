package com.ewe.fitness_app

import android.app.Service
import android.os.IBinder
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.os.CountDownTimer
import android.widget.TextView
import java.util.Locale



class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        




        val Navbtn = findViewById<Button>(R.id.button)
        Navbtn.setOnClickListener {
            val intent = Intent(this,homepage::class.java)
            startActivity(intent)

        }

    }
}
