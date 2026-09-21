package com.example.mipt_pd_1

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val knopke = findViewById<Button>(R.id.button);
        val spalvosKnopke = findViewById<Button>(R.id.button2);
        val textas = findViewById<TextView>(R.id.textView);

        knopke.setOnClickListener {
            textas.text = "labas krabas";
        }

        spalvosKnopke.setOnClickListener {
            textas.setTextColor(Color.MAGENTA);
        }
    }
}