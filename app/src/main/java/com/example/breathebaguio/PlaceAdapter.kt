package com.example.breathebaguio

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.breathebaguio.databinding.ItemPlaceBinding

class PlaceAdapter(
    private val places: List<com.example.breathebaguio.Place>,
    private val onClick: (com.example.breathebaguio.Place) -> Unit
) : RecyclerView.Adapter<PlaceAdapter.PlaceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceViewHolder {
        val binding = ItemPlaceBinding.inflate(
            LayoutInflater.from(parent.context), parent, false
        )
        return PlaceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PlaceViewHolder, position: Int) {
        holder.bind(places[position], onClick)
    }

    override fun getItemCount(): Int = places.size

    inner class PlaceViewHolder(private val binding: ItemPlaceBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(place: com.example.breathebaguio.Place, onClick: (com.example.breathebaguio.Place) -> Unit) {
            binding.placeName.text = place.name
            binding.root.setOnClickListener { onClick(place) }
        }
    }
}