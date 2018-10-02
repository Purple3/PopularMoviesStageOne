package com.purple3.popularmoviesstageone.utils;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetMovieDataService {


    /**
     * This method returns the MovieDetailsResponse from the API which inturn retrieves List of MovieDetails objects through parsing.
     *
     * @param apiKey obtained from themoviedb.org
     * @return MovieDetailsResponse
     */
    @GET("discover/movie/")
    Call<MovieDetailsResponse> getAllMoviesData(@Query("api_key") String apiKey);


    /**
     * This method is to retrieve movie details using query params like popularity and user rating.
     *
     * URL for sorting using popularity:
     *          https://api.themoviedb.org/3/movie/popular?api_key=<api_key>
     * URL for sorting using user rating :
     *          https://api.themoviedb.org/3/movie/top_rated?api_key=<api_key>
     */


    @GET("movie/popular")
    Call<MovieDetailsResponse> getPopularMovieDetails(@Query("api_key") String apiKey);


    @GET("movie/top_rated")
    Call<MovieDetailsResponse> getTopRatedMovieDetails(@Query("api_key") String apiKey);
}
