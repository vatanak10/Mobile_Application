package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_toast__message.*

class Toast_Message : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toast__message)
    }

    fun onClicked(view: View)
    {
        Toast.makeText(this, "Son of a mother!",Toast.LENGTH_SHORT).show()
    }
}
