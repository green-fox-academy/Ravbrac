package com.greenfox.reddit.service;

import com.greenfox.reddit.model.Post;
import com.greenfox.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
        Optional<Post> optionalPost = postRepository.findByTitleEquals(title);

        return optionalPost.orElse(null);
    }

    public void increaseVoteAtTitle(String title) {
        getPostByTitle(title).setVotes(getPostByTitle(title).getVotes() + 1);
        postRepository.save(getPostByTitle(title));

    }

    public void decreaseVoteAtTitle(String title) {
        getPostByTitle(title).setVotes(getPostByTitle(title).getVotes() - 1);
        postRepository.save(getPostByTitle(title));
    }

    public void addPost(String title, String postUrl) {
        this.postRepository.save(new Post(title, postUrl));
    }

    public List<Post> sortedPostsByVotes() {
        return getPosts().stream()
                .sorted(Comparator.comparing(Post::getVotes).reversed())
                .collect(Collectors.toList());
    }
}
