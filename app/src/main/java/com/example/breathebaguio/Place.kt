package com.example.breathebaguio

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Place(
    val name: String,
    val place: String,
    val imageResource: String,
    val category: String,
    val details: String,
    val location: String
) : Parcelable
