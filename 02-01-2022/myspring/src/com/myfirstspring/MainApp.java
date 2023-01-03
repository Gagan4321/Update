package com.myfirstspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springpackage/Beans.xml");
		HelloWorld obj= (HelloWorld) context.getBean("helloworld");
		
		obj.method();

	}

}
