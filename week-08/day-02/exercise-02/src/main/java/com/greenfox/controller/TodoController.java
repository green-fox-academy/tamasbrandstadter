package com.greenfox.controller;

import com.greenfox.model.Todo;
import com.greenfox.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
  private TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping(value = {"/", "/list"})
  public String list(Model model, @RequestParam(value = "isActive", defaultValue = "false") String isActive) {
    model.addAttribute("isActive", isActive);
    model.addAttribute("todos", todoRepository.findAll());
    return "todo";
  }

  @GetMapping(value = "/add")
  public String add() {
    return "add";
  }

  @PostMapping(value = "/add/create")
  public String create(Model model, @RequestParam("title") String title) {
    model.addAttribute("title", todoRepository.findAll());
    todoRepository.save(new Todo(title, false, false));
    return "redirect:/";
  }

  @RequestMapping(value = "/{id}/delete")
  public String delete(@PathVariable("id") Long id) {
    todoRepository.delete(id);
    return "redirect:/";
  }

  @GetMapping(value = "/{id}/edit")
  public String edit(Model model, @PathVariable("id") Long id) {
    model.addAttribute("todo", todoRepository.findOne(id));
    return "edit";
  }

  @PostMapping(value = "/{id}/edit/update")
  public String finishedEdit(@PathVariable("id") Long id, @RequestParam("title") String title,
                             @RequestParam("urgent") boolean urgent, @RequestParam("done") boolean done) {
    Todo updatedTodo = todoRepository.findOne(id);
    updatedTodo.setTitle(title);
    updatedTodo.setDone(done);
    updatedTodo.setUrgent(urgent);
    todoRepository.save(updatedTodo);
    return "redirect:/";
  }
}
