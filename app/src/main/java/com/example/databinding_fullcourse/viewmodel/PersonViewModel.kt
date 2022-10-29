package com.example.databinding_fullcourse.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.databinding_fullcourse.R
import com.example.databinding_fullcourse.model.Person
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class PersonViewModel : ViewModel() {
    private val _personLiveDate: MutableLiveData<Person> = MutableLiveData(
        Person("Mohamed",20,R.drawable.faces_yellow)
    )
    val personLiveData: LiveData<Person> = _personLiveDate

    init {
        viewModelScope.launch {
            delay(2000)
            _personLiveDate.postValue(Person("Elgohary",21,R.drawable.faces_green))
            delay(2000)
            _personLiveDate.postValue(Person("Mohamed Elgohary",22,R.drawable.faces_red))
            delay(2000)
            _personLiveDate.postValue(Person("Mohamed",23,R.drawable.faces_blue))
            delay(2000)
            _personLiveDate.postValue(Person("Mohamed Elgohary",24,R.drawable.faces_yellow))
        }
    }

}