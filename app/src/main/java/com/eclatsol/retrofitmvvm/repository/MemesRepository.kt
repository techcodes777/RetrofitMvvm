package com.eclatsol.retrofitmvvm.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.eclatsol.retrofitmvvm.api.ApiInterface
import com.eclatsol.retrofitmvvm.model.JokeResponse

class MemesRepository(private val apiInterface: ApiInterface) {

    private val memesLiveData = MutableLiveData<JokeResponse>()

    val memes : LiveData<JokeResponse>
        get() = memesLiveData

    suspend fun getMemes(){
        val result = apiInterface.getJokes()
        if (result.body()!=null){
            memesLiveData.postValue(result.body())
        }
    }

}