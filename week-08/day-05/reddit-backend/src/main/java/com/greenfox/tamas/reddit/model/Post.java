package com.greenfox.tamas.reddit.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  Long id;
  String title;
  String href;
  int score;
  Timestamp timeStamp;

  public Post() {
    this.timeStamp = new Timestamp(System.currentTimeMillis() / 1000);
    this.score = 0;
  }

  public Post(String title, String href) {
    this.title = title;
    this.href = href;
    this.score = 0;
    this.timeStamp = new Timestamp(System.currentTimeMillis() / 1000);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public int getScore() {
    return score;
  }

  public void setScore() {
    this.score += 1;
  }

  public void downScore() {
    this.score -= 1;
  }

  public Timestamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Timestamp timeStamp) {
    this.timeStamp = timeStamp;
  }
}
