package com.example.settingsdesign

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatImageButton

class MainActivity : AppCompatActivity() {
    private lateinit var redirect: AppCompatImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        redirect=findViewById(R.id.redirect)
        redirect.setOnClickListener {
            val intent= Intent(this,SettingsActivity::class.java)
            startActivity(intent)
        }

    }

}