package com.example.sesionj6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.sesionj6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.BtnEvaluar.setOnClickListener {
            val num = binding.TfNumber.editText!!.text.toString().toDouble()
            var msn = isPositive(num)
            Toast.makeText(this, msn, Toast.LENGTH_LONG).show()
        }

        binding.BtnPar.setOnClickListener{
            val num = binding.TfNumber.editText!!.text.toString().toInt()
            val msn = isPar(num)
            Toast.makeText(this, msn, Toast.LENGTH_LONG).show()

        }

        binding.BtnFibonacci.setOnClickListener{
            val num = binding.TfNumber.editText!!.text.toString().toInt()
            val msn = Fibonacci(num)
            Toast.makeText(this, msn, Toast.LENGTH_LONG).show()

        }

    }

    fun isPositive(number:Double):String{
        return if (number>0) "El $number es Positivo"
        else if(number<0) "El $number es Negativo"
        else "El $number es Neutro"
    }

    fun isPar(number: Int): String{
        return if (number % 2 == 0) "Es par"
        else "Es impar"
    }

    fun Fibonacci (num: Int):String{
        var n1 = 0
        var n2 = 1
        var suma: Int
        var msn = "0 1"
        for (i in 3.. num){
            suma = n1 + n2
            msn += suma
            n1 = n2
            n2= suma
        }
        return msn
    }
}