package com.example.settingsdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class SettingsActivity : AppCompatActivity() {
    private lateinit var submit_btn:AppCompatImageButton
    private lateinit var prev_btn : AppCompatImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        submit_btn=findViewById(R.id.submit_btn)
        submit_btn.setOnClickListener {
            Toast.makeText(applicationContext,"Successfully Updated", Toast.LENGTH_SHORT).show()
        }
        prev_btn=findViewById(R.id.back_btn)
        prev_btn.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }


    }
}