package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        number.setOnClickListener {
            var str = editText.text
            var consonants:Int = 0
            var vowels:Int = 0
            for(letter in str){
                if(letter=='A' || letter=='E' || letter=='I' || letter=='O' || letter=='U'
                    || letter=='a' || letter=='e' || letter=='i' || letter=='o' || letter=='u'){
                    vowels++
                }
                else if(letter==' ') continue
                else consonants++
            }
            textView4.text = vowels.toString()
            textView5.text = consonants.toString()
        }

        letter.setOnClickListener {
            var str = editText.text
            var con:String = ""
            var vow:String = ""
            for(i in str){
                if(i=='A' || i=='E' || i=='I' || i=='O' || i=='U'
                    || i=='a' || i=='e' || i=='i' || i=='o' || i=='u') vow += i.toString()
                else if(i==' ') continue
                else con += i.toString()
            }
            textView4.text = vow.toString()
            textView5.text = con.toString()
        }

        dob.setOnClickListener {
            var intent =  Intent(this, Date_of_Birth::class.java)
                    startActivity(intent)
        }

        toast.setOnClickListener {
            var intent =  Intent(this, Toast_Message::class.java)
            startActivity(intent)
        }
    }
}