package com.greenfox.controller;

import com.greenfox.repository.CrudRepository;
import com.greenfox.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  Todo todo;

  @Autowired
  CrudRepository crudRepository;

  @RequestMapping(value = {"/", "/list"})
  @ResponseBody
  public String list(Model model) {
    return "This is my first todo";
  }
}
