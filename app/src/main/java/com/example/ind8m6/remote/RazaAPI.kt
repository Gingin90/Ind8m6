package com.example.ind8m6.remote

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface RazaAPI {

        @GET("breeds/list/all")

        suspend fun getData(): Response<Raza>

    @GET("breeds/id}/image")

    suspend fun getDetallePerro@Path("id") id:String):Response<PerroDetalle>
