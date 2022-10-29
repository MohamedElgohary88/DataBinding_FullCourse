package com.example.databinding_fullcourse.model

import android.media.Image
import android.widget.ImageView
import androidx.annotation.DrawableRes

data class Person(
    val name: String,
    val age: Int,
    @DrawableRes
    val image: Int
)
