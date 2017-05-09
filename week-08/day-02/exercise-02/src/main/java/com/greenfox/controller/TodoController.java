package com.greenfox.controller;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @RequestMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", defaultValue = "false") String isActive) {
    model.addAttribute("isActive", isActive);
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";
  }

  @RequestMapping(value = "/addTodo")
  public String addTodo(Model model, @RequestParam("title") String title) {
    todoRepository.save(new Todo(title, false, false));
    model.addAttribute("title", todoRepository.findAll());
    return "redirect:/todo";
  }
}
