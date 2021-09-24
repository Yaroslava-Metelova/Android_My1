package com.example.android_my1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var fName: EditText? = null
    var lName: EditText? = null
    var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fName = findViewById<EditText>(R.id.fName) as EditText
        lName = findViewById<EditText>(R.id.lName) as EditText
        button = findViewById<Button>(R.id.button) as Button

        button!!.setOnClickListener {
            val intent = Intent(this, ViewActivity::class.java)
            intent.putExtra("fName", fName!!.text.toString())
            intent.putExtra("lName", lName!!.text.toString())
            startActivity(intent)

        }


    }
}