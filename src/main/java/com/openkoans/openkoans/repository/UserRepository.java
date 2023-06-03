package com.openkoans.openkoans.repository;

import com.openkoans.openkoans.domain.User;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing users in the database.
 */
public interface UserRepository extends JpaRepository<User, Long> {
  /**
   * Find a user by their username.
   *
   * @param username the username of the user to find
   * @return the found user, or null if not found
   */
  User findByUsername(String username);
}
