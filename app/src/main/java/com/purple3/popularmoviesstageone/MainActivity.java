package com.purple3.popularmoviesstageone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.purple3.popularmoviesstageone.utils.GetDataService;
import com.purple3.popularmoviesstageone.utils.MovieDetails;
import com.purple3.popularmoviesstageone.utils.MovieDetailsResponse;
import com.purple3.popularmoviesstageone.utils.RetrofitClientInstance;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements MoviesListAdapter.MoviesListAdapterOnClickHandler{

    private int NUM_OF_COLUMNS = 2;
    private final static String API_KEY="c11aeab206b080001633b02d4323938a";


    private RecyclerView rv_moviesList;
    private TextView tv_errorMessage;
    private ProgressBar pb_loadingMovieData;
    private Toast mToast;

    // private  MovieDetailsResponse results;
    //List<MovieDetails> movieDetails;

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


        if (API_KEY.isEmpty()) {
            Toast.makeText(getApplicationContext(), "Please obtain your API KEY first from themoviedb.org", Toast.LENGTH_LONG).show();
            return;
        }

        showMovieDetails();

    }

    @Override
    public void clickMoviePoster(View v, String item) {
        if(mToast != null){
            mToast.cancel();
        }
        mToast = Toast.makeText(this,"Clicked item is "+item, Toast.LENGTH_LONG);
        mToast.show();
    }

    public void showMovieDetails(){
        GetDataService service = RetrofitClientInstance.getRetrofitInstance().create(GetDataService.class);
        Call<MovieDetailsResponse> call = service.getAllMoviesData(API_KEY);
        call.enqueue(new Callback<MovieDetailsResponse>() {

            @Override
            public void onResponse(Call<MovieDetailsResponse> call, Response<MovieDetailsResponse> response) {
                showMoviePosters();

                Log.e("url", response.raw().request().url().toString());

                MovieDetailsResponse results = response.body();
                List<MovieDetails> movieDetails = results.getResults();

                MoviesListAdapter moviesListAdapter = new MoviesListAdapter(getApplicationContext(), movieDetails);

                rv_moviesList.setAdapter(moviesListAdapter);
            }

            @Override
            public void onFailure(Call<MovieDetailsResponse> call, Throwable t) {
                showErrorMessage();
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void showMoviePosters(){
        rv_moviesList.setVisibility(View.VISIBLE);
        tv_errorMessage.setVisibility(View.INVISIBLE);

    }
    public void showErrorMessage(){
        rv_moviesList.setVisibility(View.INVISIBLE);
        tv_errorMessage.setVisibility(View.VISIBLE);

    }

}
