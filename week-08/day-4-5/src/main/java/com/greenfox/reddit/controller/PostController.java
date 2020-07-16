package com.greenfox.reddit.controller;

import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PostController {

    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/")
    public String index(@RequestParam(required = false) String title, @RequestParam(required = false) String vote, Model model) {
        model.addAttribute("posts", postService.getPosts());

        if (vote.equals("up")) {
            postService.increaseVoteAtTitle(title);
        }else if (vote.equals("down")) {
            postService.decreaseVoteAtTitle(title);
        }

        return "index";
    }

    @GetMapping("/submit")
    public String submitGet() {
        return "submit";
    }
}
