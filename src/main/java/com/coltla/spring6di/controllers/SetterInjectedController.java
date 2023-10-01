package com.coltla.spring6di.controllers;

import com.coltla.spring6di.services.GreetingService;

public class SetterInjectedController {
  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
