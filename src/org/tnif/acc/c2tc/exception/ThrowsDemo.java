package org.tnif.acc.c2tc.exception;

import java.io.IOException;

public class ThrowsDemo {
	public static void print() {
		System.out.println("hello, world!");
	}
	public static void fileReading() throws IOException {
		System.out.println("File not found!!!");
	}
	public static void division() throws ArithmeticException, ClassNotFoundException, IOException{
		System.out.println("Cant divide by Zero");
	}
	public static void main(String[] args) {
		print();
		try {
			fileReading();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		try {
			division();
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
