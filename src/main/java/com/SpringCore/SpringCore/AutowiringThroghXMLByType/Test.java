package com.SpringCore.SpringCore.AutowiringThroghXMLByType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/SpringCore/AutowiringThroghXMLByType/ByTypeAutowiringConfig.xml");

		Player p1=(Player)context.getBean("player1");
		System.out.println(p1);
		
	}

}
