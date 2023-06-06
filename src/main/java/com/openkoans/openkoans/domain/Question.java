package com.openkoans.openkoans.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Represents a Question in the application.
 */
@Data
@Entity
@Table(name = "questions")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "question_id")
  private Long id;

  @Column(name = "question_text", nullable = false)
  private String questionText;

  @Column(name = "question_category", nullable = false)
  private String questionCategory;

  public Question() {
  }

  /**
   * Constructs a new Question with the specified question text and question category.
   *
   * @param questionText     The text of the Question.
   * @param questionCategory The category of the Question.
   */
  public Question(String questionText, String questionCategory) {
    this.questionText = questionText;
    this.questionCategory = questionCategory;
  }
}
