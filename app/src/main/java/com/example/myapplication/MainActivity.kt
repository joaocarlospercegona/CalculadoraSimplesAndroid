package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val editText = findViewById<EditText>(R.id.editText)

        val buttonSoma = findViewById<Button>(R.id.buttonSomaToast)
        buttonSoma.setOnClickListener {
            var num1:Double = editText.text.toString().toDouble()
            var num2:Double = editText4.text.toString().toDouble()
            var res:Double = num1 + num2
            Toast.makeText(this,res.toString(),Toast.LENGTH_SHORT).show()
        }
        val buttonSub = findViewById<Button>(R.id.buttonSubToast)
        buttonSub.setOnClickListener {
            var num1:Double = editText.text.toString().toDouble()
            var num2:Double = editText4.text.toString().toDouble()
            var res:Double = num1 - num2
            Toast.makeText(this,res.toString(),Toast.LENGTH_SHORT).show()
        }
        val buttonMult = findViewById<Button>(R.id.buttonMultToast)
        buttonMult.setOnClickListener {
            var num1:Double = editText.text.toString().toDouble()
            var num2:Double = editText4.text.toString().toDouble()
            var res:Double = num1 * num2
            Toast.makeText(this,res.toString(),Toast.LENGTH_SHORT).show()
        }
        val buttonDiv = findViewById<Button>(R.id.buttonDivToast)
        buttonDiv.setOnClickListener {
            var num1:Double = editText.text.toString().toDouble()
            var num2:Double = editText4.text.toString().toDouble()
            if(num2 == 0.0){
                Toast.makeText(this,"Divisao por zero",Toast.LENGTH_SHORT).show()
            }
            else {
                var res: Double = num1 / num2

                Toast.makeText(this, res.toString(), Toast.LENGTH_SHORT).show()
            }
        }
    }
}
