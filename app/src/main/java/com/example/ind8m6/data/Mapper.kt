package com.example.ind8m6.data

import com.example.ind8m6.local.RazaDetalleEntity

fun String.toEntity(id:String): RazaDetalleEntity=RazaDetalleEntity(id,this)