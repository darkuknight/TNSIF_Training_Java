package org.TNSIF.acc.c2tc.java;

import java.util.Scanner;

public class secLargest {
	public static int findSecLarge(int n, int[] arr) {
		int largest = arr[0];
		int secLargest = Integer.MIN_VALUE;
		for(int i=0;i<n;++i) {
			if(largest<arr[i]) {
				secLargest = largest;
				largest = arr[i];
			}else if(arr[i]>secLargest && arr[i]<largest) {
				secLargest = arr[i];
			}
		}
		return secLargest;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in array: ");
		int n = sc.nextInt();
		System.out.print("Enter the elements of array: ");
		int arr[] = new int[n];
		for(int i=0;i<n;++i) {
			arr[i] = sc.nextInt();
		}
		int secLarg = findSecLarge(n, arr);
		if(secLarg == Integer.MIN_VALUE) {
			System.out.println("no second largest element in arr");
		}else {
			System.out.println("Second largest element in arr is: "+secLarg);
		}
		sc.close();
	}
}
