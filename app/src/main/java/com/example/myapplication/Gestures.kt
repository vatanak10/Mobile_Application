package com.example.myapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.GestureDetector
import android.view.MotionEvent
import androidx.core.view.GestureDetectorCompat
import kotlinx.android.synthetic.main.activity_gestures.*

class Gestures : AppCompatActivity(), GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    var gdc:GestureDetectorCompat ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestures)
        gdc = GestureDetectorCompat(this, this)
        gdc?.setOnDoubleTapListener(this)
    }

    override fun onShowPress(p0: MotionEvent?) {
        tvGesture.text = "Show Press"
        page.setBackgroundColor(Color.RED)
    }

    override fun onSingleTapUp(p0: MotionEvent?): Boolean {
        tvGesture.text = "Single Tap Up"
        page.setBackgroundColor(Color.BLUE)
        return true
    }

    override fun onDown(p0: MotionEvent?): Boolean {
        tvGesture.text = "On Down"
        page.setBackgroundColor(Color.CYAN)
        return true
    }

    override fun onFling(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        tvGesture.text = "Flinging"
        page.setBackgroundColor(Color.YELLOW)
        return true
    }

    override fun onScroll(p0: MotionEvent?, p1: MotionEvent?, p2: Float, p3: Float): Boolean {
        tvGesture.text = "Scrolling"
        page.setBackgroundColor(Color.GREEN)
        return true
    }

    override fun onLongPress(p0: MotionEvent?) {
        tvGesture.text = "Long Press"
        page.setBackgroundColor(Color.MAGENTA)
    }

    override fun onDoubleTap(p0: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onSingleTapConfirmed(p0: MotionEvent?): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDoubleTapEvent(p0: MotionEvent?): Boolean {
        tvGesture.text = "Double Tap"
        page.setBackgroundColor(Color.GRAY)
        return true
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        gdc?.onTouchEvent(event)
        return super.onTouchEvent(event)
    }
}
