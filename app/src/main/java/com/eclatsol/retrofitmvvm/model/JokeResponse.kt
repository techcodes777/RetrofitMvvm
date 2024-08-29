package com.eclatsol.retrofitmvvm.model

import com.google.gson.annotations.SerializedName

data class JokeResponse(

	@field:SerializedName("data")
	val data: Data,

	@field:SerializedName("success")
	val success: Boolean
)