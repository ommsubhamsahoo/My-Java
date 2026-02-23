package com.subham.www;

public class Student {
	String name;
	String regno;
	String degree;
	char grade;

	public void eat() {
		System.out.println("Student is eating");

	}

	public static void main(String[] args) {
		Student s = new Student();
		s.eat();
		s.name = "Subham";
		s.regno = "A1234567b8";
//		s.degree = "B.Tech";
		System.out.println("Student name is:" + s.name);
		System.out.println("Student name is:" + s.name);
		System.out.println("Student name is:" + s.degree);
		System.out.println("grade is "+s.grade);
	}

}
