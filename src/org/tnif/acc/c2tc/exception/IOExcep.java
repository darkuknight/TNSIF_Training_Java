package org.tnif.acc.c2tc.exception;

import java.io.BufferedReader;
import java.io.FileReader;

public class IOExcep {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data.txt"));
			String s = br.readLine();
			System.out.println(s);
			br.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
