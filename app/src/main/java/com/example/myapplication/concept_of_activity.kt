package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_concept_of_activity.*

class concept_of_activity : AppCompatActivity() {

    fun startCalculator(view:View){
        var intent = Intent(this, Calculator_forResult::class.java)
        var numA = num1.text.toString().toInt()
        var numB = num2.text.toString().toInt()
        Toast.makeText(this, "0", Toast.LENGTH_LONG).show()
        intent.putExtra("num1", numA)
        intent.putExtra("num2", numB)
        startActivityForResult(intent, 4)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==4){
            var res = data?.getStringExtra("num3")
            finalRes.text = "The result is : $res"
        }
    }

    fun goToIntent(view:View){
        var intent = Intent(this, Intent_Screen::class.java)

        var str = word.text.toString()
        intent.putExtra("xyz", str)

        startActivity(intent)
    }

    fun startBundle(v:View){
        var intent = Intent(this, Intent_Screen::class.java)

        var name = word.text.toString()
        var bundle = Bundle()
        bundle.putString("name", name)
        bundle.putString("school", "KIT")

        intent.putExtras(bundle)
        startActivity(intent)
    }

    fun startActivity(v:View){
        var string = word.text.toString()
        var intent = Intent()

        intent.action = Intent.ACTION_SEND
        intent.putExtra(Intent.EXTRA_TEXT,string)
        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent, "Share to:"))
    }

    fun startImage(vi:View){
        var intent = Intent(this, Intent_Screen::class.java)
        var bundles = Bundle()

        bundles.putInt("image",R.drawable.chaeyon)
        intent.putExtras(bundles)

        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_concept_of_activity)
    }

    fun goHome(v:View){
        var i = Intent()
        var username = word.text.toString()

        i.putExtra("Data", username)
        setResult(RESULT_OK, i)
        finish()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Started", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this,"Resumed", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this,"Restarted", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Paused", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Stopped", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "Destroyed", Toast.LENGTH_SHORT).show()
    }
}
