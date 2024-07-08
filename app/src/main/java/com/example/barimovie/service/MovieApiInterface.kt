package com.example.barimovie.service

import com.example.barimovie.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=bf4bd3296360cf74255060d30f68b7d1")
    fun getMovieList(): Call<MovieResponse>

}