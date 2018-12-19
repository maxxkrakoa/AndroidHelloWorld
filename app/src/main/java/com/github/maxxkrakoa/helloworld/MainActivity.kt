package com.github.maxxkrakoa.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onButtonClick(view: View) {
        val t = findViewById(R.id.textView) as TextView
        t.text = "Clicked!"
        Log.i("HelloWorldApp", t.text.toString())
    }
    
}
