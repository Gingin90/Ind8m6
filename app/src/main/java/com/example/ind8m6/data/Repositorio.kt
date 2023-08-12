package com.example.ind8m6.data

import android.util.Log
import androidx.lifecycle.LiveData
import com.example.ind8m6.data.local.RazaDao
import com.example.ind8m6.data.local.RazaDetalleEntity
import com.example.ind8m6.data.local.RazaEntity
import com.example.ind8m6.data.remote.RazaAPI


class Repositorio(private val razaAPI: RazaAPI, private val razaDao: RazaDao) {

    fun obtenerRazasEntetity(): LiveData<List<RazaEntity>> = razaDao.getRazas()

    fun obtenerDetalleEntity(id: String): LiveData<List<RazaDetalleEntity>> =
        razaDao.getRazaDetalle(id)

    suspend fun getRazas() {

        val response = razaAPI.getData()
        if (response.isSuccessful) {
            val message = response.body()!!.message
            val keys = message.keys
            keys.forEach {raza->
                val razaEntity = raza.toRazaEntity()
                razaDao.insertRaza(razaEntity)
                try {


                } catch (exception: Exception) {
                    Log.e("catch", "")
                }

            }
        } else {
            Log.e("repositorio", response.errorBody().toString())
        }

    }

    suspend fun getDetallePerro(id: String) {

        val response = razaAPI.getDetallePerro(id)
        if (response.isSuccessful) {
            response.body()!!.message.forEach {url->
                val razaDetalleEntity = url.toEntity(id)
                razaDao.insertDetallePerro(razaDetalleEntity)
            }

        } else {
            Log.e("repositorio", response.errorBody().toString())
        }
    }
}




