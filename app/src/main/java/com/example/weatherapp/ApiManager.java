package com.example.weatherapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String BASE_URL = "http://dataservice.accuweather.com";
    @GET("/forecasts/v1/hourly/12hour/353412?api_key=xY1fTho6dtyEiyR6b22eAG5g8f75zbxg&language=vi-vn&metric=true")
    Call<List<Weather>> getHour();

    @GET("/forecasts/v1/daily/5day/353412?api_key=xY1fTho6dtyEiyR6b22eAG5g8f75zbxg&language=vi-vn&metric=true")
    Call<List<Weather>> getDay();
}
