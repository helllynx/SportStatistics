package com.sports.sportstatistics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.as_back_button).setOnClickListener {
            finish()
        }

        findViewById<TextView>(R.id.as_title_tv).text = intent.getStringExtra("Key")
    }
}