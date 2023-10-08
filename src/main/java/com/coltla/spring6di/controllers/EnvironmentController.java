package com.coltla.spring6di.controllers;

import org.springframework.stereotype.Controller;

import com.coltla.spring6di.services.EnvironmentService;

@Controller
public class EnvironmentController {

  private final EnvironmentService environmentService;

  public EnvironmentController(EnvironmentService environmentService) {
    this.environmentService = environmentService;
  }

  public String getEnvironment() {
    return "You are in " + environmentService.getEnv() + " environment";
  }
}
