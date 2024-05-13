package com.example.designsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class home : AppCompatActivity() {
    lateinit var  resulttext:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        resulttext=findViewById(R.id.tvresult)

          val et1= resulttext.text.toString()

         val sharedPreferences= getSharedPreferences("login", MODE_PRIVATE)
       val name=   sharedPreferences.getString("Name", "")
      val password=   sharedPreferences.getString("pass","")

        resulttext.text=" Name is: $name\npasssword is: $password"

    }
}