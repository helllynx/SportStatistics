package com.sports.sportstatistics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity(R.layout.activity_second) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val editText = findViewById<EditText>(R.id.as_edit_text)

        findViewById<Button>(R.id.as_back_button).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.as_third_activity_button).setOnClickListener {

            editText.text.toString().apply {

                if (this.isNotBlank()) {
                    startActivity(
                        Intent(this@SecondActivity, ThirdActivity::class.java)
                            .putExtra("second_activity", editText.text.toString())
                    )
                } else {
                    Toast.makeText(this@SecondActivity, "Blank value", Toast.LENGTH_LONG).show()
                }
            }
        }

        findViewById<TextView>(R.id.as_title_tv).text = intent.getStringExtra("Key")
    }
}