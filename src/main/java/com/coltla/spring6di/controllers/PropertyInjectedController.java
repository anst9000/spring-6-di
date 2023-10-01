package com.coltla.spring6di.controllers;

import com.coltla.spring6di.services.GreetingService;

public class PropertyInjectedController {
  GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
