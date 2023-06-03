package com.openkoans.openkoans.service;


import com.openkoans.openkoans.domain.Question;
import com.openkoans.openkoans.repository.QuestionRepository;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class QuestionService {
  private final QuestionRepository questionRepository;

  public QuestionService(QuestionRepository questionRepository) {
    this.questionRepository = questionRepository;
  }

  public Question getQuestionById(Long questionId) {
    return questionRepository.findById(questionId)
        .orElseThrow(() -> new EntityNotFoundException("Question not found."));
  }

  public List<Question> getAllQuestions() {
    return questionRepository.findAll();
  }

  public Question createQuestion(Question question) {
    // perform validation & business logic
    return questionRepository.save(question);
  }

  public Question updateQuestion(Question question) {
    // perform validation & business logic
    return questionRepository.save(question);
  }

  public void deleteQuestion(Long questionId) {
    questionRepository.deleteById(questionId);
  }
}
