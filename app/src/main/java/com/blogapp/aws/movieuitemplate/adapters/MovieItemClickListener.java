package com.blogapp.aws.movieuitemplate.adapters;

import android.widget.ImageView;

import com.blogapp.aws.movieuitemplate.models.Movie;

public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView); // we will need the imageview to make the shared animation between the two activity

}
