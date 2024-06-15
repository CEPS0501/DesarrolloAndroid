package com.example.s5_ejercicio1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.example.s5_ejercicio1.databinding.ActivityMainBinding
import com.example.s5_ejercicio1.databinding.FragmentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var pasquier : FragmentMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        pasquier = FragmentMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(pasquier.root)

        pasquier.btnGoWindows1.setOnClickListener{
           //findNavController().navigate(R.id.btnGoWindows1)
        }

    }
}