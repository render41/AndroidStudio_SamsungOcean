package com.example.samsungocean_androidexercise01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var textInput: EditText
    private lateinit var resultText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViews()
    }

    private fun findViews() {
        textInput = findViewById(R.id.editText)
        resultText = findViewById(R.id.resultEditText)
    }

    fun buttonClick(view: View?) {
        resultText.text = textInput.text
        println(textInput.text)
    }
}