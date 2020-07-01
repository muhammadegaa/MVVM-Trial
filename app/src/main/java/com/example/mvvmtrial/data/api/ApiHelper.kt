package com.example.mvvmtrial.data.api

class ApiHelper(private val apiService: ApiService) {

    fun getUsers() = apiService.getUsers()
}