package com.example.calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val tvAnswer = findViewById<TextView>(R.id.tvAnswer)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnAddition = findViewById<Button>(R.id.btnAdd)
        val btnSubtraction = findViewById<Button>(R.id.btnSubtract)
        val btnMultiplication = findViewById<Button>(R.id.btnMultiply)
        val btnDivision = findViewById<Button>(R.id.btnDivide)

        btnAddition.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etNumber2.getText().toString().equals(""))
            {
                Toast.makeText(baseContext, "Enter digits", Toast.LENGTH_LONG).show()
            }
            else{
                val a1 = etNumber1.text.toString().toInt()
                val a2 = etNumber2.text.toString().toInt()
                val a3 = a1 + a2
                tvAnswer.text = " Answer: $a3"
            }
        }
        btnSubtraction.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etNumber2.getText().toString().equals(""))
            {
                Toast.makeText(baseContext, "Enter digits", Toast.LENGTH_LONG).show()
            }
            else{
                val a1 = etNumber1.text.toString().toInt()
                val a2 = etNumber2.text.toString().toInt()
                val a3 = a1 - a2
                tvAnswer.text = " Answer: $a3"
            }
        }
        btnMultiplication.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etNumber2.getText().toString().equals(""))
            {
                Toast.makeText(baseContext, "Enter digits", Toast.LENGTH_LONG).show()
            }
            else{
                val a1 = etNumber1.text.toString().toInt()
                val a2 = etNumber2.text.toString().toInt()
                val a3 = a1 * a2
                tvAnswer.text = " Answer: $a3"
            }
        }
        btnDivision.setOnClickListener {
            if (etNumber1.text.toString().equals("")||etNumber2.getText().toString().equals(""))
            {
                Toast.makeText(baseContext, "Enter digits", Toast.LENGTH_LONG).show()
            }
            else{
                val a1 = etNumber1.text.toString().toInt()
                val a2 = etNumber2.text.toString().toInt()
                val a3 = a1 % a2
                tvAnswer.text = " Answer: $a3"
            }
        }
    }
}