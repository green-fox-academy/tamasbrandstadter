package com.greenfox.colors;

class HelloWorld {
  private String message;

  void setMessage(String message){
    this.message  = message;
  }

  String getMessage(){
    System.out.println("Your message: " + message);
    return message;
  }
}

