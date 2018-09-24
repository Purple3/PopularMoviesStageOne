package com.purple3.popularmoviesstageone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class DetailActivity extends AppCompatActivity {

    public static int DEFAULT_POSITION = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("in","details_Activity");
        setContentView(R.layout.movie_details);


        setTitle("Movie Details");

        Intent intent = getIntent();
        int intentExtra = intent.getIntExtra("position",DEFAULT_POSITION );
        Log.e("position", String.valueOf(intentExtra));




    }

    /**
     *original title
     movie poster image thumbnail
     A plot synopsis (called overview in the api)
     user rating (called vote_average in the api)
     release date
     */


}
