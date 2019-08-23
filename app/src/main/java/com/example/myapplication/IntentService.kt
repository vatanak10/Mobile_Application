package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_intent_service.*

class IntentService : AppCompatActivity() {
    lateinit var i:Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_service)

        download.setOnClickListener {
            i = Intent(this, IntentService_Service::class.java)
            startService(i)
        }
        nodownload.setOnClickListener {
            stopService(i)
        }
    }
}
