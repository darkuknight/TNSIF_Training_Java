package org.tnsif.acc.c2tc.oops;

abstract class Student1{
	void call() {
		System.out.println("Call feature added!");
	}
	abstract void ai();
	abstract void network();
	abstract void health();
}

abstract class Student2 extends Student1{
	@Override
	void ai() {
		System.out.println("Ai feature added!");
	}
}

class Student3 extends Student2{
	@Override
	void network() {
		System.out.println("Network feature added!");
	}
	@Override
	void health() {
		System.out.println("Health feature added!");	
	}
}

public class Abstract {
	public static void main(String[] args) {
		Student3 proj = new Student3();
		proj.call();
		proj.ai();
		proj.network();
		proj.health();
	}
}
