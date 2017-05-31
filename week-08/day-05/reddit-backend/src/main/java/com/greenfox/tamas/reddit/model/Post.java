package com.greenfox.tamas.reddit.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Post {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private String href;
  private int score;
  private Timestamp timeStamp;

  @ManyToOne
  @JoinColumn(name = "username")
  private User owner;

  public Post() {
    this.timeStamp = new Timestamp(System.currentTimeMillis());
    this.score = 0;
  }

  public Post(String title, String href, User owner) {
    this.title = title;
    this.href = href;
    this.score = 0;
    this.timeStamp = new Timestamp(System.currentTimeMillis());
    this.owner = owner;
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
    this.score++;
  }

  public void downScore() {
    this.score--;
  }

  public Timestamp getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(Timestamp timeStamp) {
    this.timeStamp = timeStamp;
  }

  public User getOwner() {
    return owner;
  }

  public void setOwner(User owner) {
    this.owner = owner;
  }
}
