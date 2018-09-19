package com.purple3.popularmoviesstageone.utils;

import org.json.JSONObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetDataService {

    //String BASE_URL = "https://api.themoviedb.org/3/discover/";

    @GET("movie/")
    Call<MovieDetailsResponse> getAllMoviesData(@Query("api_key") String apiKey);


}
