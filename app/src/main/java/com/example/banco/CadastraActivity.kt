package com.example.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.banco.databinding.ActivityCadastraBinding
import com.example.banco.databinding.ActivityMainBinding

class CadastraActivity : AppCompatActivity() {
    lateinit var binding: ActivityCadastraBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_cadastra)

        binding.buttonCancela.setOnClickListener{
            finish()
        }


    }
}