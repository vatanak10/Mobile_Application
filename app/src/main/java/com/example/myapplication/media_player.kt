package com.example.myapplication

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_media_player.*

class media_player : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_media_player)

        intent_service.setOnClickListener{
            startActivity(Intent(this, IntentService::class.java))
        }

        async.setOnClickListener {
            startActivity(Intent(this, AsyncTask::class.java))
        }

        val play:MediaPlayer = MediaPlayer.create(this, R.raw.rise)
        startmusic.setOnClickListener { play.start() }
        pausemusic.setOnClickListener { play.pause() }
        stopmusic.setOnClickListener { play.stop() }
    }

}
