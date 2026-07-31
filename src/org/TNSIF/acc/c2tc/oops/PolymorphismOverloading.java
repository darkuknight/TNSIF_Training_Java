package org.tnsif.acc.c2tc.oops;

public class PolymorphismOverloading {
	public static int add(int a, int b) {
		return a+b;
	}
	public static double add(int a, double b, int c) {
		return a+b+c;
	}
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(2,2,2));
	}
}
