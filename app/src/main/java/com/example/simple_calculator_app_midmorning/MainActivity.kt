package com.example.simple_calculator_app_midmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var display_answer_text:TextView
    private lateinit var edit_first:EditText
    private lateinit var edit_second:EditText
    private lateinit var add_btn:Button
    private lateinit var multiply_btn:Button
    private lateinit var subtract_btn:Button
    private lateinit var divide_btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //instantiate your variables
        display_answer_text = findViewById(R.id.display_txt)
        edit_first = findViewById(R.id.edit_firstnumber)
        edit_second = findViewById(R.id.edit_secondnumber)
        add_btn = findViewById(R.id.add_btn)
        multiply_btn = findViewById(R.id.multiply_btn)
        subtract_btn = findViewById(R.id.subtract_btn)
        divide_btn = findViewById(R.id.divide_btn)

        add_btn.setOnClickListener {

            var first_num = edit_first.text.toString().trim()
            var second_num = edit_second.text.toString().trim()
            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                //means has some data
                var result = first_num.toDouble() + second_num.toDouble()
                display_answer_text.text = result.toString()
            }

        }
        multiply_btn.setOnClickListener {

            var first_num = edit_first.text.toString().trim()
            var second_num = edit_second.text.toString().trim()
            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                //means has some data
                var result = first_num.toDouble() * second_num.toDouble()
                display_answer_text.text = result.toString()
            }

        }
        subtract_btn.setOnClickListener {

            var first_num = edit_first.text.toString().trim()
            var second_num = edit_second.text.toString().trim()
            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                //means has some data
                var result = first_num.toDouble() - second_num.toDouble()
                display_answer_text.text = result.toString()
            }

        }
        divide_btn.setOnClickListener {

            var first_num = edit_first.text.toString().trim()
            var second_num = edit_second.text.toString().trim()
            //validation of edit text
            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                //means has some data
                var result = first_num.toDouble() / second_num.toDouble()
                display_answer_text.text = result.toString()
            }

        }
    }
}