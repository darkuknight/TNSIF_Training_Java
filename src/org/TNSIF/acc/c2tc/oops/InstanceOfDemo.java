package org.tnsif.acc.c2tc.oops;

class Person{
	
}
class Employee1 extends Person{
	
}
class Manager extends Employee1{
	
}


public class InstanceOfDemo {
	public static void main(String[] args) {
		Person p = new Person();
		Employee1 e = new Employee1();
		Manager m = new Manager();
		System.out.println(e instanceof Employee1); //True
		System.out.println(e instanceof Person); //True
		System.out.println(e instanceof Manager); //False
		System.out.println(m instanceof Manager); //True
		System.out.println(m instanceof Person); //True
		System.out.println(m instanceof Employee1); //True
		System.out.println(p instanceof Person); //True
		System.out.println(p instanceof Employee1); //False
		System.out.println(p instanceof Manager); //False
	}
}
