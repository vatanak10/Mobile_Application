package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_async_task.*

class AsyncTask : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task)

    }

    fun task(v:View){
        var task = AsyncTask_Service(this@AsyncTask, button, progressBar, textdownload)
        task.execute()
    }
}

