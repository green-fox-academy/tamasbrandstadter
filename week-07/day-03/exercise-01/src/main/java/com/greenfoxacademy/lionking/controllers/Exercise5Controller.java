package com.greenfoxacademy.lionking.controllers;

import com.greenfoxacademy.lionking.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Exercise5Controller {
  private List<BankAccount> bankAccountList = new ArrayList<>();

  @RequestMapping("/objects")
  public String exerciseDisplay(Model model) {
    bankAccountList.add(new BankAccount("Pumba", "5000", "king", false));
    bankAccountList.add(new BankAccount("Timon", "6000", "meerkat", true));
    bankAccountList.add(new BankAccount("Nala", "7000", "lion", true));
    bankAccountList.add(new BankAccount("Rafiki", "8000", "mandrill", false));
    model.addAttribute("objects", bankAccountList);
    return "objects";
  }
}
