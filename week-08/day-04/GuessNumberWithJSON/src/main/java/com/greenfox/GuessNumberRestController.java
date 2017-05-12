package com.greenfox;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuessNumberRestController {
  private Answer answer = new Answer(3);
  private String correctAnswer = "1958";

  @PostMapping("/guessyear")
  public Answer sum(@RequestBody AudienceGuess audienceGuess) {
    if (audienceGuess.getGuess().equals(correctAnswer)) {
      answer.life--;
      answer.setResponse("Correct guess. Lives left: " + answer.getLife());
    }
    if (!audienceGuess.getGuess().equals(correctAnswer)) {
      answer.life--;
      if (answer.getLife() == 0) {
        answer.setResponse("Game over.");
      } else {
        answer.setResponse("Wrong guess. Lives remaining: " + answer.getLife());
      }
    }
    return answer;
  }

  @ExceptionHandler(Exception.class)
  public ErrorMessage showError(Exception e) {
    return new ErrorMessage("Please provide a year!");
  }
}
