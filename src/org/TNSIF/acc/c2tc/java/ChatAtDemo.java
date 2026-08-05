package org.tnsif.acc.c2tc.java;
import java.util.Scanner;

public class ChatAtDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		System.out.println("Enter char to find its index");
		char c = sc.next().charAt(0);
		int index = -1;
		for(int i=0;i<str.length();++i) {
			if(str.charAt(i)==c) {
				index = i;
				break;
			}
		}
		if(index!=-1) {
			System.out.println("char "+c+" is present in index "+index+" of string "+str);
		}else {
			System.out.println("char "+c+" is not present in the string "+str);
		}
		sc.close();
	}
}
