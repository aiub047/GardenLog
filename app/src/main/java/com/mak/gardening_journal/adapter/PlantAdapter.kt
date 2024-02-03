package com.mak.gardening_journal.adapter

import androidx.recyclerview.widget.RecyclerView
import com.mak.gardening_journal.model.Plant

class PlantAdapter(private val clickListener: PlantListener) :
    RecyclerView.Adapter<PlantAdapter.PlanViewHolder>() {


    class PlanViewHolder(val binding: PlantItem) :
        RecyclerView.ViewHolder(binding.root)
}


class PlantListener(val clickListener: (plant: Plant) -> Unit) {
    fun onClick(plant: Plant) = clickListener(plant)
}