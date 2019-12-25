package com.cuncis.foodrecipeskotlin.data


import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.cuncis.foodrecipeskotlin.AppExecutor
import com.cuncis.foodrecipeskotlin.model.SearchRecipe
import com.cuncis.foodrecipeskotlin.util.Constants.NETWORK_TIMEOUT
import java.util.*
import java.util.concurrent.Future
import java.util.concurrent.ScheduledExecutorService
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule

class RecipeApiClient {

    private var instance = RecipeApiClient()
    private val recipeList: MutableLiveData<List<SearchRecipe>> = MutableLiveData()

    fun getInstance(): RecipeApiClient {
        return instance
    }

    fun getRecipeList(): LiveData<List<SearchRecipe>> {
        return recipeList
    }

    fun searchRecipeApi() {
        val handler = AppExecutor().getInstance().networkIO().submit {

        }

        AppExecutor().getInstance().networkIO().schedule({
            handler.cancel(true)
        }, NETWORK_TIMEOUT, TimeUnit.MILLISECONDS)
    }
}

