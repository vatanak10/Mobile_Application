package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import kotlinx.android.synthetic.main.activity_seek_bar.*

class SeekBar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)
        alpha.max = 255
        red.max = 255
        green.max = 255
        blue.max = 255
        class Inner: SeekBar.OnSeekBarChangeListener{
            var alCol = 0
            var redCol = 0
            var greenCol = 0
            var blueCol = 0
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                when(p0?.id){
                    R.id.alpha -> {alCol = p1}
                    R.id.red -> {redCol = p1}
                    R.id.green -> {greenCol = p1}
                    R.id.blue -> {blueCol = p1}
                }
                page.setBackgroundColor(Color.argb(alCol, redCol, greenCol, blueCol))
                mix.setBackgroundColor(Color.argb(alCol, redCol, greenCol, blueCol))
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}

            override fun onStopTrackingTouch(p0: SeekBar?) {}
        }
        var listener = Inner()
        alpha.setOnSeekBarChangeListener(listener)
        red.setOnSeekBarChangeListener(listener)
        green.setOnSeekBarChangeListener(listener)
        blue.setOnSeekBarChangeListener(listener)
    }
}
