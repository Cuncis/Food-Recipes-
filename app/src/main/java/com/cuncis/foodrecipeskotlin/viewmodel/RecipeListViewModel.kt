package com.cuncis.foodrecipeskotlin.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cuncis.foodrecipeskotlin.model.SearchRecipe
import com.cuncis.foodrecipeskotlin.repository.RecipeRepository

class RecipeListViewModel: ViewModel() {

    private var recipeRepository: RecipeRepository = RecipeRepository().getInstance()

    fun getRecipeList(): LiveData<List<SearchRecipe>> {
        return recipeRepository.getRecipeList()
    }

}