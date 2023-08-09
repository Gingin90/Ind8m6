package com.example.ind8m6.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import com.example.Ind8m6.presentation.RazaViewModel
import com.example.ej5m6.databinding.FragmentListadoRazasBinding



class ListadoRazas : Fragment() {
    lateinit var binding : FragmentListadoRazasBinding
     val  razaViewModel: RazaViewModel by  activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentListadoRazasBinding.inflate(layoutInflater, container, false)
        //  initAdapter()
        razaViewModel.getAllRazas()
        return binding.root
    }



    private fun initAdapter() {
        val adapter = AdapterRazas()
        binding.recyclerView.adapter =adapter
        razaViewModel

        }
    }


