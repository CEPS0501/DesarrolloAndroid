package com.example.s2_ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.s2_ejercicio1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        var name:String = "Pasquier"
        var number1:Float = 3.0f
        var number2:Double = 3.0
        var number3:Int = 3

        val city = "Managua"
        start()

    }

    private fun start() {
        binding.BtnShow.setOnClickListener{
            var name = binding.EtName.text.toString()
            Toast.makeText(this, "Hola $name, bienvenido a la Univalle", Toast.LENGTH_LONG).show()
        }
    }
}