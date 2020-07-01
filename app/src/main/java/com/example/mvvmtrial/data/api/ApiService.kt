package com.example.mvvmtrial.data.api

import com.example.mvvmtrial.data.model.User
import io.reactivex.Single

interface ApiService {
    fun getUsers(): Single<List<User>>
}