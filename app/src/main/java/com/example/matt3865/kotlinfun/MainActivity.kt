package com.example.matt3865.kotlinfun

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var count = 0
    lateinit var countTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.textView)
    }

    fun onIncrement(v: View) {
        println("Increment clicked!")
        count++
        countTextView.text = count.toString()
    }

    fun onReset(v: View) {
        println("Reset clicked!")
        count = 0;
        countTextView.text = count.toString()
    }
}
