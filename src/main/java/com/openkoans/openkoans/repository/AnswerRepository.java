package com.openkoans.openkoans.repository;

import com.openkoans.openkoans.domain.Answer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for managing answers in the database.
 */
@Repository
public interface AnswerRepository extends JpaRepository<Answer, Long> {
}
