package com.openkoans.openkoans.repository;

import com.openkoans.openkoans.domain.Question;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Long> {

  /**
   * Find questions by their category
   *
   * @param category the category of the question
   * @return a list of questions with a matching category
   */
  List<Question> findByQuestionCategory(String category);
}