package com.example.mariletterbox;

public class Movie {
    private String title;
    private int imageResId;
    private float rating;

    public Movie(String title, int imageResId, float rating) {
        this.title = title;
        this.imageResId = imageResId;
        this.rating = rating;
    }

    public String getTitle() { return title; }
    public int getImageResId() { return imageResId; }
    public float getRating() { return rating; }
}
