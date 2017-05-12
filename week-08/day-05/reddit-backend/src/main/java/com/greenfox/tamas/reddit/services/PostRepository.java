package com.greenfox.tamas.reddit.services;

import com.greenfox.tamas.reddit.model.Post;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface PostRepository extends CrudRepository<Post, Long> {

}
