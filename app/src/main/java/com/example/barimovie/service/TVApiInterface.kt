package com.example.barimovie.service

import com.example.barimovie.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=bf4bd3296360cf74255060d30f68b7d1")
    fun getTVList(): Call<TelevisionResponse>

}