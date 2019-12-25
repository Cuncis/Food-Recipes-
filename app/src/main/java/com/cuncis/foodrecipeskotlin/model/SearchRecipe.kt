package com.cuncis.foodrecipeskotlin.model


import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName


data class SearchRecipe(

	@field:SerializedName("social_rank")
	val socialRank: Double? = null,

	@field:SerializedName("recipe_id")
	val recipeId: String? = null,

	@field:SerializedName("publisher_url")
	val publisherUrl: String? = null,

	@field:SerializedName("image_url")
	val imageUrl: String? = null,

	@field:SerializedName("publisher")
	val publisher: String? = null,

	@field:SerializedName("_id")
	val id: String? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("source_url")
	val sourceUrl: String? = null
): Parcelable {
	constructor(parcel: Parcel) : this(
		parcel.readValue(Double::class.java.classLoader) as? Double,
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString(),
		parcel.readString()
	)

	override fun writeToParcel(parcel: Parcel, flags: Int) {
		parcel.writeValue(socialRank)
		parcel.writeString(recipeId)
		parcel.writeString(publisherUrl)
		parcel.writeString(imageUrl)
		parcel.writeString(publisher)
		parcel.writeString(id)
		parcel.writeString(title)
		parcel.writeString(sourceUrl)
	}

	override fun describeContents(): Int {
		return 0
	}

	companion object CREATOR : Parcelable.Creator<SearchRecipe> {
		override fun createFromParcel(parcel: Parcel): SearchRecipe {
			return SearchRecipe(parcel)
		}

		override fun newArray(size: Int): Array<SearchRecipe?> {
			return arrayOfNulls(size)
		}
	}
}


