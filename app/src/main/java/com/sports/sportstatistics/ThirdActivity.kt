package com.sports.sportstatistics

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity(R.layout.activity_third) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<TextView>(R.id.at_title_tv).text = intent.getStringExtra("second_activity")

        findViewById<Button>(R.id.at_back_button).setOnClickListener {
            finish()
        }
    }
}