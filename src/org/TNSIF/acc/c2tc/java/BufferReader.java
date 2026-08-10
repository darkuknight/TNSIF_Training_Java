package org.tnsif.acc.c2tc.java;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferReader {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader ("C:\\Users\\Monish L\\eclipse\\TNSIF\\src\\org\\tnsif\\acc\\c2tc\\data\\text.txt"));
		String data="";
		while((data=br.readLine())!=null)
		{
			System.out.println(data);
		}
		br.close();
	}
}
