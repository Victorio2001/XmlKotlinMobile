package com.example.layout

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        val buttonMore: Button = findViewById(R.id.more)
        val buttonCall: Button = findViewById(R.id.call)
        val textMore: TextView = findViewById(R.id.textMore)
        val imageLogo: ImageView = findViewById(R.id.imageLogo)
        val textViewName: TextView = findViewById(R.id.texte1)


        buttonMore.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(view: View) {
                    //Intent intent = new Intent(MainActivity.this, PokemonActivity.class);
                    Log.d("MyLog", "onClick")
                    if (textMore.isVisible) {
                        textMore.isVisible = false
                    } else {
                        textMore.isVisible = true
                    }
                }
        })

        buttonCall.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(view: View) {
                    //Intent intent = new Intent(MainActivity.this, PokemonActivity.class);
                    Log.d("Call me", "0602612163")
                    val intent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:06 10 10 10 10"))
                    startActivity(intent)

                }
        })

        imageLogo.setOnClickListener(
            object : View.OnClickListener {
                override fun onClick(view: View) {
                    //Intent intent = new Intent(MainActivity.this, PokemonActivity.class);
                    Log.d("Image", "65415151181841548154154154154")
                    Log.d("Image", "65415151181841548154154154154")

                    val intent = Intent(this@MainActivity, ContactActivity::class.java)
                    intent.putExtra(EXTRA_NAME, textViewName.text)
                    startActivity(intent)


                }
            })


    }
}