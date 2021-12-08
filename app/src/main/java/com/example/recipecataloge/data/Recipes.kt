package com.example.recipecataloge.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Recipes(
    val name: String,
    val category: String,
    val description: String,
    val ingredient: String,
    val instruction: String,
    val photo: String,
    val price: String,
    val calories: String,
    val carbo: String,
    val protein: String

) : Parcelable
