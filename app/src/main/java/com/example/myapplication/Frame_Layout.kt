package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_frame__layout.*

class Frame_Layout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame__layout)
    }

    fun switchImage(view: View){
        var imgView = view as ImageView

        when(imgView.id){
            R.id.wonyoung ->{
                wonyoung.visibility = View.GONE
                wonyoung2.visibility = View.VISIBLE
            }
            R.id.wonyoung2 ->{
                wonyoung2.visibility = View.GONE
                wonyoung.visibility = View.VISIBLE
            }
        }
    }
}
