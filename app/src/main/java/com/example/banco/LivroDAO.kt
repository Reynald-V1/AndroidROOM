package com.example.banco

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface LivroDAO {
    @Query("SELECT * FROM `Meus Livros`")
    fun getAll(): List<Livro>

    @Insert
    fun insertAll(vararg livro: Livro)

}