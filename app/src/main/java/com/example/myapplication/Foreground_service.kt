package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Foreground_service : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foreground_service)
    }

    fun Music(v: View){
        var i = Intent(this, MusicService::class.java)
        when(v.id){
            R.id.start ->{startService(i)}

            R.id.stop ->{stopService(i)}
        }
    }
}
