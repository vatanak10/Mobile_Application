package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Foreground_service : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foreground_service)
    }

    fun Music(v: View){
        when(v.id){
            R.id.start ->{}

            R.id.stop ->{}
        }
    }
}
