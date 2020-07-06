package com.greenfox.basicwebshop.controller;

import com.greenfox.basicwebshop.model.ItemType;
import com.greenfox.basicwebshop.model.ShopItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebShopController {
  List<ShopItem> items = new ArrayList<>(Arrays.asList(
      new ShopItem("Running Shoes", ItemType.CLOTHES, "Nike running shoes for everyday sport",
          1000.0, 5),
      new ShopItem("Printer", ItemType.ELECTRONICS, "Some HP printer that will print pages", 3000.0,
          2),
      new ShopItem("Coca Cola", ItemType.SNACKS, "0.5l standard coke", 25.0, 0),
      new ShopItem("Wokin", ItemType.SNACKS, "Chicken with fried rice and WOKIN sauce", 119.0, 100),
      new ShopItem("T-shirt", ItemType.CLOTHES, "Blue with a corgi on a bike", 300.0, 1)
  ));

  String[] displayText = {"Average stock: ", "Most expensive item available: "};

  ArrayList<ShopItem> searchedItems = new ArrayList<>();

  @GetMapping("/webshop")
  public String webshop(Model model) {
    if (searchedItems.isEmpty()) {
      model.addAttribute("items", items);
    } else {
      model.addAttribute("items", searchedItems);
      searchedItems = new ArrayList<>();
    }


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

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    ArrayList<ShopItem> itemPriceDescending = items.stream()
        .sorted(Comparator.comparing(ShopItem::getPrice))
        .collect(Collectors.toCollection(ArrayList::new));


    model.addAttribute("items", itemPriceDescending);
    return "webshop";
  }

  @GetMapping("/contains-nike")
  public String containsNike(Model model) {

    ArrayList<ShopItem> nikeItems = items.stream()
        .filter(i -> i.getName().toLowerCase().contains("nike") ||
            i.getDescription().toLowerCase().contains("nike"))
        .collect(Collectors.toCollection(ArrayList::new));


    model.addAttribute("items", nikeItems);
    return "webshop";
  }

  @GetMapping("/average-stock")
  public String averageStock(Model model) {

    OptionalDouble optionalAverage = items.stream()
        .mapToInt(ShopItem::getQuantityOfStock)
        .average();
    if (optionalAverage.isPresent()) {
      model.addAttribute("displayText", displayText[0]);
      double average = optionalAverage.getAsDouble();
      model.addAttribute("displayData", average);
      return "display";
    } else {
      return "redirect:/webshop";
    }


  }

  @GetMapping("/most-expensive")
  public String mostExpensive(Model model) {
    Optional<ShopItem> optionalItem = items.stream()
        .max(Comparator.comparing(ShopItem::getPrice));

    if (optionalItem.isPresent()) {
      model.addAttribute("displayText", displayText[1]);
      ShopItem mostExpensiveItem = optionalItem.get();
      model.addAttribute("displayData", mostExpensiveItem.getName());
      return "display";
    } else {
      return "redirect:/webshop";
    }
  }

  @PostMapping("/search")
  public String search(@RequestParam String searchWord) {
    searchedItems = items.stream()
        .filter(i -> i.getName().toLowerCase().contains(searchWord.toLowerCase()) ||
            i.getDescription().toLowerCase().contains(searchWord.toLowerCase()))
        .collect(Collectors.toCollection(ArrayList::new));

    return "redirect:/webshop";
  }

  @GetMapping("/more-filters")
  public String moreFilters(Model model) {
    model.addAttribute("items", items);

    return "more-filters";
  }
}
