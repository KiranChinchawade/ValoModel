package com.example.api
import android.telecom.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


interface ApiInterface{
    @GET("agents")
    fun getAgents(): retrofit2.Call<List<ValoModel>>
}

object APIService {
    val api_instance: ApiInterface
    init {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://valorant-api.com/v1/")
            .addConvertorFactory(GsonConverterFactory.create())
            .build()
        api_instance = retrofit.create(ApiInterface::class.java)


    }



}