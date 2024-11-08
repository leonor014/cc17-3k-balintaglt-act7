package com.example.breathebaguio

import android.annotation.SuppressLint
import android.os.Parcel
import android.os.Parcelable

@SuppressLint("ParcelCreator")
@Place.Parcelize
data class Place(
    val name: String,
    val imageResource: Int,
    val category: String,
    val details: String,
    val location: String,
    val hours: String
) : Parcelable {
    annotation class Parcelize

    override fun describeContents(): Int {
        TODO("Not yet implemented")
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {
        TODO("Not yet implemented")
    }
}