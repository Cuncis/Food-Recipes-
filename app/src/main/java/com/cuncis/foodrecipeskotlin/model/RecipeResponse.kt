package com.cuncis.foodrecipeskotlin.model


import com.google.gson.annotations.SerializedName


data class RecipeResponse(

	@field:SerializedName("recipe")
	val recipe: Recipe? = null
)