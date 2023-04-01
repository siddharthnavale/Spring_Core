package com.SpringCore.SpringCore.AutowiringThroghXMLByName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/AutowiringThroghXMLByName/ByNameAutowiringConfig.xml");

		Player p1=(Player)context.getBean("player1");
		System.out.println(p1);
		
	}

}
