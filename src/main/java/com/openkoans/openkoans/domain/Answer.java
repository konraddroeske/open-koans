package com.openkoans.openkoans.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * Represents a User's Answer to a Question in the application.
 */
@Entity
@Table(name = "answers")
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "answer_id")
  private Long answerId;

  @ManyToOne
  @JoinColumn(name = "user_id", nullable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "question_id", nullable = false)
  private Question question;

  @Column(name = "answer_text", nullable = false)
  private String answerText;

  public Answer() {
  }

  /**
   * Constructs a new Question with the specified username, password, and email.
   *
   * @param user       The user of the Answer.
   * @param question   The question of the Answer.
   * @param answerText The text of the Answer.
   */
  public Answer(User user, Question question, String answerText) {
    this.user = user;
    this.question = question;
    this.answerText = answerText;
  }

  public Long getAnswerId() {
    return answerId;
  }

  public void setAnswerId(Long answerId) {
    this.answerId = answerId;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Question getQuestion() {
    return question;
  }

  public void setQuestion(Question question) {
    this.question = question;
  }

  public String getAnswerText() {
    return answerText;
  }

  public void setAnswerText(String answerText) {
    this.answerText = answerText;
  }

}
