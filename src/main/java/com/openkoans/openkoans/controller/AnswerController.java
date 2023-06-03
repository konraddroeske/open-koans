package com.openkoans.openkoans.controller;

import com.openkoans.openkoans.domain.Answer;
import com.openkoans.openkoans.service.AnswerService;
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

/**
 * Controller for Answers
 */
@RestController
@RequestMapping("/answers")
public class AnswerController {
  private final AnswerService answerService;

  public AnswerController(AnswerService answerService) {
    this.answerService = answerService;
  }

  @GetMapping("/{answerId}")
  public Answer getAnswer(@PathVariable Long answerId) {
    return answerService.getAnswerById(answerId);
  }

  @PostMapping
  public ResponseEntity<Answer> createAnswer(@RequestBody Answer answer) {
    Answer createdAnswer = answerService.createAnswer(answer);
    return ResponseEntity.status(HttpStatus.CREATED).body(createdAnswer);
  }

  @PutMapping
  public Answer updateAnswer(@RequestBody Answer answer) {
    return answerService.updateAnswer(answer);
  }

  @DeleteMapping("/{answerId}")
  public ResponseEntity<Void> deleteAnswer(@PathVariable Long answerId) {
    answerService.deleteAnswer(answerId);
    return ResponseEntity.noContent().build();
  }
}
