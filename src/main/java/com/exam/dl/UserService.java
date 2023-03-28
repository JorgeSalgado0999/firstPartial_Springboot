package com.exam.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exam.domain.User;

@Service
public class UserService {
  
  @Autowired
  private UserRepository repo;

  public User createUser(User user) {
    return repo.save(user);
  }
}