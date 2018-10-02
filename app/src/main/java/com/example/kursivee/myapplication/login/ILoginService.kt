package com.example.kursivee.myapplication.login

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface ILoginService {
    @POST("v2/5bb2653b3300000e0011c8e3")
    fun login(@Body loginRequest: LoginRequest) : Call<LoginResponse>
}