package com.example.praktikum2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Gacoan(
    val imgGacoan: Int,
    val nameGacoan:String,
    val descGacoan: String,
): Parcelable
