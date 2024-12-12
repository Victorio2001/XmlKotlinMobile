package com.example.layout

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible

const val EXTRA_NAME = "name";
class ContactActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact)
        val textViewName: TextView = findViewById(R.id.texte21)
        textViewName.setText(intent.getStringExtra(EXTRA_NAME))
    }



}
