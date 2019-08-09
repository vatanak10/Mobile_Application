package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mediaplayer.setOnClickListener {
            startActivity(Intent(this, media_player::class.java))
        }

        regex.setOnClickListener {
            var intent = Intent(this, Regex::class.java)
            startActivity(intent)
        }

        gesture.setOnClickListener {
            var intent = Intent(this, Gestures::class.java)
            startActivity(intent)
        }

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

        layout.setOnClickListener {
            var intent =  Intent(this, Linear_Layout::class.java)
            startActivity(intent)
        }

        cycle.setOnClickListener {
            var intent = Intent(this, concept_of_activity::class.java)
            startActivity(intent)
        }
    }

    fun forResult(v:View){
        var i = Intent(this, concept_of_activity::class.java)
        startActivityForResult(i, 2)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==2){
            var str = data?.getStringExtra("Data")
            textView4.text = str
            Toast.makeText(this, "Message is: $str",Toast.LENGTH_LONG).show()
        }
    }

    fun service(v:View){
        startActivity(Intent(this, Foreground_service::class.java))
    }
}
