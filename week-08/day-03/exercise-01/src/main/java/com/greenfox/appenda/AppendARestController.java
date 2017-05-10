package com.greenfox.appenda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppendARestController {

  @Autowired
  private AppendA appendA;

  @GetMapping("/appenda/{appendable}")
  public AppendA greeter(@PathVariable(value = "appendable") String appendable) {
    appendA.setAppended(appendable+"a");
    return appendA;
  }
}
