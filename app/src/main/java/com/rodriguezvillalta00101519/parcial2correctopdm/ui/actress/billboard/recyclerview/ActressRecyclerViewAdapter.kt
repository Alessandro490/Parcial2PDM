package com.rodriguezvillalta00101519.parcial2correctopdm.ui.actress.billboard.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rodriguezvillalta00101519.parcial2correctopdm.data.models.ActressModel
import com.rodriguezvillalta00101519.parcial2correctopdm.databinding.ActressItemBinding

/*class ActressRecyclerViewAdapter(
    private val clicklistener: (ActressRecyclerViewHolder) -> Unit
) : RecyclerView.Adapter<ActressRecyclerViewHolder> () {
    private val actresses = ArrayList<ActressModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActressRecyclerViewHolder {
        val binding = ActressItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ActressRecyclerViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return actresses.size
    }

    override fun onBindViewHolder(holder: ActressRecyclerViewHolder, position: Int) {
        val movie = actresses[position]
        holder.bind(movie, clicklistener)
    }

    fun setData(movieList: List<ActressModel>){
        actresses.clear()
        actresses.addAll(movieList)
    }

}*/
