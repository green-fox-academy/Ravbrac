package com.greenfox.thymeleafmodelsviews.controller;

import com.greenfox.thymeleafmodelsviews.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {

  @GetMapping("/show")
  public String showAccount(Model model) {
    BankAccount account = new BankAccount("Simba", 2000, "lion");

    model.addAttribute("account", account);

    return "show";
  }

  @GetMapping("/htmlcept")
  public String htmlceptioner(Model model) {
    String htmlString = "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>";

    model.addAttribute("htmlString", htmlString);

    return "htmlcept";
  }
}
