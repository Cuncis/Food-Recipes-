package com.cuncis.foodrecipeskotlin.data

import com.cuncis.foodrecipeskotlin.model.RecipeResponse
import com.cuncis.foodrecipeskotlin.model.SearchRecipeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface TheRecipeApi {

    @GET("api/search")
    fun searchRecipe(@Query("q") query: String,
                     @Query("page") page: String)
            : Call<SearchRecipeResponse>

    @GET("api/get")
    fun getRecipe(@Query("rId") recipeId: String)
            : Call<RecipeResponse>

}