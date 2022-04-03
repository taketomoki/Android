package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var hellotext : TextView = findViewById(R.id.textView1)
        var hellobutton : Button = findViewById(R.id.button1)
        hellobutton.setOnClickListener {
            hellotext.text = "Androidを作成してみた"
        }
    }
}
