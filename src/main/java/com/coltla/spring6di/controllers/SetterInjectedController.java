package com.coltla.spring6di.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.coltla.spring6di.services.GreetingService;

@Controller
public class SetterInjectedController {

  private GreetingService greetingService;

  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    System.out.println("SetterInjectedController.setterInjectedController");
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
