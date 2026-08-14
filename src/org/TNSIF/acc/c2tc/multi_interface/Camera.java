package org.tnsif.acc.c2tc.multi_interface;

public interface Camera {
	default void turnOn() {
		System.out.println("Camera is on!!!");
	}
	void clickPicture();
}