package org.tnsif.acc.c2tc.collections;

import java.util.*;

public class Vec {
	public static void main(String[] args) throws InterruptedException {
		List<Integer> vec = new Vector<>();
		
		Thread t1 = new Thread(()->{
			for(int i=1;i<5;++i) {
				vec.add(i);
				System.out.println("Thread 1 added: " + i);
			}
		});
		Thread t2 = new Thread(()->{
			for(int i=0;i<5;++i) {
				if(!vec.isEmpty()) {
					System.out.println("Thread 2 removed: " + vec.remove(0));
				}
			}
		});
		
		t1.start();
		
		t2.start();
		t2.join();
	}
}
