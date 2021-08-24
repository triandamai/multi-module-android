package com.trian.microlife

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.trian.common.utils.network.NetworkStatus
import com.trian.data.repository.CexupRepository
import com.trian.domain.entities.User

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
        nama.value = "$name -> ${System.currentTimeMillis()}"
        Log.e("VM","${cexupRepository}")
    }

    fun users():LiveData<NetworkStatus<List<User>>> = liveData{
        emit(NetworkStatus.Loading())

    }
}