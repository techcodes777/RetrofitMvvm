package com.eclatsol.retrofitmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.eclatsol.retrofitmvvm.api.ApiInterface
import com.eclatsol.retrofitmvvm.api.ApiUtilities
import com.eclatsol.retrofitmvvm.repository.MemesRepository
import com.eclatsol.retrofitmvvm.viewmodel.MemesViewModel
import com.eclatsol.retrofitmvvm.viewmodel.MemesViewModelFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {

    private lateinit var memesViewModel: MemesViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val apiInterface = ApiUtilities.getInstance().create(ApiInterface::class.java)

        val memesRepository = MemesRepository(ApiUtilities.getInstance())

        memesViewModel = ViewModelProvider(this,MemesViewModelFactory(memesRepository))[MemesViewModel::class]

        memesViewModel.memes.observe(this) { it ->
//            Log.e("KRISHNA", "onCreate: ${it.toString()}")
            it.data.memes.iterator().forEach {
                Log.e("KRISHNA", "name : ${it.name}\nimage : ${it.url}")
            }
        }
    }
}