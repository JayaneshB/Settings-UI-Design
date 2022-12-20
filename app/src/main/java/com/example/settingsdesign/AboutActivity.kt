package com.example.settingsdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class AboutActivity : AppCompatActivity() {
    private lateinit var submit_btn_01:AppCompatImageButton
    private lateinit var prev_btn_01 : AppCompatImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        submit_btn_01=findViewById(R.id.submit_btn_01)
        submit_btn_01.setOnClickListener {
            Toast.makeText(applicationContext,"Successfully Updated", Toast.LENGTH_SHORT).show()
        }
        prev_btn_01=findViewById(R.id.back_btn_01)
        prev_btn_01.setOnClickListener{
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}