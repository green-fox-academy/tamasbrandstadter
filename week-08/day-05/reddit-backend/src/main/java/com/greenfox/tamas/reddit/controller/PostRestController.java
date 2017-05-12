package com.greenfox.tamas.reddit.controller;

import com.greenfox.tamas.reddit.model.Post;
import com.greenfox.tamas.reddit.model.Posts;
import com.greenfox.tamas.reddit.services.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostRestController {

  @Autowired
  private PostRepository postRepository;
  private Posts posts = new Posts();

  @GetMapping(value = "/posts")
  public Posts listPosts() {
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @PostMapping(value = "/posts")
  public Post addPost(@RequestBody Post post) {
    postRepository.save(post);
    return post;
  }

  @PutMapping(value = "/posts/{id}/upvote")
  public Post upVotePost(@PathVariable("id") Long id) {
    Post post = postRepository.findOne(id);
    post.setScore();
    postRepository.save(post);
    return post;
  }
}
