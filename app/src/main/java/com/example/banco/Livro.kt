package com.example.banco

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "Meus Livros")
class Livro(autor: String, ano: String, titulo: String, nota: Int) {

    @PrimaryKey(autoGenerate = true)
    var uid: Int = 0
    @ColumnInfo(name = "autor") var autor: String? = null
    @ColumnInfo(name = "ano") var ano: String? = null
    @ColumnInfo(name = "titulo") var titulo: String? = null
    @ColumnInfo(name = "nota") var nota: Int? = null

}
