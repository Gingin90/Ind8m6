package com.example.ind8m6.local

import androidx.room.Entity


@Entity(tableName = "tabla_razasDetalle", primaryKeys = ["razaDetalle","url"])
    data class RazaDetalleEntity(
        val razaDetalle:String,
        val url: String)
