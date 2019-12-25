package com.cuncis.foodrecipeskotlin.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cuncis.foodrecipeskotlin.model.SearchRecipe

class RecipeRepository {

    private var instance = RecipeRepository()
    private var recipeList: MutableLiveData<List<SearchRecipe>> = MutableLiveData()

    fun getInstance(): RecipeRepository {
        return instance
    }

    fun getRecipeList(): LiveData<List<SearchRecipe>> {
        return recipeList
    }



}