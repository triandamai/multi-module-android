package com.trian.microlife

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import com.trian.data.repository.CexupRepository

import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class UserViewModel @Inject constructor(
   private val cexupRepository:CexupRepository
    ):ViewModel() {
    private val nama = MutableLiveData<String>("ghghg")

    val nameLiveData:LiveData<String> get() = nama
    init {
        Log.e("VM","${cexupRepository}")
    }
    fun tes(name:String){
        nama.value = name
        Log.e("VM","${cexupRepository}")
    }
}