package com.example.banco

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.room.Room
import com.example.banco.databinding.ActivityCadastraBinding
import com.example.banco.databinding.ActivityMainBinding

class CadastraActivity : AppCompatActivity() {
    lateinit var binding: ActivityCadastraBinding
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        val db = Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java,
            "banco_livro"
        ).build()

        binding = DataBindingUtil.setContentView(this, R.layout.activity_cadastra)
        var autor: String = binding.editAutor.text.toString()
        var ano: String = binding.editAno.text.toString()
        var titulo: String = binding.editTitulo.text.toString()
        var nota: Int = binding.nota.numStars

        var livro = Livro(autor,ano,titulo,nota )

        db.livroDao().insertAll(Livro(livro))


        binding.buttonCancela.setOnClickListener{
            finish()
        }


    }
}