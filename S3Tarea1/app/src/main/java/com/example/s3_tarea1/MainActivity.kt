package com.example.s3_tarea1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.voice.VoiceInteractionSession.ActivityId
import android.widget.Toast
import androidx.appcompat.app.ActionBar
import com.example.s3_tarea1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

        private lateinit var binding : ActivityMainBinding
        override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            binding.BtnEvaluar.setOnClickListener(){
                var num = binding.TFNumber.editText!!.text.toString().toDouble()
                var msn = isPositive(num)
                Toast.makeText(this, msn, Toast.LENGTH_LONG).show()
            }

    }
    fun isPositive(number:Double):String{
        return if(number > 0)  "El $number es Positivo"
        else if (number < 0) "El $number es Negativo"
        else "El $number es Neutro"
    }
}