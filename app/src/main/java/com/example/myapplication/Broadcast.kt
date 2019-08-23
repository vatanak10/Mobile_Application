package com.example.myapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class Broadcast : AppCompatActivity() {
    lateinit var ifil:IntentFilter
    lateinit var br:BroadcastReceiver

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_broadcast)

        ifil = IntentFilter()
        ifil.addAction(Intent.ACTION_BATTERY_CHANGED) //ifil can handle many other actions
        ifil.addAction(Intent.ACTION_BATTERY_LOW)

        br = object: BroadcastReceiver(){
            override fun onReceive(p0: Context?, p1: Intent?) {
                Toast.makeText(this@Broadcast, p1?.action, Toast.LENGTH_SHORT).show()
            }
        }

        registerReceiver(br, ifil)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(br)
    }
}
