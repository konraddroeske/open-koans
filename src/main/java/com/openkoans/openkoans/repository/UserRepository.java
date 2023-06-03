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

  /**
   * Find users by their email domain.
   *
   * @param domain the email domain to search for
   * @return a list of users with matching email domain
   */
  List<User> findByEmailContaining(String domain);
}
