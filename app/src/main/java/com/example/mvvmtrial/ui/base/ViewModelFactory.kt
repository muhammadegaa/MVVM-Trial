package com.example.mvvmtrial.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmtrial.data.api.ApiHelper
import com.example.mvvmtrial.data.repository.MainRepository
import com.example.mvvmtrial.ui.main.viewmodel.MainViewModel

class ViewModelFactory(private val apiHelper: ApiHelper) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(MainRepository(apiHelper)) as T
        }
        throw  IllegalMonitorStateException("Unknown class name")
    }
}