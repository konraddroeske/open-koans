package com.openkoans.openkoans.service;

import com.openkoans.openkoans.domain.Answer;
import com.openkoans.openkoans.repository.AnswerRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class AnswerService {
  private final AnswerRepository answerRepository;

  public AnswerService(AnswerRepository answerRepository) {
    this.answerRepository = answerRepository;
  }

  public Answer getAnswerById(Long answerId) {
    return answerRepository.findById(answerId)
        .orElseThrow(() -> new EntityNotFoundException("Answer not found."));
  }

  public List<Answer> getAllAnswers() {
    return answerRepository.findAll();
  }

  public Answer createAnswer(Answer answer) {
    // perform validation & business logic
    return answerRepository.save(answer);
  }

  public Answer updateAnswer(Answer answer) {
    // perform validation & business logic
    return answerRepository.save(answer);
  }

  public void deleteAnswer(Long answerId) {
    answerRepository.deleteById(answerId);
  }
}
