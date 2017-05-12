package com.greenfox.tamas.reddit.controller;

import com.greenfox.tamas.reddit.model.Posts;
import com.greenfox.tamas.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

  @Autowired
  private PostRepository postRepository;

  @RequestMapping(value = "/posts", method = RequestMethod.GET)
  public Posts listPosts() {
    Posts posts = new Posts();
    posts.setPosts(postRepository.findAll());
    return posts;
  }
}
