package org.tnif.acc.c2tc.exception;

public class ThrowDemo {
	 public static void main(String[] args) throws Exception {
		int age = 15;
		if(age<18) {
			throw new Exception("Age is less than 18!!!!");
		}else {
			System.out.println(age);
		}
	}
}
