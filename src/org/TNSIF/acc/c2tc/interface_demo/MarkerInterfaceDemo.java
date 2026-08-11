package org.tnsif.acc.c2tc.interface_demo;

interface Registration{
	
}

class Student implements Registration{
	// Class Variables
	private static int idTracker = 1;
	private int id;
	private String name;
	private double fee;
	private String course;
	
	// Constructors
	Student(){
		this.id = idTracker++;
		this.name = "-";
		this.fee = 100000;
		this.course = "-";
	}
	Student(String name, double fee, String course){
		this.id = idTracker++;	
		this.name = name;
		this.fee = fee;
		this.course = course;
	}
	
	// Getter Setter Methods
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	
	// Methods
	public void displayStudent() {
		System.out.println("---Student Details---");
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Fee: "+this.fee);
		System.out.println("Course: "+this.course);
	}
}

public class MarkerInterfaceDemo {
	public static void main(String[] args) {
		Registration s1 = new Student();
		Student s2 = new Student("Preran",200000,"CSE");
		if(s1 instanceof Registration) {
			System.out.println("Student is Registered!!!");
		}else {
			System.out.println("Student is not Registered!!!");
		}
		if(s2 instanceof Registration) {
			System.out.println("Student is Registered!!!");
		}else {
			System.out.println("Student is not Registered!!!");
		}
	}
}
