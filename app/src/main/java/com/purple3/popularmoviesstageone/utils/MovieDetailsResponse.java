package com.purple3.popularmoviesstageone.utils;

import java.util.List;

public class MovieDetailsResponse {

    private int page;

    private List<MovieDetails> results;

    private int totalResults;

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