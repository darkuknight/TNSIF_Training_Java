package org.TNSIF.acc.c2tc.java;

public class varTypes {
	int val = 10;
	void print() {
		String s = "Local Variable";
		System.out.println(s);
	}
	static String msg = "Static Variable";
	public static void main(String[] args) {
		varTypes obj = new varTypes();
		System.out.println(obj.val);
		obj.print();
		System.out.println(msg);
	}
}
