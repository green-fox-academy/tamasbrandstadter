package com.greenfox.greeter;

import com.greenfox.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.MissingServletRequestParameterException;
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
    greet.setWelcome_message("Oh, hi there " + name + ", my dear " + title + "!");
    return greet;
  }

  @ExceptionHandler(MissingServletRequestParameterException.class)
  public ErrorMessage showError(MissingServletRequestParameterException ex) {
    String name = ex.getParameterName();
    return new ErrorMessage("Please provide a " + name + "!");
  }
}
