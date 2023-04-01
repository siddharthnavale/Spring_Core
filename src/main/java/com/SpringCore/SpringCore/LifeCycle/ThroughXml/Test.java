package com.SpringCore.SpringCore.LifeCycle.ThroughXml;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		AbstractApplicationContext context =new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/LifeCycle/ThroughXml/LifeCycleConfig.xml");
		Car c1=(Car)context.getBean("car1");
		System.out.println(c1);
		context.registerShutdownHook();
		}

}
