package com.example.myapplication

import android.content.Context
import android.os.AsyncTask
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView

class AsyncTask_Service(context:Context, task:Button, progressBar: ProgressBar, textView: TextView) : AsyncTask<Void, Int, String>() {

    var ct = context
    var t = task
    var pb = progressBar
    var tv = textView

    override fun onPreExecute() {
        super.onPreExecute()
        tv.text = "Downloading"
        t.isEnabled = false
    }

    override fun doInBackground(vararg p0: Void?): String {
        for (i in 1..100){
            Thread.sleep(50)
            publishProgress(i)
        }
        return "Download Complete..."
    }

    override fun onProgressUpdate(vararg values: Int?) {
        var progress = values[0]
        tv.text = "$progress% downloading"
        pb.progress = progress!!
    }

    override fun onPostExecute(result: String?) {
        tv.text = result
        t.isEnabled = true
    }
}