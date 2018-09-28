package com.purple3.popularmoviesstageone.utils;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetMovieDataService {


    /**
     * This method returns the MovieDetailsResponse from the API which inturn retrieves List of MovieDetails objects through parsing.
     *
     * @param apiKey
     * @return MovieDetailsResonse
     */
    @GET("movie/")
    Call<MovieDetailsResponse> getAllMoviesData(@Query("api_key") String apiKey);


    /**
     * This method is to retrieve movie details using query params like popularity and user rating.
     *
     * URL for sorting using popularity:
     *          https://api.themoviedb.org/3/discover/movie?api_key=c11aeab206b080001633b02d4323938a&sort_by=popularity.desc
     * URL for sorting using user rating :
     *          https://api.themoviedb.org/3/discover/movie?api_key=c11aeab206b080001633b02d4323938a&sort_by=vote_average.desc
     */


    @GET("movie/")
    Call<MovieDetailsResponse> getSortedMovieDetails(@Query("api_key") String apiKey, @Query("sort_by") String sort_by);
}
