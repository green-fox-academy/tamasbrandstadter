package com.greenfoxacademy.lionking.controllers;

import com.greenfoxacademy.lionking.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class Exercise5Controller {
  private List<BankAccount> bankAccountList;
  private BankAccount ba = new BankAccount("Pumba", "5000", "king", false);
  private BankAccount bb = new BankAccount("Timon", "6000", "meerkat", true);
  private BankAccount bc = new BankAccount("Nala", "7000", "lion", true);
  private BankAccount bd = new BankAccount("Rafiki", "8000", "mandrill", false);

  public Exercise5Controller() {
    this.bankAccountList = new ArrayList<>();
    bankAccountList.add(ba);
    bankAccountList.add(bb);
    bankAccountList.add(bc);
    bankAccountList.add(bd);
  }

  @RequestMapping("/objects")
  public String exerciseDisplay(Model model) {
    model.addAttribute("objects", bankAccountList);
    return "objects";
  }

  @RequestMapping("/objects/add")
  public String add(@ModelAttribute(value = "index") BankAccount bankAccount) {
    bankAccount.setZebraNumbers();
    return "redirect:/objects";
  }
}
