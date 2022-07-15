package com.ewe.fitness_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class activity_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page)

        val Navtn = findViewById<ImageView>(R.id.imageView7)
        Navtn.setOnClickListener {
          val  Intent = Intent( this,homepage::class.java)
            startActivity(Intent)
        }

    }



}