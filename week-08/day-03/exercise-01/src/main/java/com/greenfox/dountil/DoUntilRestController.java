package com.greenfox.dountil;

import com.greenfox.ErrorMessage;
import org.springframework.web.bind.annotation.*;

@RestController
public class DoUntilRestController {

  @PostMapping("/dountil/{what}")
  public DoUntil sum(@PathVariable(value = "what") String what, @RequestBody Input input) {
    DoUntil doUntil = new DoUntil();
    if (what.equals("sum")) {
      doUntil.sum(input.getUntil());
    }
    if (what.equals("factor")) {
      doUntil.factor(input.getUntil());
    }
    return doUntil;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("Please provide a number!");
  }
}
