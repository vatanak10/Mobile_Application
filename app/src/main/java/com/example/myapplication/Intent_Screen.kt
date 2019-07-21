package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent__screen.*

class Intent_Screen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent__screen)

        var str = intent.getStringExtra("xyz")
        textView3.text = "$str"

        var bundle = intent.extras
        var name = bundle?.get("name")
        var school = bundle?.get("school")

        detail.text = "Name : $name , School : $school"

        var bundles = intent.extras
        var pic: Int? = bundles?.getInt("image")
        if (pic != null) {
            imageView.setImageResource(pic)
        }
    }
}
