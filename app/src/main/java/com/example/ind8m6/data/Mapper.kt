package com.example.ind8m6.data

import com.example.ind8m6.local.RazaDetalleEntity
import com.example.ind8m6.local.RazaEntity

fun String.toEntity(id:String): RazaDetalleEntity=RazaDetalleEntity(id,this)

fun String.toRazaEntity(): RazaEntity =RazaEntity(this)