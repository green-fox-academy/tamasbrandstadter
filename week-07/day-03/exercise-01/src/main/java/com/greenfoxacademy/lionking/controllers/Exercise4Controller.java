package com.greenfoxacademy.lionking.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Exercise4Controller {

  @RequestMapping("/text")
  public String displayString(Model model) {
    model.addAttribute("try", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "text";
  }
}
