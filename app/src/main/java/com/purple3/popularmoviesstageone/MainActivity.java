package com.purple3.popularmoviesstageone;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.purple3.popularmoviesstageone.utils.GetMovieDataService;
import com.purple3.popularmoviesstageone.utils.MovieDetails;
import com.purple3.popularmoviesstageone.utils.MovieDetailsResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity implements MoviesListAdapter.MoviesListAdapterOnClickHandler{

    private final int NUM_OF_COLUMNS = 2;

    private static Retrofit retrofit;
    private GetMovieDataService service;
    private Call<MovieDetailsResponse> call;
    private static final String BASE_URL = "https://api.themoviedb.org/3/discover/";
    private final static String API_KEY="c11aeab206b080001633b02d4323938a";

    private RecyclerView rv_moviesList;
    private TextView tv_errorMessage;
    private ProgressBar pb_loadingMovieData;
    private Toast mToast;

    private List<MovieDetails> movieDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_errorMessage = findViewById(R.id.tv_error_message);
        pb_loadingMovieData = findViewById(R.id.pb_loading_data);
        rv_moviesList = findViewById(R.id.rv_popular_movies_list);

        GridLayoutManager layoutManager = new GridLayoutManager(this, NUM_OF_COLUMNS);
        rv_moviesList.setLayoutManager(layoutManager);
        rv_moviesList.setHasFixedSize(true);

        if (retrofit == null) {
            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please get your API KEY from themoviedb.org", Toast.LENGTH_LONG).show();
            return;
        }

        service = retrofit.create(GetMovieDataService.class);
        call = service.getAllMoviesData(API_KEY);

        showMovieDetails(call);
    }

    @Override
    public void clickMoviePoster(int clickedItemPosition) {
        if(mToast != null){
            mToast.cancel();
        }
        mToast = Toast.makeText(this,"Clicked item is "+ clickedItemPosition, Toast.LENGTH_LONG);
        mToast.show();

        Context context = getApplicationContext();
        Class destinationActivity = DetailActivity.class;

        Intent intent = new Intent(context, destinationActivity);
        intent.putExtra("movie_details", movieDetails.get(clickedItemPosition));

        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_criteriea, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int selectedItemId = item.getItemId();
        if(selectedItemId == R.id.action_sort_by_top_rated){
            call = service.getSortedMovieDetails(API_KEY, "vote_average.desc");
        }
        else if(selectedItemId == R.id.action_sort_by_popularity){
            call = service.getSortedMovieDetails(API_KEY, "popularity.desc");
        }
        showMovieDetails(call);
        return super.onOptionsItemSelected(item);
    }

    private void showMovieDetails(Call<MovieDetailsResponse> callObject){

        pb_loadingMovieData.setVisibility(View.VISIBLE);

        callObject.enqueue(new Callback<MovieDetailsResponse>() {

            @Override
            public void onResponse(Call<MovieDetailsResponse> call, Response<MovieDetailsResponse> response) {
                pb_loadingMovieData.setVisibility(View.INVISIBLE);
                showMoviePosters();

                MovieDetailsResponse results = response.body();
                movieDetails = results.getResults();

                MoviesListAdapter moviesListAdapter = new MoviesListAdapter(getApplicationContext(), movieDetails);
                rv_moviesList.setAdapter(moviesListAdapter);
                moviesListAdapter.setMoviesListAdapterOnClickHandler(MainActivity.this);
            }

            @Override
            public void onFailure(Call<MovieDetailsResponse> call, Throwable t) {
                showErrorMessage();
                pb_loadingMovieData.setVisibility(View.INVISIBLE);
            }
        });
    }
    private void showMoviePosters(){
        rv_moviesList.setVisibility(View.VISIBLE);
        tv_errorMessage.setVisibility(View.INVISIBLE);

    }
    private void showErrorMessage(){
        rv_moviesList.setVisibility(View.INVISIBLE);
        tv_errorMessage.setVisibility(View.VISIBLE);

    }

}
