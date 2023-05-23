package com.rodriguezvillalta00101519.parcial2correctopdm.ui.actress.viewmodel

import androidx.lifecycle.ViewModel
import com.rodriguezvillalta00101519.parcial2correctopdm.data.models.ActressModel
import com.rodriguezvillalta00101519.parcial2correctopdm.repository.ActressRepository

class ActressViewModel(private val repository: ActressRepository): ViewModel() {

    fun getActresses() = repository.getActresses()

    fun addNewActresses(actress: ActressModel)= repository.addActresses(actress)
}