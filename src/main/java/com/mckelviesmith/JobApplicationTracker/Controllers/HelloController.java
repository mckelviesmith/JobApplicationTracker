package com.mckelviesmith.JobApplicationTracker.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller to verify the application is running correctly and endpoints are accessible.
 */
@RestController
public class HelloController {

  /**
   * Basic GET endpoint to verify the application is running correctly.
   * @return "hello"
   */
  @GetMapping("/hello")
  public String hello() {
    return "hello";
  }

}
