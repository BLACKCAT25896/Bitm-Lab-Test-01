package com.example.bitmlabtest01;

public class Movie {
    private String moviename;
    private String movieDirector;
    private int moviePoster;

    public Movie(String moviename, String movieDirector, int moviePoster) {
        this.moviename = moviename;
        this.movieDirector = movieDirector;
        this.moviePoster = moviePoster;
    }

    public String getMoviename() {
        return moviename;
    }

    public String getMovieDirector() {
        return movieDirector;
    }

    public int getMoviePoster() {
        return moviePoster;
    }
}
