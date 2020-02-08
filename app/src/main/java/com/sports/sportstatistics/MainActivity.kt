package com.sports.sportstatistics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        findViewById<Button>(R.id.am_button).setOnClickListener {
            startActivity(
                Intent(this, SecondActivity::class.java)
                    .putExtra("Key", "Sport Statistics")
            )
        }
    }
}
