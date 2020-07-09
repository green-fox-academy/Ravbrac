package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
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
    List<Fox> foxes = new ArrayList<>();

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
    public String loggedInIndex(@RequestParam(defaultValue = "empty") String name, Model model) {
        if (name.equals("empty") || !findFox(name).isPresent()) {
            return "login";
        }else {
            Fox fox = findFox(name).get();
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
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name) {
        foxes.add(new Fox(name));
        String s = "?name=" + name;

        return "redirect:/" + s;
    }

    public  Optional<Fox> findFox(String name) {
        return foxes.stream()
                .filter(f -> f.getName().equals(name))
                .findFirst();
    }
}
