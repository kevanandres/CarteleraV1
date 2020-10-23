package com.alkar.cartelera.data.api

import com.alkar.cartelera.data.vo.MovieDetails
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Path

interface TheMovieDBInterface {
    //https://api.themoviedb.org/3/movie/popular?api_key=05f20b09e88ebf3a85349e53809e7ff9
    //https://api.themoviedb.org/3/movie/497582?api_key=05f20b09e88ebf3a85349e53809e7ff9
    //https://api.themoviedb.org/3/

    @GET("movie/{movie_id}")
    //direccion del path del id
    fun getMovieDetails(@Path("movie_id") id: Int): Single<MovieDetails>

}