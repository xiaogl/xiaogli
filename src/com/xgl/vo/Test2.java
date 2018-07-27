package com.xgl.vo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	
	public static void main(String[] args) {
		
		
		try {
			
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			Party pa = (Party) ac.getBean("frd3");
			for (Friend str : pa.getFds()) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}
