package com.example.databinding_fullcourse.adapter

import android.media.Image
import android.widget.ImageView
import androidx.databinding.BindingAdapter

// this used to covert (adapter = adapt ) Image to set on layoutFile.xml
object Binding {
    @JvmStatic
    // connect with layout by -> personImage
    // layout get Image from object of dataClass on MainActivity
    @BindingAdapter("personImage")
    fun setPersonImage(view: ImageView , image: Int){
        // get image from activity_main.xml
        view.setImageResource(image)
    }
}