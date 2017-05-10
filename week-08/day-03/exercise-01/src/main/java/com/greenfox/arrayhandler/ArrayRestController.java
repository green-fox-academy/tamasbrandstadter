package com.greenfox.arrayhandler;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrayRestController {

  @PostMapping("/arrays")
  public Output sum(@RequestBody Input input) {
    Output output = new Output();
    if (input.what.equals("sum")) {
      output.sum(input.numbers);
    }
    if (input.what.equals("multiply")) {
      output.multiply(input.numbers);
    }
    return output;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("Please provide what to do with the numbers!");
  }
}
