package com.eclatsol.retrofitmvvm.model

import com.google.gson.annotations.SerializedName

data class MemesItem(

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("width")
	val width: Int,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("url")
	val url: String,

	@field:SerializedName("captions")
	val captions: Int,

	@field:SerializedName("height")
	val height: Int,

	@field:SerializedName("box_count")
	val boxCount: Int
)