package com.example.itunes_mysia

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val music : ArrayList<Music>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.row, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = music[position]
        holder.artistName.text = currentItem.artistName
        holder.trackName.text = currentItem.trackName
        holder.previewUrl.text = currentItem.previewUrl
        holder.trackPrice.text = currentItem.trackPrice.toString()
    }

    override fun getItemCount(): Int {
        return music.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val artistName: TextView = itemView.findViewById(R.id.art_name)
        val trackName: TextView = itemView.findViewById(R.id.trackName)
        val previewUrl: TextView = itemView.findViewById(R.id.previewUrl)
        val artworkUrl60: ImageView = itemView.findViewById(R.id.artworkurl60)
        val trackPrice: TextView = itemView.findViewById(R.id.trackPrice)


    }
}
