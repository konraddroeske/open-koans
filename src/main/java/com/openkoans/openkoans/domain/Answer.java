package com.openkoans.openkoans.domain;

import com.openkoans.openkoans.domain.user.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * Represents a User's Answer to a Question in the application.
 */
@Data
@Entity
@Table(name = "answers")
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "answer_id")
  private Long id;

  @Column(name = "user_id")
  private Long userId;

  @Column(name = "question_id")
  private Long questionId;

  @Column(name = "answer_text", columnDefinition = "TEXT")
  private String answerText;

  @ManyToOne
  @JoinColumn(name = "user_id", insertable = false, updatable = false)
  private User user;

  @ManyToOne
  @JoinColumn(name = "question_id", insertable = false, updatable = false)
  private Question question;


  public Answer() {
  }

  /**
   * Constructs a new Answer with the specified user id, question id, and
   * answer text.
   *
   * @param userId     The user id of the Answer.
   * @param questionId The question id of the Answer.
   * @param answerText The text of the Answer.
   */
  public Answer(Long userId, Long questionId, String answerText) {
    this.userId = userId;
    this.questionId = questionId;
    this.answerText = answerText;
  }
}
