package com.methodsetter;

public class Student {
	private String studentName;
	private int studentId;
	private String studentAge;
	
	



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public void setStudentAge(String studentAge) {
		this.studentAge = studentAge;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public void displayStudentInfo() {
		
		System.out.println("Student name is " + studentName);
		System.out.println("Student id: " + studentId);
		System.out.println("Age: " + studentAge);
	}
	
}
