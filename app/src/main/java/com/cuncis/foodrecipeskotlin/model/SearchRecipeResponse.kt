package com.cuncis.foodrecipeskotlin.model

import com.google.gson.annotations.SerializedName


data class SearchRecipeResponse(

	@field:SerializedName("recipes")
	val recipes: List<SearchRecipe?>? = null,

	@field:SerializedName("count")
	val count: Int? = null
)