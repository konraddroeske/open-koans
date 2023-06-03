package com.openkoans.openkoans.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * DTO for Creating New User
 */
public class CreateUserRequest {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("email")
  private String email;

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getEmail() {
    return email;
  }
}
