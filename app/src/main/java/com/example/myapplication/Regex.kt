package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_regex.*

class Regex : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_regex)

        checkbox.setOnClickListener {
            var intent = Intent(this, CheckBox::class.java)
            startActivity(intent)
        }

        seekbar.setOnClickListener {
            var intent = Intent(this, SeekBar::class.java)
            startActivity(intent)
        }

        radiobutton.setOnClickListener {
            var intent = Intent(this, Radio_Button::class.java)
            startActivity(intent)
        }

        switch.setOnClickListener {

        }
    }
}
