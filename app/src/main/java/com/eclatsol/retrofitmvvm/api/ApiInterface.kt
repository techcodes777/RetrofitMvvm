package com.eclatsol.retrofitmvvm.api

import com.eclatsol.retrofitmvvm.model.JokeResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("get_memes")
    suspend fun getJokes() : Response<JokeResponse>


}