package com.example.ind8m6.data

import org.junit.Assert.*

import org.junit.Test

class MapperTest {

    @Test
    fun toEntity() {
       //Given(dado este valor)

        val url = "datoUrl"
        val id= "datoId"

        //When(hago esta acción)

           val  resultadoDeTransformacion=url.toEntity(id)
        //Then(espero este resultado)
        assertEquals(id, resultadoDeTransformacion.razadetalle)
        assertEquals(url, resultadoDeTransformacion.url)



    }
}