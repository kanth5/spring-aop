package com.learning.springaop.movierecommenderaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class User {

    public String getUserDetails() {
        return "user details";
    }
}