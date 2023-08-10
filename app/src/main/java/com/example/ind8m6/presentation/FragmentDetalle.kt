package com.example.ind8m6.presentation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.Ind8m6.presentation.RazaViewModel
import com.example.ej5m6.R
import com.example.ej5m6.databinding.FragmentDetalleBinding
import com.example.ej5m6.databinding.FragmentListadoRazasBinding


private const val ARG_PARAM1 = "id"

class FragmentDetalle : Fragment() {

    lateinit var binding: FragmentDetalleBinding
    val razaViewModel: RazaViewModel by activityViewModels()

    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetalleBinding.inflate(layoutInflater, container, false)
        //initAdapter()
        razaViewModel.getDetallePerro(param1.toString())
        return binding.root
    }


}
