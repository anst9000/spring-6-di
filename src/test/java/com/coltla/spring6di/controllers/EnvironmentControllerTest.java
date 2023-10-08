package com.coltla.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("prod")
@SpringBootTest
public class EnvironmentControllerTest {

  @Autowired
  EnvironmentController controller;

  @Test
  void testGetEnvironment() {
    System.out.println(controller.getEnvironment());
  }
}
