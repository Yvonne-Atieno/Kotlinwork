package com.example.simple_calculator


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    var etfirstvalue: EditText? = null
    var etsecondvalue: EditText? = null
    var btnadd: Button? = null
    var btnsubs: Button? = null
    var btnmultiply: Button? = null
    var btndivide: Button? = null
    var num1: Double? = null
    var num2: Double? = null
    var tvresult: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etfirstvalue = findViewById(R.id.editTextNumber5)
        etsecondvalue = findViewById(R.id.editTextNumber6)
        btnadd = findViewById(R.id.button3)
        btndivide = findViewById(R.id.button4)
        btnmultiply = findViewById(R.id.button5)
        btnsubs = findViewById(R.id.button6)
        tvresult = findViewById(R.id.tvsimple_calculator)
        Clicklistener()
    }

    fun Clicklistener() {
        btnadd!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! + num2!!
            tvresult!!.text = result.toString()
        }
        btnsubs!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! - num2!!
            tvresult!!.text = result.toString()
        }
        btnmultiply!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! * num2!!
            tvresult!!.text = result.toString()
        }
        btndivide!!.setOnClickListener {
            num1 = etfirstvalue!!.text.toString().toDouble()
            num2 = etsecondvalue!!.text.toString().toDouble()
            val result = num1!! / num2!!
            tvresult!!.text = result.toString()
        }
    }
}









