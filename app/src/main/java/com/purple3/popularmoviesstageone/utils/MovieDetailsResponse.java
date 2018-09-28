package com.purple3.popularmoviesstageone.utils;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * MovieDetailsResponse class is to hold the Json response coming from themoviedb API.
 *
 * @author : Pratyusha Vankayala
 */

public class MovieDetailsResponse {

    @SerializedName("page")
    private int page;

    @SerializedName("results")
    private List<MovieDetails> results;

    @SerializedName("total_results")
    private int totalResults;

    @SerializedName("total_pages")
    private int totalPages;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MovieDetails> getResults() {
        return results;
    }

    public void setResults(List<MovieDetails> results) {
        this.results = results;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }
}