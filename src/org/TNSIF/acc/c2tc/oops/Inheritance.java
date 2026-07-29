package org.tnsif.acc.c2tc.oops;

//Single inheritance
class Course{
	String courseName = "Java Programming";
	void showCourse() {
		System.out.println("Course: "+courseName);
	}
}
class Student extends Course{
	String studName = "Monish";
	void showStudent() {
		System.out.println("Student: "+studName);
	}
}

//multilevel inheritance
class Device{
	void info() {
		System.out.println("Device: Electronic");
	}
}
class Sam extends Device{
	void brand() {
		System.out.println("Brand: Samsung");
	}
}
class SmartPhone extends Sam{
	void feature() {
		System.out.println("Feature: Touchscreen");
	}
}

//Hierarchical Inheritance
class Employee{
	void company() {
		System.out.println("Company: TNSIF");
	}
}
class Dev extends Employee{
	void role() {
		System.out.println("Role: Developer");
	}
}
class Tester extends Employee{
	void role() {
		System.out.println("Role: Tester");
	}
}

public class Inheritance {
	public static void main(String[] args) {
		//Single inheritance
		System.out.println("<------------- Single Inheritance ------------->");
		Student s = new Student();
		s.showStudent();
		s.showCourse();
		
		//Multilevel inheritance
		System.out.println("\n<------------- Multilevel Inheritance ------------->");
		SmartPhone p = new SmartPhone();
		p.info();
		p.brand();
		p.feature();
		
		//Hierarchical inheritance
		System.out.println("\n<------------- Hierarchical Inheritance ------------->");
		Dev d = new Dev();
		Tester t = new Tester();
		System.out.println("Developer");
		d.company();
		d.role();
		System.out.println("Tester");
		t.company();
		t.role();
	}
}
