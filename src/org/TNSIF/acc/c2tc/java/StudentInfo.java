package org.tnsif.acc.c2tc.java;
import java.util.Scanner;

public class StudentInfo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		System.out.print("Enter your height: ");
		float height = sc.nextFloat();
		System.out.print("Are you a student?: ");
		boolean isStudent = sc.nextBoolean();
		System.out.print("Enter your aadhar: ");
		long aadhar = sc.nextLong();
		sc.nextLine();
		System.out.print("Enter your favourate teacher name: ");
		String favTeach = sc.nextLine();
		System.out.print("Enter your hobby: ");
		String hobby = sc.nextLine();
		System.out.print("Enter your daily reading time in minutes: ");
		short readTime = sc.nextByte();
		System.out.print("Enter your CGPA: ");
		double cgpa = sc.nextDouble();
		System.out.print("Enter no of siblings: ");
		byte siblingNo = sc.nextByte();
		
		System.out.println("\n\n\n----------------------Student Info----------------------");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("height: "+height);
		System.out.println("is student "+isStudent);
		System.out.println("Aadhar: "+aadhar);
		System.out.println("fav Teacher: "+favTeach);
		System.out.println("Hobby: "+hobby);
		System.out.println("Reading time: "+readTime);
		System.out.println("CGPA: "+cgpa);
		System.out.println("Siblings: "+siblingNo);
		sc.close();
	}
}
