package com.openkoans.openkoans.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller for Health Checks
 */
@RestController
public class HealthController {
  @GetMapping("/api/v1/health")
  public String healthCheck() {
    return "OK";
  }
}
