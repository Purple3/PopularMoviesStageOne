package com.purple3.popularmoviesstageone;

import android.content.Intent;
import android.graphics.Movie;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.purple3.popularmoviesstageone.utils.MovieDetails;
import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    private TextView tv_originalTitle;
    private TextView tv_plotSynopsis;
    private TextView tv_userRating;
    private TextView tv_releaseDate;
    private ImageView iv_moviePoster;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details);



        tv_originalTitle = findViewById(R.id.tv_original_title);
        tv_plotSynopsis = findViewById(R.id.tv_plot_synopsis);
        tv_releaseDate = findViewById(R.id.tv_release_date);
        tv_userRating = findViewById(R.id.tv_user_rating);
        iv_moviePoster = findViewById(R.id.iv_movie_poster);

        Intent intent = getIntent();
        MovieDetails movieDetails = intent.getParcelableExtra("movie_details");

        tv_originalTitle.setText(movieDetails.getTitle());
        tv_userRating.setText(movieDetails.getVoteAverage());
        tv_releaseDate.setText(movieDetails.getReleaseDate());
        tv_plotSynopsis.setText(movieDetails.getOverView());

        String image_url = "http://image.tmdb.org/t/p/w500/"+movieDetails.getPosterPath();
        Picasso.with(this).load(image_url).into(iv_moviePoster);

        setTitle(movieDetails.getTitle());

    }

}
