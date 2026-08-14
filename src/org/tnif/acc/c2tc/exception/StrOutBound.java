package org.tnif.acc.c2tc.exception;

public class StrOutBound {
	public static void main(String[] args) {
		String s = "hello";
		try {
			System.out.println(s.charAt(5));
		}catch(Exception e) { 
			System.out.println(e);
		}
	}
}
