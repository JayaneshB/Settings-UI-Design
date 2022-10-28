package com.example.settingsdesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton

class SettingsActivity : AppCompatActivity() {
    private lateinit var submit_btn:AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        submit_btn=findViewById(R.id.submit_btn)
        submit_btn.setOnClickListener {
            Toast.makeText(applicationContext,"Successfully Updated", Toast.LENGTH_SHORT).show()

        }


    }
}