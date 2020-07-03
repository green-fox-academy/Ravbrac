package com.greenfox.basicwebshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebShopController {
//  @GetMapping("/webshop")
//  @ResponseBody
//  public String helloWorld() {
//    return "Hello World";
//  }

  @GetMapping("/webshop")
  public String webshop() {
    return "webshop";
  }
}
