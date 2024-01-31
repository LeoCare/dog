package com.example.woof.ui.misscreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow


class DogScreenViewModel: ViewModel() {

    private val _titulo = MutableStateFlow("") //para ser manipulada desde este archivo
    val titulo: StateFlow<String> = _titulo //para acceder desde otros archivos

    fun cuandoClickeEnUnElemento(nombre: String){
        _titulo.value = nombre
    }

}