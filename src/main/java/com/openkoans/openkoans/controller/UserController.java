package com.openkoans.openkoans.controller;

import com.openkoans.openkoans.domain.User;
import com.openkoans.openkoans.dto.CreateUserRequest;
import com.openkoans.openkoans.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Users
 */
@RestController
@RequestMapping("/users")
public class UserController {
  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping("/{userId}")
  public User getUser(@PathVariable Long userId) {
    return userService.getUserById(userId);
  }

  @PostMapping
  public ResponseEntity<User> createUser(@RequestBody CreateUserRequest request) {
    User newUser = new User(request.getUsername(), request.getPassword(), request.getEmail());
    User createdUser = userService.createUser(newUser);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdUser);
  }

  @PutMapping
  public User updateUser(@RequestBody User user) {
    return userService.updateUser(user);
  }

  @DeleteMapping("/{userId}")
  public ResponseEntity<Void> deleteUser(@PathVariable Long userId) {
    userService.deleteUser(userId);
    return ResponseEntity.noContent().build();
  }
}
