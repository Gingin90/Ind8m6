package com.example.ind8m6.data.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RazaAPI {

        @GET("breeds/list/all")

        suspend fun getData(): Response<Raza>
    @GET("breed/{id}/images")
    suspend fun getDetallePerro(@Path("id") id: String): Response<PerroDetalle>}