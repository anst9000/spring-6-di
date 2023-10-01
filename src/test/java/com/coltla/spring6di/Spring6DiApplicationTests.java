package com.coltla.spring6di;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.coltla.spring6di.controllers.MyController;

@SpringBootTest
class Spring6DiApplicationTests {

  @Autowired
  ApplicationContext applicationContext;

  @Autowired
  MyController controllerTesting;

  @Test
  void testAutowireOfController() {
    System.out.println(controllerTesting.sayHello());
  }

  @Test
  void testGetControllerFromCtx() {
    MyController controllerTesting = applicationContext.getBean(MyController.class);

    System.out.println(controllerTesting.sayHello());
  }

  @Test
  void contextLoads() {
  }

}
