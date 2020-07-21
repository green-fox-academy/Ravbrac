package com.greenfox.backendapi.controller;

import com.greenfox.backendapi.model.dto.ErrorMessage;
import com.greenfox.backendapi.model.dto.InputNumber;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public ResponseEntity<? extends Object> doubling(@RequestParam(required = false) Integer input) {

        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        }
        return ResponseEntity.status(200).body(new InputNumber(input));
    }
}
