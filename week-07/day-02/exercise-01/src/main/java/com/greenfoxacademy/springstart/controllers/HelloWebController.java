package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  private AtomicLong atomicLong = new AtomicLong();

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam(value = "name") String name) {
    model.addAttribute("name", name);
    model.addAttribute("count", atomicLong.addAndGet(1));
    model.addAttribute("hellos", displayHello());
    return "greeting";
  }

  public String displayHello() {
    String[] hellos = {"Mirëdita", "Ahalan", "Parev", "Zdravei", "Nei Ho", "Dobrý den", "Ahoj", "Goddag", "Goede dag, Hallo", "Hello", "Saluton", "Hei", "Bonjour",
            "Guten Tag", "Gia'sou", "Aloha", "Shalom", "Namaste", "Namaste", "Jó napot", "Halló", "Helló", "Góðan daginn", "Halo", "Aksunai", "Qanuipit", "Dia dhuit",
            "Salve", "Ciao", "Kon-nichiwa", "An-nyong Ha-se-yo", "Salvëte", "Ni hao", "Dzien' dobry", "Olá", "Bunã ziua", "Zdravstvuyte", "Hola", "Jambo", "Hujambo", "Hej",
            "Sa-wat-dee", "Merhaba", "Selam", "Vitayu", "Xin chào", "Hylo", "Sut Mae", "Sholem Aleychem", "Sawubona"};
    String str = "";
    for (int i = 0; i < hellos.length; i++) {
      str += hellos[i] + " ";
    }
    return str;
  }

  public String getRandomColor() {
    final Random random = new Random();
    final String[] letters = "0123456789ABCDEF".split("");
    String color = "#";
    for (int i = 0; i < 6; i++) {
      color += letters[Math.round(random.nextFloat() * 15)];
    }
    return color;
  }
}
