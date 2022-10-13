package com.magdy.demo.cleanArchitecture.core.film.model;

import java.util.List;

public class FilmResponse {

    private String query;
    private List<Result> results;

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }
}
