package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public List<Post> getPosts() {
        return (List<Post>) postRepository.findAll();
    }

    public Post getPostByTitle(String title) {
        return postRepository.findByTitleEquals(title);
    }

    public void increaseVoteAtTitle(String title) {
        getPostByTitle(title).setVotes(getPostByTitle(title).getVotes() + 1);
        postRepository.save(getPostByTitle(title));

    }

    public void decreaseVoteAtTitle(String title) {
        getPostByTitle(title).setVotes(getPostByTitle(title).getVotes() - 1);
        postRepository.save(getPostByTitle(title));
    }
}
