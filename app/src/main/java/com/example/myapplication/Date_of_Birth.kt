package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_date_of__birth.*
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Date_of_Birth : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_of__birth)

        back_to_main.setOnClickListener {
            var intent =  Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        calculate.setOnClickListener {
            var dob = fillin.text.toString()

            var current_time = LocalDateTime.now()
            var formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
            var formatted = current_time.format(formatter)

            var birth = dob.split("/")
            var now = formatted.split("/")
            var born = arrayOf(0, 0, 0)
            var live = arrayOf(0, 0, 0)
            var age = arrayOf(0, 0, 0)

            for(i in 0..2){
                born[i] = birth[i].toInt()
                live[i] = now[i].toInt()
            }

            if(live[0]<born[0]){
                if(live[1]==1 || live[1]==3 || live[1]==5 || live[1]==7 || live[1]==8 || live[1]==10 || live[1]==12)
                    live[0]+=31
                else if(live[1]==2){
                    if(live[2]%4==0 && live[2]%100==0) live[0]+=29
                    else live[0]+=28
                }
                else live[0]+=30
                live[1]-=1
            }
            if(live[1]<born[1]){
                live[1]+=12
                live[2]-=1
            }

            for(i in 0..2){
                age[i] = live[i]-born[i]
            }
            textView.text = "You have been living for: "
            ages.text = "${age[2]} years, ${age[1]} months, and ${age[0]} days"
        }
    }
}
