package com.example.pariwisata.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pariwisata.R
import com.example.pariwisata.model.Destinasi


class AdapterDestinasi(private val destinationList: List<Destinasi>) :
    RecyclerView.Adapter<AdapterDestinasi.DestinationViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DestinationViewHolder {
        // Inflate layout item_destination.xml (pastikan file XML ini ada)
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_beranda, parent, false)
        return DestinationViewHolder(view)
    }

    override fun onBindViewHolder(holder: DestinationViewHolder, position: Int) {
        val destination = destinationList[position]
        holder.destinationName.text = destination.name
        holder.destinationImage.setImageResource(destination.imageResId)
    }

    override fun getItemCount(): Int = destinationList.size

    class DestinationViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val destinationName: TextView = itemView.findViewById(R.id.destinationName)
        val destinationImage: ImageView = itemView.findViewById(R.id.destinationImage)
    }
}