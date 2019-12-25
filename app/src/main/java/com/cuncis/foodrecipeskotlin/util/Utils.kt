package com.cuncis.foodrecipeskotlin.util

import android.content.Context
import android.util.Log
import android.widget.Toast

class Utils {
    companion object {

        fun displayToast(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }

        fun logd(message: String) {
            Log.d("_recipeList", message)
        }

    }
}