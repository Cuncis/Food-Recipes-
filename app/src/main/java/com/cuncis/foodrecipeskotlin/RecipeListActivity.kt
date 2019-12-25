package com.cuncis.foodrecipeskotlin


import android.os.Bundle
import android.view.View.VISIBLE
import androidx.lifecycle.ViewModelProviders
import com.cuncis.foodrecipeskotlin.data.ApiClient
import com.cuncis.foodrecipeskotlin.model.RecipeResponse
import com.cuncis.foodrecipeskotlin.model.SearchRecipeResponse
import com.cuncis.foodrecipeskotlin.util.Utils.Companion.displayToast
import com.cuncis.foodrecipeskotlin.util.Utils.Companion.logd
import com.cuncis.foodrecipeskotlin.viewmodel.RecipeListViewModel
import kotlinx.android.synthetic.main.activity_recipe_list.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.IOException
import java.lang.Exception

class RecipeListActivity : BaseActivity() {

    private lateinit var recipeViewModel: RecipeListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_list)

        recipeViewModel = ViewModelProviders.of(this).get(RecipeListViewModel::class.java)

        test.setOnClickListener {
//            testRequest()
            testRecipeRequest()
        }

    }

//    fun testRequest() {
//        showProgressBar(true)
//        val recipeApi = ApiClient.getRecipeApi()
//        val call = recipeApi.searchRecipe("chicken breast", "1")
//        call.enqueue(object : Callback<SearchRecipeResponse> {
//            override fun onResponse(call: Call<SearchRecipeResponse>, response: Response<SearchRecipeResponse>) {
//                showProgressBar(false)
//                if (response.isSuccessful) {
//                    val recipes = listOf(response.body()?.recipes)
//                    for (str in recipes) {
//                        logd(" - $str")
//                    }
//                } else {
//                    try {
//                        logd(response.message())
//                    } catch (e: IOException) {
//                        e.printStackTrace()
//                    }
//                }
//            }
//
//            override fun onFailure(call: Call<SearchRecipeResponse>, t: Throwable) {
//                showProgressBar(false)
//                logd(t.message.toString())
//            }
//        })
//    }

    fun testRecipeRequest() {
        showProgressBar(true)
        val recipeApi = ApiClient.getRecipeApi()
        val call = recipeApi.getRecipe("30372")
        call.enqueue(object : Callback<RecipeResponse> {
            override fun onResponse(call: Call<RecipeResponse>, response: Response<RecipeResponse>) {
                showProgressBar(false)
                if (response.isSuccessful) {
                    val recipe = response.body()?.recipe
                    logd(" - $recipe")
                } else {
                    try {
                        logd(response.message())
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }

            override fun onFailure(call: Call<RecipeResponse>, t: Throwable) {
                showProgressBar(false)
                logd(t.message.toString())
            }
        })
    }

}
