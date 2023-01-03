package com.methodsetter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("com/beanspackage/Beans2.xml");
		Student org= context.getBean("student",Student.class);
		org.displayStudentInfo();
		

	}

}
