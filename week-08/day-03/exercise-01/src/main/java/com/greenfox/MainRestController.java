package com.greenfox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  @Autowired
  private DoubleNumber doubleNumber;

  @GetMapping("/doubling")
  public DoubleNumber doubling(@RequestParam(value = "input") int input) {
    doubleNumber.setReceived(input);
    doubleNumber.setResult(input*2);
    return doubleNumber;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("Please provide an input!");
  }
}
