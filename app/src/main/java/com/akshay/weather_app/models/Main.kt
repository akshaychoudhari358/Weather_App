package com.weatherapp.models

import java.io.Serializable

data class Main(
    val temp: Double,
    val pressure: Int,
    val humidity: Int,
    val tempMin: Int,
    val tempMax: Int,
    val sea_level : Double,
    val grnd_level : Double
) : Serializable