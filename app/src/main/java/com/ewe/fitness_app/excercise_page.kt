package com.ewe.fitness_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class excercise_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excercise_page)

        val Navbtn = findViewById<ImageView>(R.id.imageView12)
        Navbtn.setOnClickListener {
            val Intent = Intent(this, activity_4am::class.java)
            startActivity(Intent)
        }

        val Navb = findViewById<ImageView>(R.id.imageView7)
        Navb.setOnClickListener {
            val Intent = Intent(this, homepage::class.java)
            startActivity(Intent)
        }

    }
}



