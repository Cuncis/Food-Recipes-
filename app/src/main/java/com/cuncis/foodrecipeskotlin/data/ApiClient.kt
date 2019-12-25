package com.cuncis.foodrecipeskotlin.data

import com.cuncis.foodrecipeskotlin.util.Constants.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {
    fun getRecipeApi(): TheRecipeApi {
        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

        return retrofit.create(TheRecipeApi::class.java)
    }
}