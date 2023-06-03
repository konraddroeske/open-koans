package com.openkoans.openkoans.repository;

import com.openkoans.openkoans.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing users in the database.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
  /**
   * Find a user by their username.
   *
   * @param username the username of the user to find
   * @return the found user, or null if not found
   */
  User findByUsername(String username);
}
