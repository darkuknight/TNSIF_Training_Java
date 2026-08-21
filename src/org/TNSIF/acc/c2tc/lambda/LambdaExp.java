package org.tnsif.acc.c2tc.lambda;

interface Drawable{
	public void draw();
}

public class LambdaExp {
	public static void main(String[] args) {
		int width = 10;
		Drawable d = ()->{
			System.out.println("Drawing with width "+width);
		};
		d.draw();
	}
}
