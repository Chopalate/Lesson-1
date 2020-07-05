package com.example.lesson1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val login = findViewById<EditText>(R.id.Login)
        val password = findViewById<EditText>(R.id.Password)
        val buttonSign = findViewById<EditText>(R.id.Sign)

        buttonSign.setOnClickListener {

        }
    }
}