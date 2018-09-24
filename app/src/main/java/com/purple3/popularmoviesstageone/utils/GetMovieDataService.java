package com.purple3.popularmoviesstageone.utils;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetMovieDataService {

    //String BASE_URL = "https://api.themoviedb.org/3/discover/";

    @GET("movie/")
    Call<MovieDetailsResponse> getAllMoviesData(@Query("api_key") String apiKey);


    /*
    *
    * https://api.themoviedb.org/3/discover/movie?api_key=c11aeab206b080001633b02d4323938a&sort_by=popularity.desc
    * https://api.themoviedb.org/3/discover/movie?api_key=c11aeab206b080001633b02d4323938a&sort_by=vote_average.desc
    */

    @GET("movie/")
    Call<MovieDetailsResponse> getAllTopRatedMovieDetails(@Query("api_key") String apiKey, @Query("sort_by") String sorty_by);
}
