package com.SpringCore.SpringCore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/Collection/CollectionConfig.xml");
		Tution tution1 =(Tution) context.getBean("Tution1");
		System.out.println(tution1.getName());
		System.out.println(tution1.getAddresses());
		System.out.println(tution1.getPhoneNumber());
		System.out.println(tution1.getCourses());}

}
