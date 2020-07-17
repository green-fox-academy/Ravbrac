package com.greenfox.reddit.controller;

import com.greenfox.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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
        model.addAttribute("posts", postService.sortedPostsByVotes());

        if (title != null) {
            if (vote.equals("up")) {
                postService.increaseVoteAtTitle(title);
                return "redirect:/";
            }else if (vote.equals("down")) {
                postService.decreaseVoteAtTitle(title);
                return "redirect:/";
            }
        }
        
        return "index";
    }

    @GetMapping("/submit")
    public String submitGet() {
        return "submit";
    }

    @PostMapping("/submit")
    public String submitPost(@RequestParam(required = false) String title, @RequestParam(required = false) String postUrl) {
        if (!(title == null && !(postUrl == null))){
            postService.addPost(title, postUrl);
            return "redirect:/";
        }else {
            return "redirect:/submit";
        }

    }
}
