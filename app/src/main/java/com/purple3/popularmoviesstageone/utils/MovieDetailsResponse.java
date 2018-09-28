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

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public int getPage() {
//        return page;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setPage(int page) {
//        this.page = page;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

    public List<MovieDetails> getResults() {
        return results;
    }

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setResults(List<MovieDetails> results) {
//        this.results = results;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public int getTotalResults() {
//        return totalResults;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setTotalResults(int totalResults) {
//        this.totalResults = totalResults;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public int getTotalPages() {
//        return totalPages;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)

// --Commented out by Inspection START (9/28/18, 9:38 AM):
//    public void setTotalPages(int totalPages) {
//        this.totalPages = totalPages;
//    }
// --Commented out by Inspection STOP (9/28/18, 9:38 AM)
}