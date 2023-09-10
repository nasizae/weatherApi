package com.example.wetherapi.presenter

import com.example.wetherapi.WeatherApi
import com.example.wetherapi.model.appModel
import com.example.wetherapi.view.WeatherView
import retrofit2.Call
import retrofit2.Response
import javax.inject.Inject

class presenter @Inject constructor(private val api: WeatherApi)
{
    lateinit var wetherView:WeatherView

fun getWeatherDetails(lon:Double, lat:Double,units:String){
    api.getWeather(lon, lat, units).enqueue(object :retrofit2.Callback<appModel>{
        override fun onResponse(call: Call<appModel>, response: Response<appModel>) {
            response.body()?.let {
                wetherView.showWeather(it)
            }
        }

        override fun onFailure(call: Call<appModel>, t: Throwable) {
            wetherView.showWeatherError(t.message.toString())
        }

    })

}
    fun atachView(view:WeatherView){
        this.wetherView=view
    }
}