package com.openkoans.openkoans.service;

import com.openkoans.openkoans.domain.User;
import com.openkoans.openkoans.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.stereotype.Service;


@Service
public class UserService {
  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public User getUserById(Long userId) {
    return userRepository.findById(userId)
        .orElseThrow(() -> new EntityNotFoundException("User not found."));
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

  public User createUser(User user) {
    // perform validation & business logic
    return userRepository.save(user);
  }

  public User updateUser(User user) {
    // perform validation & business logic
    return userRepository.save(user);
  }

  public void deleteUser(Long userId) {
    userRepository.deleteById(userId);
  }
}
