package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {
  AtomicLong atomicLong = new AtomicLong();

  @RequestMapping
  public Greeting greeting(@RequestParam(value = "name", required = true) String name) {
    Greeting greeting = new Greeting(atomicLong.addAndGet(1), "Hello, " + name);
    return greeting;
  }
}
