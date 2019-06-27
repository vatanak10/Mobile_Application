package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Linear_Layout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear__layout)
    }
    fun next(view: View){
        var intent = Intent(this, Relative_Layout::class.java)
        startActivity(intent)
    }

    fun frame(view: View){
        var intent = Intent(this, Frame_Layout::class.java)
        startActivity(intent)
    }
}
