package com.example.ind8m6.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.ej5m6.databinding.ItemDetalleBinding
import com.example.ind8m6.local.RazaDetalleEntity


class AdapterDetalle: RecyclerView.Adapter<AdapterDetalle.DetallePerroViewHolder>() {

    lateinit var binding: ItemDetalleBinding
    private val listDetalleperro = mutableListOf<RazaDetalleEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DetallePerroViewHolder {
        binding = ItemDetalleBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return DetallePerroViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listDetalleperro.size
    }

    override fun onBindViewHolder(holder: DetallePerroViewHolder, position: Int) {
        val perro = listDetalleperro[position]
        holder.bind(perro)
    }

    fun setDataDetalle(detalle : List<RazaDetalleEntity>){
        this.listDetalleperro.clear()
        this.listDetalleperro.addAll(detalle)
        notifyDataSetChanged()
    }

    class DetallePerroViewHolder(val perrovista: ItemDetalleBinding): RecyclerView.ViewHolder(perrovista.root){
        fun bind(detalle: RazaDetalleEntity){
            perrovista.imageDogsDetail.load(detalle.url)
        }
    }
}




