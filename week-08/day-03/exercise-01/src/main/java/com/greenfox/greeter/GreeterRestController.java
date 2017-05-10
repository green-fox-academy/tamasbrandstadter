package com.greenfox.greeter;

import com.greenfox.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterRestController {

  @Autowired
  private Greet greet;

  @GetMapping("/greeter")
  public Greet greeter(@RequestParam(value = "name") String name, @RequestParam(value = "title") String title) {
    greet.setWelcomeMessage("Oh, hi there " + name + ", my dear " + title + "!");
    return greet;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("Please provide a name!");
  }
}
