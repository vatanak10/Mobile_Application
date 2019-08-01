package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_radio__button.*
import kotlinx.android.synthetic.main.activity_regex.*
import kotlinx.android.synthetic.main.activity_regex.radiobutton

class Radio_Button : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio__button)

        radiobutton.setOnClickListener {
            var sel = group.checkedRadioButtonId
            when(sel){
                R.id.opt1 -> Toast.makeText(this, "Option 1", Toast.LENGTH_LONG).show()
                R.id.opt2 -> Toast.makeText(this, "Option 2", Toast.LENGTH_LONG).show()
                R.id.opt3 -> Toast.makeText(this, "Option 3", Toast.LENGTH_LONG).show()
                R.id.opt4 -> Toast.makeText(this, "Option 4", Toast.LENGTH_LONG).show()
            }
        }
    }
}
