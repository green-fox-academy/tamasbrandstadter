package com.greenfox.tamas.reddit.controller;

import com.greenfox.tamas.reddit.model.Post;
import com.greenfox.tamas.reddit.model.Posts;
import com.greenfox.tamas.reddit.model.User;
import com.greenfox.tamas.reddit.services.PostRepository;
import com.greenfox.tamas.reddit.services.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class PostRestController {
  private final PostRepository postRepository;
  private final UserRepository userRepository;
  private Posts posts;

  @Autowired
  public PostRestController(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
    this.posts = new Posts();
  }

  @GetMapping(value = "/posts")
  public Posts listPosts() {
    posts.setPosts(postRepository.findAll());
    return posts;
  }

  @PostMapping(value = "/posts")
  public Post addPost(@RequestBody Post inputPost, @RequestHeader(value = "owner", required = false) String owner) {
    userRepository.save(new User(owner));
    Post post = new Post(inputPost.getTitle(), inputPost.getHref(), userRepository.findOne(owner));
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

  @PutMapping(value = "/posts/{id}/downvote")
  public Post downVotePost(@PathVariable("id") Long id) {
    Post post = postRepository.findOne(id);
    post.downScore();
    postRepository.save(post);
    return post;
  }

  @DeleteMapping(value = "/posts/{id}")
  public Post deletePost(@PathVariable("id") Long id) {
    Post post = postRepository.findOne(id);
    postRepository.delete(id);
    return post;
  }

  @PutMapping(value = "/posts/{id}")
  public Post updatePost(@PathVariable("id") Long id, @RequestBody Post inputPost) {
    Post post = postRepository.findOne(id);
    post.setHref(inputPost.getHref());
    post.setTitle(inputPost.getTitle());
    postRepository.save(post);
    return post;
  }
}
