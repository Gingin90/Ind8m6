package com.example.ind8m6.data.local

import androidx.room.Entity


@Entity(tableName = "tabla_razasdetalle", primaryKeys = ["razadetalle","url"])
    data class RazaDetalleEntity(
        val razadetalle:String,
        val url: String)
