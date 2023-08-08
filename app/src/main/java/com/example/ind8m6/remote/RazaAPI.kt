package com.example.ind8m6.remote

import retrofit2.Response
import retrofit2.http.GET

interface RazaAPI {

        @GET("breeds/list/all.")

        suspend fun getData(): Response<Raza>
    }
