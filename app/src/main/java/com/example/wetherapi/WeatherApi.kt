package com.example.wetherapi

import retrofit2.Call
import com.example.wetherapi.model.appModel
import retrofit2.http.GET
import retrofit2.http.Query


interface WeatherApi {

    @GET("data/2.5/weather")
    fun getWeather(
        @Query("lon") lon:Double,
        @Query("lat")lat:Double,
        @Query("units") name:String,
        @Query("appid") key:String="a6724a258918d9e10ad2c5cc3fb8194e"
    ):Call<appModel>
}