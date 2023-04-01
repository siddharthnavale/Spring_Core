package com.SpringCore.SpringCore.LifeCycle.Annotation;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/LifeCycle/Annotation/LifeCycleConfig.xml");
		Car c1=(Car)context.getBean("car1");
		System.out.println(c1);
		context.registerShutdownHook();
		}

}
