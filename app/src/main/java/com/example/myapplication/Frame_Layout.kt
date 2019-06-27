package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_frame__layout.*
import kotlinx.android.synthetic.main.activity_main.view.*

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

    var i:Int = 2
    fun next(view: View){
        when(i){
            1 ->{
                hide()
                sakura.visibility = View.VISIBLE }
            2 ->{
                hide()
                chaeyon.visibility = View.VISIBLE }
            3 -> {
                hide()
                yuri.visibility = View.VISIBLE }
            4 -> {
                hide()
                yena.visibility = View.VISIBLE }
            5 -> {
                hide()
                wonyoung3.visibility = View.VISIBLE }
            6 -> {
                hide()
                minju.visibility = View.VISIBLE }
        }
        i++
        if(i==7)i=1
    }

    fun pre(view: View){
        when(i){
            1 ->{
                hide()
                sakura.visibility = View.VISIBLE }
            2 ->{
                hide()
                chaeyon.visibility = View.VISIBLE }
            3 -> {
                hide()
                yuri.visibility = View.VISIBLE }
            4 -> {
                hide()
                yena.visibility = View.VISIBLE }
            5 -> {
                hide()
                wonyoung3.visibility = View.VISIBLE }
            6 -> {
                hide()
                minju.visibility = View.VISIBLE }
        }
        i--
        if(i==0)i=6
    }

    fun goto(view: View){
        var x = editsearch.text
        if(x.toString()=="1"){
            hide()
            sakura.visibility = View.VISIBLE }
        else if(x.toString()=="2"){
            hide()
            chaeyon.visibility = View.VISIBLE }
        else if(x.toString()=="3"){
            hide()
            yuri.visibility = View.VISIBLE }
        else if(x.toString()=="4"){
            hide()
            yena.visibility = View.VISIBLE }
        else if(x.toString()=="5"){
            hide()
            wonyoung3.visibility = View.VISIBLE }
        else if(x.toString()=="6"){
            hide()
            minju.visibility = View.VISIBLE }
        else{}
    }

    fun hide(){
        sakura.visibility = View.GONE
        chaeyon.visibility = View.GONE
        yuri.visibility = View.GONE
        yena.visibility = View.GONE
        wonyoung3.visibility = View.GONE
        minju.visibility = View.GONE
    }
}
