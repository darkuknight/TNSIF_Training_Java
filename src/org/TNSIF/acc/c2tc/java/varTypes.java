package org.TNSIF.acc.c2tc.java;

public class VarTypes {
	int val = 10;
	void print() {
		String s = "Local Variable";
		System.out.println(s);
	}
	static String msg = "Static Variable";
	public static void main(String[] args) {
		VarTypes obj = new VarTypes();
		System.out.println(obj.val);
		obj.print();
		System.out.println(msg);
	}
}
