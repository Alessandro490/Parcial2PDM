package com.rodriguezvillalta00101519.parcial2correctopdm.ui.actress.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.rodriguezvillalta00101519.parcial2correctopdm.data.models.ActressModel
import com.rodriguezvillalta00101519.parcial2correctopdm.databinding.ActressItemBinding

class ActressRecyclerViewHolder(private val binding: ActressItemBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind (movie: ActressModel, clicklistener: (ActressModel) -> Unit) {
        binding.TitleMovieItemTextView.text = movie.name
        binding.QualificationMovieItemTextView.text = movie.age

        binding.MovieItemCardVoew.setOnClickListener{
            clicklistener(movie)
        }
    }
}