package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.service.FoxService;
import com.greenfox.foxclub.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {
    @Autowired
    private FoxService foxService;
    @Autowired
    private NutritionService nutritionService;

    @GetMapping("/nutritionStore")
    public String nutritionStore(@RequestParam(required = false) String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("foods", nutritionService.getFoods());
        model.addAttribute("drinks", nutritionService.getDrinks());

        if (name == null)  {
            return "redirect:/login";
        }else if(foxService.findFox(name).isPresent()) {
            model.addAttribute("currentFood", foxService.findFox(name).get().getFood());
            model.addAttribute("currentDrink", foxService.findFox(name).get().getDrink());
        }
        return "nutrition-store";
    }

    @PostMapping("/nutritionStore")
    public String changeNutrition(@RequestParam String name, @RequestParam String food, @RequestParam String drink) {
        if (foxService.findFox(name).isPresent()) {
            foxService.findFox(name).get().setFood(food);
            foxService.findFox(name).get().setDrink(drink);
        }

        return "redirect:/?name=" + name;
    }
}
