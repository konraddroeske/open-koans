package com.openkoans.openkoans.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a User in the application.
 */
@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long userId;

  public User() {
  }

  /**
   * Constructs a new User with the specified username, password hash, and email.
   *
   * @param username     The username of the user.
   * @param passwordHash The password of the user.
   * @param email        The email address of the user.
   */
  public User(String username, String passwordHash, String email) {
    this.username = username;
    this.passwordHash = passwordHash;
    this.email = email;
  }

  @Column(name = "username", unique = true, nullable = false)
  private String username;

  @Column(name = "password_hash", nullable = false)
  private String passwordHash;

  @Column(name = "email", nullable = false)
  private String email;
}
