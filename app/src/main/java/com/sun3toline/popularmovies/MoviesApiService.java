package com.sun3toline.popularmovies;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by coldware on 7/10/17.
 */

public interface MoviesApiService {
    @GET("/movie/popular")
    void getPopularMovies(Callback<Movie.MovieResult> cb);
    @GET("/movie/top_rated")
    void getTopMovies(Callback<Movie.MovieResult> cb);

}
