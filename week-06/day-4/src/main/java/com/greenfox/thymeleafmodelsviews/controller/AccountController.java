package com.greenfox.thymeleafmodelsviews.controller;

import com.greenfox.thymeleafmodelsviews.model.BankAccount;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AccountController {
  List<BankAccount> accounts = new ArrayList<>(Arrays.asList(
      new BankAccount("Timon", 500, "meerkat"),
      new BankAccount("Pumbaa", 700, "warthog"),
      new BankAccount("Rafiki", 100, "mandrill"),
      new BankAccount("Mufasa", 5000, "lion", true),
      new BankAccount("Zordon", 1000, "lion", false, false),
      new BankAccount("Nala", 3000, "lion")
  ));

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

  @GetMapping("/multiple")
  public String multipleAcc(Model model) {


    model.addAttribute("accounts", accounts);

    return "multiple";
  }

  @PostMapping("/increment-balance")
  public String incrementBalance(@RequestParam String name) {
    Optional<BankAccount> optionalAccount = findAccount(name);

    if (optionalAccount.isPresent()) {
      BankAccount account = optionalAccount.get();

      if (account.isKing()) {
        account.setBalance(account.getBalance() +100);
      } else {
        account.setBalance(account.getBalance() + 10);
      }
    }
    return "redirect:/multiple";
  }

  private Optional<BankAccount> findAccount(String name) {
    return accounts.stream()
        .filter(account -> account.getName().equals(name))
        .findFirst();
  }

}
