package com.example.ind8m6.data

import org.junit.Assert.*

import org.junit.Test

class MapperKtTest {

    @Test
    fun toRazaEntity() {

        //Given(dado este valor)

        val raza = "razasiono"


        //When(hago esta acción)

        val  resultadoDeTransf=raza.toRazaEntity()
        //Then(espero este resultado)
        assertEquals(raza, resultadoDeTransf.raza) //Given(dado este valor)



    }
}