package com.example.databinding_fullcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databinding_fullcourse.databinding.ActivityMainBinding
import com.example.databinding_fullcourse.model.Person

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.person = Person("Mohamed Elgohary", 20, R.drawable.ic_baseline_tag_faces_24)

    }
}