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
        findResources()
    }

    private fun findResources() {
        textInput = findViewById(R.id.editText)
        resultText = findViewById(R.id.resultEditText)
    }

    fun buttonClick(view: View) {
        if (textInput.text.isEmpty()) {
            textInput.error = "Your name isn't typed"
        } else {
            resultText.text = textInput.text
        }
    }
}