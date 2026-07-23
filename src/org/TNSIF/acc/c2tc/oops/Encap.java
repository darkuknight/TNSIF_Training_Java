package org.TNSIF.acc.c2tc.oops;


class Human{
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}

}

public class Encap {

	public static void main(String[] args) {
		Human me = new Human();
		me.setName("Monish");
		me.setAge(21);
		me.setAge(me.getAge()/2);
		System.out.println("Name: "+me.getName());
		System.out.println("Age: "+me.getAge());
	}

}
