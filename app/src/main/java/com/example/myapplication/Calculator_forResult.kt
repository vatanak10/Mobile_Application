package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_concept_of_activity.*

class Calculator_forResult : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_for_result)
    }

    fun add(view:View){
        var intent = Intent()
        var num1 = intent.getIntExtra("num1",0)
        var num2 = intent.getIntExtra("num2",0)
        var result = (num1 + num2)
        intent.putExtra("num3", "$result")
        setResult(RESULT_OK, intent)
        finish()
    }
}
