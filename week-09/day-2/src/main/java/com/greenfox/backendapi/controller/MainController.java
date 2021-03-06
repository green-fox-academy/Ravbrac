package com.greenfox.backendapi.controller;

import com.greenfox.backendapi.model.dto.*;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public ResponseEntity<?> doubling(@RequestParam(required = false) Integer input) {

        if (input == null) {
            return ResponseEntity.status(200).body(new ErrorMessage("Please provide an input!"));
        }
        return ResponseEntity.status(200).body(new InputNumber(input));
    }

    @GetMapping("/greeter")
    public ResponseEntity<?> greeter(@RequestParam(required = false) String name, @RequestParam(required = false) String title) {
        if (name == null) {
            if (title == null) {
                return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name and a title!"));
            }
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a name!"));
        }else if (title == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a title!"));
        }

        return ResponseEntity.status(200).body(new WelcomeMessage(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity<?> appendA(@PathVariable(required = false) String appendable) {
        if (appendable == null) {
            return ResponseEntity.status(404).build();
        }
        return ResponseEntity.status(200).body(new AppendedWord(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody(required = false) UntilNumber until) {
        if (until == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a number!"));
        }
        UntilNumber untilNumber = new UntilNumber(action, until.getUntil());
        return ResponseEntity.status(200).body(untilNumber);
    }

    @PostMapping("/arrays")
    public ResponseEntity<?> arraysHandler(@RequestBody(required = false) ArrayHandler arrayHandler) {
        if (arrayHandler == null || arrayHandler.getWhat() == null || arrayHandler.getNumbers() == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide what to do with the numbers!"));
        }else if ((arrayHandler.getWhat().equals("sum") || arrayHandler.getWhat().equals("multiply")) && arrayHandler.getNumbers() != null) {
            return ResponseEntity.status(200).body(new ReducedArray(arrayHandler.getWhat(), arrayHandler.getNumbers()));
        }else if (arrayHandler.getWhat().equals("double") && arrayHandler.getNumbers() != null) {
            return ResponseEntity.status(200).body(new DoubledArray(arrayHandler.getNumbers()));
        }

        return ResponseEntity.status(400).body(new ErrorMessage("Please provide what to do with the numbers!"));
    }
}
