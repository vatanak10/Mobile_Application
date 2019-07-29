package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_check_box.*

class CheckBox : AppCompatActivity() {

    var name:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        click.setOnClickListener {
            name = ""
            if(peter.isChecked) name+="Peter Akimoto\n"
            if(madam.isChecked) name+="Madame Zostra\n"
            if(professor.isChecked) name+="Professor Longfellow\n"
            if(flash.isChecked) name+="Flash Williams\n"
            Toast.makeText(this, "The name:\n$name", Toast.LENGTH_LONG).show()
        }
    }
}
