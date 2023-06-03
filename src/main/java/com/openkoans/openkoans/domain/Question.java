package com.openkoans.openkoans.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Represents a Question in the application.
 */
@Entity
@Table(name = "questions")
public class Question {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long questionId;

  public Question() {
  }

  /**
   * Constructs a new Question with the specified username, password, and email.
   *
   * @param questionText     The text of the Question.
   * @param questionCategory The category of the Question.
   */
  public Question(String questionText, String questionCategory) {
    this.questionText = questionText;
    this.questionCategory = questionCategory;
  }

  @Column(name = "question_text", nullable = false)
  private String questionText;

  @Column(name = "question_category", nullable = false)
  private String questionCategory;

  public Long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(Long questionId) {
    this.questionId = questionId;
  }

  public String getQuestionText() {
    return questionText;
  }

  public void setQuestionText(String questionText) {
    this.questionText = questionText;
  }

  public String getQuestionCategory() {
    return questionCategory;
  }

  public void setQuestionCategory(String questionCategory) {
    this.questionCategory = questionCategory;
  }
}
