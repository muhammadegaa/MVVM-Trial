package com.example.mvvmtrial.data.repository

import com.example.mvvmtrial.data.api.ApiHelper
import com.example.mvvmtrial.data.model.User
import io.reactivex.Single

class MainRepository(private val apiHelper: ApiHelper) {

    fun getUsers(): Single<List<User>> {
        return apiHelper.getUsers()
    }
}