package com.purple3.popularmoviesstageone;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.purple3.popularmoviesstageone.utils.MovieDetails;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MoviesListAdapter extends RecyclerView.Adapter<MoviesListAdapter.MoviesViewHolder>{

    private List<MovieDetails> list_of_movies;
    private Context this_context;
    private  MoviesListAdapterOnClickHandler moviesClickHandler;

    public MoviesListAdapter(Context thisContext, List<MovieDetails> moviesList) {
        list_of_movies = moviesList;
        this_context = thisContext;
    }

    public interface MoviesListAdapterOnClickHandler{
        void clickMoviePoster(View view, int itemId);
    }


    public void setMoviesListAdapterOnClickHandler(MoviesListAdapterOnClickHandler clickHandler) {
        this.moviesClickHandler = clickHandler;
    }

    @Override
    public MoviesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        int layoutInflater = R.layout.movie_list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;

        View view = inflater.inflate(layoutInflater, parent, shouldAttachToParentImmediately);

        return new MoviesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MoviesViewHolder holder, int position) {
        MovieDetails md = list_of_movies.get(position);

        String image_url = "http://image.tmdb.org/t/p/w500/"+md.getPosterPath();
        Picasso.with(this_context).load(image_url).into(holder.iv_moviePoster);

    }

    @Override
    public int getItemCount() {
        return list_of_movies.size();
    }

    class MoviesViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private final ImageView iv_moviePoster;

        public MoviesViewHolder(View itemView) {
            super(itemView);
            iv_moviePoster = itemView.findViewById(R.id.iv_movie_poster);
            itemView.setOnClickListener(this);
        }

        /**
         * Called when a view has been clicked.
         *
         * @param v The view that was clicked.
         */
        @Override
        public void onClick(View v) {
            moviesClickHandler.clickMoviePoster(v, getAdapterPosition());
        }
    }
}
