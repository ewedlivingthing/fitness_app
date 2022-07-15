package com.ewe.fitness_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        val Navbtn = findViewById<ImageView>(R.id.imageView9)
        Navbtn.setOnClickListener {
            val Intent = Intent(this, excercise_page::class.java)
            startActivity(Intent)
        }



    }
}