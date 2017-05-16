package com.greenfox.gamora;

import org.springframework.stereotype.Component;

@Component
public class Song {
  private String author;
  private String title;
  private int year;
  private double rating;

  public Song(String author, String title, int year, double rating){
    this.author = author;
    this.title = title;
    this.year = year;
    this.rating = rating;
  }

  public Song(){

  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public double getRating() {
    return rating;
  }

  public void setRating(double rating) {
    this.rating = rating;
  }
}
