package com.example.kursivee.myapplication.login

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class LoginService {
    // http://www.mocky.io/v2/5bb2653b3300000e0011c8e3
    fun login(username: String, password: String) : LoginResponse? {
        println("Attempting Login $username, $password")
        val service = Retrofit.Builder()
                .baseUrl("http://www.mocky.io")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(ILoginService::class.java)
        return service.login(LoginRequest(username, password)).execute().body()
    }
}