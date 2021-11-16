package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var firstNumber: EditText
    lateinit var symbol: EditText
    lateinit var secondNumber: EditText

    lateinit var button: Button

    lateinit var result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstNumber = findViewById(R.id.firstNumber)
        symbol = findViewById(R.id.symbol)
        secondNumber = findViewById(R.id.secondNumber)

        button = findViewById(R.id.resultBtn)

        result = findViewById(R.id.result)

        button.setOnClickListener {
            result.text = getResult()
        }
    }
    fun getResult () : String {
        val fNumber = firstNumber.text.toString().toInt()
        val sNumber = secondNumber.text.toString().toInt()
        val symbol = symbol.text.toString()

        if (symbol =="+") {
            return (fNumber + sNumber).toString()
        }
        if (symbol=="-") {
            return (fNumber - sNumber).toString()
        }
        if (symbol=="*") {
            return (fNumber * sNumber).toString()
        }
        if (symbol=="/") {
            return (fNumber / sNumber).toString()
        }
        if (symbol =="=") {
            return (fNumber == sNumber).toString()
        }
        if (symbol==">") {
            return (fNumber > sNumber).toString()
        }
        if (symbol=="<") {
            return  (fNumber < sNumber).toString()
        }
        return "Нет результата"

    }
}