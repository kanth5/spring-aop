package com.learning.springaop.movierecommenderaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Movie {

    public String getMovieDetails() {
        return "movie details";
    }
}