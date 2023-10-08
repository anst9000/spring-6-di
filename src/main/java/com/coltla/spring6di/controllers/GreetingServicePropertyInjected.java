package com.coltla.spring6di.controllers;

import org.springframework.stereotype.Service;

import com.coltla.spring6di.services.GreetingService;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements GreetingService {

  @Override
  public String sayGreeting() {
    return "Friends don't let friends do property injection.";
  }

}
