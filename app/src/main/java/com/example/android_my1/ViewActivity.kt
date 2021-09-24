package com.example.android_my1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        var view: TextView? = null
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view)
        view = findViewById<TextView>(R.id.view) as TextView
        val intent = intent
        val fName = intent.getStringExtra("fName")
        val lName = intent.getStringExtra("lName")
        view!!.text = "Your name is $fName $lName"
    }
}