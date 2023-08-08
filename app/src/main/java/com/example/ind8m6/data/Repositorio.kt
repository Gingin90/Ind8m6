package com.example.ind8m6.data

import com.example.ind8m6.local.RazaDao
import com.example.ind8m6.local.RazaEntity
import com.example.ind8m6.remote.RazaAPI


class Repositorio(private val razaAPI: RazaAPI, private val razaDao: RazaDao) {


        suspend fun getRazas() {

            val response = razaAPI.getData()
            if (response.isSuccessful) {
                val message = response.body()!!.message
                val keys = message.keys
                keys.forEach {
                    val razaEntity = RazaEntity(it)
                    razaDao.insertRaza(razaEntity)
                }
            }
        }
    }

