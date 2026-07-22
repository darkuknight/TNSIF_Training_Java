package org.TNSIF.acc.c2tc.java;
import java.util.Scanner;

public class stringPalindrome {
	public static String reverse(String str) {
		StringBuffer rev = new StringBuffer();
		int n = str.length();
		for(int i=0;i<n;i++) {
			rev.append(str.charAt(n-i-1));
		}
		return rev.toString();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string to check palindrome: ");
		String str = sc.next();
		System.out.println(str.equals(reverse(str)));
		sc.close();
	}
}
