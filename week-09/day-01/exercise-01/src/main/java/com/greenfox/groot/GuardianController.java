package com.greenfox.groot;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  @GetMapping("/groot")
  public Groot getGroot(@RequestParam("message") String message) {
    return new Groot(message);
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("I am groot!");
  }
}
