package com.SpringCore.SpringCore.LifeCycle.ThroughInterface;


import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext Context = new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/LifeCycle/ThroughInterface/LifeCycleConfig.xml");
	
		Car c1=(Car)Context.getBean("car1");
		System.out.println(c1);
	
		Context.registerShutdownHook();
		
	
	}

}
