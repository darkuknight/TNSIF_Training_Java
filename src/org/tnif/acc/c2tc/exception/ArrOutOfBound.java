package org.tnif.acc.c2tc.exception;

public class ArrOutOfBound {
	public static void main(String[] args) {
		int arr[] = new int[4];
		try {
			int i = arr[5];
			System.out.println(i);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	}
}
