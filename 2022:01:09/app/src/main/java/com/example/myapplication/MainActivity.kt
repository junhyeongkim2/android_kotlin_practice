package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btn_event = findViewById<Button>(R.id.button)
        val textview = findViewById<TextView>(R.id.text1)
        var counter = 0
        btn_event.setOnClickListener {
            counter++
            if(counter==1)
                textview.setText("helloworld")
            if(counter==2){ textview.setText("nothello")
                counter=0}

        }





    }
}