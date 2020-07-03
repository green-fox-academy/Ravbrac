package com.greenfox.basicwebshop.controller;

import com.greenfox.basicwebshop.model.ShopItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebShopController {
  List<ShopItem> items = new ArrayList<>(Arrays.asList(
      new ShopItem("Running Shoes", "Nike running shoes for everyday sport", 1000.0, 5),
      new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2),
      new ShopItem("Coca Cola", "0.5l standard coke", 25.0, 0),
      new ShopItem("Wokin", "Chicken with fried rice and WOKIN sauce", 119.0, 100),
      new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1)
      ));

//  @GetMapping("/webshop")
//  @ResponseBody
//  public String helloWorld() {
//    return "Hello World";
//  }

  @GetMapping("/webshop")
  public String webshop(Model model) {
    model.addAttribute("items", items);

    return "webshop";
  }

  @GetMapping("/only-available")
  public String onlyAvailable(Model model) {

    ArrayList<ShopItem> itemsAvailable = items.stream()
        .filter(i -> i.getQuantityOfStock() > 0)
        .collect(Collectors.toCollection(ArrayList::new));



    model.addAttribute("items", itemsAvailable);
    return "webshop";
  }
}
