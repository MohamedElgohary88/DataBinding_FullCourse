package com.example.databinding_fullcourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.databinding_fullcourse.databinding.ActivityMainBinding
import com.example.databinding_fullcourse.viewmodel.PersonViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel : PersonViewModel by viewModels()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = viewModel
        binding.lifecycleOwner = this
      //  binding.person = Person( "Mohamed Elgohary", 20, R.drawable.faces_yellow)
    }
}