package com.openkoans.openkoans.controller;

import com.openkoans.openkoans.domain.Question;
import com.openkoans.openkoans.service.QuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/questions")
public class QuestionController {
  private final QuestionService questionService;

  public QuestionController(QuestionService questionService) {
    this.questionService = questionService;
  }

  @GetMapping("/{questionId}")
  public Question getQuestion(@PathVariable Long questionId) {
    return questionService.getQuestionById(questionId);
  }

  @PostMapping
  public ResponseEntity<Question> createQuestion(@RequestBody Question question) {
    Question createdQuestion = questionService.createQuestion(question);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdQuestion);
  }

  @PutMapping
  public Question updateQuestion(@RequestBody Question question) {
    return questionService.updateQuestion(question);
  }

  @DeleteMapping("/{questionId}")
  public ResponseEntity<Void> deleteQuestion(@PathVariable Long questionId) {
    questionService.deleteQuestion(questionId);
    return ResponseEntity.noContent().build();
  }
}
