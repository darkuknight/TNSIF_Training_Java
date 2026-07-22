package org.TNSIF.acc.c2tc.java;

import java.util.HashMap;
import java.util.Scanner;

public class frequencyCount {
	public static void count(String s) {
		HashMap<Character,Integer> hash = new HashMap<Character,Integer>();
		for(char c : s.toCharArray()) {
			if(hash.containsKey(c)) {
				hash.put(c, hash.get(c)+1);
			}else {
				hash.put(c, 1);
			}
		}
		System.out.println("Frequency count of chars in str is: "+hash);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.next();
		count(str);
		sc.close();
	}
}
