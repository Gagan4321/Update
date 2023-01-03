package com.methodconstructor;

public class Student {
	private String studentName;
	private int studentId;
	private int studentAge;
	
	public Student(int studentId) {
		this.studentId=studentId;
	}
	
	
	public Student(String studentName,int studentId, int studentAge) {
		this.studentName=studentName;
		this.studentId=studentId;
		this.studentAge=studentAge;
	}
	
	public void display() {
		System.out.println("Name: " + studentName);
		System.out.println("Id: " + studentId);
		System.out.println("Age: " + studentAge);
	}

}
