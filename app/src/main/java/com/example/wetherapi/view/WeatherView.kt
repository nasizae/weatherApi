package com.example.wetherapi.view

import com.example.wetherapi.model.appModel

interface WeatherView {
    fun showWeather(appModel: appModel)
    fun showWeatherError(massage:String)
}