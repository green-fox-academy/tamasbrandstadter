package com.greenfox.yondu;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class YonduController {

  @GetMapping("/yondu")
  public Yondu arrowSpeedCalculator(@RequestParam("distance") double distance, @RequestParam("time") double time) {
    return new Yondu(distance, time);
  }
}
