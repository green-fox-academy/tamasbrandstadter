package com.greenfox.doubling;

import com.greenfox.ErrorMessage;
import com.greenfox.logentries.Log;
import com.greenfox.logentries.LogList;
import com.greenfox.logentries.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoublingRestController {

  @Autowired
  private DoubleNumber doubleNumber;

  @Autowired
  private LogRepository logRepository;

  @GetMapping("/doubling")
  public DoubleNumber doubling(@RequestParam(value = "input") int input) {
    doubleNumber.setReceived(input);
    doubleNumber.setResult(input*2);
    Log log = new Log("/doubling", String.valueOf(input));
    log.setCreatedAt();
    logRepository.save(log);
    return doubleNumber;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("Please provide an input!");
  }
}
