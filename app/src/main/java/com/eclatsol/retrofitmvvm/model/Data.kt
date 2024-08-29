package com.eclatsol.retrofitmvvm.model

import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("memes")
	val memes: List<MemesItem>
)