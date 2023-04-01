package com.SpringCore.SpringCore.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/ConstructorInjection/ConstructorInjectionConfig.xml");
	Student student1 = (Student)context.getBean("student1");
	System.out.println(student1);
	
	}

}
