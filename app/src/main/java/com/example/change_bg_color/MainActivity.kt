package com.example.change_bg_color

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutRoot: ConstraintLayout = findViewById(R.id.root_layout)
        val text: TextView = findViewById(R.id.textView)
        val bRed: Button = findViewById(R.id.buttonRed)
        val bYellow: Button = findViewById(R.id.butonYellow)
        val bGreen: Button = findViewById(R.id.buttonGreen)

        bRed.setOnClickListener {
            text.text = "Red"
            layoutRoot.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }

        bYellow.setOnClickListener {
            text.text = resources.getText(R.string.Yellow)
            layoutRoot.setBackgroundColor(ContextCompat.getColor(this, R.color.yellowColor))
        }
        bGreen.setOnClickListener {
            text.text = resources.getText(R.string.Green)
            layoutRoot.setBackgroundColor(Color.GREEN)
        }




    }
}