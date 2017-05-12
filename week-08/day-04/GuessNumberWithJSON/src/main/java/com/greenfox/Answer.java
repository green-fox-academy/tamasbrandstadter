package com.greenfox;

public class Answer {
  String response;
  int life;

  public Answer(int life) {
    this.life = life;
  }

  public String getResponse() {
    return response;
  }

  public void setResponse(String response) {
    this.response = response;
  }

  public int getLife() {
    return life;
  }

  public void setLife(int life) {
    this.life = life;
  }
}
