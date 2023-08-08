package com.example.Ind8m6.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.ind8m6.data.Repositorio
import com.example.ind8m6.local.RazaDatabase
import com.example.ind8m6.remote.RazaRetrofit
import kotlinx.coroutines.launch


class RazaViewModel (application: Application) : AndroidViewModel(application) {
        private val repositorio: Repositorio


        init {
            val api = RazaRetrofit.getRetroFitRaza()
            val razaDatabase = RazaDatabase.getDatabase(application).getRazaDao()
            repositorio = Repositorio(api,razaDatabase)
        }


        fun getAllRazas() = viewModelScope.launch {
            repositorio.getRazas()


        }

}