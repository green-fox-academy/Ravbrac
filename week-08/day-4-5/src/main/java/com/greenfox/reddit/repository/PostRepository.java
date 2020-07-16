package com.greenfox.reddit.repository;

import com.greenfox.reddit.model.Post;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {
    Post findByTitleEquals(String title);
}
