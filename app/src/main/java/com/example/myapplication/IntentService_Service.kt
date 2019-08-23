package com.example.myapplication

import android.app.IntentService
import android.content.Intent
import android.widget.Toast

class IntentService_Service : IntentService("nak's thread") {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Toast.makeText(this, "Service Started...", Toast.LENGTH_SHORT).show()
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onHandleIntent(p0: Intent?) {
        Thread.sleep(5000)
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Service Destoryed...", Toast.LENGTH_SHORT).show()
    }
}