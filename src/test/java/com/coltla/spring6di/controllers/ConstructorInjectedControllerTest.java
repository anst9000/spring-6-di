package com.coltla.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ConstructorInjectedControllerTest {

  @Autowired
  ConstructorInjectedController controller;

  @Test
  void sayHello() {
    System.out.println(controller.sayHello());
  }
}
