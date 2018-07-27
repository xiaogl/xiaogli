package com.xgl.vo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	
	public static void main(String[] args) {
		
		try {
			ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
			Friend fd = (Friend) ac.getBean("frd");
			System.out.println(fd.getFname());
			System.out.println(fd.getSex());
			System.out.println(fd.getAge());
			for (String str : fd.getAihao()) {
				System.out.println(str);
			}
			
			
			System.out.println("------------------------");
			Friend fd2 = (Friend) ac.getBean("frd2");
			System.out.println(fd2.getFname());
			System.out.println(fd2.getSex());
			System.out.println(fd2.getAge());
			for (String str : fd2.getAihao()) {
				System.out.println(str);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
}
