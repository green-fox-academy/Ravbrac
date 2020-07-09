package com.greenfox.foxclub.controller;

import com.greenfox.foxclub.model.Fox;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
    Fox fox = new Fox();

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
        if (name.equals("empty")) {
            return "login";
        }else {
            model.addAttribute("name", name);

            return "index";
        }

    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam String name) {
        String s = "?name=" + name;

        return "redirect:/" + s;
    }
}
