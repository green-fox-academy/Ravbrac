package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import com.greenfox.foxclub.service.FoxService;
import com.greenfox.foxclub.service.NutritionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class MainController {
    @Autowired
    FoxService foxService;
    @Autowired
    NutritionService nutritionService;


//    @GetMapping("/")
//    public String sendToLogin() {
//        return "redirect:/login";
//    }

//    @GetMapping("/")
//    public String index(Model model) {
//        model.addAttribute("name", fox.getName());
//
//        return "index";
//    }

    @GetMapping("/")
    public String index(@RequestParam(required = false) String name, Model model) {
        if (name == null)  {
            return "redirect:/login";
        }else if (!foxService.findFox(name).isPresent()) {
            foxService.addFox(name);
            return "redirect:/login?isNew=true";
        }else {

            Fox fox = foxService.findFox(name).get();
            model.addAttribute("name", fox.getName());
            model.addAttribute("food", fox.getFood());
            model.addAttribute("drink", fox.getDrink());
            model.addAttribute("tricks", fox.getTricks());
            if (fox.getTricks().isEmpty()) {
                model.addAttribute("noTrick", "You know no tricks, yet. Go and learn some.");
            } else {
                model.addAttribute("noTrick", "");
            }

            return "index";
        }
    }

    @GetMapping("/login")
    public String getLogin(@RequestParam(required = false) boolean isNew, Model model) {
        if (isNew) {
            model.addAttribute("newAlert", "You have provided a name that has not been used before, add it as a new one!");
        }else {
            model.addAttribute("newAlert", "");
        }

        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name) {
        return "redirect:/?name=" + name;
    }


}
