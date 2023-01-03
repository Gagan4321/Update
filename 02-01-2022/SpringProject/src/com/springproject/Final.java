package com.springproject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beanpackage/Beans.xml");
		Hello obj = (Hello) context.getBean("hello");
		
		obj.display();

	}

}
