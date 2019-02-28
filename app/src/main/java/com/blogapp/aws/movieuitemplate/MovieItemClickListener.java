package com.blogapp.aws.movieuitemplate;

import android.widget.ImageView;

public interface MovieItemClickListener {

    void onMovieClick(Movie movie, ImageView movieImageView); // we will need the imageview to make the shared animation between the two activity

}
