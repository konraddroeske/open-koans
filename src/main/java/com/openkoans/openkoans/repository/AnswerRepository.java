package com.openkoans.openkoans.repository;

import com.openkoans.openkoans.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for managing answers in the database.
 */
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
