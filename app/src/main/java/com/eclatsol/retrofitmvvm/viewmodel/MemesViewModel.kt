package com.eclatsol.retrofitmvvm.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.eclatsol.retrofitmvvm.model.JokeResponse
import com.eclatsol.retrofitmvvm.repository.MemesRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MemesViewModel(private val memesRepository: MemesRepository) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            memesRepository.getMemes()

        }
    }

    val memes: LiveData<JokeResponse>
        get() = memesRepository.memes
}