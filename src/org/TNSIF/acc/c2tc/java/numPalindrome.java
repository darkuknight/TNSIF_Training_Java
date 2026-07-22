package org.TNSIF.acc.c2tc.java;

import java.util.Scanner;

public class numPalindrome {
	public static int numRev(int n) {
		int i = n;
		int rev = 0;
		while(i!=0) {
			int digit = i%10;
			rev = rev*10 + digit;
			i /= 10;
		}
		return rev;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check palindrome: ");
		int n = sc.nextInt();
		System.out.println(numRev(n)==n);
		sc.close();
	}
}
