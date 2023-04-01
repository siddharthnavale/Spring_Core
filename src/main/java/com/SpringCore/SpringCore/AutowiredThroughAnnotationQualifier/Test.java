package com.SpringCore.SpringCore.AutowiredThroughAnnotationQualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
public static void main(String[] args) {
	
ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/AutowiredThroughAnnotationQualifier/ByannotionAutowiringConfig.xml");
Customer c1=(Customer)context.getBean("customer1");
System.out.println(c1);
}
}
