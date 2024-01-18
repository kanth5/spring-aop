package com.learning.springaop.movierecommenderaop.business;

import com.learning.springaop.movierecommenderaop.aspect.MeasureTime;
import com.learning.springaop.movierecommenderaop.data.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilteringTechnique1 {

    @Autowired
    private Movie movie;

    @MeasureTime
    public String contentBasedFiltering() {
        String movieDetails = movie.getMovieDetails();
        return movieDetails;
    }
}