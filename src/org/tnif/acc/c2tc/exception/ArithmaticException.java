package org.tnif.acc.c2tc.exception;

public class ArithmaticException {
	public static void main(String[] args) throws ArithmeticException {
		int num;
		num = 50/5;
		System.out.println(num);
		num = 50/10;
		try {
			System.out.println(num);
			num = 50/0;
		}catch(Exception e) {
			System.out.println("!!!!!!!!!!\nException occured: "+e+"\n!!!!!!!!!!");
		}
		System.out.println(num);
		num = 50/25;
		System.out.println(num);
	}
}
