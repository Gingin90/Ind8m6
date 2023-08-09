package com.example.ind8m6.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ej5m6.databinding.ItemRazasBinding
import com.example.ind8m6.local.RazaEntity

class AdapterRazas : RecyclerView.Adapter<AdapterRazas.ItemRazasViewHolder>() {

    lateinit var binding: ItemRazasBinding

    val listItemRazas = mutableListOf<RazaEntity>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterRazas.ItemRazasViewHolder {
        binding = ItemRazasBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ItemRazasViewHolder(binding)

    }

    override fun onBindViewHolder(holder: AdapterRazas.ItemRazasViewHolder, position: Int) {
     val raza =listItemRazas[position]
        holder.bind(raza)
    }

    override fun getItemCount(): Int {
        return listItemRazas.size
    }

    fun setData(razas:List<RazaEntity>){
        this.listItemRazas.clear()
        this.listItemRazas.addAll(razas)
        notifyDataSetChanged()


    }


    class ItemRazasViewHolder(val razasVistas:ItemRazasBinding):RecyclerView.ViewHolder(razasVistas.root) {

         fun bind(raza:RazaEntity){
             razasVistas.txtRaza.text =raza.raza



         }




    }
}
