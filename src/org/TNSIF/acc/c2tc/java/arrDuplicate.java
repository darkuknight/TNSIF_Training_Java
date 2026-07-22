package org.TNSIF.acc.c2tc.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrDuplicate {
	public static ArrayList<Integer> findDuplicate(int n,int[] arr) {
		ArrayList<Integer> dup = new ArrayList<Integer>();
		Arrays.sort(arr);
		for(int i=1;i<n;++i) {
			if(!dup.contains(arr[i]) && arr[i]==arr[i-1]) {
				dup.add(arr[i]);
			}
		}
		return dup;
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
		System.out.println("the duplicate elements in array is: "+findDuplicate(n,arr).toString());
		sc.close();
	}
}
