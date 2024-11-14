package com.s1scottd.WeatherForecastApp.dtos;

import java.time.LocalDateTime;

public class ErrorResponse {
  private LocalDateTime timestamp;
  private String message;
  private String details;

  public ErrorResponse(LocalDateTime timestamp, String message, String details) {
    this.timestamp = timestamp;
    this.message = message;
    this.details = details;
  }

  // Getters and setters
}
