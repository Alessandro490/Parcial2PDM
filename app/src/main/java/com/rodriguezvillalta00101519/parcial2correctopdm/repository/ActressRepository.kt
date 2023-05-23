package com.rodriguezvillalta00101519.parcial2correctopdm.repository

import com.rodriguezvillalta00101519.parcial2correctopdm.data.models.ActressModel

class ActressRepository(private val actresses: MutableList<ActressModel>) {

    fun getActresses() = actresses

    fun addActresses(newActress: ActressModel) =actresses.add(newActress)
}