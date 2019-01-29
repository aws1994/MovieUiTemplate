package com.blogapp.aws.movieuitemplate;

public class Slide {

    private int Image ;
    private String Title;
    // Add more field depand on whay you wa&nt ...


    public Slide(int image, String title) {
        Image = image;
        Title = title;
    }


    public int getImage() {
        return Image;
    }

    public String getTitle() {
        return Title;
    }

    public void setImage(int image) {
        Image = image;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
