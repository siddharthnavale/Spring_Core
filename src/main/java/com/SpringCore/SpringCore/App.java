package com.SpringCore.SpringCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
  public static void main(String[] args) {
    System.out.println("Hello World!");
    ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/config.xml");
    Employee employee1=(Employee)context.getBean("employee1");
    System.out.println(employee1);
    
  }
}
