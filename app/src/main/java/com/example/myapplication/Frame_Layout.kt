package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
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

    var i:Int = 0
    fun next(view: View){
        i++
        when(i){
            1 ->{
                sakura.visibility = View.GONE
                chaeyon.visibility = View.VISIBLE
                editsearch.text ="2"
            }
            2 ->{
                chaeyon.visibility = View.GONE
                yuri.visibility = View.VISIBLE
            }
            3 -> {
                yuri.visibility = View.GONE
                sakura.visibility = View.VISIBLE
                i -= 3
            }
        }
    }
    var j:Int = 0
    fun pre(view: View){
        j++
        when(j){
            1 ->{
                sakura.visibility = View.GONE
                yuri.visibility = View.VISIBLE
            }
            2 ->{
                yuri.visibility = View.GONE
                chaeyon.visibility = View.VISIBLE
            }
            3 -> {
                chaeyon.visibility = View.GONE
                sakura.visibility = View.VISIBLE
                j -=3
            }
        }
    }
}
