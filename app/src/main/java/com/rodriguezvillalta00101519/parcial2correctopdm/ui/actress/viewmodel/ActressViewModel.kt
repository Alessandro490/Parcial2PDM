package com.rodriguezvillalta00101519.parcial2correctopdm.ui.actress.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.rodriguezvillalta00101519.parcial2correctopdm.ActressReviewerApplication
import com.rodriguezvillalta00101519.parcial2correctopdm.data.models.ActressModel
import com.rodriguezvillalta00101519.parcial2correctopdm.repository.ActressRepository

class ActressViewModel(private val repository: ActressRepository): ViewModel() {

    var name: MutableLiveData<String> = MutableLiveData("")
    var age = MutableLiveData("")
    var description = MutableLiveData ("")
    var status = MutableLiveData ("")

    fun getActress() = repository.getActresses()

    fun addActresses(actress: ActressModel) = repository.addActresses(actress)

    private fun validateData(): Boolean {
        when{
            name.value.isNullOrEmpty() -> return false
            age.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
            description.value.isNullOrEmpty() -> return false
        }
        return true
    }

    fun createActress(){
        if (!validateData()){
            status.value = WRONG_DATA
            return
        }

        val newActress = ActressModel (
            name.value.toString(),
            age.value.toString(),
            description.value.toString(),
        )

        addActresses(newActress)
        status.value = ACTRESS_CREATED
    }

    fun clearStatus(){
        status.value = INACTIVE
    }

    fun clearData() {
        name.value = ""
        age.value  = ""
        description.value = ""
        status.value = ""
    }

    fun setSelectedActress(actress: ActressModel) {
        name.value = actress.name
        age.value = actress.age
        description.value =  actress.description
    }

    companion object{
        val Factory = viewModelFactory {
            initializer {
                val app  = this [APPLICATION_KEY] as ActressReviewerApplication
                ActressViewModel(app.ActressRepository)
            }
        }

        const val ACTRESS_CREATED = "actress created"
        const val WRONG_DATA = "wrong data"
        const val INACTIVE = ""
    }
}