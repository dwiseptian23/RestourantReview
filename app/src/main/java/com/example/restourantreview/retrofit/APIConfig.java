package com.example.restourantreview.retrofit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class APIConfig {
    public static APIService getApiService(){
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient client = new OkHttpClient.Builder().addInterceptor(loggingInterceptor).build();
        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://restaurant-api.dicoding.dev/").addConverterFactory(GsonConverterFactory.create()).client(client).build();
        return retrofit.create(APIService.class);
    }
}