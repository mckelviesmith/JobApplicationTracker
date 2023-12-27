package com.mckelviesmith.JobApplicationTracker.Controllers;

import com.mckelviesmith.JobApplicationTracker.DTOs.UserDto;
import com.mckelviesmith.JobApplicationTracker.Services.UserService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Handles endpoints for users
 */
@RestController
@RequiredArgsConstructor
public class UserController {

  private final UserService userService;

  /**
   * Endpoint that returns all users
   * @return JSON response containing all users
   */
  @GetMapping("/users")
  public ResponseEntity<Object> getUsers() {
    List<UserDto> returnUsers = userService.getUsers();
    return new ResponseEntity<>(returnUsers, HttpStatus.OK);
  }

}
