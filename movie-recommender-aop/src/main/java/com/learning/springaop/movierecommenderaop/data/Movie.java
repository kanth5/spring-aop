package com.learning.springaop.movierecommenderaop.data;

import com.learning.springaop.movierecommenderaop.aspect.MeasureTime;
import org.springframework.stereotype.Repository;

@Repository
public class Movie {

    @MeasureTime
    public String getMovieDetails() {
        return "movie details";
    }
}