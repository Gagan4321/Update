package com.methodconstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springconstructor/Beans3.xml");
		Student obj = context.getBean("student",Student.class);
		obj.display();
		
		Student obj2 = context.getBean("uchiha",Student.class);
		obj2.display();
		
		Student obj3 = context.getBean("stuid",Student.class);
		obj3.display();
		
	}

}
