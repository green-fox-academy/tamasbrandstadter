package com.greenfox.tamas.reddit.services;

import com.greenfox.tamas.reddit.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
