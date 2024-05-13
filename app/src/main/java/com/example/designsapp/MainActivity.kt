package com.example.designsapp

import android.content.Intent
import android.content.SharedPreferences.Editor
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var  name: EditText
    lateinit var pass:EditText
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            button=findViewById(R.id.btnsave)
            name=findViewById(R.id.name)
        pass=  findViewById(R.id.password)

          button.setOnClickListener{
              val n= name.text.toString()
              val pas= pass.text.toString()

           val sharedPreferences= getSharedPreferences("login", MODE_PRIVATE)
             val editor = sharedPreferences.edit()
               editor.putString("Name",n)
               editor.putString("pass",pas)
              editor.apply()
                     Toast.makeText(this,"Data save succesfully", Toast.LENGTH_SHORT).show()

               startActivity(Intent(this@MainActivity, home::class.java))
               finish()

          }
    }
}